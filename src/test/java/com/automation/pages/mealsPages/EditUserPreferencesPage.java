package com.automation.pages.mealsPages;

import com.automation.pageElements.meals.pageElements.EditPreferencesPageElements;
import com.automation.pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class EditUserPreferencesPage extends BasePage {

    EditPreferencesPageElements editPreferencesPageElements = new EditPreferencesPageElements();

    public EditUserPreferencesPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), editPreferencesPageElements);
    }

    private void goToAdminSettings() {
        waitForDisplayed(editPreferencesPageElements.editPreferenceButton, 10);
        MobileElement longpress = editPreferencesPageElements.editPreferenceButton;
        LongPressOptions longPressOptions = new LongPressOptions();
        longPressOptions.withDuration(Duration.ofSeconds(3)).withElement(ElementOption.element(longpress));
        TouchAction action = new TouchAction(driver);
        action.longPress(longPressOptions).release().perform();
    }

    public void resetAdminSettings() {
        goToAdminSettings();
        scrollDownForElement(editPreferencesPageElements.resetUserData);
        editPreferencesPageElements.resetUserData.click();
        waitForClickableAndClick(editPreferencesPageElements.confirmResetPopUp);
        waitForDisplayed(editPreferencesPageElements.resetSuccessFulText);
    }

    public void goToDietPreferences() {
        editPreferencesPageElements.editPreferenceButton.click();
    }
}
