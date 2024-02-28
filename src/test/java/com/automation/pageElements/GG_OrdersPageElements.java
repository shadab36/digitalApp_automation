package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;

public class GG_OrdersPageElements {

    @AndroidFindBy(id = "tvTitle")
    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Orders\"")
    public MobileElement ordersHeaderTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Your Order is Pending\"]")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Cancel Order' ")
    public MobileElement pendingOrderLabel;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Cancel Order' ")
    @AndroidFindBy(id = "cancel_order")
    @CacheLookup
    public MobileElement cancelOrderButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"You have no pending orders.\"]")
    @iOSXCUITFindBy(id = "You have no pending orders.")
    public MobileElement noPendingOrders;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND label == 'Cancel Order'")
    public MobileElement cancelOrderPopUpButton;

    @AndroidFindBy(id = "edit_text")
    @iOSXCUITFindBy(accessibility = "Enter Address Line One. Field is required")
    public MobileElement deliveryAddressField;

    @AndroidFindBy(xpath = "//*[contains(@content-desc,'1-hour')]")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name BEGINSWITH'1‑h'")
    public WebElement deliveryWindow1h;

    @AndroidFindBy(xpath = "//*[contains(@content-desc,'2-hour')]")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name BEGINSWITH'2‑h'")
    public WebElement deliveryWindow2h;

    @AndroidFindBy(xpath = "//*[contains(@content-desc,'4-hour')]")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name BEGINSWITH '4‑h'")
    public WebElement deliveryWindow4h;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Save'")
    @AndroidFindBy(accessibility = "Save")
    public MobileElement saveButton;

    @AndroidFindBy(id = "order_number_info")
    @iOSXCUITFindBy(xpath = "//*[@label='Order Number']//following-sibling:: XCUIElementTypeStaticText[@visible='true']")
    public MobileElement orderNumberOrderConfirmationPage;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'order_status_container')]//*[contains(@resource-id,'order_number')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Cancel Order']//following-sibling:: XCUIElementTypeStaticText[3]")
    public MobileElement orderNumberOrdersPage;
}
