package com.automation.steps;

import com.automation.mobile.appium.AppiumDevice;
import com.automation.mobile.appium.AppiumDeviceManager;
import com.automation.mobile.appium.AppiumDriverManager;
import com.automation.pages.MemberFreshPassPage;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MemberFreshPassPageSteps {

    public AppiumDriver driver = AppiumDriverManager.getDriver();
    public AppiumDevice device = AppiumDeviceManager.getDevice();
    MemberFreshPassPage memberFreshPassPage = new MemberFreshPassPage(driver);


    @When("user verify How much you could save")
    public void user_verify_how_much_you_could_save(){
        memberFreshPassPage.verifyHowMuchYouCouldSave();
    }

    @When("user click on the dollar 395 link")
    public void user_click_on_the_dollar_395_link() throws InterruptedException {
        memberFreshPassPage.clickOnSaveUpToDollarAYearLink();
    }

    @Then("user should see Estimated Savings is appear with text")
    public void user_should_see_estimated_savings_is_appear_with_text(){
        memberFreshPassPage.verifyEstimatedSavings();
        memberFreshPassPage.verifyEstimatedSavingsText();
    }


}
