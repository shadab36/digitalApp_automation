package com.automation.pages;

import com.automation.pageElements.GG_FreshPassMemberTab_Elements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MemberFreshPassPage extends BasePage {
    public GG_FreshPassMemberTab_Elements ggFreshPassMemberTabElements = new GG_FreshPassMemberTab_Elements();

    public MemberFreshPassPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), ggFreshPassMemberTabElements);
    }

    public void verifyHowMuchYouCouldSave() {
        scrollDown(3);
        waitForDisplayed(ggFreshPassMemberTabElements.howMuchYouCouldSave);
        Assert.assertTrue(ggFreshPassMemberTabElements.howMuchYouCouldSave.isDisplayed());
    }

    public void clickOnSaveUpToDollarAYearLink() throws InterruptedException {
        Thread.sleep(5000);
        String text = ggFreshPassMemberTabElements.saveUpToDollarAYear.getText();
        System.out.println("Text value : " + text);
        String newTest = text.substring(46, 50);
        System.out.println(newTest);
        int gY = ggFreshPassMemberTabElements.saveUpToDollarAYear.getCenter().getY();
        int gX = ggFreshPassMemberTabElements.saveUpToDollarAYear.getCenter().getX();
        System.out.println(gX + " " + gY);
        tapCoordinate(283, 1524);
        clickElement(ggFreshPassMemberTabElements.saveUpToDollarAYear);
    }

    public void verifyEstimatedSavings() {
        waitForDisplayed(ggFreshPassMemberTabElements.estimatedSavings);
        Assert.assertTrue(ggFreshPassMemberTabElements.estimatedSavings.isDisplayed());
    }

    public void verifyEstimatedSavingsText() {
        waitForDisplayed(ggFreshPassMemberTabElements.estimatedSavingsText);
        Assert.assertTrue(ggFreshPassMemberTabElements.estimatedSavingsText.isDisplayed());
    }


}
