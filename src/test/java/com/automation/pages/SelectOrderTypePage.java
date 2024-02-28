package com.automation.pages;


import com.automation.helpers.ThreadLocalHelper;
import com.automation.mobile.appium.AppiumDevice;
import com.automation.mobile.appium.AppiumDeviceManager;
import com.automation.pageElements.HomePageElements;
import com.automation.pageElements.SelectOrderTypePageElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class SelectOrderTypePage extends BasePage {
    private SelectOrderTypePageElements selectOrderTypePageElements = new SelectOrderTypePageElements();
    public HomePageElements homePageElements=new HomePageElements();

    public SelectOrderTypePage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), selectOrderTypePageElements);
    }

    public void waitForSelectOrderTypePageDisplayed() {
        try {
            waitVar.until(ExpectedConditions.visibilityOf(selectOrderTypePageElements.title));
        } catch (Exception e) {
            waitVar.until(ExpectedConditions.visibilityOf(selectOrderTypePageElements.title2));

        }

    }


    public void clickDelivery() {
        waitForLoadingComplete();
        waitForDisplayed(selectOrderTypePageElements.deliverToZipButton, 10);
        selectOrderTypePageElements.deliverToZipButton.click();
        waitForLoadingComplete();
        if (!isElementDisplayed(selectOrderTypePageElements.startShoppingButton,1)){
            selectOrderTypePageElements.deliverToZipButton.click();
            waitForLoadingComplete();
        }
    }

    public void clickInstore() {
        waitForLoadingComplete();
        selectOrderTypePageElements.instoreZipButton.click();
        waitForLoadingComplete();
        if (!isElementDisplayed(selectOrderTypePageElements.startShoppingButton,1)){
            selectOrderTypePageElements.instoreZipButton.click();
            waitForLoadingComplete();
        }
    }

    public void VerifyStartShoppingButton() {
        waitVar.until(ExpectedConditions.visibilityOf(selectOrderTypePageElements.startShoppingButton));
    }

    public void clickStartShoppingButton() {
        waitForClickableAndClick(selectOrderTypePageElements.startShoppingButton);
    }

  /*  public void clickStartShoppingButton() throws InterruptedException {
        waitForClickableAndClick(selectOrderTypePageElements.startShoppingButton);
        if (driver.getPlatformName().equalsIgnoreCase("ios"))
            waitforUMAhomeScreen(selectOrderTypePageElements.loadingOrderType);
    }*/

    public void startShoppingButtonEnabled() {
        //  waitForClickableAndClick(selectOrderTypePageElements.startShoppingButton);
        isElementDisplayed(selectOrderTypePageElements.startShoppingButton);
    }

    /*  public void clickStartShoppingButton() throws InterruptedException {
          waitForClickableAndClick(selectOrderTypePageElements.startShoppingButton);
          if (driver.getPlatformName().equalsIgnoreCase("ios"))
              waitforUMAhomeScreen(selectOrderTypePageElements.loadingOrderType);
      }
  */
 /*   public void startShoppingButtonEnabled(){
      //  waitForClickableAndClick(selectOrderTypePageElements.startShoppingButton);
        isElementDisplayed(selectOrderTypePageElements.startShoppingButton);
    }
*/
    public void waitForDownloadDifferentBannerDisplayed() {
        waitForDisplayed(selectOrderTypePageElements.downLoadDifferentAppTitle);
    }

    public void waitForNotification() {
        waitForDisplayed(selectOrderTypePageElements.notificationText);
    }

    public void clickNotAllowNotification() {
        clickElement(selectOrderTypePageElements.dontAllowNotificationButton);
    }

    public void clickPickUp() {
        waitForLoadingComplete();
        selectOrderTypePageElements.pickUpButton.click();
        waitForLoadingComplete();
        if (!isElementDisplayed(selectOrderTypePageElements.searchZipCodeButton,1)){
            selectOrderTypePageElements.pickUpButton.click();
            waitForLoadingComplete();
        }
    }

    public void enterZipCode(String zipcode) {
        enterKey(selectOrderTypePageElements.pickUpZipodeEditText, zipcode);
    }

    public void clickSearchButton() {
        clickElement(selectOrderTypePageElements.searchZipCodeButton);
    }

    public void waitForDUGListDisplayed() {
        waitForDisplayed(selectOrderTypePageElements.dugStoreText);
    }

    public void selectAnyStore() {
        if (getPlatformName().equalsIgnoreCase("ios")) {
            if (getCurrentBanner().equalsIgnoreCase("tomthumb")) {
                if ((!getCurrentBanner().equalsIgnoreCase("tomthumb")) && selectOrderTypePageElements.dugStoreBanner.getAttribute("label").contains(getCurrentBanner())) {
                    scrollDown();
                    clickElement(selectOrderTypePageElements.dugStoreText);
                } else if ((getCurrentBanner().equalsIgnoreCase("tomthumb")) && selectOrderTypePageElements.dugStoreBanner.getAttribute("label").contains("Tom")) {
                    scrollDown();
                    clickElement(selectOrderTypePageElements.dugStoreText);
                } else {
                    scrollDown();
                    clickElement((WebElement) driver.findElements(By.xpath("//*[contains(@label,\"mi.\")]")).get(1));
                }
            }
        }

        else{
            if ((!getCurrentBanner().equalsIgnoreCase("tomthumb")) && selectOrderTypePageElements.dugStoreBanner.getAttribute("content-desc").contains(getCurrentBanner()))
                clickElement(selectOrderTypePageElements.dugStoreText);
            else if ((getCurrentBanner().equalsIgnoreCase("tomthumb")) && selectOrderTypePageElements.dugStoreBanner.getAttribute("content-desc").contains("Tom"))
                clickElement(selectOrderTypePageElements.dugStoreText);
            else {
                scrollDown();
                clickElement((WebElement) driver.findElements(By.xpath("//*[contains(@content-desc,\"Radio Button  with\")]")).get(0));
            }
        }
    }

    public void selectStore() {
        String store = ThreadLocalHelper.testCaseData.get().get("INSTORE_STORE");
        AppiumDevice device = AppiumDeviceManager.getDevice();
        if (device.getPlatform().equalsIgnoreCase("ios")) {
//            scrollDownForElement(gg_shoppingModePageElements.firstStoreCard);
            boolean storeFound = false;
            int maxScrolls = 10;
            int counter = 0;
            while (!storeFound) {
                while (counter < maxScrolls) {
                    for (int i = 0; i < selectOrderTypePageElements.allStoreCardsList.size(); i++) {
                        String add = selectOrderTypePageElements.allStoreCardsList.get(i).getText();
                        if (add.contains(store)) {
                            clickElement(selectOrderTypePageElements.allStoreCardsList.get(i));
                            if (!selectOrderTypePageElements.startShoppingButton.isEnabled()) {
                                clickElement(selectOrderTypePageElements.allStoreCardsList.get(i));
                            }

                            counter = maxScrolls;
                            storeFound = true;
                            break;
                        }
                    }
                    if (!storeFound) {
                        scrollDown();
                        counter++;
                    }
                }
                if (counter >= maxScrolls) {
                    break;
                }
            }
        }
        else{
            for (int i = 0; i < 10; i++) {
                ArrayList<MobileElement> elementList = (ArrayList<MobileElement>) driver.findElementsByClassName("android.widget.TextView");
                for (MobileElement element : elementList) {
                    if (element.getText().contains(store)) {
                        clickElement(element);
                        return;
                    }
                }
                scrollDown();
            }
        }
    }

    public void waitForZipcodeFieldDisplayed() {
        waitForDisplayed(selectOrderTypePageElements.pickUpZipodeEditText);
    }


    public void selectInStoreDeliveryOpion() {
        clickElement(selectOrderTypePageElements.InStore);
    }

    public void clickOnStartShopping() throws InterruptedException {
        try {


            if (driver.getPlatformName().equalsIgnoreCase("ios")) {
                Thread.sleep(50000);
                clickElement(driver.findElement(By.name("Start shopping")));
            } else {
                Thread.sleep(4000);
                clickElement(homePageElements.startShoppingButton);

            }
        } catch (Exception ex) {

        }
    }

    public void validateFirstStore() throws InterruptedException {
      //  waitForDUGListDisplayed();
        Thread.sleep(9000);

        if(driver.getPlatformName().equalsIgnoreCase("Android") ){
       String value = selectOrderTypePageElements.storeListRadioBtn.get(0).getAttribute("checked");
       Assert.assertTrue(value.equalsIgnoreCase("true"));}else{

            waitForDisplayed(selectOrderTypePageElements.storeListRadioBtn.get(0),10);

             selectOrderTypePageElements.storeListRadioBtn.get(0).isDisplayed();

        }

       //*[@content-desc="Radio Button Selected with Store Address 1.94miles awaysafeway6790 Bernal Ave Pleasanton, CA 94566Locker Pickup"]//*[@resource-id="com.safeway.client.android.safeway.debug:id/btn_select"]
    }
}
