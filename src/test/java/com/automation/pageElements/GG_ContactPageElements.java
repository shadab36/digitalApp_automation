package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class GG_ContactPageElements {

    @iOSXCUITFindBy(iOSNsPredicate = "PENDING")
    @AndroidFindBy(accessibility = "First Name Field is required")
    public MobileElement firstNameLabel;

    @iOSXCUITFindBy(iOSNsPredicate = "PENDING")
    @AndroidFindBy(accessibility = "Last Name Field is required")
    public MobileElement lastNameLabel;

    @iOSXCUITFindBy(iOSNsPredicate = "PENDING")
    @AndroidFindBy(accessibility = "Phone Number Field is required")
    public MobileElement phoneNumberLabel;

    @iOSXCUITFindBy(iOSNsPredicate = "PENDING")
    @AndroidFindBy(xpath = "//*[@text='Phone Number']")
    public MobileElement phoneNumberField;
}
