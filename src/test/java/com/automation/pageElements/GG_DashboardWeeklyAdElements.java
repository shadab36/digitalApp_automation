package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class GG_DashboardWeeklyAdElements {

    @AndroidFindBy(xpath  = "(//android.widget.TextView[@text=\"Weekly Ads\"])")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value == 'Weekly Ad'")
    public MobileElement weeklyAdBannerTitle;

    @AndroidFindBy(xpath = "//*[contains(@content-desc,'Browse the weekly') or contains(@content-desc,'Show all weekly ads')]")
    @iOSXCUITFindBy(accessibility = "imageMoreServiceBannerImageView-promo")
    public MobileElement weeklyAdBanner;

    @AndroidFindBy(xpath = "//*[contains(@content-desc,'Browse the weekly') or contains(@content-desc,'Show all weekly ads')]")
    @iOSXCUITFindBy(accessibility = "imageMoreServiceBannerImageView-promo")
    public MobileElement weeklyAdBannerImage;

    @AndroidFindBy(xpath  = "(//android.widget.Button[@text=\"View by Category\"])")
    @iOSXCUITFindBy(accessibility = "View by Category")
    public MobileElement weeklyAdCoverImage;

    @AndroidFindBy(id = "progress_indicator")
    @iOSXCUITFindBy(accessibility = "In progress")
    public MobileElement loadingSpinner;

    @AndroidFindBy(accessibility = "Show all weekly ads")
    @iOSXCUITFindBy(accessibility = "imageMoreServiceBannerImageView-promo")
    public MobileElement skinnyWeeklyAdBanner;

    @AndroidFindBy(accessibility = "Back")
    @iOSXCUITFindBy(accessibility = "btnTopNavBarWithHintLeft")
    public MobileElement backButton;

}
