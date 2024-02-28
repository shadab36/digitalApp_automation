package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.util.List;

public class GG_CartPageElements {

    @AndroidFindBy(id = "iv_cart")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Cart' AND visible==1")
    public MobileElement cartIcon;

    @AndroidFindBy(xpath = "//*[@text=\"Offer Complete!\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]")
    public MobileElement offerComplete;

    @AndroidFindBy(xpath = "//*[@text=\"Offer completed!\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Offer completed!\"]")
    public MobileElement offerCompleted;

    @AndroidFindBy(id = "tvCenterTitle")
    @AndroidFindBy(id = "tv_cart_count")
    public MobileElement cartIconCount;

    @AndroidFindBy(id = "tvRegularTitle")
    @iOSXCUITFindBy(id = "lblTopNavBarTitle")
    public MobileElement cartHeaderWithCount;

    @AndroidFindBy(id = "ctaClose")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Cart Close' AND visible==1")
    public MobileElement closeCartButton;

    @AndroidFindBy(id = "iv_cart_product_image")
    @iOSXCUITFindBy(iOSNsPredicate = "name == 'lblPrice'")
    public MobileElement productImageCart;

    @AndroidFindBy(id = "tv_cart_title_price")
    @iOSXCUITFindBy(iOSNsPredicate = "name == 'lblPrice'")
    public MobileElement productPriceCart;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'iv_cart_product_image')]/parent::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='lblpricePerQuantity']/../../following-sibling::XCUIElementTypeButton")
    public MobileElement productTitleCart;

    @AndroidFindBy(id = "tv_cart_price_per_quantity")
    @iOSXCUITFindBy(iOSNsPredicate = "name == 'lblpricePerQuantity'")
    public MobileElement productPerUnitPriceCart;

    @AndroidFindBy(id = "tv_substitution")
    @iOSXCUITFindBy(accessibility = "Substitution")
    public MobileElement productLinkForSubstitutionCart;

    @AndroidFindBy(id = "tv_add_notes")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND label=='Add Note'")
    public MobileElement productLinkForNoteCart;

    @AndroidFindBy(id = "tv_approx_title")
    @iOSXCUITFindBy(iOSNsPredicate = "name == 'lblPrice'")
    public MobileElement productApproxPriceCart;

    @AndroidFindBy(id = "tv_strike_price")
    @iOSXCUITFindBy(accessibility = "lblStrikeThroughPrice")
    public MobileElement productPriceStrikethroughCart;

    @AndroidFindBy(accessibility = "back button to take you back")
    @iOSXCUITFindBy(iOSNsPredicate = "name == 'lblTitle'")
    public MobileElement productDescriptionLongCart;

    @AndroidFindBy(id = "tv_cart_dept_title")
    @iOSXCUITFindBy(iOSNsPredicate = "name == 'lblTitle' AND visible==1")
    public List<MobileElement> productCategoriesCart;

    @AndroidFindBy(id = "ctaLabel")
    @iOSXCUITFindBy(id = "Happy shopping!")
    public MobileElement cartV2HappyShoppingText;

    @AndroidFindBy(id = "ctaButton")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Shop now' AND name == 'Shop now' AND type == 'XCUIElementTypeButton' AND visible==1")
    public MobileElement cartV2ShopNowCTA;

    @AndroidFindBy(id = "subtotalLabel")
    @iOSXCUITFindBy(accessibility = "lblCartEstSubtotalText")
    public MobileElement cartV2EstSubtotal;

    @AndroidFindBy(id = "subtotalText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='lblCartEstSubtotalValue' and @visible='true']")
    public MobileElement cartV2EstSubtotalAmount;

    @AndroidFindBy(id = "subtotalTextStrikePrice")
    public MobileElement cartV2EstSubtotalStrikeThroughAmount;

    @AndroidFindBy(id = "tvCartSummary")
    @iOSXCUITFindBy(id = "lblCartSummary")
    public MobileElement cartV2CartSummary;

    @AndroidFindBy(id = "tvCartItems")
    @iOSXCUITFindBy(iOSNsPredicate = "name contains 'Items'")
    public MobileElement cartV2CartItemsWithCount;

    @AndroidFindBy(id = "tvCartItemsPrice")
    @iOSXCUITFindBy(iOSNsPredicate = "pending")
    public MobileElement cartV2CartItemsPrice;

    @AndroidFindBy(id = "tvEstimatedSavings")
    @iOSXCUITFindBy(iOSNsPredicate = "pending")
    public MobileElement cartV2EstimatedSavings;

    @AndroidFindBy(id = "tvEstimatedSavingsValue")
    @iOSXCUITFindBy(iOSNsPredicate = "pending")
    public MobileElement cartV2EstimatedSavingsValue;

    @AndroidFindBy(id = "tvEstimatedSavings")
    @iOSXCUITFindBy(iOSNsPredicate = "pending")
    public MobileElement cartV2EstimatedSavingsInfoIcon;

    @AndroidFindBy(id = "tvTitle")
    @iOSXCUITFindBy(iOSNsPredicate = "pending")
    public MobileElement cartV2EstimatedSavingsSheetHeader;

    @AndroidFindBy(id = "ivClose")
    @iOSXCUITFindBy(iOSNsPredicate = "pending")
    public MobileElement cartV2EstimatedSavingsSheetCloseButton;

    @AndroidFindBy(id = "tvDescription")
    @iOSXCUITFindBy(iOSNsPredicate = "pending")
    public MobileElement cartV2EstimatedSavingsSheetStaticText;

    @AndroidFindBy(id = "tvCartSavings")
    @iOSXCUITFindBy(iOSNsPredicate = "pending")
    public MobileElement cartV2ClubCardSavings;

    @AndroidFindBy(id = "tvCartSavingsValue")
    @iOSXCUITFindBy(iOSNsPredicate = "pending")
    public MobileElement cartV2ClubCardSavingsValue;

    @AndroidFindBy(id = "tvDisclaimer")
    @iOSXCUITFindBy(iOSNsPredicate = "pending")
    public MobileElement cartV2StaticTextEstSubtotal;

    @AndroidFindBy(id = "tv_cart_dept_title")
    @iOSXCUITFindBy(iOSNsPredicate = "pending")
    public List<MobileElement> cartV2Categories;

    @AndroidFindBy(id = "checkoutButton")
    @iOSXCUITFindBy(id = "Pending")
    public MobileElement cartV2CheckoutCTA;

    @AndroidFindBy(id = "Pending")
    @iOSXCUITFindBy(id = "Pending")
    public MobileElement cartV2ThresholdText;

    @AndroidFindBy(id = "tv_cart_description")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeButton")
    public List<MobileElement> productName;

    @AndroidFindBy(id = "tv_stepper_quantity")
    @iOSXCUITFindBy(id = "btnRoundQuantity")
    public MobileElement productQuantity;

    @AndroidFindBy(id = "tv_stepper_quantity")
    @iOSXCUITFindBy(id = "btnRoundQuantity")
    public List<MobileElement> productQuantities;

    @AndroidFindBy(id = "tv_age_restricted")
    @iOSXCUITFindBy(xpath = "//*[@label='Age restricted item' and @visible='true']")
    public MobileElement ageRestrictedLabel;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'rv_cart_item_list')]/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='lblTitle'])[1]")
    public MobileElement unavailableLabel;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'tvProductStatus')]")
    @iOSXCUITFindBy(iOSNsPredicate = "value CONTAINS[c] 'Out of' or value CONTAINS[c] 'Not Available for'")
    public MobileElement unavailableProductHeaderLabel;

    @AndroidFindBy(id = "ctaViewSimilar")
    @iOSXCUITFindBy(accessibility = "btnProductCartUnavailableViewSimilar")
    public MobileElement viewSimilarCTA;

    @AndroidFindBy(id = "minimumText")
    @iOSXCUITFindBy(accessibility = "lblCartThresholdMessage")
    public MobileElement orderMinimumAmountMessage;

    @AndroidFindBy(id = "iv_stepper_plus")
    public MobileElement incrementProductQty;

    @AndroidFindBy(id = "iv_stepper_minus")
    public MobileElement decrementProductQty;

    @AndroidFindBy(id = "tv_stepper_quantity")
    public MobileElement stepperQty;

    @AndroidFindBy(id = "iv_stepper_plus")
    @iOSXCUITFindBy(accessibility = "btnStepperView")
    public MobileElement stepperView;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Network Problem\")")
    @iOSXCUITFindBy(iOSNsPredicate = "label=='Network Problem' AND type='XCUIElementTypeStaticText' AND visible==1")
    public MobileElement networkProblemMsg;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"OK\")")
    @iOSXCUITFindBy(xpath = "//*[@label='OK' or @label='Ok']")
    public MobileElement okBtnErrorMsg;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Service Problem\")")
    @iOSXCUITFindBy(iOSNsPredicate = "label=='Service Problem' AND type='XCUIElementTypeStaticText' AND visible==1")
    public MobileElement serviceProblemMsg;

    @AndroidFindBy(id = "tv_cart_title_price")
    @iOSXCUITFindBy(iOSNsPredicate = "name == 'lblPrice'")
    public List<MobileElement> productPriceList;

    @AndroidFindBy(id = "iv_remove_cart_item_card")
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Remove' AND visible==1")
    public MobileElement removeBtnCart;

    @AndroidFindBy(id = "tvCartItemsPrice")
    @iOSXCUITFindBy(iOSNsPredicate = "name contains '$'")
    public MobileElement cartSummaryTotalAmount;

    @AndroidFindBy(id = "minimumText")
    @iOSXCUITFindBy(accessibility = "lblCartThresholdMessage")
    public MobileElement minimumOrderAmountForCheckout;

    @AndroidFindBy(id = "tv_prop")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Prop 65 Warning'")
    public MobileElement prop65Warning;

    @AndroidFindBy(id = "tvSubstitutionsTitle")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement substitutionTitle;

    @AndroidFindBy(id = "tvSubstitutionQuestion")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement substitutionQuestion;

    @AndroidFindBy(id = "rb_same_brand")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement sameBrand;

    @AndroidFindBy(id = "rb_same_size")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement sameSize;

    @AndroidFindBy(id = "rb_no_sub")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement noSubstitutions;

    @AndroidFindBy(id = "ctaSaveSubstitutions")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement saveSubstitutionsBtn;

    @AndroidFindBy(id = "ctaClose")
    @iOSXCUITFindBy(accessibility = "pending")
    public MobileElement closeSubstitutionsBtn;

    @AndroidFindBy(id = "pending")
    @iOSXCUITFindBy(iOSNsPredicate = "name == 'btnNoSubstitutionCheckbox'")
    public MobileElement noSubstitutionCheckboxBtn;
}
