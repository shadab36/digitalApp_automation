package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class GG_ProductDetailsPageElements {
    @AndroidFindBy(id = "tvTotalItemCount")
    @iOSXCUITFindBy(accessibility = "Cart")
    public MobileElement cartInProductDetailPage;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND label == 'Cancel' AND visible==1")
    public MobileElement cancelButton;

    @AndroidFindBy(id = "btnAdd")
    @iOSXCUITFindBy(iOSNsPredicate = "label contains 'Add'")
    public MobileElement addToCartButton;

    @AndroidFindBy(id = "btnPlus")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Increment quantity'")
    public MobileElement incrementQuantity;

    @AndroidFindBy(id = "tvQuantity")
    @iOSXCUITFindBy(id = "Quantity")
    public MobileElement currentAddedQuantity;

    @AndroidFindBy(id = "btnMinus")
    @iOSXCUITFindBy(id = "Decrement quantity")
    public MobileElement decrementQuantity;

    @AndroidFindBy(xpath = "//*[@content-desc='Navigate up' or @content-desc='Close']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeNavigationBar/XCUIElementTypeButton)[1]")
    public MobileElement backButton;

    @AndroidFindBy(id = "isProductOutOfStock")
    @iOSXCUITFindBy(id = "This item is currently Out of Stock")
    public MobileElement outOfStockLabel;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Related Products\")")
    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Related Products\"")
    public MobileElement relatedProductsLabel;
}
