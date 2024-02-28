package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.util.List;

public class GG_MylistPageElements {

    @AndroidFindBy(accessibility = "MY LIST")
    @iOSXCUITFindBy(accessibility = "MY LIST")
    public MobileElement mylistTab;

    @AndroidFindBy(accessibility = "All")
    @iOSXCUITFindBy(accessibility = "All")
    public MobileElement mylistAll;

    @AndroidFindBy(accessibility = "Items")
    @iOSXCUITFindBy(accessibility = "Items")
    public MobileElement mylistItems;

    @AndroidFindBy(accessibility = "Deals")
    @iOSXCUITFindBy(accessibility = "Deals")
    public MobileElement mylistDeals;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name CONTAINS 'Comments' AND visible == 1")
    @AndroidFindBy(uiAutomator = "new UiSelector().selected(true)")
    public MobileElement selectedstate;

    @AndroidFindBy(accessibility = "Add new item")
    @iOSXCUITFindBy(accessibility = "btnAddNewItem")
    public MobileElement addNewItemButton;

    @AndroidFindBy(className = "android.widget.Button")
    @iOSXCUITFindBy(iOSNsPredicate = "label contains 'selected' AND visible==1")
    public MobileElement categoryTabSelected;

    @AndroidFindBy(id = "ic_forward")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable//XCUIElementTypeOther//XCUIElementTypeButton[contains(@name,'btnExpandableSectionHeader')]")
    public List<MobileElement> categoryDropDown;

    @AndroidFindBy(id = "tv_store_details_header")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable//XCUIElementTypeOther//XCUIElementTypeButton[contains(@name,'lblExpandableSectionHeaderTitle')]")
    public List<MobileElement> categoryTotalItemCount;

    @AndroidFindBy(id = "tv_store_details_header")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable//XCUIElementTypeOther//XCUIElementTypeButton[contains(@name,'lblExpandableSectionHeaderTitle')]")
    public List<MobileElement> categoryNamesInList;

    @AndroidFindBy(id = "view_item_card_checker")
    @iOSXCUITFindBy(accessibility = "btnMyListDealCellCheck")
    public List<MobileElement> categorySelectionCheckBox;

    @AndroidFindBy(id = "tv_deals_store_details")
    @iOSXCUITFindBy(accessibility = "lblMyListDealCellName")
    public List<MobileElement> dealNamesInSubCategory;

    @AndroidFindBy(accessibility = "More Menu")
    @iOSXCUITFindBy(accessibility = "More menu")
    public MobileElement ellipsesCTAOption;

    @AndroidFindBy(xpath = "//*[contains(@text,'List Tools')]")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'List Tools'")
    public MobileElement listToolsHeaderText;

    @AndroidFindBy(id = "tv_tools_item")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText")
    public List<MobileElement> listToolsOptions;

