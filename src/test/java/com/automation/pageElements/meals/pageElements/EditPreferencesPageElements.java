package com.automation.pageElements.meals.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class EditPreferencesPageElements {

    @iOSXCUITFindBy(iOSNsPredicate = "name == \"menu:id/filters-button\"")
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'filters-button')]")
    public MobileElement editPreferenceButton;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Reset user data\"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Reset user data\"]")
    public MobileElement resetUserData;

    @iOSXCUITFindBy(xpath = "//*[@label='OK' or @label='Ok']")
    @AndroidFindBy(id = "android:id/button1")
    public MobileElement confirmResetPopUp;

    @iOSXCUITFindBy(xpath = "//*[@label='OK' or @label='Ok']")
    @AndroidFindBy(id = "android:id/alertTitle")
    public MobileElement resetSuccessFulText;
}
