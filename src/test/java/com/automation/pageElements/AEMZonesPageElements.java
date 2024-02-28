package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.util.List;

public class AEMZonesPageElements {


    @iOSXCUITFindBy(xpath = "//*[contains(@name,\"viewStepperView\")]")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add\")")
    public MobileElement addCTA_LandingPage;

    //  @iOSXCUITFindBy(xpath = "//*[@value=\"CTA LP\"]")
    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"LP\")]")
//   @iOSXCUITFindBy(iOSNsPredicate = "value == \"CTA LP\"")
    //  @AndroidFindBy(xpath = "//*[@content-desc=\"LP banner CTA LP\"]")
    @AndroidFindBy(id = "tv_aem_card_open_app")
    public MobileElement carouselLPACTAHomePage;

    //  @iOSXCUITFindBy(xpath = "//*[@label=\"landing Page linked Banner\"]")
    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"landing Page\")]")
    // @iOSXCUITFindBy(iOSNsPredicate = "label == \"landing Page linked Banner\"")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"landing Page linked Banner\")")
    public MobileElement carouselLPASubTitleHomePage;

    //  @iOSXCUITFindBy(xpath = "//*[@label=\"LP banner\"]")
    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"LP banner\")]")
    // @iOSXCUITFindBy(iOSNsPredicate = "label == \"LP banner\"")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"LP banner\")")
    public MobileElement carouselLPATitleHomePage;

    //  @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Carousel Title\")]")
    @AndroidFindBy(id = "tv_salutation_header")
    public MobileElement carouselTitleHomePage;

    //  @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Carousel Title\")]")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'lblSeeAllTitle' AND visible == 1")
    @AndroidFindBy(id = "tv_salutation_header")
    public MobileElement carouselTitle;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'lblSeeAllSubTitle' AND visible == 1")
    @AndroidFindBy(id = "tv_salutation_wish")
    public MobileElement carouselSubTitle;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'btnSeeAllButtonTitle' AND visible == 1")
    @AndroidFindBy(id = "tv_see_all")
    public MobileElement carouselCtaText;


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[10]/XCUIElementTypeButton[2]")

    @iOSXCUITFindBy(xpath = "//*[@label=\"CTA search\"]")
    @AndroidFindBy(xpath = "//*[@text=\"CTA search\"]")
    public MobileElement ctaSearch;

    @iOSXCUITFindBy(xpath = "//*[@label=\"External CTA Banner\"]")
    @AndroidFindBy(xpath = "//*[@text=\"External CTA Banner\"]")
    public MobileElement ctaExternal;


    @AndroidFindBy(xpath = "//*[@content-desc=\"LP banner CTA LP\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"LP banner\"]")
    public MobileElement ctaLp;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[10]/XCUIElementTypeButton[2]")
    @AndroidFindBy(xpath = "//*[@text=\"LP banner\"]")
    public MobileElement mediumBannerLpTitle;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id,\"tv_title\")]")
    public MobileElement landingPageName;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id,\"back\")]")
    public MobileElement LpBackBtn;


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[4]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(xpath = "//android.view.ViewGroup[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]")
    public MobileElement carouselCTA;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
    //@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
    //  @iOSXCUITFindBy(iOSNsPredicate = "label == \"Carousel Title\"")
    @AndroidFindBy(id = "bottom_sheet_title")
    public MobileElement carouselsheetTitle;


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "bottom_sheet_sub_title")
    public MobileElement carouselsheetSubTitle;

    //  @iOSXCUITFindBy(xpath = "//*[@label="iconClose"]")
    @iOSXCUITFindBy(iOSNsPredicate = "label == \"iconClose\"")
    @AndroidFindBy(id = "bottom_sheet_close")
    public MobileElement carouselsheetClose;


    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Landing Page\")]")
    @AndroidFindBy(id = "tv_aem_card_header")
    public MobileElement carouselLPATitleBrowsePage;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Landing Page\")]")
    @AndroidFindBy(id = "tv_aem_card_sub_header")
    public MobileElement carouselLPASubTitleBrowsePage;

    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"Landing Page\")]")
    @AndroidFindBy(id = "tv_aem_card_open_app")
    public MobileElement carouselLPACTABrowsePage;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.Button[1]/android.view.ViewGroup[2]/android.widget.ViewSwitcher[1]/android.widget.TextView[1] | //android.widget.FrameLayout[1]/android.widget.Button[1]/android.view.ViewGroup[3]/android.widget.ViewSwitcher[1]/android.widget.TextView[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@name, \"viewStepperView\")]")
    public List<MobileElement> addButtonList;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[25]/XCUIElementTypeButton[2]")
    @AndroidFindBy(xpath = "//*[@content-desc=\"Banner- Landing Page CTA Label\"]")
    public MobileElement ctaLpBrowsePage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[25]/XCUIElementTypeButton[2]")
    @AndroidFindBy(xpath = "//*[@text=\"Banner- Landing Page\"]")
    public MobileElement mediumBannerLpTitleBrowsePage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "tv_title")
    public MobileElement landingPageNameBrowsePage;

    //none
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[10]/XCUIElementTypeButton[4]")
    @AndroidFindBy(xpath = "//*[@text=\"Banner- No CTA\"]")
    public MobileElement mediumBannerNoneTitle;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[10]/XCUIElementTypeButton[4]")
    @AndroidFindBy(xpath = "//*[@text=\"CTA None\"]")
    public MobileElement ctaNone;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[26]/XCUIElementTypeButton[1]")
    @AndroidFindBy(xpath = "//*[@text=\"test banner\"]")
    public MobileElement mediumBannerNoneTitleBrowsePage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[26]/XCUIElementTypeButton[1]")
    @AndroidFindBy(xpath = "//*[(@text=\"CTA Link none\")]")
    public MobileElement ctaNoneBrowsePage;


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[10]/XCUIElementTypeOther[1]/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]")
    public MobileElement summerGrillingCarouselAddButton;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Back\"] | //*[@label=\"back\"]")
    @AndroidFindBy(xpath = "//*[@content-desc=\"Back\"] | //*[@content-desc=\"Back / Navigation Up\"]")
    public MobileElement navigateBackFromExternalLink;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.Button[1]/android.widget.ImageView[1]")
    public MobileElement firstProductInSheet;
}

