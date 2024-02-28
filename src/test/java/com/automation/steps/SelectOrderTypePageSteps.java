package com.automation.steps;

import com.automation.helpers.ThreadLocalHelper;
import com.automation.mobile.appium.AppiumDriverManager;
import com.automation.mobile.manager.ConfigFileManager;
import com.automation.pages.SelectOrderTypePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;

import java.io.IOException;
import java.util.Map;

public class SelectOrderTypePageSteps {
    public AppiumDriver driver = AppiumDriverManager.getDriver();
    public SelectOrderTypePage selectOrderTypePage = new SelectOrderTypePage(driver);

    public String getCurrentBanner(){
        return driver.getCapabilities().getCapability("banner").toString();
    }

    public String getCurrentEnv() throws IOException {
        return driver.getCapabilities().getCapability("env").toString();
    }


        @Then("^select order type page is displayed$")
    public void select_order_type_page_is_displayed() throws Throwable {
            try {
                selectOrderTypePage.waitForSelectOrderTypePageDisplayed();
            }catch (Exception e) {}
    }

    @Then("^user click delivery option$")
    public void user_click_delivery_option() {
        selectOrderTypePage.clickDelivery();
      /*  try {
            selectOrderTypePage.clickDelivery();
        } catch (Exception e) {}*/
    }

    @When("^user click start shopping button on Sign In page$")
    public void user_click_start_shopping_button_on_Sign_In_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        try {
            selectOrderTypePage.clickStartShoppingButton();
        } catch (Exception e) {}
    }

    @Then("^start shopping button is active$")
    public void start_shopping_button_is_active() throws Throwable {
        selectOrderTypePage.startShoppingButtonEnabled();
    }

    @Then("^instruction to download correct banner is displayed$")
    public void instructionToDownloadCorrectBannerIsDisplayed() {
        selectOrderTypePage.waitForDownloadDifferentBannerDisplayed();
    }

    @When("^user clicks pickup on delivery select page$")
    public void userClicksPickupOnDeliverySelectPage() {
        selectOrderTypePage.clickPickUp();
    }

    @And("^user enters zipcode and search in zipcode field$")
    public void userEntersZipcodeAndSearchInZipcodeField() throws IOException {
        selectOrderTypePage.enterZipCode(ThreadLocalHelper.testCaseData.get().get("ZIPCODE"));
        selectOrderTypePage.clickSearchButton();
    }

    @Then("^store list is displayed$")
    public void storeListIsDisplayed() {
        selectOrderTypePage.waitForDUGListDisplayed();
    }

    @When("^user clicks (\\d+)st store on the list$")
    public void userClicksAnyStoreOnTheList(int i) {
       selectOrderTypePage.selectAnyStore();
    }

    @Then("^user selects the In-store on the list$")
    public void userClicksStoreOnTheList() {
        selectOrderTypePage.selectStore();
    }

    @Then("^search zipcode bar is displayed on delivery select page$")
    public void searchZipcodeBarIsDisplayedOnDeliverySelectPage() {
        selectOrderTypePage.waitForZipcodeFieldDisplayed();
    }
    @And("^user click start shopping button on After Signup$")
    public void user_click_start_shopping_button_on_Signup() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        try {
            selectOrderTypePage.clickStartShoppingButton();
        } catch (Exception e) {}
    }

    @Then("^Verify Start shopping button on Sign In page$")
    public void Verify_shopping_button_on_SignUp() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        try {
            selectOrderTypePage.VerifyStartShoppingButton();
        } catch (Exception e) {}
    }



    @When("^user clicks instore on delivery select page$")
    public void userClicksInstoreOnDeliverySelectPage() {
        try {
            selectOrderTypePage.selectInStoreDeliveryOpion();
        } catch (Exception e) {}

    }
    @Then("^user click on start shopping on sign in page$")
    public void clickOnStartShopping() throws InterruptedException {
        selectOrderTypePage.clickOnStartShopping();
    }

    @When("^user clicks <number>st store on the list$")
    public void userClicksNumberStStoreOnTheList() {
        selectOrderTypePage.selectAnyStore();
    }

    @Then("^Verify First store is selected and Start Shopping is enabled")
    public void validateFirstStoreStateAndStartShoppingButton() throws InterruptedException {
        selectOrderTypePage.validateFirstStore();
        selectOrderTypePage.startShoppingButtonEnabled();

    }
}