    @AndroidFindBy(xpath = "//android.widget.HorizontalScrollView[contains(@resource-id,'tablayout_mylist')]//android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "PENDING")
    public List<MobileElement> myListNavBarOptions;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@content-desc,'Expanded')]")
    public MobileElement expandedDropdownBtn;

    @AndroidFindBy(id = "view_item_card_checker")
    @iOSXCUITFindBy(accessibility = "btnMyListDealCellCheck")
    public MobileElement categorySelectionSingleCheckBox;

    @AndroidFindBy(id = "view_item_card_checker")
    @iOSXCUITFindBy(accessibility = "btnMyListDealCellCheck")
    public List<MobileElement> checkedSelectBtn;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@content-desc,'Expanded')]//android.widget.TextView")
    public MobileElement expandedCategoryHeader;

    @AndroidFindBy(accessibility = "back button to take you back")
    @iOSXCUITFindBy(accessibility = "btnTopNavBarLeft")
    public MobileElement backButtonInListTools;

    @AndroidFindBy(xpath = "//*[@text='Delete checked items']")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND label == 'Delete checked items' AND visible==1")
    public MobileElement deleteCheckedItem;

    @AndroidFindBy(xpath = "//*[@text='Delete all items']")
    @iOSXCUITFindBy(accessibility = "Delete all items")
    public MobileElement deleteAllItem;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_store_details_header') and not(contains(@text,'Checked - In Store Basket'))]")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name CONTAINS 'lblExpandableSectionHeaderTitle' AND NOT(label CONTAINS 'Checked - In Store Basket') AND visible==1")
    public MobileElement categoryName;

    @AndroidFindBy(accessibility = "Close")
    @iOSXCUITFindBy(accessibility = "Close")
    public MobileElement closeBtn;

    @AndroidFindBy(accessibility = "clip coupon")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'Clip Deal'")
    public MobileElement clipCoupon;

    @AndroidFindBy(id = "tv_deals_store_details")
    @iOSXCUITFindBy(accessibility = "lblMyListDealCellName")
    public MobileElement dealsNameInMyList;

    @AndroidFindBy(id = "btn_add_to_list")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Add to list'")
    public MobileElement addToListButton;

    @AndroidFindBy(id = "tv_added_to_list")
    @iOSXCUITFindBy(accessibility = "Added to list!")
    public MobileElement addedToListButton;

    @AndroidFindBy(id = "tv_deal_name")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'lblCardMediumVerticalNameLabel' AND visible==1")
    public List<MobileElement> dealName;

    @AndroidFindBy(id = "clip_coupon_layout")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Clip deal'")
    public List<MobileElement> dealClip;

    @AndroidFindBy(id = "tv_clipped_added")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Coupon Added'")
    public List<MobileElement> dealClipped;

    @AndroidFindBy(id = "tv_deals")
    @iOSXCUITFindBy(accessibility = "lblMyListDealCellName")
    public MobileElement dealsInMyList;

    @AndroidFindBy(accessibility = "Unchecked")
    @iOSXCUITFindBy(accessibility = "btnMyListDealCellCheck")
    public MobileElement checkOutButtonForDeals;

    @AndroidFindBy(id = "view_item_card_checker")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'btnMyListCategoryCellCheck' AND visible==1")
    public MobileElement checkOutButtonForItems;

    @AndroidFindBy(id = "tv_item_card_title")
    @iOSXCUITFindBy(accessibility = "lblItemNameTitle")
    public MobileElement itemInMyList;

    @AndroidFindBy(xpath = "//*[contains(@text,'Checked')]")
    @iOSXCUITFindBy(iOSNsPredicate = "label CONTAINS 'Checked - In Store Basket' AND visible==1")
    public MobileElement checkedOutCategory;

    @AndroidFindBy(id = "cl_store_details_header")
    public List<MobileElement> categoryExpandCollapseFlag;

    @AndroidFindBy(id = "tv_deals_store_details")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='lblMyListDealCellName']")
    public MobileElement firstProductAndDealNameInSubCategory;

    @AndroidFindBy(id = "etItemSearch")
    @iOSXCUITFindBy(iOSNsPredicate = "value BEGINSWITH 'Type item like' AND visible==1")
    public MobileElement searchItemTextField;

    @AndroidFindBy(accessibility = "back button to take you back")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Back' AND visible==1")
    public MobileElement backBtnItemSearch;

    @AndroidFindBy(accessibility = "Clear text")
    @iOSXCUITFindBy(accessibility = "Clear text")
    public MobileElement clearTextItemSearch;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Gmail\")")
    public MobileElement gmailAppShareOption;

    @AndroidFindBy(accessibility = "More options")
    public MobileElement moreOptionsGmail;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Discard\")")
    public MobileElement discardMailGmail;

    @iOSXCUITFindBy(xpath = "//*[@label='Cancel']")
    public MobileElement cancelMailIos;

    @iOSXCUITFindBy(xpath = "//*[@label='Delete Draft']")
    public MobileElement deleteMailDraftIos;

    @AndroidFindBy(accessibility = "Send")
    public MobileElement sendMailGmail;

    @iOSXCUITFindBy(xpath = "//*[@label='Send']")
    public MobileElement sendMailIos;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"List Tools\")")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'List Tools' AND visible==1")
    public MobileElement listToolsHeader;

    @AndroidFindBy(id = "com.google.android.gm:id/peoplekit_chip")
    @iOSXCUITFindBy(xpath = "//*[@label='To: ']")
    public MobileElement recipientAddress;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'wc_body_layout')]//android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//*[@label='Message Body']")
    public MobileElement emailBody;

    @AndroidFindBy(id = "com.google.android.gm:id/subject")
    @iOSXCUITFindBy(xpath = "//*[@label='Subject: ']")
    public MobileElement emailSubject;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(accessibility = "Ok")
    public MobileElement okButton;

    @AndroidFindBy(xpath = "//*[@label='No email service found on this device.']")
    @iOSXCUITFindBy(xpath = "//*[@label='No email service found on this device.']")
    public MobileElement noEmailServicePopUp;

    @AndroidFindBy(xpath = "//*[contains(@content-desc,'Collapsed')]")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'downArrow' AND visible==1")
    public List<MobileElement> downArrowCategoryName;

    @AndroidFindBy(xpath = "//*[contains(@content-desc,'Expanded')]")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'upArrow' AND visible==1")
    public List<MobileElement> upArrowCategoryName;

    @AndroidFindBy(id = "tv_item_card_title")
    @iOSXCUITFindBy(iOSNsPredicate = "name == 'lblItemNameTitle' AND visible==1")
    public List<MobileElement> itemNameUnderCategory;

    @AndroidFindBy(id = "tv_deals_details")
    @iOSXCUITFindBy(iOSNsPredicate = "name == 'lblMyListDealCellDescription' AND visible==1")
    public List<MobileElement> dealDescriptionUnderCategory;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Uncheck all items']")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND label == 'Uncheck all items'")
    public MobileElement uncheckAllItems;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND label == 'Ok' AND visible==1")
    public MobileElement okButtonInPromptMessage;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='CANCEL']")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND label == 'Cancel' AND visible==1")
    public MobileElement cancelButtonInPromptMessage;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Checked - In Store Basket')]")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND label CONTAINS 'Checked - In Store Basket' AND visible==1")
    public MobileElement checkedInStoreBasket;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc='Checked']")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND label == 'radioButtonChecked' AND visible==1")
    public MobileElement checkedStateBox;

    @AndroidFindBy(id = "ctaScanBarcode")
    @iOSXCUITFindBy(accessibility = "btnScanBarcode")
    public MobileElement scanBtnInSearchPageInMyList;

    @AndroidFindBy(id = "global_scan_title_tv")
    @iOSXCUITFindBy(iOSNsPredicate = "name == 'lblTopNavBarTitle' and label == 'Scan to clip'")
    public MobileElement scanScreen;

    @AndroidFindBy(accessibility = "Close")
    @iOSXCUITFindBy(accessibility = "btnTopNavBarLeft")
    public MobileElement closeBtnInScanScreen;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_remove_my_list_item_card') and @focusable='true']")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND label =='Remove' AND visible==1")
    public MobileElement removeItemBtn;

    @AndroidFindBy(id = "et_item_quantity")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name =='textFieldItemQuantity' AND visible==1")
    public MobileElement itemQuantity;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"No items on your list yet.\")")
    @iOSXCUITFindBy(accessibility = "lblMyListEmptyStateTitle")
    public MobileElement myListNoItemsNoDealsMessage;

    @AndroidFindBy(id = "tv_item_card_title")
    @iOSXCUITFindBy(accessibility = "lblItemNameTitle")
    public List<MobileElement> itemsInHeaderList;

    @AndroidFindBy(id = "tv_deals")
    @iOSXCUITFindBy(iOSNsPredicate = "name == 'lblMyListDealCellDescription' AND visible==1")
    public List<MobileElement> dealsInHeaderList;

    @AndroidFindBy(id = "ic_forward")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'downArrow' AND visible==1")
    public MobileElement headerDropDownBtn;

    @AndroidFindBy(id = "tv_store_details_header")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name BEGINSWITH 'lblExpandableSectionHeaderTitle' AND visible==1")
    public List<MobileElement> itemHeadersList;

    @AndroidFindBy(id = "tv_store_details_header")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name BEGINSWITH 'lblExpandableSectionHeaderTitle' AND visible==1")
    public List<MobileElement> dealHeadersList;

    @AndroidFindBy(id = "tv_edit_my_list_item_card")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Edit' AND visible==1")
    public MobileElement itemsEditButton;

    @AndroidFindBy(id = "bt_related_offers")
    @iOSXCUITFindBy(accessibility = "Related Offers")
    public MobileElement relatableOffers;

    @AndroidFindBy(id = "etItemSearch")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND visible==1")
    public MobileElement relatableOffersPage;

    @AndroidFindBy(accessibility = "back button to take you back")
    @iOSXCUITFindBy(accessibility = "back")
    public MobileElement relatableOffersPageBackButton;

    @AndroidFindBy(id = "tvCenterTitle")
    @iOSXCUITFindBy(accessibility = "lblTopNavBarTitle")
    public MobileElement editItemPage;

    @AndroidFindBy(accessibility = "back button to take you back")
    @iOSXCUITFindBy(accessibility = "btnTopNavBarLeft")
    public MobileElement editItemPageBackButton;

    @AndroidFindBy(xpath = "//*[@text='Clipped deals']")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND label BEGINSWITH 'Clipped deals Tab' and visible==1")
    public MobileElement clippedDealstab;

    @AndroidFindBy(accessibility = "List")
    @iOSXCUITFindBy(xpath = "//*[contains(@value,'List Tab,') and @visible='true']")
    public MobileElement listTab;

    @AndroidFindBy(id = "fabAddItem")
    @iOSXCUITFindBy(accessibility = "btnAddNewItem")
    public MobileElement newItemsBtn;

    @AndroidFindBy(id = "etItemSearch")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' and value BEGINSWITH 'Type item' AND visible==1")
    public MobileElement myListSearch;

    @AndroidFindBy(id = "rvSearchResult")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell")
    public List<MobileElement> searchResult;

    @AndroidFindBy(id = "flSnackbarCoordinator")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeOther")
    public MobileElement toastMessage;

    @AndroidFindBy(accessibility = "Clear text")
    @iOSXCUITFindBy(iOSNsPredicate = "label contains 'lear'")
    public MobileElement textClearButtonOnSearchField;

    @AndroidFindBy(accessibility = "back button to take you back")
    @iOSXCUITFindBy(accessibility = "Back")
    public MobileElement backButtonOnMyListSearchPage;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"My List\")")
    @iOSXCUITFindBy(iOSNsPredicate = "name == 'lblTitle' and label == 'My List'")
    public MobileElement myListPageHeader;

    @AndroidFindBy(id = "et_item_name")
    @iOSXCUITFindBy(accessibility = "textFieldItemTitle")
    public MobileElement itemNameField;

    @AndroidFindBy(id = "et_item_quantity")
    @iOSXCUITFindBy(accessibility = "textFieldItemQuantity")
    public MobileElement quantityField;

    @AndroidFindBy(accessibility = "back button to take you back")
    @iOSXCUITFindBy(accessibility = "btnTopNavBarLeft")
    public MobileElement backButtonOnItemCardDetailsPage;

    @AndroidFindBy(id = "tvCenterTitle")
    @iOSXCUITFindBy(accessibility = "lblTopNavBarTitle")
    public MobileElement itemsTitle;

    @AndroidFindBy(id = "cl_category_selector")
    @iOSXCUITFindBy(accessibility = "lblItemCategory")
    public MobileElement categoryNameInEditItem;

    @AndroidFindBy(id = "btn_remove_from_list")
    @iOSXCUITFindBy(accessibility = "btnRemove")
    public MobileElement removeButtonItem;

    @AndroidFindBy(id = "tv_store_details_header")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name BEGINSWITH 'lblExpandableSectionHeaderTitle' AND visible==1")
    public List<MobileElement> categoriesName;

    @AndroidFindBy(id = "et_item_name")
    @iOSXCUITFindBy(accessibility = "textFieldItemTitle")
    public MobileElement itemCardDetailPage;

    @AndroidFindBy(id = "tv_category_item_title")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'lblCategoryNameTitle' AND visible==1")
    public MobileElement categoryTitle;

    @AndroidFindBy(id = "tv_category_item_title")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'lblCategoryNameTitle' AND visible==1")
    public List<MobileElement> categoryList;

    @iOSXCUITFindBy(iOSNsPredicate = "label == 'next'")
    public MobileElement keyBoard;

    @AndroidFindBy(accessibility = "Store Aisles")
    @iOSXCUITFindBy(iOSNsPredicate = "label CONTAINS 'Store Aisles'")
    public MobileElement storeAisleTab;

    @AndroidFindBy(accessibility = "Category")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND label BEGINSWITH 'Category' AND visible==1")
    public MobileElement categoryTab;

    @AndroidFindBy(className = "android.widget.ProgressBar")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Loading' AND visible==1")
    public MobileElement loadingSpinner;

    @AndroidFindBy(accessibility = "Checked")
    @iOSXCUITFindBy(accessibility = "btnMyListDealCellCheck")
    public MobileElement unCheckForDeals;

    @AndroidFindBy(id = "view_item_card_checker")
    @iOSXCUITFindBy(accessibility = "btnMyListCategoryCellCheck")
    public MobileElement unCheckForItems;

    @AndroidFindBy(accessibility = "Buy it again")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Buy it again Tab'")
    public MobileElement buyItAgainTitleMyItemsTab;

    @AndroidFindBy(accessibility = "Offer Details Expanded")
    @iOSXCUITFindBy(accessibility = "Terms and Conditions")
    public MobileElement dealCardDetailPage;

    @AndroidFindBy(id = "ic_forward")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND label == 'downArrow' AND visible==1")
    public List<MobileElement>  expandCategory;

    @AndroidFindBy(id = "ic_forward")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND label == 'upArrow' AND visible==1")
    public MobileElement  collapseCategory;

    @AndroidFindBy(id = "iv_deals_image")
    @iOSXCUITFindBy(xpath = "(//*[@type='XCUIElementTypeCell'])[7]")
    public MobileElement dealCardImage;

    @AndroidFindBy(id = "tv_deals")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='lblMyListDealCellName']/..")
    public MobileElement dealCardOffer;

    @AndroidFindBy(id = "tv_deals_store_details")
    @iOSXCUITFindBy(accessibility = "lblMyListDealCellName")
    public MobileElement dealCardDescription;

    @AndroidFindBy(accessibility = "Last order")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND label BEGINSWITH 'Last Order Tab' and visible==1")
    public MobileElement lastOrderTab;

    @AndroidFindBy(accessibility = "MY LIST")
    @iOSXCUITFindBy(accessibility = "MY LIST")
    public MobileElement myListTab;

    @AndroidFindBy(id = "tv_clipped_deals_category_name")
    @iOSXCUITFindBy(iOSNsPredicate = "name == 'dealsCell'")
    public MobileElement dealsCategoryClippedDeals;

    @AndroidFindBy(id = "tv_clipped_deals_category_name")
    @iOSXCUITFindBy(xpath = "//*[contains(@label,'Buy it again')]/following-sibling:: XCUIElementTypeImage[@name='imgvHorizontalTitleCVCellSelection' and @visible='true']")
    public MobileElement buyItAgainSelected;

    @AndroidFindBy(id = "btn_clipped_deals_explore")
    @iOSXCUITFindBy(accessibility = "btnClippedEmptyState")
    public MobileElement exploreDealsbtn;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'lblHorizontalTitleCVCellTitle' AND visible==1")
    public List<MobileElement> tabNames;

    @AndroidFindBy(accessibility = "More Menu")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'More menu' AND visible==1")
    public MobileElement ellipses;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_remove_my_list_item_card') and @focusable='true']")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Remove' AND visible == 1")
    public MobileElement itemsRemoveButton;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_remove_deal_item') and @focusable='true']")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Remove' AND visible == 1")
    public MobileElement dealsRemoveButton;

    @AndroidFindBy(accessibility = "Most Recent")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Most Recent' AND visible==1")
    public MobileElement mostRecentTab;
    
    @AndroidFindBy(id = "tv_aisle_feedback")
    @iOSXCUITFindBy(accessibility = "btnLblAisleFeedback")
    public MobileElement aisleFeedbackBtn;

    @AndroidFindBy(id = "tv_aisle_feedback_item")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'lblCategoryNameTitle' AND visible==1")
    public MobileElement aisleFeedbackList;

    @AndroidFindBy(id = "tv_aisle_feedback_item")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'lblCategoryNameTitle' AND visible==1")
    public List <MobileElement> aisleFeedbacks;
    
    @AndroidFindBy(accessibility = "back button to take you back")
    @iOSXCUITFindBy(accessibility = "btnTopNavBarLeft")
    public MobileElement aisleFeedbackBackBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"We're having trouble accessing our servers. Please check your mobile data or WIFI connection or move to an area with better connectivity before continuing.\")")
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Please check your mobile data or WIFI connection' AND visible==1")
    public MobileElement noInternetPopMsg;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"We're having trouble accessing our servers. Please check your mobile data or WIFI connection or move to an area with better connectivity before continuing.\")")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Error updating aisle feedback' AND type == 'XCUIElementTypeStaticText'")
    public MobileElement errorUpdatingAisleFeedback;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"OK\")")
    @iOSXCUITFindBy(accessibility = "Ok")
    public MobileElement okBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"CANCEL\")")
    @iOSXCUITFindBy(accessibility = "Cancel")
    public MobileElement cancelBtn;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_item_card_title') or contains(@resource-id,'tv_deals_store_details')]")
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'lblExpandableSectionHeaderTitle' OR name CONTAINS 'lblItemNameTitle' AND visible==1")
    public List<MobileElement> listAndDeals;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Delete all items?\")")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Delete all items?' AND type == 'XCUIElementTypeStaticText'")
    public MobileElement deleteAllItemsAlertTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Do you really want to delete all items from your list?\")")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Do you really want to delete all items from your list?' AND type == 'XCUIElementTypeStaticText'")
    public MobileElement deleteAllItemsAlertMessage;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Delete checked items?\")")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Delete checked items?' AND type == 'XCUIElementTypeStaticText'")
    public MobileElement deleteCheckedItemsAlertTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Do you really want to delete checked items?\")")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Do you really want to delete checked items?' AND type == 'XCUIElementTypeStaticText'")
    public MobileElement deleteCheckedItemsAlertMessage;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Uncheck all items?\")")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Uncheck all items?' AND type == 'XCUIElementTypeStaticText'")
    public MobileElement uncheckAllItemsAlertTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Do you really want to uncheck all items?\")")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Do you really want to uncheck all items?' AND type == 'XCUIElementTypeStaticText'")
    public MobileElement uncheckAllItemsAlertMessage;

    @AndroidFindBy(id = "tv_item_card_title")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='lblItemNameTitle']/..")
    public MobileElement itemCardListView;

    @AndroidFindBy(id = "tv_deals_details")
    @iOSXCUITFindBy(iOSNsPredicate = "name == 'lblCardMediumVerticalDescritionLabel' AND visible==1")
    public List<MobileElement> dealDescriptionRelatedOffers;
}