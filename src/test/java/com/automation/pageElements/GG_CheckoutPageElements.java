package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.CacheLookup;
import org.w3c.dom.html.HTMLInputElement;

import java.util.List;

public class GG_CheckoutPageElements {

    @iOSXCUITFindBy(id = "Contact")
    @AndroidFindBy(id = "contact_title")
    public MobileElement contactLabel;

    @iOSXCUITFindBy(id = "Order Info")
    @AndroidFindBy(id = "orderInfo_txt")
    public MobileElement orderInfoLabel;

    @iOSXCUITFindBy(id = "Payment")
    @AndroidFindBy(id = "payment_title")
    public MobileElement paymentLabel;

    @iOSXCUITFindBy(id = "Promo Code(s)")
    @AndroidFindBy(id = "promo_code_title")
    public MobileElement promoCodeLabel;

    @iOSXCUITFindBy(id = "Cart")
    @AndroidFindBy(id = "cart_title")
    public MobileElement cartLabel;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND label BEGINSWITH 'Contact'")
    @AndroidFindBy(id = "cart_title")
    public MobileElement addContactLink;

    @iOSXCUITFindBy(xpath = "(//*[@name='Contact']/following-sibling::XCUIElementTypeStaticText)[1]")
    @AndroidFindBy(id = "right_arrow")
    public MobileElement addPhoneNumber;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Phone Number Field is required']/..//android.widget.LinearLayout//android.widget.EditText")
    @iOSXCUITFindBy(id = "Phone Number textfield, field is required.")
    public MobileElement phoneNumberTextField;

    @AndroidFindBy(id = "type_pickup_card")
    @iOSXCUITFindBy(id = "Pickup")
    public MobileElement pickUpShoppingMode;

    @AndroidFindBy(className = "android.widget.ProgressBar")
    @iOSXCUITFindBy(iOSNsPredicate = "type=\"XCUIElementTypeStaticText\" value=\"Loading\"")
    public MobileElement loadingSpinner;

