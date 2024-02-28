package com.automation.pages;

import com.automation.mobile.appium.AppiumDevice;
import com.automation.mobile.appium.AppiumDeviceManager;
import com.automation.pageElements.CartPageElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class CartPage extends BasePage {
    private CartPageElements cartPageElements = new CartPageElements();
    private HomePage homepage;

    public CartPage(AppiumDriver driver) {
        super(driver);
        homepage = new HomePage(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), cartPageElements);
    }


    public void waitForCartPageDisplayed() {
        waitForLoadingComplete();
        waitVar.until(ExpectedConditions.visibilityOf(cartPageElements.myCartTitle));
    }

    public void waitForEmptyCartDisplayed() {
        waitVar.until(ExpectedConditions.visibilityOf(cartPageElements.emptyCartImage));
    }

    public void emptyCart() {
        while (true) {
            try {
                Thread.sleep(1000);
                if (cartPageElements.emptyCartImage.isDisplayed()) return;
            } catch (Exception e) {
                for (MobileElement element : cartPageElements.cartItemsImageList) {
                    swipeLeftOnElement(element);
                    clickElement(cartPageElements.swipeRemoveButton);
//                    clickElement(cartPageElements.removeIcon);
                }

            }
        }
    }


    public void closeCartPage() {
        waitForDisplayed(cartPageElements.closeButton,10);
        cartPageElements.closeButton.click();
    }


    public boolean verifyTotalNumber(int num) {
        String displayedNum;
        if (driver.getPlatformName().equalsIgnoreCase("android")) {
            displayedNum = cartPageElements.totalNumber.getText().replace("Cart ", "").replace("(", "")
                    .replace(")", "");
        } else {//ios
            displayedNum = StringUtils.substringBetween(cartPageElements.totalNumber.getText(), "(", ")");
        }

        if (Integer.parseInt(displayedNum) == num) {
            return true;
        } else return false;
    }

    public void clickRemoveIcon() {
     //   cartPageElements.removeIcon.click();
        clickElement(cartPageElements.removeIcon);

    }

    public void increaseItemQuantity(int item, int quantity) {
        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            MobileElement element = null;
            element = cartPageElements.plusButtonList.get(item - 1);
            for (int i = 0; i < quantity; i++) {
                clickElement(element);
                waitForLoadingComplete();
            }
        }else{
            MobileElement element = null;
            element = cartPageElements.plusButtonList.get(item);
            for (int i = 0; i < quantity; i++) {
                clickElement(element);
                waitForLoadingComplete();
            }
        }
    }
    public void clickOnFirstITem() {
        clickElement(cartPageElements.clickfirstItem);
        waitForLoadingComplete();
    }
    public void clickBackCTACheckout() {
        waitForClickableAndClick(cartPageElements.cartClose);
        waitForLoadingComplete();
    }
    public void clickCheckout() {
        waitForLoadingComplete();
        waitForClickableAndClick(cartPageElements.checkoutButton);
        waitForLoadingComplete();
    }

    public boolean checkoutButtonEnabled() {
        //waitForDisplayed(cartPageElements.checkoutButton);
        return cartPageElements.checkoutButton.isEnabled();
    }

    public void togglePickupToDelivery() {
        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            if (cartPageElements.toggleToPickup.isDisplayed()) {
                tapCoordinate(cartPageElements.toggleToPickup.getCenter().getX(), cartPageElements.toggleToPickup.getCenter().getY());
                waitForDisplayed(cartPageElements.toggleToDelivery, 5);
            }
        }
    }

    public void dayNextToTodayCTA(){
        waitForDisplayed(cartPageElements.dayNextToToday);
        clickElement(cartPageElements.dayNextToToday);
    }

    public void continuePaymentCTA(){
        waitForClickableAndClick(cartPageElements.continuePaymentCTA);
    }

    public void continueSlotSelectionCTA(){
        waitForClickableAndClick(cartPageElements.continueSlotSelection);
    }

    public boolean verifyAddAddressPageIsDisplayed(){
        return cartPageElements.verifyAddAddressPageIsDisplayed.isDisplayed();
    }

    public void validateInfornmationIcon() throws InterruptedException {
        waitForDisplayed(cartPageElements.informationIcon);
        clickElement(cartPageElements.informationIcon);
//        doubleClick(cartPageElements.informationIcon);
        Thread.sleep(5000);
        waitForDisplayed(cartPageElements.estimatedTaxSheet, 10);
        Assert.assertTrue(cartPageElements.estimatedTaxSheet.getText().equalsIgnoreCase("Estimated Taxes And Fees"));
        clickElement(cartPageElements.CloseButton);
    }

    public void validateEstTotalInfo(){
        waitForDisplayed(cartPageElements.estimatedTotalInfoIcon);
        clickElement(cartPageElements.estimatedTotalInfoIcon);
        waitForDisplayed(cartPageElements.esttotalSheet, 5);
        Assert.assertTrue(cartPageElements.esttotalSheet.getText().equalsIgnoreCase("Estimated Total"));
        clickElement(cartPageElements.CloseButton);
    }

    public void esttotalSheet()
    {
        waitForDisplayed(cartPageElements.esttotalSheet);
//      Thread.sleep(1000);
        clickElement(cartPageElements.CloseButton);
    }

    public void clickBackButtonAddAddressPage() {
        waitForDisplayed(cartPageElements.backButtonAddAddressPage);
        clickElement(cartPageElements.backButtonAddAddressPage);
    }


    public void clickBackButtonOnYourOrderPage() {
        waitForDisplayed(cartPageElements.backButton);
        clickElement(cartPageElements.backButton);
    }

    public void closeSlotSelectionScreen(){
        clickElement(cartPageElements.closeSlotSelectionScreen);
    }

    public void continueReviewOrderCTA() throws InterruptedException {
        waitForClickableAndClick(cartPageElements.reviewOrder);
        Thread.sleep(3000);
    }

    public void continueContactInfoCTA(){
        waitForClickableAndClick(cartPageElements.continueContactInfo);
    }

    public void clickEnterPayment() {
        waitForDisplayed(cartPageElements.clickEnterpayment);
        cartPageElements.clickEnterpayment.click();
    }

    public void confirmSelection(){
        waitForDisplayed(cartPageElements.confirmPopup);
        clickElement(cartPageElements.confirmPopup);
    }

    /*   public boolean isInstoreButtonDisplayed(){
           waitForDisplayed(cartPageElements.inStoreButton);
           return cartPageElements.inStoreButton.isDis
           played());

       }
   */
    public void clickChangeQuantityButtonOnItem(String changeQuantity, int item) {
        List<MobileElement> elements = null;
        if (changeQuantity.equalsIgnoreCase("increase")) {
            elements = cartPageElements.plusButtonList;
        } else if (changeQuantity.equalsIgnoreCase("decrease")) {
            elements = cartPageElements.minusButtonList;
        }
        for (MobileElement element : elements) {
            if (element.isDisplayed()) {
                item--;
                if (item == 0) {
                    clickElement(element);
                    return;
                }
            }
        }

    }

    public void clickSingleIncreaseMultipleTimes(int arg0) {
        waitForLoadingComplete();
        MobileElement element = cartPageElements.plusButton;
        for (int i = 0; i < arg0; i++) {
            clickElement(element);
        }
    }

    public boolean cartNotEmpty() {
        return cartPageElements.removeIcon.isDisplayed();
    }

    public void waitForEstimationTotalInformationIconDisplayed() {
        waitForDisplayed(cartPageElements.EstimatedTotalInfoIcon);
    }

    public void waitForEstimationTotalTextisDisplayed() {
        waitForDisplayed(cartPageElements.EstimatedTotalText);
    }

    public void waitForEstTotalTextisDisplayed() {
        waitForDisplayed(cartPageElements.EstimatedTotalText);
        Assert.assertTrue(cartPageElements.EstimatedTotalText.getText().equalsIgnoreCase("Est. total"));
    }

    public void waitForEstimatedRewardCardSavingsTextisDisplayed() {
        waitForDisplayed(cartPageElements.EstimatedRewardCardSavingsText);
    }

    public void waitForEstimatedClubCardSavingsTextisDisplayed() {
        waitForDisplayed(cartPageElements.EstimatedClubCardSavingsText);
    }
    public void clickEstimationTotalInformationIcon() {
        waitForLoadingComplete();
        clickElement(cartPageElements.EstimatedTotalInfoIcon);

    }

    public void clickEstimatedRewardSavingsInformationIcon() {
      //  waitForLoadingComplete();
        clickElement(cartPageElements.EstimatedRewardSavingsInfoIcon);
        waitForLoadingComplete();

    }

    public void changeAllItemQuantity(String quantity) throws InterruptedException {

        Thread.sleep(5000);

            /*clickElement(element);
            element.sendKeys(quantity);
            if (driver.getPlatformName().equalsIgnoreCase("ios")) {
                driver.findElementByName("Update").click();
            } else {
                tapEnterAndroidKeyboard();
            }*/
            clickElement(cartPageElements.firstCartItem);
        for (int i = 0; i < Integer.parseInt(quantity); i++) {
            Thread.sleep(3000);
            for (MobileElement element : cartPageElements.quantityFieldList) {
                //if (isElementDisplayed(element)) {
                //clickElement(element);
                element.click();
                waitForLoadingComplete();
                Thread.sleep(5000);
            }
        }
        }

    public void increaseAllItemQuantity(int step) {
        for (MobileElement element : cartPageElements.plusButtonList) {
            for (int i = 0; i < step; i++) {
                clickElement(element);
                waitForLoadingComplete();
                waitForLoadingComplete();
            }
            waitForLoadingComplete();
        }
    }

    public void decreaseAllItemQuantity(int step) {
        for (MobileElement element : cartPageElements.minusButtonList) {
            for (int i = 0; i < step; i++) {
                clickElement(element);
                waitForLoadingComplete();
            }
            waitForLoadingComplete();
        }
    }

    public void waitForEstimatedSavingsTotalInformationIconDisplayed() {
        waitForDisplayed(cartPageElements.EstimatedSavingsInfoIcon);
    }
    public void removeItem() {
        clickElement(cartPageElements.removeButton);
    }


    public void swipeLeftToRemoveAllItem() {

        while (true) {
            try {
                Thread.sleep(1000);
                if (cartPageElements.emptyCartImage.isDisplayed()) return;
            } catch (Exception e) {
                for (MobileElement element : cartPageElements.cartItemsImageList) {
                    swipeLeftOnElement(element);
                    waitForDisplayed(cartPageElements.swipeRemoveButton);
                    clickElement(cartPageElements.swipeRemoveButton);
//                    clickElement(cartPageElements.removeIcon);
                    if (cartPageElements.emptyCartImage.isDisplayed()) return;
                }
            }
        }
    }
    public void swipeLeftToRemoveItems() {

        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            for (MobileElement element : cartPageElements.cartItemsImageList) {
                swipeLeftOnElement(element);
                clickElement(cartPageElements.swipeRemoveButton);
              //  waitForLoadingComplete();
            }
        }
        else{
            swipeLeft();
       //      tapCoordinate(991, 1028);
            waitForLoadingComplete();
            clickElement(cartPageElements.swipeRemoveButton);

        }
        waitForLoadingComplete();
    }
    public void clickGlobalSubstitutionCheckbox() {
        clickElement(cartPageElements.globalSubstitutionCheckbox);
    }

    public boolean globalSubstitutionCheckboxEnabled() {
        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            return cartPageElements.globalSubstitutionCheckbox.getText().contains("1");
        } else {
            String checked = cartPageElements.globalSubstitutionCheckbox.getAttribute("checked");
            if (checked.contains("false")) return false;
            else return true;
        }
    }

    public boolean checkedNoSubstitutionForAllItems() throws InterruptedException {
        Thread.sleep(3000);
        for (MobileElement element : cartPageElements.itemSubstitutionCheckboxList) {
            if (driver.getPlatformName().equalsIgnoreCase("ios")) {
                if (element.getText().contains("Not selected")) return false;
            } else {
                String checked = element.getAttribute("checked");
                if (checked.contains("false")) return false;
            }
        }
        return true;
    }


    public void waitForCartSummaryDisplayed() {
        waitForDisplayed(cartPageElements.cartSummary);
    }




    public void removedSubstituion() {
        if (!isElementDisplayed(cartPageElements.noSubstitutionPreference, 30)) {
            Assert.assertTrue(false, "Substitution preference is removed");
        }

    }

    public void verifyinStoreHeader() {

        waitForLoadingComplete();
        waitVar.until(ExpectedConditions.visibilityOf(cartPageElements.inStoreHeader));

    }

    public void milkRemove() {
        if (cartPageElements.removeMilk.size() > 0) {
            clickElement(cartPageElements.removeButton);
            clickElement(cartPageElements.doneCartpage);
        } else {
            clickElement(cartPageElements.doneCartpage);
        }
    }

    public void navigateBackToCartPage() {

        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            clickElement(cartPageElements.doneCartpage);
        }
        else{
            driver.navigate().back();
        }
        waitForLoadingComplete();
    }

    public void verifyDoneButtonInCartPage() {
        Assert.assertTrue(cartPageElements.doneCartpage.isDisplayed());
    }


    public void CheckoutIsEnable() {
        try {

            if (cartPageElements.checkoutButtonCartPage.isEnabled()) {
                System.out.println("checkout button is enabled");
            } else {
                System.out.println("checkout button is not enabled");
            }
        } catch (Exception ex) {

        }
    }

    public void cartPageFirstMilkIncremental() throws InterruptedException {
        for (int i = 0; i < 14; i++) {
            Thread.sleep(1000);
            clickElement(cartPageElements.cartPageFirstMilkIncremental);
        }
    }

    public void changeShoppingMethodDisplayed() {
        try {
            org.junit.Assert.assertTrue(cartPageElements.changeShoppingMethod.isDisplayed());
        } catch (Exception ex) {

        }
    }

    public void payInStore() {
        try {
            org.junit.Assert.assertTrue(cartPageElements.payInStore.isDisplayed());
        } catch (Exception ex) {

        }
    }

    public void payInStoreDisabledForEmptyCart() {
        Assert.assertTrue(cartPageElements.payInStore.getAttribute("enabled").equals("false"));
    }

    public void clickChangeShoppingMethod() {
        clickElement(cartPageElements.changeShoppingMethod);
    }

    public void clickpayInstore() {
        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            waitForLoadingComplete();
            clickElement(cartPageElements.payInStore);
        }
    }

    public void CheckoutIsEnabled() {
        try {
            org.junit.Assert.assertTrue(cartPageElements.checkoutOnCartPage.isEnabled());
        } catch (Exception ex) {

        }
    }

    public void myCartVerification() {
        try {
            org.junit.Assert.assertTrue(cartPageElements.myCart.isDisplayed());
        } catch (Exception ex) {

        }
    }


    public void decreaseAllItemQuantityFromCart() {
        for (MobileElement element : cartPageElements.reduceQuantityList) {
            /*clickElement(element);
            element.sendKeys(quantity);
            if (driver.getPlatformName().equalsIgnoreCase("ios")) {
                driver.findElementByName("Update").click();
            } else {
                tapEnterAndroidKeyboard();
            }*/
            for (int i = 0; i < 21; i++)
                clickElement(element);
        }
    }

    public void clickCartInEditOrder() {
        waitForElementToBeClickable(cartPageElements.cartInEditOrder, 15);
        cartPageElements.cartInEditOrder.click();
    }

    public void clickBackInEditOrder() {
        cartPageElements.backInCartEditOrder.click();
    }


    public void noteToPersonalShopperSearchBox() {
        waitForDisplayed(cartPageElements.noteForShopperEditText);
    }

    public void enterNoteToPersonalShopper(String arg0) {
        if (driver.getPlatformName().equalsIgnoreCase("android")) {
            enterKey(cartPageElements.noteForShopperEditText, arg0);
            driver.hideKeyboard();
        } else {
            clickElement(cartPageElements.noteForShopperEditText);
            enterKey(cartPageElements.noteForShopperEditText, arg0 + Keys.RETURN.toString());
        }
    }

    public void verifyNoteToPersonalShopper(String arg0) {
        String note;
        if (driver.getPlatformName().equalsIgnoreCase("android")) {
            note = cartPageElements.noteForShopperEditText.getText();
            Assert.assertTrue(note.equals(arg0));
        } else {
            note = cartPageElements.noteCharacterLimit.getAttribute("name");
            Assert.assertTrue(!note.contains("0/40 characters allowed for this field"));
        }
    }

    public void verifyRadioButtonSelected(String arg0) {
        String str;
        AppiumDevice device = AppiumDeviceManager.getDevice();
        if (device.getPlatform().equalsIgnoreCase("ios")) {
            if (arg0.equalsIgnoreCase("Same Brand, Different Size")) {
                arg0 = "  Same brand, different size";
            } else if (arg0.equalsIgnoreCase("Same Size, Different Brand")) {
                arg0 = "  Same size, different brand";
            } else {
                arg0 = "  No substitutions";
            }
            str = driver.findElementByName(arg0).getAttribute("value");
            Assert.assertTrue(str.equals("1"));

        } else {
            ArrayList<MobileElement> elementList = (ArrayList<MobileElement>) driver.findElementsByClassName("android.widget.RadioButton");
            for (MobileElement element : elementList) {
                if (element.getText().equalsIgnoreCase(arg0)) {
                    str = element.getAttribute("checked");
                    Assert.assertTrue(str.equals("true"));
                }
            }
        }
    }

    public void verifySaveButtonEnabled() {
        Assert.assertTrue(cartPageElements.preferencesSaveButton.isEnabled());
    }

    public void verifyCancelButtonEnabled() {
        Assert.assertTrue(cartPageElements.preferencesCancelButton.isEnabled());
    }

    public void scrollDownToCartSummary() {

        scrollDownForElement(cartPageElements.cartSummary);
    }

    public void verifyClippedBannerText() {
        waitForDisplayed(cartPageElements.navBanner);
        String text = cartPageElements.navBanner.getText();
        Assert.assertFalse(text.contains("Clipped deal"));
    }

    public void removeItems() throws InterruptedException{
        clickElement(cartPageElements.firstCartItem);
        do{
            cartPageElements.cartMinusIcon.click();
            Thread.sleep(7000);
        }
        while (!isElementVisible(cartPageElements.addToCartButton));
        clickElement(cartPageElements.shoppingCartButton);

    }

    public void ValidateItemscount()
    {
        String totalItems = cartPageElements.itemsCount.getText();
        Assert.assertTrue(totalItems.contains("items"));
    }

    public void closepickupdetailsscreen()
    {
    if(cartPageElements.CloseButton.isDisplayed())
    {
        clickElement(cartPageElements.CloseButton);
        clickElement(cartPageElements.confirmPopupNo);

    }
    else
    {
        System.out.println("close button is not displayed");
    }
    }

  public void validatetaxinfosheet()
  {
      waitForDisplayed(cartPageElements.taxFeesheet);
//      Thread.sleep(1000);
      clickElement(cartPageElements.CloseButton);
  }

}

