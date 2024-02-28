package com.automation.pageElements;

import io.appium.java_client.MobileElement;

import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

import java.util.List;

public class NewCheckoutPageElements {


    @AndroidFindBy(id="dug_chip")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Pickup\"] | //XCUIElementTypeStaticText[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[2]")
    public MobileElement slotPickuptoggle;


    @AndroidFindBy(id="delivery_chip")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
    public MobileElement slotDeliveryToggle;

    //@iOSXCUITFindBy(xpath ="//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]")
    @iOSXCUITFindBy(xpath="//*[@value=\"Edit\"] | //*[@label=\"Edit\"]")
    //@iOSXCUITFindBy(xpath ="//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]")
    @iOSXCUITFindBy(xpath="//*[@value=\"Edit\"]")
    public MobileElement slotEditBtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeTextField[1]")
    public MobileElement slotsearchZip;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[1]/XCUIElementTypeButton[2]")
    public MobileElement submitZipArrowBtn;

    @iOSXCUITFindBy(xpath ="//XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]")
    public MobileElement firstStore;

    @iOSXCUITFindBy(xpath ="//XCUIElementTypeCollectionView[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]")
    public MobileElement horizontal_FirstStore;

    @iOSXCUITFindBy(xpath ="//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeButton[1]")
    public MobileElement scndStore;

    @iOSXCUITFindBy(xpath ="//XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeButton[1]")
    public MobileElement thirdStore;

    @iOSXCUITFindBy(className ="XCUIElementTypeButton")
    public List <MobileElement> storeButtons;


    @iOSXCUITFindBy(xpath ="//AppiumAUT/XCUIElementTypeApplication[1]/XCUIElementTypeWindow[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
    public MobileElement numericKeyboard;

    @iOSXCUITFindBy(xpath ="//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]")
    public MobileElement allStoreCards;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
    public MobileElement selectPickupStoreTxt;

    @iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[1]")
    public List<MobileElement> stores;

    @iOSXCUITFindBy(xpath ="//XCUIElementTypeCell[20]/XCUIElementTypeButton[1]")
    public MobileElement lastStore;


    @iOSXCUITFindBy(xpath ="XCUIElementTypeOther[1]/XCUIElementTypeStaticText[3]")
    public List<MobileElement> driveUpGo;


    @iOSXCUITFindBy(className="XCUIElementTypeKey")
    public List<MobileElement> numericKeys;

    @iOSXCUITFindBy(xpath ="//*[@name=\"viewStoreListView\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
    public MobileElement sliderIcon;

    @iOSXCUITFindBy(xpath ="//XCUIElementTypeCell[5]/XCUIElementTypeButton[1]")
    public MobileElement slideUp5thStore;

    @iOSXCUITFindBy(xpath ="//*[@name=\"viewStoreListView\"]//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]")
    public MobileElement slideUp2ndStore;


    @iOSXCUITFindBy(xpath="//*[@label=\"Map View\"] | //*[@name=\"viewStoreMapView\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]")
    public MobileElement storePin;

    //continue to payment button on slot selection page
    @AndroidFindBy(id="slot_selection_btn")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeOther[2]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]")
    public MobileElement continueToPaymentBtn;

    @AndroidFindBy(id="payment_title")
    @iOSXCUITFindBy(xpath="//*[@value=\"Enter Card Details\"]")
    public MobileElement enterCardDeatilsPage;

    //continue button credit card form
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Continue\")")
    @iOSXCUITFindBy(xpath="//*[@label=\"Continue\"]")
    public MobileElement continueBtn;

    @iOSXCUITFindBy(xpath="//*[@label=\"Done\"]")
    public MobileElement keypadDoneBtn;


    @AndroidFindBy(xpath="//*[@text=\"Confirm CVV\"]")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeScrollView//*[@value=\"Confirm CVV\"]")
    public MobileElement confirmCvvTxt;

    @iOSXCUITFindBy(xpath="//*[@label=\"Contact Info\"]")
    public MobileElement contactInfoPage;



    //@AndroidBy(id="bottom_sheet_close")
  //  @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ImageView[1]")
