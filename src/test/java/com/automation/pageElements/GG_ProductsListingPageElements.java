package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.util.List;

public class GG_ProductsListingPageElements {

    @AndroidFindBy(id = "img_filterSort")
    @iOSXCUITFindBy(id = "Sort & Filter Options")
    public MobileElement filterButton;

    @AndroidFindBy(accessibility = "Cancel Sort or Filter page.")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND label == 'closeGray'")
    public MobileElement  closeToggleIt;

    @AndroidFindBy(id = "tv_cart_count")
    @iOSXCUITFindBy(id = "Cart")
    public MobileElement cartIconWithCount;

    @AndroidFindBy(accessibility = "Sort")
    public MobileElement filterRightArrow;

    @AndroidFindBy(accessibility = "Back / Navigation Up")
    public MobileElement saveButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Reward Card Specials\")")
    @iOSXCUITFindBy(id = "Reward Card Specials")
    public MobileElement filterRewardCardSpecials;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Price - Low to High\")")
    @iOSXCUITFindBy(id = "Price - Low to High")
    public MobileElement sortByPriceLowToHigh;

    @AndroidFindBy(id = "itemParentLayout")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name='productCell']/XCUIElementTypeButton[@visible='true']")
    public List<MobileElement> productCards;

    @iOSXCUITFindBy(accessibility = "Back")
    public MobileElement backButton;

    @AndroidFindBy(id = "description")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name='productCell']/XCUIElementTypeButton[@visible='true']")
    public List<MobileElement> productDescription;

    //This is for UMA master locator changes
    //@AndroidFindBy(id = "btnAdd")
    @AndroidFindBy(id = "addButton")
    @iOSXCUITFindBy(iOSNsPredicate = "label contains 'Add'")
    public MobileElement addToCartButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='viewStepperView']")
    public List<MobileElement> addToCartButtonListForIOS;

    @iOSXCUITFindBy(accessibility = "This item is currently Out of Stock")
    public MobileElement outOfStockLabel;


    //This is for UMA master locator changes
    //@AndroidFindBy(id = "btnPlus")
    @AndroidFindBy(id = "umaStepperPlus")
    @iOSXCUITFindBy(id = "Increment quantity")
    public MobileElement incrementQuantity;

    //This is for UMA master locator changes
    //@AndroidFindBy(id = "btnMinus")
    @AndroidFindBy(id = "umaStepperMinus")
    @iOSXCUITFindBy(id = "Decrement quantity")
    public MobileElement decrementQuantity;

    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Quantity in cart'")
    public MobileElement productQuantityButton;

    @AndroidFindBy(id = "tvQuantity")
    @iOSXCUITFindBy(id = "Quantity")
    public MobileElement quantityProductDetailsPage;

    @AndroidFindBy(id = "product_price_container")
    @iOSXCUITFindBy(iOSNsPredicate = "name == 'lblPrice' and visible == 1")
    public List<MobileElement> productPriceCompleteTxt;

    @AndroidFindBy(id = "product_approx")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='lblApproxLabel']/..")
    public List<MobileElement> productApproxLbl;


}
