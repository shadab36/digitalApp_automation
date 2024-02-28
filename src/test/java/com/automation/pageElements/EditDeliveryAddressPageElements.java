package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.CacheLookup;

public class EditDeliveryAddressPageElements {
    //zip code
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name CONTAINS 'Zipcode' AND visible == 1")
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public MobileElement zipcodeTextField;

    //address line 1
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name CONTAINS 'Address' AND visible == 1")
    @AndroidFindBy(xpath = "//*[@text=\"Street address\"] | //android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]")
    public MobileElement addressLine1TextField;

    //address line 1
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name CONTAINS 'Address' AND visible == 1")
    @AndroidFindBy(xpath = "//*[contains(@resource-id,\"addressLine2TextView\")]//*[contains(@resource-id,\"edit_text\")]")
    public MobileElement addressLine2TextField;

    //apt number
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name CONTAINS 'Apartment' AND visible == 1")
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    public MobileElement aptTextField;

    //enter comments
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name CONTAINS 'Comments' AND visible == 1")
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Comments\")")
    public MobileElement deliveryInstructionTextField;

    //back button: android arrow, ios arrow
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[6]")
    @AndroidFindBy(accessibility = "Navigate up")
    public MobileElement topLeftArrowBack;


    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Add new address'")
    public MobileElement addNewAddress;

    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Add Delivery Address'")
    public MobileElement addDeliveryAddressTitle;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Residential'")
    @AndroidFindBy(xpath = "//*[contains(@text, 'Residential')]")
    public MobileElement addressAdded;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Save' AND visible == 1")
    @AndroidFindBy(id= "btn_save")
    public MobileElement saveButton;

}