//    @AndroidFindBy(xpath ="//android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView[1]")
    @AndroidBy(id="btnClose")

    @iOSXCUITFindBy(xpath="//*[@label=\"Close\"]")
    public MobileElement closeButton;

    //@AndroidBy(id="secondaryButton")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.Button[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"No\"]")
    //XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[2]
    public MobileElement confirmNo;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]|//XCUIElementTypeButton[@label=\"Continue to contact info\"]|//XCUIElementTypeButton[@label=\"Continue to slot selection\"]")
    public MobileElement continueToReviewOrder;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@label=\"Continue to slot selection\"]")
    public MobileElement continueToSLotSelection;

   // @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@label=\"Continue to contact info\"]")
   // public MobileElement continueToContactInfo;

    //checkout summary Page

    @AndroidFindBy(id="tv_rewards_title")
    @iOSXCUITFindBy(xpath="//*[@label=\"Your order\"]")
    public MobileElement yourorderTxt;

    @AndroidFindBy(id="textViewPayment")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\" Enter payment\"]|//XCUIElementTypeStaticText[@label=\"Enter payment\"]|//XCUIElementTypeStaticText[@name=\"Enter payment\"]|//*[@label=\"Enter payment\"]|//*[@label=\" Enter payment\"]")
    public MobileElement paymentCard;

    //CVV Screen
    @iOSXCUITFindBy(xpath="//*[@label=\"Edit\"]")
    public MobileElement editOnCvvScreen;

    //Continue to contact info
    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Continue\")]")
    @AndroidFindBy(xpath = "//*[@text=\"Continue to contact info\"]")
    public MobileElement continueToContactInfo;


    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Place\")]|//XCUIElementTypeButton[@label=\"Place order\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Place order\"]")
    public MobileElement placeOrderCTA;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Enter first name\")")
    public MobileElement enterFirstname;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[2]")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Enter last name\")")
    public MobileElement enterLastname;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[3]")

    @iOSXCUITFindBy(xpath = "//*[@label=\"Text me my order status.\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Text me my order status\"]")
    public MobileElement textmyOrderStatusMessage;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Turn on order status text messages?\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Turn on order status text messages?\"]")
    public MobileElement turnOnTextMessage;


   /* @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Place\")]")
    @AndroidFindBy(xpath = "//*[@text=\"Place order\"]")
    public MobileElement placeOrderCTA;
    //  @iOSXCUITFindBy(xpath = "//*[@label=\"First Name textfield, field is required.\"]")
    @iOSXCUITFindBy(xpath = "//*[@name=\"firstNameField\"]")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Enter first name\")")
    public MobileElement enterFirstname;

    //   @iOSXCUITFindBy(xpath = "//*[@label=\"Last Name textfield, field is required.\"]")
    @iOSXCUITFindBy(xpath = "//*[@name=\"lastNameField\"]")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Enter last name\")")
    public MobileElement enterLastname;*/

    //   @iOSXCUITFindBy(xpath = "//*[@label=\"Last Name textfield, field is required.\"]")
    @iOSXCUITFindBy(xpath = "//*[@name=\"phoneField\"]")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Enter mobile number\")")
    public MobileElement enterMobileNumber;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"status\")")
    public MobileElement textOrderStatus;


    @iOSXCUITFindBy(xpath = "//*[@label=\"Save\"]")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Save\")")
    public MobileElement saveCTA;


    //Continue to slot selection
    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Continue\")]")
    @AndroidFindBy(xpath = "//*[@text=\"Continue to review order\"] | //*[@text=\"Save\"]")
    public MobileElement continueToReviewOrderCTA;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Continue\")]")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Continue to payment method\")")
    public MobileElement continueToPaymentCTA;

 /*   @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Contact Info\")")
    public MobileElement textOrderStatus;*/

    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Contact Info\")]")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Contact Info\")")
    public MobileElement contactInfoTitle;

    @iOSXCUITFindBy(xpath = "//*[@name=\"flagSwitch\"]")
    @AndroidFindBy(id = "switchOrderStatusUpdates")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeSwitch[1]")
  //  @iOSXCUITFindBy(accessibility = "lblToggleViewFirst")
    public MobileElement toggleButton;


    @iOSXCUITFindBy(iOSNsPredicate = "name == 'btnSearchBarViewButton'")
    @AndroidFindBy(xpath = "//*[contains(@resource-id,\"searchview_container\")]")
    public MobileElement searchTextField;

    @iOSXCUITFindBy(xpath="//*[@label=\"Saved addresses\"]")
    public MobileElement savedAddressesPage;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
    public MobileElement radioBtnSavedAddresses;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    public MobileElement defaultAddress;

    @iOSXCUITFindBy(xpath="//*[@label=\"Edit address\"]")
    public MobileElement editAddressPage;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Saved addresses\"] | //*[@label=\"Back\"]")
    public MobileElement EditAddBackBtn;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Back\"]")
    public MobileElement saveAddressBackBtn;

    @iOSXCUITFindBy(xpath="//*[@label=\"Add new address\"]")
    public MobileElement addAddressBtn;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@label=\"Use this address\"]")
    public MobileElement useThisAddressBtn;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
    public MobileElement addressOnSlotSelection;

    @iOSXCUITFindBy(xpath="//*[@label=\"Select date and time\"]")
    public MobileElement slotSelectionCard;


    //address line 1
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name CONTAINS 'Street address' AND visible == 1")
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public MobileElement addressLineTextField;

    //address line 2
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name CONTAINS 'optional' AND visible == 1")
  //  @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public MobileElement addressLine2TextField;
    //zip code
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name CONTAINS 'Zipcode' AND visible == 1")
 //   @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public MobileElement zipCodeTextField;

    //city
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name CONTAINS 'City' AND visible == 1")
  //  @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public MobileElement cityTextField;

    //state
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name CONTAINS 'State' AND visible == 1")
 //   @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public MobileElement stateTextField;


    //@iOSXCUITFindBy(xpath = "//*[contains(@label,\"Pickup\")]")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name CONTAINS 'Pickup' AND visible == 1")
    public MobileElement pickupHeaderText;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name CONTAINS 'Delivery' AND visible == 1")
    public MobileElement deliveryHeaderText;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Today\")]")
 //   @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND label CONTAINS 'Today' AND visible == 1")
    public MobileElement dateSlot;

   // @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Today\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
  //  @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name CONTAINS 'Pickup' AND visible == 1")
    public MobileElement timeSlot;
    
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
    //   @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND label CONTAINS 'Today' AND visible == 1")
    public MobileElement selectedSlot;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Add promo\")]")
    @AndroidFindBy(id = "add_promo_code")
    public MobileElement addPromoCode;

    //@iOSXCUITFindBy(className = "XCUIElementTypeTextField")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
    @AndroidFindBy(id = "promo_code_edit_text")
    public MobileElement promoCodeTextField;


    //promo code enter button
   // @iOSXCUITFindBy(accessibility = "Apply Promo Code")
    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Apply\")]")
    @AndroidFindBy(id = "btn_next")
    public MobileElement applyPromoCode;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Please Reserve\")]")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Please Reserve a Time\")")
    public MobileElement reserveTimeText;


    @AndroidFindBy(id="age_restricted_msg_tv")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
    public MobileElement ageRestrictedMessage;

    @AndroidFindBy(xpath="//*[@text=\"Save\"]")
    public MobileElement saveButton;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Payment details\")]")
    @AndroidFindBy(xpath="//*[contains(@resource-id,'payment_icon')]")
    public MobileElement cardLogo;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Payment details\")]")
    @AndroidFindBy(xpath="//*[contains(@resource-id,'textViewPayment')]")
    public MobileElement cardLastDigits;




   // @AndroidFindBy(xpath="//*[contains(@resource-id,'payment_icon')]")
    @AndroidFindBy(xpath="//android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]")
    public MobileElement pullSheetUp;


    @iOSXCUITFindBy(xpath="//XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[4]")
    public MobileElement cartCardOnCheckout;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeOther[7]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]")
    public MobileElement itemSizeOnCart;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeOther[2]")
    public List <MobileElement> minusIcon;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeStaticText[4]")
    public MobileElement cartWorth;

    @iOSXCUITFindBy(xpath="//*[@label=\"Double tap to close cart screen\"]")
    public MobileElement closeCartBackBtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[3]")
    public MobileElement alertMsgForLessCartSize;

    @iOSXCUITFindBy( iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'Confirm changes' AND visible == 1")
    public MobileElement savechangeslabel;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Yes' AND visible == 1")
    public MobileElement Clickyespopup;

//XCUIElementTypeButton[@label="Yes"]


    @AndroidFindBy(xpath = "//*[contains(@text,'save your changes?')]")
    public MobileElement saveChangesPopUp;

    @AndroidFindBy(xpath = "//*[@text='No']")
    public MobileElement saveChangesNoButton;

    @AndroidFindBy(xpath = "//*[@text='Pickup']")
    public MobileElement pickUpOption;


    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Driver tip\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Driver tip. $2.00.\"]")
    public MobileElement drivertipatSummary;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Driver tip heading\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Driver tip\"]")
    public MobileElement drivertip;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Change Driver Tip Amount\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Change\"]")
    public MobileElement drivertipchange;

    @AndroidFindBy(id = "textView7")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Drivers are critical to our delivery services. 100% of tips go to drivers. \"]")
    public MobileElement drivertipchangetext;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Add a custom tip\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Add a custom tip\"]")
    public MobileElement customtipwindow;

    @AndroidFindBy(id = "customTipMessageTextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"100% of tips go to the delivery people. Your gratuity is appreciated.\"]")
    public MobileElement tipmessage;

    @AndroidFindBy(xpath = "//*[@text=\"Change\"]")
    public MobileElement chevronatcustom;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Pick up at\"]")
    public MobileElement slotselect;
}
