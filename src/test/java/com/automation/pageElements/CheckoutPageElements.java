package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.CacheLookup;

import java.util.List;

public class CheckoutPageElements {
    //******************************************* checkout page *******************************************
    //checkoutTitle
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'Checkout' AND visible == 1")
    @AndroidFindBy(id = "tvTitle")
    public MobileElement checkoutTitle;

    //order confirmation window - done button
    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Close\" AND visible==1")
    @AndroidFindBy(accessibility = "Close")
    @CacheLookup
    public MobileElement doneOrderConfirmationButton;

    //contact
    @iOSXCUITFindBy(accessibility = "Contact")
    @AndroidFindBy(id = "contact_title")
    @CacheLookup
    public MobileElement contactInfo;

    @iOSXCUITFindBy(accessibility = "Phone Number textfield, field is required.")
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    public MobileElement phoneNumberEditText;

    //order info
    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Order Info\" AND visible==1")
    @AndroidFindBy(id = "orderInfo_txt")
    public MobileElement orderInfoText;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Add address\" AND visible==1")
  //  @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS 'Add address' AND visible == 1")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add address\")")
    public MobileElement addAddressText;
    //payment
    @iOSXCUITFindBy(accessibility = "Payment")
    @AndroidFindBy(id = "payment_title")
    @CacheLookup
    public MobileElement paymentText;

    //promo code
    @iOSXCUITFindBy(accessibility = "Promo Code(s)")
    @AndroidFindBy(id = "promo_code_title")
    @CacheLookup
    public MobileElement promoCodeText;

    //cart
    @iOSXCUITFindBy(accessibility = "Cart")
    @AndroidFindBy(id = "cart_title")
    @CacheLookup
    public MobileElement cartText;

    //Estimate subtotal
    @iOSXCUITFindBy(accessibility = "Estimated Subtotal")
    @AndroidFindBy(id = "nameTv")
    @CacheLookup
    public MobileElement estimateSubtotalText;

    //service fee
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name BEGINSWITH 'Service' AND visible == 1")
    @AndroidFindBy(id = "nameTv")
    @CacheLookup
    public MobileElement serviceFeeText;

    //Estimate total
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name BEGINSWITH 'Estimated Total' AND visible == 1")
    @AndroidFindBy(accessibility = "Estimated Total [Info button], swipe up and right to open details link.")
    @CacheLookup
    public MobileElement estimateTotalText;

    //place order button
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Place order' AND visible == 1")
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Place Order\"]")
    @CacheLookup
    public MobileElement placeOrderButton;

    @iOSXCUITFindBy(accessibility = "Checkout")
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    @CacheLookup
    public MobileElement promoCodeBackButtonToCheckout;

    //order confirmation window
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'thanksUserLabel' AND visible == 1")
    @AndroidFindBy(id = "thank_you_txt")
    public MobileElement orderConfirmationTitle;

