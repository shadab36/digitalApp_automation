package com.automation.pages;


import com.automation.mobile.appium.AppiumDeviceManager;
import com.automation.pageElements.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {
    public HomePageElements homePageElements = new HomePageElements();

    public MenuPageElements menuPageElements = new MenuPageElements();
    public GG_MyItemsPageElements myItemsElements = new GG_MyItemsPageElements();
    public CheckoutPageElements pageElements = new CheckoutPageElements();
    private GG_OtpPasswordPageElements otpPasswordPageElements = new GG_OtpPasswordPageElements();
    private SelectOrderTypePage selectOrderTypePage = new SelectOrderTypePage(driver);
    SelectOrderTypePageElements selectOrderTypePageElements = new SelectOrderTypePageElements();
    private String productInMustHaveGrabs = null;
    public String firstStoreAddress = null;

    public HomePage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), homePageElements);
        PageFactory.initElements(new AppiumFieldDecorator(driver), menuPageElements);
        PageFactory.initElements(new AppiumFieldDecorator(driver), myItemsElements);
        PageFactory.initElements(new AppiumFieldDecorator(driver), otpPasswordPageElements);
        PageFactory.initElements(new AppiumFieldDecorator(driver), selectOrderTypePage);
        PageFactory.initElements(new AppiumFieldDecorator(driver), pageElements);
        PageFactory.initElements(new AppiumFieldDecorator(driver), selectOrderTypePageElements);
    }

    public void waitForHomePageDisplayed() {
        waitForLoadingComplete();
        if (platformName.equalsIgnoreCase("ios")) {
            driver.closeApp();
            driver.launchApp();
            for (int i = 0; i < 1; i++) {
                if (isElementDisplayed(otpPasswordPageElements.Delivery_Next, 10))
                    clickElement(otpPasswordPageElements.Delivery_Next);
                else {
                    break;
                }
            }
        } else {
            scrollUp();
            scrollUp();
        }

        waitVar.until(ExpectedConditions.visibilityOf(homePageElements.menuButton));
        Assert.assertTrue(homePageElements.menuButton.isDisplayed());
    }

    public void clickMenuIcon() {
        homePageElements.menuButton.click();
    }


    public void clickAppLovePopup() {
        homePageElements.yesButton.click();
        homePageElements.dismissAlert.click();
    }


    public void clickAddButton() {
        homePageElements.addItemButtons.get(0).click();
    }

    public void clickShoppingCartButton() throws InterruptedException {
        Thread.sleep(3000);
        waitForClickableAndClick(homePageElements.shoppingCartButton);
    }


    public void clickAislesTab() throws InterruptedException {
        homePageElements.aisleTab.click();
        Thread.sleep(1000);
        waitForLoadingComplete();
    }

    public void waitForSubListDisplayed() {
        waitVar.until(ExpectedConditions.visibilityOf(homePageElements.subListElements.get(0)));
    }

    public void clickSubListItem(String arg0) {
        homePageElements.subListElements.get(Integer.parseInt(arg0) - 1).click();
    }

    public void waitForCategoryListDisplayed() {
        waitVar.until(ExpectedConditions.visibilityOf(homePageElements.categoryListElements.get(0)));
    }

    public void waitForDepartmentListDisplayed() {
        waitForDisplayed(homePageElements.aisleTitle);
    }

    public void clickCategoryListItem(String arg0) {
        if (driver.getPlatformName().equalsIgnoreCase("ios"))
            homePageElements.categoryListElements.get(Integer.parseInt(arg0) - 2).click();
        else
            homePageElements.categoryListElements.get(Integer.parseInt(arg0) - 1).click();
    }

    public void clickDepartmentListItem(String arg0) {
        homePageElements.departmentListElements.get(Integer.parseInt(arg0) - 1).click();
    }

    public void waitForItemFoundFromAisle() {
        waitVar.until(ExpectedConditions.visibilityOf(homePageElements.aisleResultText));
    }

    public void waitForAddCTAOnHomePage() {
        waitVar.until(ExpectedConditions.visibilityOf(homePageElements.addCTA));
    }

    public void waitForAddToListCTAOnHomePage() {
        //    scrollDownForElement(homePageElements.addToListCTA);
        waitVar.until(ExpectedConditions.visibilityOf(homePageElements.addToListCTA));
    }

    public void clickAddItem(String arg0) throws InterruptedException {
        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            try {
                if (homePageElements.iosTogglePopUp.isDisplayed())
                    homePageElements.iosCloseToggle.click();
            } catch (Exception e) {
            }
        }
        Thread.sleep(1000);
        waitForLoadingComplete();
        //homePageElements.addButton.click();
        MobileElement element = homePageElements.addButtonList.get(Integer.parseInt(arg0) - 1);
        element.click();

    }

    public void clickMyPurchaseTab() {
        homePageElements.myPurchaseTab.click();
        waitForLoadingComplete();
    }

    public void clickSearchBar() {
        homePageElements.clickSearch.click();
//        driver.hideKeyboard();
    }

    public void verifySearchIcon() {
        //   homePageElements.clickSearch.click();
        waitVar.until(ExpectedConditions.visibilityOf(homePageElements.searchIconInHomePage));
        //   dashboardPage.clickOnSearchIconOnHomePage();
        waitForLoadingComplete();
    }

    public void verifySearchBar() {
        //   homePageElements.clickSearch.click();
        waitVar.until(ExpectedConditions.visibilityOf(homePageElements.clickSearch));
        //   dashboardPage.clickOnSearchIconOnHomePage();
    }

    public void waitForSearchWindowDisplayed() {
        waitVar.until(ExpectedConditions.visibilityOf(homePageElements.currentTrendingText));
    }

    public void clickElementsByIndex(int arg0) {
        List<MobileElement> elements = homePageElements.autoSuggestSearchList;
        clickElement(elements.get(arg0));
    }

    public void enterSearchItem(String arg0) {

        try {
                Thread.sleep(4000);
            if (driver.getPlatformName().equalsIgnoreCase("android")) {

                if (AppiumDeviceManager.getDevice().getDeviceType().equalsIgnoreCase("cloud")) {
                    homePageElements.searchEditText.click();
                    homePageElements.searchEditText.sendKeys(arg0);
                    tapCoordinate(1358, 2901);
                    tapSearchAndroidKeyboard();
                    driver.hideKeyboard();
                    waitForLoadingComplete();
                } else {
                    enterKey(homePageElements.searchEditText, arg0);
                   // tapCoordinate(990, 1983);
                    androidKeyboardClickDone();
                }
            } else {
                if (isElementVisible(homePageElements.searchTextField)) {
                    tapCoordinate(homePageElements.searchTextField.get(0).getCenter().getX(), homePageElements.searchTextField.get(0).getCenter().getY());
                    Thread.sleep(5000);
                }
                Thread.sleep(5000);
                enterKey(homePageElements.searchEditText, arg0 + Keys.RETURN.toString());
                if (isElementVisible(myItemsElements.dealToggleSwitch)) {
                    myItemsElements.dealToggleSwitch.get(0).click();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
//            homePageElements.milkProduct.click();
            //homePageElements.sodaProduct.click();
        }
        /*try {
            homePageElements.closeToggle.click();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }


    public void enterSearchItemInSearchBar(String arg0) throws InterruptedException {

        if (driver.getPlatformName().equalsIgnoreCase("android")) {

            if (AppiumDeviceManager.getDevice().getDeviceType().equalsIgnoreCase("cloud")) {
                homePageElements.searchEditText.click();
                homePageElements.searchEditText.sendKeys(arg0);
                tapSearchAndroidKeyboard();

            } else {
                enterKey(homePageElements.searchEditText, arg0);
                androidKeyboardClickDone();
            }
        } else {
            clickElement(homePageElements.searchEditText);
            enterKey(homePageElements.searchEditText, arg0 + Keys.RETURN.toString());
            try {
                if (myItemsElements.dealsToggleSwitch.isDisplayed()) {
                    myItemsElements.dealsToggleSwitch.click();
                }
            } catch (Exception e) {
                return;
            }

//            enterKey(homePageElements.searchEditText, arg0);
        }
    }

    public void verifySearchItem(String arg0) {

//        Assert.assertTrue(homePageElements.validSearchProduct.getText().contains(arg0));
//        Assert.assertTrue(homePageElements.validSearchProduct.isDisplayed());
        Assert.assertTrue(homePageElements.validSearchProduct.isDisplayed());
    }



    public void verifySearchResults() {

        Assert.assertTrue(homePageElements.searchResults.isDisplayed());
//        Assert.assertTrue(homePageElements.validSearchProduct.isDisplayed());
    }

    public void clickDealTab() {
        clickElement(homePageElements.dealsTab);
        waitForLoadingComplete();
    }

    public void clickHomePageTab() {
        clickElement(homePageElements.homeTab);
        waitForLoadingComplete();
    }


    public void verifyPopularItemsDisplayed() {
        waitForDisplayed(homePageElements.popularItemText);
    }

    public void verifyMustHaveGrabsItemsDisplayed() {
        waitForDisplayed(homePageElements.mustHaveGrabsSection);
    }

    public void verifyMostViewedDisplayed() {
        scrollDownForElement(homePageElements.mostViewedText);
    }

    public void waitForResultFoundDisplayed() {
        waitForLoadingComplete();
        waitVar.until(ExpectedConditions.visibilityOf(homePageElements.searchResultText));
        Assert.assertTrue(homePageElements.searchResultText.isDisplayed());

    }

    public void clickCancelButton() {
        waitForLoadingComplete();
        clickElement(homePageElements.cancelButton);
    }

    public void waitForNotificationAlert() {
        waitForDisplayed(homePageElements.notificationText);
    }

    public void clickDoNotAllowNotification() {
        clickElement(homePageElements.doNotAllowNotificationButton);
    }

    public void increaseItemQuantity(int item, int quantity) throws InterruptedException {
        if (driver.getPlatformName().equalsIgnoreCase("android")) {
            MobileElement element = null;
            element = homePageElements.plusButtonList.get(item - 1);
            for (int i = 0; i < quantity; i++) {
                tapElement(element);
            }
        }
    }

    public void clickDeliveryOption() {

        waitForLoadingComplete();

       /* Dimension dimension = driver.manage().window().getSize();
        int height = (int) (dimension.getHeight() * .90);
        int width = (int) (dimension.getWidth() * .92);
        tapCoordinate(width, height);*/

        // clickonNextButton();

        //   tapCoordinate((int) (driver.manage().window().getSize().width * 0.95), element.getCenter().getY());

       /* if (driver.getPlatformName().equalsIgnoreCase("ios")) {
          //  tapCoordinate(714, 1116);
            clickonNextButton();
        }*//*else{
            Dimension dimension = driver.manage().window().getSize();
            int height = (int) (dimension.getHeight() * .90);
            int width = (int) (dimension.getWidth() * .92);
            tapCoordinate(width, height);
        }
*/
        //   tapCoordinate(350, 1500);


      /*  IOSTouchAction touch = new IOSTouchAction (driver);
        touch.tap (TapOptions.tapOptions ()
                .withElement (ElementOption.element (e)))
                .perform ();
*/
        waitForLoadingComplete();


/*
        Dimension dimension = driver.manage().window().getSize();
        tapCoordinate(82, (int) ((dimension.getHeight()) * .32));*/
        //   tapCoordinate(60,800);
        clickElement(homePageElements.editDeliveryButton);


    }

    public void verifyNextButtonisDisplayed() {
        waitForLoadingComplete();


        Dimension dimension = driver.manage().window().getSize();
        int height = (int) (dimension.getHeight() * .90);
        int width = (int) (dimension.getWidth() * .92);
        tapCoordinate(width, height);

    /*   if (isElementDisplayed(homePageElements.nextButton, 100)) {
                for (int i = 0; i < 3; i++) {
                    clickElement(homePageElements.nextButton);
                }
            }*/
        waitForLoadingComplete();

    }

    public void clickonNextButton() {
        waitForLoadingComplete();
        clickElement(homePageElements.nextButton);
    }

    public void waitForLoveShoppingPopUpDisplayed() {
        waitForDisplayed(homePageElements.loveShoppingPopUpText);
    }

    public void clickLoveShoppingYesButton() {
        clickElement(homePageElements.loveShoppingYesButton);
    }

    public void waitForRateShopPopup() {
        waitForDisplayed(homePageElements.ratingShopWindowText);
    }

    public void clickRateShopNotNowButton() {
        clickElement(homePageElements.ratingShopNotNowButton);
    }

    public void clickAutoSuggestItem(int arg0) {
        waitForDisplayed(homePageElements.currentTrendingText);
        if (getPlatformName().equalsIgnoreCase("ios")) {
            clickElement(homePageElements.autoSuggestBread);
        } else {
            clickElement(homePageElements.autoSuggestSearchList.get(arg0 - 1));
        }
    }


    public void clickItemOnAisleList(String item) throws InterruptedException {
        waitForLoadingComplete();
        Thread.sleep(4000);
       //new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOf(findElementByName(item)));
        tapElementCoordinate(findElementByName(item));
        waitForLoadingComplete();
    }


    public void scrollDownForNonSnapCategory(String item) {
        waitForLoadingComplete();
        for (int i = 0; i <= 15; i++) {
            try {
                if (homePageElements.nonSnapCategoryName.isDisplayed()) {
                    if (driver.getPlatformName().equalsIgnoreCase("android")) {
                        if (homePageElements.nonSnapCategoryName.getAttribute("text").contains(item)) {
                            clickElement(homePageElements.nonSnapCategoryName);
                            break;
                        }
                    } else {
                        if (homePageElements.nonSnapCategoryName.getAttribute("label").contains(item)) {
                            clickElement(homePageElements.nonSnapCategoryName);
                            break;
                        }
                    }
                } else {
                    scrollDown();
                }
            } catch (Exception e) {
                scrollDown();
            }
        }
    }


    public void clickCategoryOnCategoryList(String item) {
        waitForLoaderToDisappear();
        if (driver.getPlatformName().equalsIgnoreCase("android")) {
            new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOf(findElementByName(item)));
            tapElementCoordinate(findElementByName(item));
        } else {
            tapElementCoordinate(findElementByLabel(item));
        }
        waitForLoadingComplete();
    }

    public boolean verifyPreferenceDisplayed(String preference) {
        waitForDisplayed(homePageElements.editDeliveryButton);
        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            if (preference.equalsIgnoreCase("delivery")) {
                return homePageElements.editDeliveryButton.getText().contains("Delivery");
            } else if (preference.equalsIgnoreCase("pickup")) {
                return homePageElements.editDeliveryButton.getText().contains("Pickup");
            } else if (preference.equalsIgnoreCase("inStore")) {
                return homePageElements.editDeliveryButton.getText().contains("In-store");
            }
        } else {
            if (preference.equalsIgnoreCase("delivery")) {
                return homePageElements.editDeliveryButton.getText().contains("Delivery");
            } else if (preference.equalsIgnoreCase("pickup")) {
                return homePageElements.editDeliveryButton.getText().contains("Pickup");
            } else if (preference.equalsIgnoreCase("inStore")) {
                return homePageElements.editDeliveryButton.getText().contains("In-store");

            }
        }
        return false;
    }

    public boolean verifyPreferenceTextDisplayed(String preference) {

        if (getPlatformName().equalsIgnoreCase("ios")) {
            //clickElement(homePageElements.autoSuggestBread);
            if (preference.startsWith("In")) {
                return homePageElements.preferenceText.getText().contains("In-Store");
            }
        } else {
            if (preference.endsWith("run")) {
                return homePageElements.preferenceText.getText().contains("In-store run");
            }

        }
        return false;
    }


    public boolean waitForWindowDisplayed(String title) {
        waitForDisplayed(homePageElements.windowTitle);
        return homePageElements.windowTitle.getText().equalsIgnoreCase(title);
    }

    public void clickReserveTimeOption() {
        clickElement(homePageElements.editReserveTimeButton);
    }

    public void clickViewAllPopularItems() {
        clickElement(homePageElements.popularViewAllButton);
    }

    public void clickSeeAllPopularItems() {
        waitForLoadingComplete();
        clickElement(homePageElements.popularSeeAllButton);
    }

    public void clickSeeAllMustHaveGrabs() {
        waitForLoadingComplete();
        clickElement(homePageElements.mustHaveGrabsSeeAllButton);
    }

    public void clickSeeAllBrowseCategories() {
        waitForLoadingComplete();
        clickElement(homePageElements.browseCategoriesSeeAllButton);
    }

    public void verifyMustHaveGrabsItemsTitle() {
        waitForDisplayed(homePageElements.mustHaveGrabsTitle);
    }

    public void clickSortAndFilterButton() {
        clickElement(homePageElements.sortAndFilterButton);
    }

    public void waitForNoResultDisplayed() {
        waitForDisplayed(homePageElements.noSearchResult);
    }

    public void waitForProductDetailPageDisplayed() {
        waitForDisplayed(homePageElements.productImage);
    }

    public void waitForRelatedItemDisplayed() {
        scrollDownForElement(homePageElements.relatedProductText);
        waitForDisplayed(homePageElements.relatedProductText);
    }

    public void clickAddProductButton() {
        scrollTop();
        clickElement(homePageElements.addProductButton);
    }

    public void clickProductFromSearchList(int arg0) throws InterruptedException {
        waitForLoadingComplete();
        clickElement(homePageElements.searchResultProductList.get(arg0 - 1));
    }

    public void waitForRecentSearchedItemDisplayed() {
        waitForDisplayed(homePageElements.recentlySearchedText);
    }

    public void waitForDealsToggleSwitchDisplayed() {
        waitForDisplayed(homePageElements.dealsToggleSwitch);
    }

    public void clickDealsToggleSwitch() {
        clickElement(homePageElements.dealsToggleSwitch);
    }

    public boolean dealsToggleSwitch(String switchStatus) {
        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            if (homePageElements.dealsToggleSwitch.
                    getAttribute("value").equalsIgnoreCase(switchStatus)) return true;
        } else if (driver.getPlatformName().equalsIgnoreCase("android")) {
            if (homePageElements.dealsToggleSwitch.
                    getAttribute("checked").equalsIgnoreCase("true") && switchStatus.equals("on"))
                return true;
            if (homePageElements.dealsToggleSwitch.
                    getAttribute("checked").equalsIgnoreCase("false") && switchStatus.equals("off"))
                return true;
        }
        return false;
    }

    public void androidNavigateBackArrow() {
        if (driver.getPlatformName().equalsIgnoreCase("android")) {
            clickElement(homePageElements.androidBackArrow);
        }
    }

    public void clickonSaveButton() {
        if (driver.getPlatformName().equalsIgnoreCase("android")) {
            clickElement(homePageElements.saveButton);
        }
    }

    public void changeQuantityto(String arg0) {
        waitForLoadingComplete();
        waitForDisplayed(homePageElements.quantityButton);

        tapElementCoordinate(homePageElements.quantityButton);
        waitForDisplayed(homePageElements.quantityTextEdit);
        homePageElements.quantityTextEdit.sendKeys(arg0);
        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            driver.findElementByName("Update").click();
        } else {
            tapEnterAndroidKeyboard();
        }
    }


    public void verifyNoSearchResultsDisplayed() {

        Assert.assertTrue(homePageElements.zeroSearchResults.isDisplayed());

    }

    public void userNavigateBackToHomePage() {
        clickElement(homePageElements.backButton);
    }

    public void clickShoppingCartButtonOnHomePage() throws InterruptedException {
        Thread.sleep(1000);
        waitForClickableAndClick(homePageElements.shoppingCartButtonWithXpath);
    }


    public void InStoreModeSetUpOnHomepage() throws InterruptedException {
        waitForLoadingComplete();
        if (homePageElements.pickupFromHomepage.size() > 0) {
            clickElement(homePageElements.homepagePickUp);
            if (driver.getPlatformName().equalsIgnoreCase("ios")) {
                waitForLoadingComplete();
                driver.findElement(By.name("whiteRightArrow")).click();
                waitForLoadingComplete();
                clickElement(homePageElements.inStoreSignInPageButton);
                selectOrderTypePage.selectAnyStore();
                driver.findElement(By.name("Start shopping")).click();
            } else {
                waitForLoadingComplete();
                clickElement(homePageElements.whiteRightArrow);
                waitForLoadingComplete();
                clickElement(homePageElements.inStoreSignInPageButton);
                Thread.sleep(5000);
                clickElement(homePageElements.startShoppingButton);

            }
        } else if (homePageElements.deliveryFromHomepage.size() > 0) {
            clickElement(homePageElements.deliveryHomePage);
            if (driver.getPlatformName().equalsIgnoreCase("ios")) {
                waitForLoadingComplete();
                driver.findElement(By.name("whiteRightArrow")).click();
                waitForLoadingComplete();
                clickElement(homePageElements.inStoreSignInPageButton);
                Thread.sleep(5000);
                driver.findElement(By.name("Start shopping")).click();
            } else {
                waitForLoadingComplete();
                clickElement(homePageElements.whiteRightArrow);
                waitForLoadingComplete();
                clickElement(homePageElements.inStoreSignInPageButton);
                Thread.sleep(5000);
                clickElement(homePageElements.startShoppingButton);

            }
        } else {

            System.out.println("this is in store mode");
        }


    }

    public void enterSearchItemAndClickMilk(String arg0) throws InterruptedException {

        if (driver.getPlatformName().equalsIgnoreCase("android")) {

            if (AppiumDeviceManager.getDevice().getDeviceType().equalsIgnoreCase("cloud")) {
                waitForLoadingComplete();
                homePageElements.searchEditButton.click();
                homePageElements.searchMilkButton.click();
//                homePageElements.searchEditText.sendKeys(arg0);
//                tapSearchAndroidKeyboard();
//                driver.hideKeyboard();
            } else {
                waitForLoadingComplete();
                enterKey(homePageElements.searchEditButton, arg0);
                androidKeyboardClickDone();
            }
        } else {
//            enterKey(homePageElements.searchEditText, arg0 + Keys.RETURN.toString());
            Thread.sleep(2000);
            homePageElements.searchEditButton.click();
            homePageElements.searchMilkButton.click();
        }
    }

    public void iosToggleClose() {
        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            try {
//                Thread.sleep(4000);
                if (homePageElements.iosToggle.isDisplayed())
                    clickElement(homePageElements.iosToggleClose);
            } catch (Exception e) {
            }
        }
    }

    public void addFirstOnSearchpage() throws InterruptedException {
        Thread.sleep(5000);
        clickElement(homePageElements.addFirstItemForMilkSearch);

    }

    public void clickOnStartShoppingButton() throws InterruptedException {
        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            Thread.sleep(5000);
            driver.findElement(By.name("Start shopping")).click();
        } else {
            Thread.sleep(5000);
            clickElement(homePageElements.startShoppingButton);
        }
    }

    public void tapShoppingCartButton() throws InterruptedException {
        Thread.sleep(1000);
        waitForClickableAndClick(homePageElements.clickOnShoppingCartButton);
    }

    public void pickUpModeSetUpOnHomepage() throws InterruptedException {

        waitForLoadingComplete();
        if (homePageElements.inStoreFromHomepage.size() > 0) {
            clickElement(homePageElements.inStoreHomepage);
            if (driver.getPlatformName().equalsIgnoreCase("ios")) {
                waitForLoadingComplete();
                driver.findElement(By.name("whiteRightArrow")).click();
                waitForLoadingComplete();
                Thread.sleep(3000);
                driver.findElement(By.name("Pickup")).click();
                Thread.sleep(5000);
                driver.findElement(By.name("Start shopping")).click();
            } else {
                waitForLoadingComplete();
                clickElement(homePageElements.whiteRightArrow);
                waitForLoadingComplete();
                Thread.sleep(3000);
                clickElement(homePageElements.pickUpButtonOnSignInPage);
                Thread.sleep(5000);
                clickElement(homePageElements.startShoppingButton);
            }

        } else if (homePageElements.deliveryFromHomepage.size() > 0) {
            clickElement(homePageElements.deliveryOnHomePage);
            if (driver.getPlatformName().equalsIgnoreCase("ios")) {
                waitForLoadingComplete();
                driver.findElement(By.name("whiteRightArrow")).click();
                waitForLoadingComplete();
                driver.findElement(By.name("Pickup")).click();
                Thread.sleep(5000);
                driver.findElement(By.name("Start shopping")).click();
            } else {
                waitForLoadingComplete();
                clickElement(homePageElements.whiteRightArrow);
                waitForLoadingComplete();
                Thread.sleep(3000);
                clickElement(homePageElements.pickUpButtonOnSignInPage);
                Thread.sleep(5000);
                clickElement(homePageElements.startShoppingButton);

            }

        } else {
            System.out.println("this is pick up mode");
        }


    }

    public void deliveryModeSetUpOnHomepage() throws InterruptedException {

        waitForLoadingComplete();
        if (homePageElements.inStoreFromHomepage.size() > 0) {
            clickElement(homePageElements.inStoreHomepage);
            if (driver.getPlatformName().equalsIgnoreCase("ios")) {
                waitForLoadingComplete();
                driver.findElement(By.name("whiteRightArrow")).click();
                waitForLoadingComplete();
                clickElement(selectOrderTypePageElements.deliverSignInPage);
                Thread.sleep(5000);
                driver.findElement(By.name("Start shopping")).click();
            } else {
                waitForLoadingComplete();
                clickElement(homePageElements.whiteRightArrow);
                waitForLoadingComplete();
                clickElement(driver.findElement(By.xpath("//*[@resource-id=\"com.safeway.client.android.tomthumb.debug:id/delivery_zipcode\"]")));
//                clickElement(selectOrderTypePageElements.deliverSignInPage);
                Thread.sleep(5000);
                clickElement(homePageElements.startShoppingButton);

            }
        } else if (homePageElements.pickupFromHomepage.size() > 0) {
            clickElement(homePageElements.homepagePickUp);
            if (driver.getPlatformName().equalsIgnoreCase("ios")) {
                waitForLoadingComplete();
                driver.findElement(By.name("whiteRightArrow")).click();
                waitForLoadingComplete();
                clickElement(selectOrderTypePageElements.deliverSignInPage);
                Thread.sleep(2000);
                driver.findElement(By.name("Start shopping")).click();
            } else {
                waitForLoadingComplete();
                clickElement(homePageElements.whiteRightArrow);
                waitForLoadingComplete();
                clickElement(driver.findElement(By.xpath("//*[@resource-id=\"com.safeway.client.android.tomthumb.debug:id/delivery_zipcode\"]")));
//                clickElement(selectOrderTypePageElements.deliverSignInPage);
                clickElement(homePageElements.startShoppingButton);
            }
        } else {
            System.out.println("this is delivery mode");

        }


    }

    public void addItemOnCartPage() {
        try {


            for (int i = 0; i < 12; i++) {
                Thread.sleep(1000);
                clickElement(homePageElements.addFirstItemForMilkCartpage);
            }
        } catch (Exception exe) {


        }
    }

    public void clickOnCancelOnSearch() {
        clickElement(homePageElements.clickOnCancelOnSearchPage);
    }

    public void clickOnPickUpInSignInPage() throws InterruptedException {
        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            waitForLoadingComplete();
            Thread.sleep(4000);
            driver.findElement(By.name("Pickup")).click();
        } else {
            waitForLoadingComplete();
            Thread.sleep(4000);
            clickElement(homePageElements.pickUpButtonOnSignInPage);
        }
    }

    public void signOutIfSignedIn() {
        try {
            if (homePageElements.homeTab.isDisplayed()) {
                clickElement(homePageElements.homeTab);
                clickMenuIcon();
                menuPageElements.signOutButton.click();
                menuPageElements.confirmSignOutButton.click();
            }
        } catch (Exception e) {
            return;
        }
    }

    public void clickOnAnySubCategoryFromTheCategorySelected() {
        waitForLoadingComplete();
        new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOf(homePageElements.subCategoryNames.get(0)));
        clickElement(homePageElements.subCategoryNames.get(0));
        waitForLoadingComplete();

    }

    public void viewAllRelatedProducts() {
        clickElement(homePageElements.viewAllDealButton);
    }


    public void scrollDownForCategory(String item) {
//        scrollDownForElement(findElementByName(item));
        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            WebElement element = driver.findElementByName(item);
            for (int i = 0; i<10; i++) {
                if (element.isDisplayed()) {
                    return;
                } else {
                    scrollDown();
                }
            }
        } else {
            for (int i = 0; i < 10; i++) {
                ArrayList<MobileElement> elementList = (ArrayList<MobileElement>) driver.findElementsByClassName("android.widget.TextView");
                for (MobileElement element : elementList) {
                    if (element.getText().equalsIgnoreCase(item)) {
                        return;
                    }
                }
                scrollDown();
            }
        }
    }

    public boolean isRefineButtonDisplayed() {
        return isElementDisplayed(homePageElements.refineButton);
    }

    public boolean isTotalCountDisplayed(){
        return isElementDisplayed(homePageElements.totalCount);
    }

    public boolean isProductsSelected(){
        boolean isSelected = false;
        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            if (homePageElements.productsToggle.isEnabled()) {
                isSelected = true;
            }
        } else {
            if (homePageElements.productsToggle.getAttribute("selected").equalsIgnoreCase("true")) {
                isSelected = true;
            }
        }
        return isSelected;
    }

    public boolean isDealsSelected(){
        boolean isSelected = false;
        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            if (homePageElements.dealsToggle.isEnabled()) {
                isSelected = true;
            }
        } else {
            if (homePageElements.dealsToggle.getAttribute("selected").equalsIgnoreCase("true")) {
                isSelected = true;
            }
        }
        return isSelected;
    }


    public void firstStoreAddressValue() {

       waitForDisplayed(selectOrderTypePageElements.storeAddress.get(0) ,1);

        firstStoreAddress =  selectOrderTypePageElements.storeAddress.get(0).getText();
    }

    public void verifyStoreAddress() {

        waitForDisplayed(pageElements.addressFieldOnSlotSelectionScreen,20);
       String actualAddress =  pageElements.addressFieldOnSlotSelectionScreen.getText();

      Assert.assertTrue(actualAddress.toLowerCase().contains(firstStoreAddress.toLowerCase().substring(0,5)));


    }

    public void clickSearchButton() {
        homePageElements.searchButton.click();
//        driver.hideKeyboard();
    }
}