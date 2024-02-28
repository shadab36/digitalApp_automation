package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.util.List;

public class GG_DashboardPersonalisePageElements {

    @AndroidFindBy(xpath = "//*[contains(@text,'Must-have grabs')]")
    @iOSXCUITFindBy(xpath = "//*[@value='Must-have grabs']")
    public MobileElement mustHaveGrabsLabel;

    @AndroidFindBy(xpath = "//*[contains(@text,'Buy it again')]")
    @iOSXCUITFindBy(xpath = "//*[@value='Buy it again']")
    public MobileElement buyItAgainLabel;

    @AndroidFindBy(xpath = "//*[contains(@text,'Must-have grabs')]//following-sibling::*[contains(@resource-id,'tv_see_all')]")
    @iOSXCUITFindBy(xpath = "//*[@value='Must-have grabs']//parent::*//following-sibling::*[contains(@name,'btnSeeAllButtonTitle')]")
    public MobileElement seeAllMustHaveGrabs;

    @AndroidFindBy(xpath = "//*[contains(@text,'Buy it again')]//following-sibling::*[contains(@resource-id,'tv_see_all')]")
    @iOSXCUITFindBy(xpath = "//*[@value='Buy it again']//parent::*//following-sibling::*[contains(@name,'btnSeeAllButtonTitle')]")
    public MobileElement seeAllBuyItAgain;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'tvTitle') and @text='Must-have grabs']")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeNavigationBar' AND name == 'Must-have grabs'")
    public MobileElement getMustHaveGrabsTitle;

    @AndroidFindBy(id = "itemParentLayout")
    @iOSXCUITFindBy(id = "productCell")
    public MobileElement productCard;

    @AndroidFindBy(id = "deals_cardview")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeButton[@visible='true']")
    public List<MobileElement> dealCardContainer;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Clip your deals\")")
    @iOSXCUITFindBy(xpath = "//*[contains(@label,'Clip your deals')]")
    public MobileElement clipYourFavoriteTitle;

    @AndroidFindBy(accessibility = "Navigate up")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Back' AND visible==1")
    public MobileElement backBtnMustHaveGrabs;

    @AndroidFindBy(xpath = "//*[contains(@text,'Clip your deals')]//following-sibling::*[contains(@resource-id,'tv_salutation_no_deal')]")
    @iOSXCUITFindBy(xpath = "//*[contains(@label,'Clip your deals')]")
    public MobileElement clipYourDealsCount;

    @AndroidFindBy(xpath = "//*[@text='See all']")
    @iOSXCUITFindBy(iOSNsPredicate = "name == 'btnSeeAllButtonTitle-Clip your deals'")
    public MobileElement seeAllClipYourDeals;
}