    @AndroidFindBy(id = "start_shopping")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Start shopping\"]")
    public MobileElement startShoppingButton;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'et_zip_code')]//android.widget.EditText[contains(@resource-id,'edit_text')]")
    @iOSXCUITFindBy(accessibility = "Zip Code")
    public MobileElement zipCodeTextField;

    @AndroidFindBy(id = "btn_next")
    @iOSXCUITFindBy(id = "whiteRightArrow")
    public MobileElement zipCodeRightArrow;

    @AndroidFindBy(id = "address")
    @iOSXCUITFindBy(xpath = "(//*[@name='lblStoreAddress' and @visible='true'])[1]")
    public MobileElement firstStoreCard;

    @AndroidFindBy(id = "address")
    @iOSXCUITFindBy(iOSNsPredicate = "name == \"lblStoreAddress\" and visible==1")
    public List<MobileElement> allStoreCardsList;

    @AndroidFindBy(id = "radioButtonSnap")
    @iOSXCUITFindBy(accessibility = "SNAP EBT (Pick Up Only)")
    public MobileElement snapEBT;

    @AndroidFindBy(accessibility  = "Checkout")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND label == 'Checkout'")
    public MobileElement checkoutButton;

    @AndroidFindBy(id = "editSearch")
    @iOSXCUITFindBy(id = "Search for Products")
    public MobileElement searchField;

    @AndroidFindBy(xpath = "//*[@text=\"Edit\"]")
    @iOSXCUITFindBy(xpath = "//*[@value=\"Edit\"]")
    public MobileElement editStore;

    @AndroidFindBy(id  = "sv_global")
    @iOSXCUITFindBy(accessibility = "btnSearchBarViewButton")
    public MobileElement searchButton;

    // slot selection screen
    @iOSXCUITFindBy(xpath = "//*[contains(@name,'SlotSelectionView')]")
    public MobileElement slotSelectionScreen;

    // Your order screen
    @iOSXCUITFindBy(xpath = "//*[@label=\"Your order\"]")
    @AndroidFindBy(xpath = "//*[@text='Your order']")
    public MobileElement verifyYourOrderScreen;

    @AndroidFindBy(className = "android.widget.Button")
    @iOSXCUITFindBy(accessibility = "View Cart")
    public MobileElement viewCartPopUp;

    @AndroidFindBy(id  = "tvRemove")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name BEGINSWITH 'Remove'")
    public List<MobileElement> removeButton;

    @AndroidFindBy(accessibility  = "Close")
    @iOSXCUITFindBy(accessibility = "Checkout")
    public MobileElement backButtonToCheckOut;

    @AndroidFindBy(accessibility = "SNAP Eligible Item Subtotal:")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'SNAP Eligible Item Subtotal:'")
    public MobileElement snapEligibleTotal;

    @AndroidFindBy(accessibility = "Non-SNAP Eligible Item Subtotal:")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Non-SNAP Eligible Item Subtotal:'")
    public MobileElement nonSnapEligibleTotal;

    @AndroidFindBy(id = "iv_cart")
    @iOSXCUITFindBy(id = "btnCartWithBadge")
    public MobileElement myCart;

    @AndroidFindBy(id  = "umaStepperPlus")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND label == '﹢'")
    public MobileElement plusButton;

    @AndroidFindBy(id  = "payment_error_msg")
    @iOSXCUITFindBy(accessibility = "Confirm CVV")
    public MobileElement confirmCVV;

    @AndroidFindBy(xpath =  "//*[@text=\"Continue\"]")
    @iOSXCUITFindBy(xpath = "//*[@value=\"Continue\"]")
    public MobileElement continuePopup;

    @AndroidFindBy(xpath =  "//*[@text=\"Go back\"]")
    @iOSXCUITFindBy(xpath = "//*[@value=\"Go back\"]")
    public MobileElement goBack;

    @AndroidFindBy(xpath  = "//*[contains(@resource-id,\"/search_src_text\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[1]")
    public MobileElement zipCodeField;

    @AndroidFindBy(id  = "order_info_nav")
    @iOSXCUITFindBy(accessibility = "Choose time and date")
    public MobileElement chooseDateAndTimeArrow;

    @AndroidFindBy(id  = "order_info_nav")
    @iOSXCUITFindBy(xpath = "//*[contains(@name,\"Delivery.SlotSelectionView\")]")
    public MobileElement selectPref;

    @AndroidFindBy(xpath  = "//*[contains(@resource-id,\"/map_checkout_store\")]")
    @iOSXCUITFindBy(xpath = "//*[@name=\"viewStoreMapView\"]")
    public MobileElement mapView;


    @AndroidFindBy(xpath  = "//*[@text=\"Your item prices, promos and item availability may change.\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Your item prices, promos and item availability may change.\"]")
    public MobileElement popUpMessage;

    @AndroidFindBy(id  = "btn_save")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND label == 'Save'")
    public MobileElement saveButton;

    @AndroidFindBy(id  = "edit_text")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND label == 'Confirm CVV'")
    public MobileElement confirmCVVTextField;

    @AndroidFindBy(accessibility = "Estimated Total")
    @iOSXCUITFindBy(iOSNsPredicate = "PENDING")
    public MobileElement estimatedTotal;

    @AndroidFindBy(id  = "promo_code_title")
    @iOSXCUITFindBy(accessibility = "Promo Code(s)")
    public MobileElement promoCodes;

    @AndroidFindBy(id  = "substitution_checkbox")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND label == 'No substitution on all unavailable items'")
    public MobileElement globalSubstitution;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Confirm CVV\")")
    @iOSXCUITFindBy(id = "Confirm CVV")
    public MobileElement confirmCVVLabel;


    @AndroidFindBy(id  = "btn_save")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND label == 'Place order'")
    public MobileElement placeOrderButton;

    @AndroidFindBy(accessibility  = "Close")
    @iOSXCUITFindBy(accessibility = "Done")
    public MobileElement doneButton;

    @AndroidFindBy(accessibility = "Close")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name BEGINSWITH 'My Cart'")
    public MobileElement backButtonToCartScreen;

    @AndroidFindBy(accessibility  = "View order status details")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND label == 'View details'")
    public MobileElement viewDetailsButton;

    @AndroidFindBy(id  = "cart_title")
    @iOSXCUITFindBy(accessibility = "Cart")
    public MobileElement editCart;

    @AndroidFindBy(id = "editSearch")
    @iOSXCUITFindBy(accessibility = "Search to Add New Items")
    public MobileElement searchFieldInEditCart;

    @AndroidFindBy(accessibility  = "Back / Navigation Up")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Cancel' AND name == 'Cancel' AND value == 'Cancel'")
    public MobileElement cancelButton;

    @AndroidFindBy(accessibility = "2-hour Tom Thumb/Partner Delivery,")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND label == '2‑hour Tom Thumb Delivery'")
    public MobileElement timeDelivery;

    @AndroidFindBy(id  = "currentReserveTimeTv")
    @iOSXCUITFindBy(iOSNsPredicate = "PENDING")
    public MobileElement changeTime;

    @AndroidFindBy(id  = "orderInfo_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Order Info\" AND visible==1")
    public MobileElement orderInfoLink;

    @AndroidFindBy(accessibility = "Place Order")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND label == 'Confirm Changes'")
    public MobileElement confirmChanges;

    @AndroidFindBy(id = "update_your_order_content")
    @iOSXCUITFindBy(accessibility = "To update your order, visit your Orders page.")
    public MobileElement updateOrderLink;

    @AndroidFindBy(id = "cancel_order")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Cancel Order'")
    public MobileElement cancelOrderButton;

    @AndroidFindBy(id = "button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND label == 'Cancel Order'")
    public MobileElement cancelOrderPopUpButton;

    @AndroidFindBy(accessibility = "Confirm CVV")
    public MobileElement confirmCVVArrow;

    @AndroidFindBy(accessibility = "Navigate up")
    @iOSXCUITFindBy(accessibility = "Orders")
    public MobileElement backToOrder;

    @AndroidFindBy(id = "promo_code")
    @iOSXCUITFindBy(id = "Confirm CVV")
    public MobileElement promoCode;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Order Info\" AND visible==1")
    @AndroidFindBy(id = "orderInfo_txt")
    public MobileElement orderInfoText;

    @AndroidFindBy(accessibility = "Please enter a valid phone number.")
    public MobileElement phoneNoInvalidErrMsg;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'iv_contact_right_arrow')]")
    public MobileElement editContactBtn;

}




