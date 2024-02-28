package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.CacheLookup;

import java.util.List;

public class SelectOrderTypePageElements {
    @iOSXCUITFindBy(accessibility = "Pick Up")
    @AndroidFindBy(id = "how_do_want_text")
    public MobileElement title;

    @iOSXCUITFindBy(accessibility = "Pick Up")
    @AndroidFindBy(id = "tvSelectYourDeliveryType")
    public MobileElement title2;


    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value BEGINSWITH[c] 'Fulfilled' AND visible == 1")
    @AndroidFindBy(id = "llHomeDelivery")
    public MobileElement deliveryOptionButton;


    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value BEGINSWITH 'Delivery'")
    @AndroidFindBy(id = "delivery_zipcode")

    public MobileElement deliverToZipButton;


    //@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[3]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[3]/android.view.ViewGroup[1]")
    public MobileElement instoreZipButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'Pickup' AND visible == 1")
    @AndroidFindBy(id = "pickup_title")
    @CacheLookup
    public MobileElement pickUpButton;

    @iOSXCUITFindBy(xpath = "//*[@label='In-store run']")
    @AndroidFindBy(id = "instore_title")
    @CacheLookup
    public MobileElement inStore;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'Open Shopping App' AND visible == 1")
    @AndroidFindBy(id = "bodytext")
    @CacheLookup
    public MobileElement downLoadDifferentAppTitle;


/*    //@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Start Shopping\"]")
    //@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeImage[1]")
    @AndroidFindBy(id = "start_shopping")
    public MobileElement startShoppingButton;*/


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Start shopping\"]")
    @AndroidFindBy(id = "start_shopping")
    public MobileElement startShoppingButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Start shopping\"]")
    @AndroidFindBy(id = "start_shopping")
    public MobileElement loadingOrderType;

    @AndroidFindBy(id = "selectbtn")
    public MobileElement startShoppingButton2;

    @iOSXCUITFindBy(accessibility = "Notifications may include alerts, sounds, and icon badges. These can be configured in Settings.")
    public MobileElement notificationText;

    @iOSXCUITFindBy(accessibility = "Don’t Allow")
    public MobileElement dontAllowNotificationButton;

    @iOSXCUITFindBy(accessibility = "Allow")
    public MobileElement allowNotificationButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Fulfilled' AND visible == 1")
    @AndroidFindBy(id = "fulfilled_banner")
    public MobileElement differentBannerDeliveryText;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name == 'Zip Code' AND visible == 1")
    @AndroidFindBy(id = "edit_text")
    @CacheLookup
    public MobileElement pickUpZipodeEditText;

    @AndroidFindBy(id = "address")
    @iOSXCUITFindBy(iOSNsPredicate = "name == \"lblStoreAddress\" and visible==1")
    public List<MobileElement> allStoreCardsList;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Search for Pickup store' AND visible == 1")
    @AndroidFindBy(id = "btn_next")
    @CacheLookup
    public MobileElement searchZipCodeButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND label ENDSWITH 'mi.' AND visible == 1")
    @AndroidFindBy(id = "dug_address_container")
    @CacheLookup
    public MobileElement dugStoreText;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"mi.\")]/parent::XCUIElementTypeCell/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[contains(@content-desc,\"Radio Button Selected with\")]")
    @CacheLookup
    public MobileElement dugStoreBanner;


    @iOSXCUITFindBy(xpath = "//*[@label=\"Shop in-store or make your list\"]")
    @AndroidFindBy(id = "instore_title")
    public MobileElement InStore;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[3]/XCUIElementTypeOther[1]")
//    @AndroidFindBy(id = "instore_title")
    public MobileElement InStoreSelectCheck;

    @iOSXCUITFindBy(xpath = "//*[starts-with(@label,\"Delivery\")]|//XCUIElementTypeTable/XCUIElementTypeCell[1]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'delivery_zipcode')]")
    public MobileElement deliverSignInPage;


    @iOSXCUITFindBy(xpath = "//*[contains(@name,\"in-store\"]")
    @AndroidFindBy(id = "instore_title")
    public MobileElement InStoreSelection;

    @AndroidFindBy(className = "android.widget.RadioButton")
    @iOSXCUITFindBy(xpath="//*[@name='viewStoreCard' and @value='Selected']")

   // @iOSXCUITFindBy(id="imgvCheckImage")
    //class = XCUIElementTypeImage
    //type = XCUIElementTypeImage
   // id = "imgvCheckImage
    //xpath = //AppiumAUT/XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeImage[2]
   // @iOSXCUITFindBy(xpath="//*[@name=\"viewStoreCard\" and @value=\"Selected\"]//*[@name=\"imgvCheckImage\"]")
    //viewStoreCard
    //AppiumAUT/XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]

    public List<MobileElement> storeListRadioBtn;

    @AndroidFindBy(id="address")
    public List<MobileElement> storeAddress;
}
