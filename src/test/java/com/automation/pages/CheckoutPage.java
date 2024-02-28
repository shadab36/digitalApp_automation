package com.automation.pages;

import static com.automation.mobile.entities.BannerConfType.BANNER_ZIPCODE;

import com.automation.helpers.ThreadLocalHelper;
import com.automation.mobile.appium.AppiumDevice;
import com.automation.mobile.appium.AppiumDeviceManager;
import com.automation.mobile.entities.BannerConfType;
import com.automation.pageElements.CartPageElements;
import com.automation.pageElements.CheckoutPageElements;
import com.automation.pageElements.GG_AccountProfilePageElements;
import com.automation.pageElements.HomePageElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckoutPage extends BasePage {
    public AppiumDevice device = AppiumDeviceManager.getDevice();
    public CheckoutPageElements pageElements = new CheckoutPageElements();
    public GG_AccountProfilePageElements myAccountPageElementsPage = new GG_AccountProfilePageElements();
    public HomePageElements homePageElements = new HomePageElements();
    public CartPageElements cartPageElements = new CartPageElements();
    public NewCheckoutPage newCheckoutPage = new NewCheckoutPage(driver);
    public String productInCart = null;
    public String productInCheckout = null;
    public String deliveryPhoneNumber = null;

    public CheckoutPage(AppiumDriver driver) {
        super(driver);

        PageFactory.initElements(new AppiumFieldDecorator(driver), pageElements);
        PageFactory.initElements(new AppiumFieldDecorator(driver), myAccountPageElementsPage);
        PageFactory.initElements(new AppiumFieldDecorator(driver), homePageElements);
        PageFactory.initElements(new AppiumFieldDecorator(driver), cartPageElements);
    }

    public void slotselectionScreenDisplayed() {
        waitForDisplayed(pageElements.pickupHeaderText);

    }

    public void changeStorePopUpDisplayed() {
        waitForDisplayed(pageElements.changePickupStoreHeaderText);

    }


    public void popUpDisplayed() {
        waitForDisplayed(pageElements.pickupAvailableHeaderText);
        waitForDisplayed(pageElements.pickupAvailableDescription);
        // waitForDisplayed(pageElements.firstStore);
        // clickElement(pageElements.firstStore);
    }

    public void driveUpGoIsDisplayed() {
        waitForDisplayed(pageElements.driveUpGoText);

    }

    public void counterPickupIsDisplayed() {
        waitForDisplayed(pageElements.counterPickupText);

    }

    public void kioskPickupIsDisplayed() {
        waitForDisplayed(pageElements.kioskPickupText);

    }

    public void lockerPickupIsDisplayed() {
        waitForDisplayed(pageElements.lockerPickupText);

    }

    public void pharmacyIsDisplayed() {
        waitForDisplayed(pageElements.pharmacyText);

    }

    public void clickFirstStore() {
        //  waitForDisplayed(pageElements.firstStore);
        clickElement(pageElements.firstStore);
    }

    public void clickEditButton() {
        //  waitForDisplayed(pageElements.editButton);
        waitForLoadingComplete();
        clickElement(pageElements.editButton);
    }

    public void enterZipCode(String zipCode) {
//        zipCodePageElements.zipCodeEditText.clear();
        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            deleteCurrentTextInEditText(pageElements.enterZipCode);
            enterKey(pageElements.enterZipCode, zipCode);
        } else {
            pageElements.zipcodeEditText.clear();
            enterKey(pageElements.zipcodeEditText, zipCode);
            waitForLoadingComplete();

        }
       /* if (driver.getPlatformName().equalsIgnoreCase("android")) {
            enterKey(zipCodePageElements.zipCodeEditText, zipCode);
            clickElement(zipCodePageElements.registerZipCodeNext);
        }*/ /*else if (driver.getPlatformName().equalsIgnoreCase("ios"))

            enterKey(pageElements.enterZipCode, zipCode);
    }*/
  /*  public void enterZipCode() {
    //    waitForDisplayed(pageElements.editButton);
        clickElement(pageElements.enterZipCode);
     //   enterKey(pageElements.enterZipCode,94566);
    }*/
    }

    public void waitForSelectpickupstoreisDisplayed() {
//        waitForDisplayed(pageElements.orderInfoText);
        waitForLoaderToDisappear();
        isElementDisplayed(pageElements.selectpickupStore, 15);
        waitForLoadingComplete();
        clickElement(pageElements.selectpickupStore);
    }

    public void userclicksNotRightNowCTA() {
        //  isElementDisplayed(pageElements.notRightNowText, 15);
        clickElement(pageElements.notRightNowText);
    }

    public void verifyAppLaunched() {
        waitForLoadingComplete();
    }

    public void navigateToAppleStore() {

        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            if (isElementDisplayed(pageElements.getCTA, 2))
                driver.navigate().back();
        }
    }

    public void userclicksOpenCTA() {

        clickElement(pageElements.openCTA);
        waitForLoadingComplete();
        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            if (isElementDisplayed(pageElements.openAlertCTA, 2))
                clickElement(pageElements.openAlertCTA);
        } else {
            //  clickElement(pageElements.openAlertCTA);
            //  clickElement(pageElements.continueCTA);
        }
        waitForLoadingComplete();

    }

    public void notRightNowCTADisplayed() {
        isElementDisplayed(pageElements.notRightNowText, 15);
    }

    public void downloadCTADisplayed() {
        waitForLoaderToDisappear();
        isElementDisplayed(pageElements.downloadCTA, 15);
    }

    public void clickDownloadCTA() {
        waitForLoadingComplete();
        clickElement(pageElements.downloadCTA);
        //  waitForLoaderToDisappear();
    }

    public void clickGoBackCTA() {
        waitForLoadingComplete();
        clickElement(pageElements.goBackCTA);
        //  waitForLoaderToDisappear();
    }

    public void clickContinueCTA() {
        waitForLoadingComplete();
        clickElement(pageElements.continueCTA);
        //  waitForLoaderToDisappear();
    }

    public void continueCTADisplayed() {
        waitForLoaderToDisappear();
        isElementDisplayed(pageElements.continueCTA, 15);
    }

    public void goBackCTADisplayed() {
        waitForLoaderToDisappear();
        isElementDisplayed(pageElements.goBackCTA, 15);
    }

    public void openCTADisplayed() {
        waitForLoaderToDisappear();
        isElementDisplayed(pageElements.openCTA, 15);
    }

    public void serviceProblemDisplayed() {
        try {
            if (pageElements.dismissButton.isDisplayed()) {
                pageElements.dismissButton.click();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void textOrderisDisplayed() {
        isElementDisplayed(pageElements.textOrderStatus);
    }

    public void enterContactInfo() {
        //  clickElement(pageElements.closeCTA);
        enterKey(pageElements.enterFirstname, "Fname");
        enterKey(pageElements.enterLastname, "Lname");
        enterKey(pageElements.enterMobileNumber, "7788787987");
/*        enterValue(pageElements.firstName, "Fname");
        enterValue(pageElements.lastName, "lname");
        enterValue(pageElements.phoneNumber, "7788787987");*/
        if (getPlatformName().equalsIgnoreCase("ios")) {
            myAccountPageElementsPage.doneButton.click();

        } else {
            tapSearchAndroidKeyboard();
        }
        //      pageElements.saveDetails.click();
        clickElement(pageElements.continueToReviewOrderCTA);
        waitForLoadingComplete();
    }

    public void closeCTA() {
        clickElement(pageElements.closeCTA);
    }

    public void clickSaveCTA() {
        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            waitForLoadingComplete();
        } else {
            clickElement(pageElements.saveCTA);
        }

    }


    public void continueToPaymentCTA() throws InterruptedException {

        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            waitForLoadingComplete();
            Thread.sleep(15000);
            try {
                if (pageElements.continueToPaymentCTA.isDisplayed()) {
                    //   pageElements.continueToPaymentCTA.click();
                    clickElement(pageElements.continueToPaymentCTA);
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            waitForLoadingComplete();
        } else {

            waitForLoadingComplete();
            //waitForLoadingComplete();
            Thread.sleep(5000);
            clickElement(pageElements.selectslotCTA);
            tapCoordinate(139, 2875);
            clickElement(pageElements.continueToPaymentCTA);
            waitForLoadingComplete();
        }

        //  waitForLoadingComplete();
    }

    public void enterMyAddressDetails(String deliveryAddress) throws Exception {
//        try {
        AppiumDevice device = AppiumDeviceManager.getDevice();
        String address = device.getConfigureData(BannerConfType.BANNER_ADDRESS_LINE2);
        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            enterKey(pageElements.addressLine1TextField, address);
            clickElement(pageElements.egMsg);
            pageElements.egMsg.sendKeys("\n");
            Thread.sleep(1000);
            clickElement(pageElements.saveCTA);
        } else {
            enterKey(pageElements.addressField, address);
            //hideKeyBoard();
            //waitForLoaderToDisappear();
            waitForLoadingComplete();
            Thread.sleep(5000);
            //clickElement(pageElements.saveCTA);
        }
    }

    public void enterAddressDetails(String deliveryAddress) throws Exception {
        //try{
        AppiumDevice device = AppiumDeviceManager.getDevice();
        String address;

        switch (deliveryAddress) {
            case "address2":
                address = ThreadLocalHelper.testCaseData.get().get("ADDRESSLINE2");
                break;
            case "address3":
                address = ThreadLocalHelper.testCaseData.get().get("ADDRESSLINE3");
                break;
            case "address4":
                address = ThreadLocalHelper.testCaseData.get().get("ADDRESSLINE4");
                break;
            case "address5":
                address = ThreadLocalHelper.testCaseData.get().get("ADDRESSLINE5");
                break;
            case "address6":
                address = ThreadLocalHelper.testCaseData.get().get("ADDRESSLINE6");
                break;
            case "address7":
                address = ThreadLocalHelper.testCaseData.get().get("ADDRESSLINE7");
                break;
            case "address8":
                address = ThreadLocalHelper.testCaseData.get().get("ADDRESSLINE8");
                break;
            case "address9":
                address = ThreadLocalHelper.testCaseData.get().get("ADDRESSLINE9");
                break;
            case "address10":
                address = ThreadLocalHelper.testCaseData.get().get("ADDRESSLINE10");
                break;
            case "address11":
                address = ThreadLocalHelper.testCaseData.get().get("ADDRESSLINE11");
                break;
            case "address12":
                address = ThreadLocalHelper.testCaseData.get().get("ADDRESSLINE12");
                break;
            case "address13":
                address = ThreadLocalHelper.testCaseData.get().get("ADDRESSLINE13");
                break;

            default:
                address = device.getConfigureData(BannerConfType.BANNER_ADDRESS_LINE1_FORSR);
        }

        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            enterKey(pageElements.addressLine1TextField, address);
            clickElement(pageElements.egMsg);
            pageElements.egMsg.sendKeys("\n");
            Thread.sleep(1000);
            clickElement(pageElements.saveCTA);
        } else {
            enterKey(pageElements.addressField, address);
            //hideKeyBoard();
            //waitForLoaderToDisappear();
            waitForLoadingComplete();
            Thread.sleep(5000);
            //clickElement(pageElements.saveCTA);
        }
    }


    public void waitForAddAddressDisplayed() {
//        waitForDisplayed(pageElements.orderInfoText);
        waitForLoaderToDisappear();
        isElementDisplayed(pageElements.addAddressText, 15);
    }

    public void enterAddressDetails() throws Exception {
        if ((getCurrentBanner().equalsIgnoreCase("tomthumb")) || (getCurrentBanner().equalsIgnoreCase("safeway")) || (getCurrentBanner().equalsIgnoreCase("shaws")) || (getCurrentBanner().equalsIgnoreCase("acme"))) {
            AppiumDevice device = AppiumDeviceManager.getDevice();
            String address = device.getConfigureData(BannerConfType.BANNER_ADDRESS_LINE1_FORSR);

            if (driver.getPlatformName().equalsIgnoreCase("ios")) {
                enterKey(pageElements.addressLine1TextField, address);
                clickElement(pageElements.egMsg);
                pageElements.egMsg.sendKeys("\n");
                Thread.sleep(1000);
                clickElement(pageElements.saveCTA);
            } else {
                enterKey(pageElements.addressField, address);
                //   hideKeyBoard();
                //  waitForLoaderToDisappear();
                waitForLoadingComplete();
                Thread.sleep(5000);
                //   clickElement(pageElements.saveCTA);
            }
        }
    }


    public void waitForCheckoutPageDisplayed() {
//        waitForDisplayed(pageElements.orderInfoText);
        if ((getCurrentBanner().equalsIgnoreCase("tomthumb")) || (getCurrentBanner().equalsIgnoreCase("safeway")) || (getCurrentBanner().equalsIgnoreCase("shaws")) || (getCurrentBanner().equalsIgnoreCase("acme")) || (getCurrentBanner().equalsIgnoreCase("pavilions"))) {
            waitForAddAddressDisplayed();
        } else {
            waitForLoaderToDisappear();
            isElementDisplayed(pageElements.orderInfoText, 15);
        }
    }

    public void clickOrderInfo() {
        if (!(getCurrentBanner().equalsIgnoreCase("tomthumb")) && (!getCurrentBanner().equalsIgnoreCase("safeway")) && (!getCurrentBanner().equalsIgnoreCase("shaws")) && (!getCurrentBanner().equalsIgnoreCase("acme")) && (!getCurrentBanner().equalsIgnoreCase("pavilions"))) {
            clickElement(pageElements.orderInfoText);
        }
    }

    public void clickPayment() {
        waitForDisplayed(pageElements.paymentText);
        clickElement(pageElements.paymentText);
    }

    public void waitForPlaceOrderButtonEnabled() {
        waitForLoaderToDisappear();
        waitForClickableAndClick(pageElements.placeOrderButton);
    }

    public void clickDoneConfirmationButton() {
        clickElement(pageElements.doneOrderConfirmationButton);
    }

    public void waitForConfirmationPageDisplayed() {
        if (isElementDisplayed(pageElements.dismissCTA, 3)) {
            clickElement(pageElements.dismissCTA);
        }
        waitForDisplayed(pageElements.orderConfirmationTitle, 5);
    }

    public void waitForEstimatedTotalDisplayed() {
        waitForDisplayed(pageElements.estimatedTotalText);
    }

    public void waitForEstimatedSubTotalDisplayed() {
        waitForDisplayed(pageElements.estimatedSubTotalText);
    }

    public void waitForCOADisplayed() {
        waitForDisplayed(pageElements.coaText);
    }

    public void waitForEstimatedRewardsSavingsTextDisplayed() {
        waitForDisplayed(pageElements.estimatedRewardCardSavingsText);
    }

    public void waitForDeliveryFeeDisplayed() {
        waitForLoadingComplete();
        clickElement(pageElements.estimatedTaxandFees);
        waitForLoadingComplete();
        waitForDisplayed(pageElements.deliveryFeeText);
    }

    public void waitForDeliverySubscriptionFeeDisplayed() {
        waitForLoadingComplete();
        //clickElement(pageElements.estimatedTaxandFees);
        //waitForLoadingComplete();
        waitForDisplayed(pageElements.deliverySubscriptionFeeText);
    }

    public void waitForEditOrderConfirmationPageDisplayed() {

        if (!isElementDisplayed(pageElements.orderConfirmationTitle, 5)) {
            if (isElementDisplayed(pageElements.dismissCTA, 1)) {
                clickElement(pageElements.dismissCTA);
            }
        }

    }

    public void clickPromoCode() {
        if (!isElementDisplayed(pageElements.addPromoCode)) {
            scrollDownForElement(pageElements.addPromoCode);
        }
        waitForDisplayed(pageElements.addPromoCode, 10);
        clickElement(pageElements.addPromoCode);
    }

    public void clickCOA() {
        // clickElement(pageElements.applyCOA);
        pageElements.applyCOA.click();
    }


    public void waitForPromoCodeWindow() {
        waitForDisplayed(pageElements.promoCodeTitle);
    }

    public void enterPromoCode(String promoCode) {
        clickElement(pageElements.enterPromoCode);
        enterKey(pageElements.enterPromoCode, promoCode);
        clickElement(pageElements.applyBtn);
    }

    public void enterCOAAmount(String coa) {
        enterKey(pageElements.enterCOATextField, coa);
        clickElement(pageElements.enterCOAEnterButton);
    }

    public void waitForCOAApplied() {
        waitForDisplayed(pageElements.coaAppliedText);
    }

    public void waitForPromoCodeApplied() {
        waitForDisplayed(pageElements.promoCodeAppliedText);
    }

    public void clickBackButtonFromPromoCode() {

        clickElement(pageElements.promoCodeBackButtonToCheckout);


    }

    public void clickBackButton() {
        driver.navigate().back();

    }

    public void clickBackButtonFromCOAPage() {
        driver.navigate().back();

    }

    public void enterPhoneNumber(String phoneNumber) {
        pageElements.phoneNumberEditText.clear();
        enterKey(pageElements.phoneNumberEditText, phoneNumber);
    }

    public void clearPromoCode() {
        try {
            //wait for Enter Promo Code element
            containTextDisplayed("Enter Promo Code");
            return;

        } catch (Exception e) {
            clickPromoCode();
            waitForPromoCodeWindow();
            clickElement(pageElements.deletePromoCode);
            waitForPromoCodeWindow();
            clickBackButtonFromPromoCode();
            return;
        }
    }

    public void scrollDownToTotalSummary() {
        // scrollDownForElement(pageElements.estimateTotalText);
        scrollDownForElement(pageElements.estimatedTotalText);
    }

    public void clickContactDetail() {
        if (!(getCurrentBanner().equalsIgnoreCase("tomthumb")) && (!getCurrentBanner().equalsIgnoreCase("safeway")) && (!getCurrentBanner().equalsIgnoreCase("shaws")) && (!getCurrentBanner().equalsIgnoreCase("acme")) && (!getCurrentBanner().equalsIgnoreCase("pavilions"))) {
            waitForElementToBeClickable(pageElements.conatctDetails, 5000);
            pageElements.conatctDetails.click();
        }
    }

    public void fillContactDetails() throws Exception {
        if ((getCurrentBanner().equalsIgnoreCase("tomthumb")) || (getCurrentBanner().equalsIgnoreCase("safeway")) || (getCurrentBanner().equalsIgnoreCase("shaws")) || (getCurrentBanner().equalsIgnoreCase("acme")) || (getCurrentBanner().equalsIgnoreCase("pavilions"))) {
            newCheckoutPage.enterContactInformation();
        } else {
            enterValue(pageElements.firstName, "Fname");
            enterValue(pageElements.lastName, "lname");
            enterValue(pageElements.phoneNumber, "7788787987");

            if (getPlatformName().equalsIgnoreCase("ios"))
                myAccountPageElementsPage.doneButton.click();
            else
                tapSearchAndroidKeyboard();
            pageElements.saveDetails.click();
        }
    }

    public void fillAndBufferContactDetails() {
        enterValue(pageElements.firstName, "Fname");
        enterValue(pageElements.lastName, "lname");
        enterValue(pageElements.phoneNumber, "7788787987");

        if (driver.getPlatformName().equalsIgnoreCase("Android")) {
            deliveryPhoneNumber = pageElements.phoneNumber.getAttribute("text");
        } else {
            deliveryPhoneNumber = pageElements.phoneNumber.getAttribute("label");
        }

        if (getPlatformName().equalsIgnoreCase("ios"))
            myAccountPageElementsPage.doneButton.click();
        else
            tapSearchAndroidKeyboard();
        pageElements.saveDetails.click();

    }

    public void confirmChanges() {
        pageElements.confirmChanges.click();
    }

    public void fillSameNumberInContact() {
        enterValue(pageElements.phoneNumber, deliveryPhoneNumber);

    }

    public void verifyEditOrderPage() {
        waitForDisplayed(pageElements.confirmChanges);
    }

    public void captureNameOfProduct() {

        if (driver.getPlatformName().equalsIgnoreCase("android")) {
            productInCart = pageElements.productAddedInCart.getAttribute("text");
        } else {
            productInCart = pageElements.productAddedInCart.getAttribute("label");
        }
        System.out.println(productInCart);
    }

    public void bufferNameOfProduct(String arg0) {

        MobileElement element = homePageElements.addedProductNameList.get(Integer.parseInt(arg0) - 1);
        if (driver.getPlatformName().equalsIgnoreCase("android")) {
            productInCart = element.getAttribute("text");
        } else {
            productInCart = element.getAttribute("label");
        }
        System.out.println(productInCart);
    }

    public void verifyNonSnapItemsDisplayed() {
        if (driver.getPlatformName().equalsIgnoreCase("android")) {
            productInCheckout = pageElements.productAddedInCheckout.getAttribute("text");
        } else {
            productInCheckout = pageElements.productAddedInCheckout.getAttribute("label");
        }
        System.out.println(productInCheckout);
        Assert.assertTrue((productInCheckout.contains(productInCart)) | (productInCart.contains(productInCheckout)), "The Non-SNAP item added is not displayed");
    }

    public void verifySnapPaymentOption() {

        waitForDisplayed(pageElements.snapOption, 10);
    }

    public void clickSnapOptionForPayment() {
        clickElement(pageElements.snapRadioButton);
    }

    public void verifyPopupToRemoveNonSnapItems() {
        Assert.assertTrue(pageElements.nonSnapItemRemovalPopup.isDisplayed(), "popup to remove non snap items is not displayed");
    }

    public void userClickOnViewCart() {
        clickElement(pageElements.nonSnapItemRemovalPopup);
    }

    public void verifyDeliveryFeeTooltipOption() {
        waitForLoadingComplete();
        scrollDown();
        pageElements.taxCollapseMode.click();
        waitForDisplayed(pageElements.deliveryFeeTooltip);
    }

    public void verifySalesTaxTooltipOption() {
        waitForLoadingComplete();
        scrollDown();
        pageElements.taxCollapseMode.click();
        waitForDisplayed(pageElements.salesTaxTooltip);
    }

    public void verifyEstimatedTotalTooltipOption() {
        waitForLoadingComplete();
        scrollDown();
        waitForDisplayed(pageElements.estimatedTotaltip);
    }

    public void clickItemTextOnScreen(String arg0) {
        clickElement(pageElements.preferences);
    }

    public void verifyAuthMessageDisplayed() {
        String str1 = "A hold will be placed on your debit/ credit card for this estimated total and will reduce the amount available to spend from your account. Your bank may take up to 5 business days after delivery/ pickup to release the hold and display your final charge.";
        String str2;
        if (driver.getPlatformName().equalsIgnoreCase("android")) {
            str2 = pageElements.authMessage.getText();
            Assert.assertTrue(str2.equals(str1), "Auth message text is not as expected");
        } else {
            str2 = pageElements.authMessage.getAttribute("name");
            Assert.assertTrue(str2.equals(str1), "Auth message text is not as expected");
        }
    }

    public void lookingForSavingsText() {
        String str;
        if (driver.getPlatformName().equalsIgnoreCase("android")) {
            str = pageElements.savingsTitle.getText();
            Assert.assertTrue(str.equals("Looking for your savings?"), "Savings title is not displayed");
        } else {
            str = pageElements.savingsTitle.getAttribute("name");
            Assert.assertTrue(str.equals("Looking for your savings?. . "), "Savings title is not displayed");
        }
    }

    public void verifySavingsMessageDisplayed() {
        String str1 = "The estimated total above excludes discounts from coupons you clipped and Buy One, Get One deals which will appear on your receipt at delivery or pickup";
        String str2;
        if (driver.getPlatformName().equalsIgnoreCase("android")) {
            str2 = pageElements.savingsMessage.getText();
            Assert.assertTrue(str2.equals(str1), "Auth message text is not as expected");
        } else {
            str2 = pageElements.savingsMessage.getAttribute("name");
            Assert.assertTrue((str2.contains(str1) | str1.contains(str2)), "Auth message text is not as expected");
        }
    }

    public void verifyTermsUseMessageDisplayed() {
        String str1 = "By clicking ‘Place Order’, you acknowledge that you have read and agree to the Albertsons Companies’ Terms of Use and Privacy Policy and that they apply to this order.";
        String str2;
        if (driver.getPlatformName().equalsIgnoreCase("android")) {
            str2 = pageElements.termsUseMessage.getText();
            Assert.assertTrue(str2.equals(str1), "Auth message text is not as expected");
        } else {
            str2 = pageElements.termsUseMessage.getAttribute("value");
            Assert.assertTrue(str2.equals(str1), "Auth message text is not as expected");
        }
    }

    public void scrollDownForCartSummary() {
        scrollDownForElement(cartPageElements.cartSummary);
    }

    public void clickOrders() {
    }

    public void clickCloseButtonOnPayment() {
        waitForLoadingComplete();
        waitForDisplayed(pageElements.crossButtonOnPaymentScreen, 15);
        pageElements.crossButtonOnPaymentScreen.click();
    }

    public void displayErrorForInvalidPromoCode() {
        waitForDisplayed(pageElements.errorMsg, 15);
        Assert.assertTrue(pageElements.errorMsg.isDisplayed());

    }

    public void appliedPromoCode(String arg0) throws InterruptedException {


        Thread.sleep(10000);
        //   List<MobileElement> value = driver.findElements(By.id("nameTv"));
        waitForDisplayed(pageElements.promoCodeApplied.get(5), 50);
        String promoCodeText = pageElements.promoCodeApplied.get(5).getText();
        Assert.assertTrue(promoCodeText.equalsIgnoreCase(arg0));
    }

    public void deletePromoCode() {
        waitForDisplayed(pageElements.deleteAppliedPromoCode, 15);
        pageElements.deleteAppliedPromoCode.click();
        waitForDisplayed(pageElements.addPromoCode);

    }

    public void visibilityOfDeletedPromoCode() {

        waitForDisplayed(pageElements.deleteAppliedPromoCode, 15);
        pageElements.deleteAppliedPromoCode.click();
        waitForDisplayed(pageElements.addPromoCode);
        String value = pageElements.promoCodeApplied.get(5).getText();
        System.out.println(value);


    }

    public void verifyPromoCodeVisibility(String arg0) {

        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + arg0 + "')]"));
        Assert.assertTrue(list.size() == 0);

    }

    public void continueToCVVCTA() {
        waitForDisplayed(pageElements.continueToCVV);
        waitForClickableAndClick(pageElements.continueToCVV);
    }


    public void clickAddAddressButton() {

        waitForDisplayed(pageElements.addAddressButton, 10);
        pageElements.addAddressButton.click();
    }

    public void displayZipCode() {


        waitForDisplayed(pageElements.addressFieldOnSlotSelectionScreen, 15);
        String value = pageElements.addressFieldOnSlotSelectionScreen.getText();

        AppiumDevice device = AppiumDeviceManager.getDevice();
        String zipCodeValue = device.getConfigureData(BANNER_ZIPCODE);


        Assert.assertTrue(value.equalsIgnoreCase(zipCodeValue));

        waitForDisplayed(pageElements.addAddressButton, 10);
    }

    public void addressDetails() {

        waitForDisplayed(pageElements.addressFieldOnSlotSelectionScreen, 15);
        String addressValue = pageElements.addressFieldOnSlotSelectionScreen.getText();
        AppiumDevice device = AppiumDeviceManager.getDevice();
        String address = device.getConfigureData(BannerConfType.BANNER_ADDRESS_LINE1_FORSR);

        Assert.assertTrue(address.toLowerCase().contains(addressValue.toLowerCase().substring(0, 11)));

    }

    public void clickPickUpOnSlotSelection() {

        waitForDisplayed(pageElements.pickUpToggle);
        pageElements.pickUpToggle.click();
    }

    public void clickDeliverySlotSelection() {

        waitForDisplayed(pageElements.deliveryToggle);
        pageElements.deliveryToggle.click();
    }

    public void verifyInlineMessage(String message) {
        String inlineMessage = getText(pageElements.inlineMessage);
        Assert.assertTrue(inlineMessage.equalsIgnoreCase(message), "Inline message is not displayed or wrong message is displayed");
    }

    public void verifySnapEBTIssuePopup() {
        Assert.assertTrue(pageElements.snapEBTPurchaseIssuePopUp.isDisplayed(), "popup to remove non snap items is not displayed");
    }

    public void userClickOnCartTab() {
        clickElement(pageElements.cartTab);
    }

    public void verifyNonSnapItems() {
        if (driver.getPlatformName().equalsIgnoreCase("android")) {
            productInCheckout = pageElements.productAddedInCheckout.getAttribute("text");
        } else {
            productInCheckout = pageElements.productAddedInCheckout.getAttribute("label");
        }
        Assert.assertTrue((productInCheckout != null && productInCheckout != ""), "The Non-SNAP item added is not displayed");
    }

    public void validateCvvLbl() {
        pageElements.confirmCvvLbl.isDisplayed();
    }


    public void clickBack() {
        pageElements.backButton.click();
//        clickElement(pageElements.backButton);
    }

    public void VerifyEBTDisplayed() {

        waitForDisplayed(pageElements.textmessage);

    }


}

