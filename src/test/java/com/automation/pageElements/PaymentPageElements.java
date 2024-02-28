package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PaymentPageElements {
    //back button
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Checkout' AND visible == 1")
    @AndroidFindBy(accessibility = "Navigate up")
    public MobileElement backToCheckoutPageButton;

    //cvv window title
    //@iOSXCUITFindBy(accessibility = "Current Payment Method")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView//*[@value=\"Confirm CVV\"]")
    //  @AndroidFindBy(id = "confirm_cvv_et")
    //@AndroidFindBy(xpath = "//*[@text=\"Payment\"]")
    @AndroidFindBy(xpath="//*[@content-desc=\"Confirm CVV\"]")
    public MobileElement cvvWindowTitle;

    //Continue to slot selection button
    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Continue\")]")
    @AndroidFindBy(xpath = "//*[@text=\"Continue\"]")
    public MobileElement continueCTA;

    //Continue to slot selection button
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"editCardButton\"]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id,\"edit_card\")]")
    public MobileElement editPayment;


    //continue button
    @iOSXCUITFindBy(xpath = "//*[@label=\"Continue\"]")
    //   @AndroidFindBy(xpath = "//*[@text=\"Continue\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"submit\"]")
    public MobileElement continueButton;

    //cvv
    @iOSXCUITFindBy(xpath = "//*//XCUIElementTypeTextField[contains(@label,\"Confirm CVV\")]")
//    @iOSXCUITFindBy(xpath = "//*/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
//    @iOSXCUITFindBy(xpath = "//*[@label=\"Confirm CVV\"]/following::XCUIElementTypeTextField")
  //   @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
//    @iOSXCUITFindBy(xpath = "//*[@label=\"Confirm CVV\"]/following::XCUIElementTypeTextField")
    //@iOSXCUITFindBy(className = "XCUIElementTypeTextField")

    //  @AndroidFindBy(id = "edit_text")
    //  @AndroidFindBy(id = "textinput_placeholder")
    //@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TextView[1]")
    //@AndroidFindBy(xpath = "//android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TextView[1]")
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.EditText[1] | //android.widget.FrameLayout[1]/android.widget.TextView[1] | //android.widget.FrameLayout[1]/android.widget.EditText[1]")
    public MobileElement cvvEditText;

    //Continue to contact info
   // @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Continue\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Confirm CVV\"]")
    //@AndroidFindBy(xpath = "//*[@text=\"Continue to contact info\"]")
    //Element added due to change in checkout
    @AndroidFindBy(xpath = " //*[contains(@resource-id,\"cvv_button\")]")
    public MobileElement continueToContactInfo;


    @iOSXCUITFindBy(xpath = "//*[@value=\"Continue to contact info\"]")
    public MobileElement continuetoContactbtn;

    @iOSXCUITFindBy(xpath = "//*[@label=\"done\" or @label=\"Done\"]")
    public MobileElement doneButton;

    @AndroidFindBy(id = "btn_next")
    public MobileElement cvvEnter;

    //enter cvv
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Confirm CVV' AND visible == 1")
    @AndroidFindBy(id = "btn_next")
    public MobileElement creditCvvNextButton;

    //name on card

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
    //@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name == 'Full Name' AND visible == 1")
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public MobileElement nameOnCard;

    //card number
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name == 'Credit Card Number' AND visible == 1")
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public MobileElement cardNumber;

    //Expiration Month year
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name == 'Expiration Date' AND visible == 1")
    @AndroidFindBy(xpath = "//*[@resource-id=\"exp\"]")
    public MobileElement expirationMonthYear;

    //Billing zip
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Payment V2\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@resource-id=\"cc-zip\"]")
    public MobileElement billingZip;

    // @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Add Credit Card\")]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Add Credit Card\"]")
    @AndroidFindBy(xpath = "//*[contains(@text,\"Add Credit Card\")]")
    public MobileElement payment;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Store card details. (optional)\"]")
    @AndroidFindBy(xpath="//*[@text=\"Store card details. (optional)\"]")
    public MobileElement saveCardDetailsCheckbox;

    @AndroidFindBy(xpath="//*[@text=\"Save\"]")
    public MobileElement saveButton;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Continue\")]")
    @AndroidFindBy(xpath = "//*[@text=\"Continue to review order\"] | //*[@text=\"Save\"]")
    public MobileElement continueToReviewOrderCTA;

    @iOSXCUITFindBy(xpath = "//*[@label='Continue']")
    public MobileElement continueBtnFPPayment;


}