//    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Orders'")
    @iOSXCUITFindBy(xpath = "//*/XCUIElementTypeCell[4]/XCUIElementTypeButton[1]")
    public MobileElement OrdersHyperLink;



  //  @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeOther' AND label BEGINSWITH 'Estimated Total'")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeCell[7]/XCUIElementTypeOther[4]/XCUIElementTypeOther[6]")
    //@AndroidFindBy(xpath = "//*[@content-desc=\"Estimated Total\"]")
    @AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[5]/android.widget.TextView[1]")
    public MobileElement estimatedTotalText;


    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeOther' AND label BEGINSWITH 'Estimated Subtotal'")
   // @iOSXCUITFindBy(xpath="//XCUIElementTypeCell[7]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]")
    //@AndroidFindBy(xpath = "//*[@content-desc=\"Estimated Subtotal\"]")
    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.TextView[1]")
    public MobileElement estimatedSubTotalText;



    //@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeOther' AND label BEGINSWITH 'Estimated  Reward'")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeCell[7]/XCUIElementTypeOther[4]/XCUIElementTypeOther[3]")
  //  @AndroidFindBy(xpath = "//*[@content-desc=\"Estimated Reward Card Savings\"]")
    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[2]/android.widget.TextView[1]")
    public MobileElement estimatedRewardCardSavingsText;


    //@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeOther' AND label BEGINSWITH 'Credit On Account Applied'")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeCell[7]/XCUIElementTypeOther[4]/XCUIElementTypeOther[4]")
  //  @AndroidFindBy(xpath = "//*[@content-desc=\"Credit On Account Applied\"]")
    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[3]/android.widget.TextView[1]")
    public MobileElement coaText;


    @iOSXCUITFindBy(xpath="//*[@label=\"Credit on Account\"]")
   // @AndroidFindBy(xpath = "//android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.widget.TextView[1]")
   // @AndroidFindBy(id = "btn_credit")
    @AndroidFindBy(xpath="//android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.widget.ImageView[1]")
    public MobileElement applyCOA;


    //@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeOther' AND label BEGINSWITH 'Delivery Fee'")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeCell[7]/XCUIElementTypeOther[4]/XCUIElementTypeOther[6]")
  //  @AndroidFindBy(xpath = "//*[@content-desc=\"Delivery Fee\"]")
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.view.ViewGroup[2]/android.widget.TextView[1]")
    public MobileElement deliveryFeeText;


    @iOSXCUITFindBy(xpath="//XCUIElementTypeCell[7]/XCUIElementTypeOther[4]/XCUIElementTypeOther[9]")
    //@AndroidFindBy(xpath = "//*[@content-desc=\"Delivery Subscription Fee\"]")
    @AndroidFindBy(xpath="//android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.TextView[2]")
    public MobileElement deliverySubscriptionFeeText;

    //@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeOther' AND label BEGINSWITH 'Estimated Tax'")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeCell[7]/XCUIElementTypeOther[4]/XCUIElementTypeButton[4]")
  //  @AndroidFindBy(xpath = "//*[@content-desc=\"Estimated Taxes and Fees\"]")
    @AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[4]/android.widget.Button[1]")
    //*[@content-desc="Estimated Taxes and Fees Collapsed"]
    public MobileElement estimatedTaxandFees;


    //order confirmation window
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'Edit Order Confirmation' AND visible == 1")
    @AndroidFindBy(id = "thank_you_txt")
    public MobileElement editOrderConfirmationTitle;


    //******************************************* promo code page *******************************************
    //promo code delete icon
    @iOSXCUITFindBy(accessibility = "Remove")
    @AndroidFindBy(id = "delete_promo")
    public MobileElement deletePromoCode;

    //ConatctDetails
    @iOSXCUITFindBy(xpath = "//*[@label=\"Contact\"]")
    @AndroidFindBy(id = "right_arrow")
    public MobileElement conatctDetails;

    //submitContactDetails
    @iOSXCUITFindBy(xpath = "//*[@value=\"Save and Review\"]")
    @AndroidFindBy(id = "btn_save")
    public MobileElement saveDetails;

    //submitContactDetails
  //  @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Save\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Save\"]")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Save\")")
    public MobileElement saveCTA;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Close\"]")
  //  @AndroidFindBy(id = "btn_save")
    public MobileElement closeCTA;

  //  @iOSXCUITFindBy(xpath = "//*[@label=\"First Name textfield, field is required.\"]")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Enter first name\")")
    public MobileElement enterFirstname;

 //   @iOSXCUITFindBy(xpath = "//*[@label=\"Last Name textfield, field is required.\"]")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Enter last name\")")
    public MobileElement enterLastname;

 //   @iOSXCUITFindBy(xpath = "//*[@label=\"Last Name textfield, field is required.\"]")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Enter mobile number\")")
    public MobileElement enterMobileNumber;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"status\")")
    public MobileElement textOrderStatus;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Continue\")]")
    //@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Continue to review order\")")
    @AndroidFindBy(xpath="//android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.Button[1]")
   // @AndroidFindBy(id = "btnSaveContactInfo")
     public MobileElement continueToReviewOrderCTA;


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Continue to payment method\"] | //XCUIElementTypeButton[@label=\"Save\"] | //*[contains(@label,\"Continue\")]")
 //    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Continue\")]")

 //   @iOSXCUITFindBy(xpath = "//*[@label=\"Continue to payment method\"]")
    //@iOSXCUITFindBy(xpath = "//*[contains(@label,\"Continue\")]")

 //   @iOSXCUITFindBy(iOSNsPredicate = "class == 'XCUIElementTypeButton' AND label CONTAINS 'Continue'")
    //@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Continue to payment method\")")
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Continue\")")
    public MobileElement continueToPaymentCTA;


    @AndroidFindBy(xpath = "//android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView[1]/android.widget.FrameLayout[2] | //android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.RadioButton[1]")
    public MobileElement selectslotCTA;

    //XCUIElementTypeOther[1]/XCUIElementTypeTextView[1]/XCUIElementTypeTextView[1]
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeTextView[1]/XCUIElementTypeTextView[1]")
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[6]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]")
    public MobileElement egMsg;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Street address\")")
    public MobileElement addressField;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name CONTAINS 'next'")
    @AndroidFindBy(id = "btn_save")
    @CacheLookup
    public MobileElement next;

    @iOSXCUITFindBy(xpath = "//*[@label=\"done\"]")
    public MobileElement DoneButton;

    //confirmEditOrderChanges
    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Confirm Changes\")]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \"btn_save\")] | //*[contains(@resource-id, \"btn_checkout\")]")
    public MobileElement confirmChanges;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView[1]/XCUIElementTypeCell[1]/XCUIElementTypeButton[1] | //XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.Button[1]/android.widget.TextView[1]")
    public MobileElement productAddedInCart;


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[1]/XCUIElementTypeButton[2]")
    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.TextView[1]")
    public MobileElement productAddedInCheckout;

    //firstName
    @iOSXCUITFindBy(xpath = "//*[@label=\"First Name textfield, field is required.\"]")
    @AndroidFindBy(xpath = "//*[@text=\"First Name\"]")
    public MobileElement firstName;

    //lastName
    @iOSXCUITFindBy(xpath = "//*[@label=\"Last Name textfield, field is required.\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Last Name\"]")
    public MobileElement lastName;

    //phoneNumber
    @iOSXCUITFindBy(xpath = "//*[@label=\"Phone Number textfield, field is required.\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Phone Number\"]")
    public MobileElement phoneNumber;


    //promo code title
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Promo Code(s)\"]")
    @AndroidFindBy(id = "tvTitle")
    public MobileElement promoCodeTitle;

    //promo code text field
    @iOSXCUITFindBy(className = "XCUIElementTypeTextField")
    @AndroidFindBy(id = "edit_text")
    @CacheLookup
    public MobileElement promoCodeTextField;


    @iOSXCUITFindBy(className = "XCUIElementTypeTextField")
    @AndroidFindBy(id = "edit_text")
    @CacheLookup
    public MobileElement enterCOATextField;

    @iOSXCUITFindBy(accessibility = "Apply Credit on Account")
    @AndroidFindBy(id = "btn_next")
    @CacheLookup
    public MobileElement enterCOAEnterButton;


    @iOSXCUITFindBy(accessibility = "Credit Amount Applied")
    //@AndroidFindBy(xpath = "//*[@text=\"Credit Amount Applied\"]")
    @AndroidFindBy(xpath="//android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.TextView[2]")
    @CacheLookup
    public MobileElement coaAppliedText;

    //promo code enter button
    @iOSXCUITFindBy(accessibility = "Apply Promo Code")
    @AndroidFindBy(id = "btn_next")
    @CacheLookup
    public MobileElement promoCodeEnterButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeOther' AND name CONTAINS 'Applied' AND visible == 1")
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Applied\")")
    @CacheLookup
    public MobileElement promoCodeAppliedText;

    //******************************************* Edit Delivery Address page *******************************************
    //zip code
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name CONTAINS 'Zipcode' AND visible == 1")
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public MobileElement zipcodeTextField;

    //address line 1
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name CONTAINS 'Street address' AND visible == 1")
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public MobileElement addressLine1TextField;

    //apt number
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name CONTAINS 'Apartment' AND visible == 1")
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    public MobileElement aptTextField;

    //enter comments
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name CONTAINS 'Comments' AND visible == 1")
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Comments\")")
    public MobileElement deliveryInstructionTextField;


    //Snap Option
    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"SNAP EBT (Pick Up Only)\")]")
    @AndroidFindBy(xpath = "//*[@text='SNAP EBT (Pickup only)']")
    public MobileElement snapOption;


    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'View Cart'")
    @AndroidFindBy(xpath = "//*[@text='View cart']")
    public MobileElement nonSnapItemRemovalPopup;

    //Delivery Fee tooltip
    @iOSXCUITFindBy(xpath = "//*[@label=\"Delivery Fee, Info\"]")
    @AndroidFindBy(xpath = "//*[@content-desc=\"Delivery Fee, info.\"]")
    public MobileElement deliveryFeeTooltip;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Sales Tax\")]")
    @AndroidFindBy(xpath = "//*[@content-desc=\"Sales Tax\"]")
    public MobileElement salesTaxTooltip;

    //Estimated total  tooltip
    @iOSXCUITFindBy(xpath = "//*[@label=\"Estimated Total, Info\"]")
    @AndroidFindBy(xpath = "//*[@content-desc=\"Estimated Total, info.\"]")
    public MobileElement estimatedTotaltip;

    //Confirm changes
    @iOSXCUITFindBy(xpath = "//*[@label=\"Confirm changes\"]")
    @AndroidFindBy(xpath = "//*[@content-desc=\"Confirm changes\"]")
    public MobileElement changeconfirmation;

    //Click on No CTA
    @iOSXCUITFindBy(xpath = "//*[@label=\"No\"]")
    public MobileElement NoCTA;

    //Tax Collapse Mode
    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"double tap to Expand\")]")
    @AndroidFindBy(xpath = "//*[@content-desc=\"Estimated Taxes and Fees Collapsed\"]")
    public MobileElement taxCollapseMode;

    @AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView[1]/android.widget.Button[1]/android.widget.Button[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/*/XCUIElementTypeButton[2]")
    public MobileElement preferences;

    @AndroidFindBy(xpath="//*[@text=\"DISMISS\"]")
    @iOSXCUITFindBy(id = "Dismiss")
    public MobileElement dismissCTA;


    @AndroidFindBy(id = "full_auth_message")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[6]/XCUIElementTypeOther[4]/XCUIElementTypeStaticText[1]")
    public MobileElement authMessage;

    @AndroidFindBy(id = "savings_title")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[4]/XCUIElementTypeOther[6]")
    public MobileElement savingsTitle;

    @AndroidFindBy(id = "saving_message")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[4]/XCUIElementTypeOther[7]")
    public MobileElement savingsMessage;

    @AndroidFindBy(id = "terms_use")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[7]/XCUIElementTypeTextView[1]")
    public MobileElement termsUseMessage;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Order history']")
    @iOSXCUITFindBy(accessibility = "Order history")
    public MobileElement cartSummaryButton;


    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Dismiss\")]")
    public MobileElement dismissButton;

   // @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Edit\")")
    @AndroidFindBy(xpath="//android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.Button[1]")
    @iOSXCUITFindBy(xpath = "//*[contains(@value,\"Edit\")]")
    public MobileElement editButton;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Select pickup store\")]")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Select pickup store\")")
    //android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.TextView[1]
    public MobileElement selectpickupStore;

    @AndroidFindBy(xpath="//android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.view.View[1]")
    @iOSXCUITFindBy(xpath = "//*[@name=\"viewStoreListView\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
    public MobileElement pullUpMap;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Back\")]")
    @AndroidFindBy(xpath = "//*[@content-desc=\"Navigate up\"]")
    public MobileElement backButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[1]")
    public MobileElement enterZipCode;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name =='Zip Code'")
    @AndroidFindBy(id = "search_src_text")
    //android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]
    public MobileElement zipcodeEditText;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(xpath="//android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/androidx.recyclerview.widget.RecyclerView[1]/androidx.cardview.widget.CardView[1]")
    //androidx.recyclerview.widget.RecyclerView[1]/androidx.cardview.widget.CardView[1]/android.view.ViewGroup[1]/android.widget.ImageView[1]
    public MobileElement firstStore;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Continue\")]")
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Continue\")")
    public MobileElement continueCTA;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Go\")]")
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Go\")")
    public MobileElement goBackCTA;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Download\")]")
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Download\")")
    public MobileElement downloadCTA;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Open\")]")
   // @AndroidFindBy(xpath = "//*[@text=\"Open Safeway App\"]")
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Open\")")
    public MobileElement openCTA;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Open\"]")
   // @AndroidFindBy(xpath = "//*[@text=\"Open\"]")
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Open\")")
    public MobileElement openAlertCTA;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Not right now\")]")
    @AndroidFindBy(xpath = "//*[@text=\"Not right now\"]")
    public MobileElement notRightNowText;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Changing\")]")
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Changing\")")
    public MobileElement changePickupStoreHeaderText;

    //@iOSXCUITFindBy(xpath = "//*[contains(@label,\"Pickup\")]")
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Pickup\")")
    public MobileElement pickupHeaderText;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Pickup available\")]")
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Pickup available\")")
    public MobileElement pickupAvailableHeaderText;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"To continue\")]")
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"To continue\")")
    public MobileElement pickupAvailableDescription;

    @iOSXCUITFindBy(xpath = "//*[@label=\"get\"]")

    public MobileElement getCTA;

  //  @iOSXCUITFindBy(xpath = "//*[contains(@label,\"DriveUp & Go\")]")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name CONTAINS 'DriveUp & Go' AND visible == 1")
    public MobileElement driveUpGoText;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name CONTAINS 'Pharmacy' AND visible == 1")
    public MobileElement pharmacyText;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name CONTAINS 'Counter' AND visible == 1")
    public MobileElement counterPickupText;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name CONTAINS 'Kiosk' AND visible == 1")
    public MobileElement kioskPickupText;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name CONTAINS 'Locker' AND visible == 1")
    public MobileElement lockerPickupText;

    @AndroidFindBy(id = "bottom_sheet_close")
    @iOSXCUITFindBy(accessibility = "btnClose")
    public MobileElement crossButtonOnPaymentScreen;

    //*[@label="Close"]
    @iOSXCUITFindBy(xpath = "//*[@value=\"No\"]")


    @AndroidFindBy(id="add_promo_code")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Add promo code\"]")

    public MobileElement addPromoCode;

    @AndroidFindBy(id="promo_code_edit_text")
    @iOSXCUITFindBy(className = "XCUIElementTypeTextField")
    public MobileElement enterPromoCode;

    @AndroidFindBy(id="promo_code_apply")
    @iOSXCUITFindBy(xpath ="//*[contains(@label,\"Apply\")]" )
    public MobileElement applyBtn;

    @AndroidFindBy(id="error_message_view")
    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"promo code is\")]")
    public MobileElement errorMsg;


    @AndroidFindBy(id = "nameTv")
    public List<MobileElement> promoCodeApplied;

    @AndroidFindBy(id="promoImg")
    @iOSXCUITFindBy(xpath ="//*[@label,\"closeButton\")]" )
    public MobileElement deleteAppliedPromoCode;

    @AndroidFindBy(id="tv_change_address_store")
    public MobileElement addAddressButton;


    @AndroidFindBy(id ="Zipcode")
    public MobileElement addressFieldOnSlotSelectionScreen;

    @AndroidFindBy(id="dug_chip")

    public MobileElement pickUpToggle;

    @AndroidFindBy(id="delivery_chip")

    public MobileElement deliveryToggle;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Continue\")]")
    @AndroidFindBy(xpath = "//*[@text=\"Continue to CVV\"]")
    public MobileElement continueToCVV;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'textViewSnapEbtSubTitle')]")
    public MobileElement inlineMessage;

    @AndroidFindBy(xpath = "//*[@text='SNAP EBT Purchase Issue']")
    public MobileElement snapEBTPurchaseIssuePopUp;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'iv_cart_right_arrow')]")
    public MobileElement cartTab;

    //Snap Option
    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"SNAP EBT (Pick Up Only)\")]")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@content-desc='SNAP EBT (Pickup only)']")
    public MobileElement snapRadioButton;

    //Confirm CVV New Checkout
    @AndroidFindBy(xpath= "//*[@text='Confirm CVV']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Confirm CVV\"]")
    public MobileElement confirmCvvLbl;

    // Continue btn new checkout
    @AndroidFindBy(xpath= "//*[@text='Continue']")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Continue\"]")
    public MobileElement continueBtnFP;

    @iOSXCUITFindBy(xpath = "//*[@value=\"Name on the Debit/Credit card\"]")
    public MobileElement CreditCardNameFP;

    @AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    @iOSXCUITFindBy(xpath = "//*[@value=\"Card number\"]")
    public MobileElement CreditCardNumberFP;

    @AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    @iOSXCUITFindBy(xpath = "//*[@value=\"MM/YY\"]")
    public MobileElement expdNumberFP;

    @AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(3)")
    @iOSXCUITFindBy(xpath = "//*[@value=\"ZIP Code\"]")
    public MobileElement zipCodeCreditCardFP;

    @AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/androidx.drawerlayout.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/androidx.cardview.widget.CardView[1]/android.view.ViewGroup[1]/android.widget.RadioButton[2]")
    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Remember to bring your EBT Card, and Debit or Credit card for any non-EBT items.\")]")
    public MobileElement textmessage;


}
