package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class GG_MenuPageElements {

    @AndroidFindBy(accessibility = "Sign Out button")
    @iOSXCUITFindBy(accessibility = "Sign Out")
    public MobileElement signOutButton;

    @AndroidFindBy(accessibility = "close")
    public MobileElement closeIcon;
}
