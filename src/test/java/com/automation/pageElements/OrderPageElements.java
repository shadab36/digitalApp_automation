package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.CacheLookup;

import java.util.List;

public class OrderPageElements {

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'Orders' AND visible == 1")
    @AndroidFindBy(id = "tvTitle")
    public MobileElement orderTitle;

    @iOSXCUITFindBy(accessibility = "Back")
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Close\"]")
    @CacheLookup
    public MobileElement backButtonToMenu;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel Order\"]")
    @AndroidFindBy(id = "cancel_order")
    @CacheLookup
    public MobileElement cancelOrderButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Order Number' AND visible == 1")
    @AndroidFindBy(id = "order_number")
    public List<MobileElement> orderNumberList;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'Cancel Order' AND visible == 1")
    @AndroidFindBy(id = "alertTitle")
    @CacheLookup
    public MobileElement cancelOrderAlertWindow;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Cancel Order' AND visible == 1")
    @AndroidFindBy(id = "android:id/button1")
    @CacheLookup
    public MobileElement cancelOrderConfirmButton;

    @iOSXCUITFindBy(accessibility = "Past Orders")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Past Orders\")")
    public MobileElement pastOrder;

    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' And name == 'Edit Order' ")
    @AndroidFindBy(id = "edit_button")
    public MobileElement editOrder;

    @iOSXCUITFindBy(accessibility = "Past Orders")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Past Orders\")")
    public MobileElement pastOrderText;

    @iOSXCUITFindBy(accessibility = "Current Orders")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Current Orders\")")
    public MobileElement currentOrderText;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeButton[1]")
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]")
    public MobileElement needHelpText;


    @iOSXCUITFindBy(xpath = "//*[@label=\"Order history\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Order history\"]")
    public MobileElement orderHistoryText;

}
