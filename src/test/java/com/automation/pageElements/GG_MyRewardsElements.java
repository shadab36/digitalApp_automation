package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.w3c.dom.html.HTMLInputElement;

public class GG_MyRewardsElements {



    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"View My rewards\"]")
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"View Rewards\"]")
    //   @AndroidFindBy(xpath="//android.widget.Button[@text=\"Rewards\"]")
    // @AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"View My rewards link\"]")
    //@AndroidFindBy(xpath="//android.view.ViewGroup[@ content-desc=\"View My rewards link\"]")
    // @AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"View My rewards link\"]")
//    @AndroidFindBy(xpath= "//android.widget.Button[@text=\"Rewards\"]")
    @AndroidFindBy(xpath="//*[@text=\"My rewards\"]")
    public MobileElement rewardhome;

    @AndroidFindBy(xpath = "//*[@text=\"For U\"]")
//    @iOSXCUITFindBy(xpath = "//*[@label=\"For U Tab, 2 of 3\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
    public MobileElement forUtitle;

    @AndroidFindBy(xpath = "//*[@text=\"Coming soon\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Coming Soon\"]")
    public MobileElement comingsoon;

//    @AndroidFindBy(xpath = "//*[@text=\"During your birthday month, enjoy a treat on us. You can use it on any purchase.\"]")
    @AndroidFindBy(xpath= "//*[starts-with(@text,\"During your birthday\")]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"During your birthday month, enjoy a treat on us. You can use it on any purchase.\"]")
    public MobileElement comingsoonbdaytext;

//    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[10]/android.widget.Button[1]")
    @AndroidFindBy(xpath = "//*[@text=\"Learn More\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Learn more\"]")
    public MobileElement learntab;

      @AndroidFindBy(xpath = "//*[@text=\"Birthday Treat\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Birthday Treat\"]")
    public MobileElement dealstab;

    @AndroidFindBy(xpath="//*[@text=\"My rewards\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"View My rewards\"]")
    public MobileElement rewarddeals;
    @AndroidFindBy(xpath = "//*[@text=\"Birthday Treat\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Birthday Treat\"]")
    public MobileElement bdaytreat;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[2]/android.widget.ImageView[1]")



    @AndroidFindBy(xpath = "//*[@text=\"Free In-Store WiFi\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Free In-Store WiFi\"]")
    public MobileElement freewifi;

    @AndroidFindBy(xpath = "//*[@text=\"Free Item Every Month\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Free Item Every Month\"]")
    public MobileElement freeitem;

    @AndroidFindBy(xpath = "//*[@text=\"$5 Off Welcome Offer for New Members\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"$5 Off Welcome Offer for New Members\"]")
    public MobileElement welcomeoffer;

    @AndroidFindBy(xpath = "//*[@text=\"Personalized Deals\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Personalized Deals\"]")
    public MobileElement pdeals;

    @AndroidFindBy(xpath = "//*[@text=\"Redeem Rewards on Gas & Grocery\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Redeem Rewards on Gas & Grocery\"]")
    public MobileElement redeemrewards;

    @AndroidFindBy(xpath = "//*[@text=\"Unlimited Free Delivery (on orders $30+)\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Unlimited Free Delivery (on orders $30+)\"]")
    public MobileElement unlimitedfree;


    @AndroidFindBy(xpath = "//*[@text=\"Exclusive Monthly Starbucks Perks\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Exclusive Monthly Starbucks Perks\"]")
    public MobileElement starbuckPerk;


    @AndroidFindBy(xpath = "//*[@text=\"2-Hour Delivery (where available)\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"2-Hour Delivery (where available)\"]")
    public MobileElement hrdelivery;


    @AndroidFindBy(xpath = "//*[@text=\"5% Off O Organic® and Open Nature®\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"5% Off O Organic® and Open Nature®\"]")
    public MobileElement organic;


    @AndroidFindBy(xpath = "//*[@text=\"Rewards Don't Expire\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Rewards Don't Expire\"]")
    public MobileElement rewardsnoexpire;


    @AndroidFindBy(xpath = "//*[@text=\"VIP Customer Service Phone Line\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"VIP Customer Service Phone Line\"]")
    public MobileElement vipcare;


    @AndroidFindBy(xpath = "//*[@text=\"Culinary Experiences\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Culinary Experiences\"]")
    public MobileElement experienceculi;

    @AndroidFindBy(xpath = "//*[@text=\"Shop to earn rewards\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Shop to earn rewards. You have 0 out of 100 points to your next reward button\"]")
    public MobileElement scorecardNoRewards;


    @AndroidFindBy(xpath = "//*[contains(@resource-id,\":id/tvPointsSummary\")]")
    @iOSXCUITFindBy(xpath = "//*[contains(@label,'Start spending to earn points')]")
    public MobileElement howForUScoreCardNoRewards;

    @AndroidFindBy(xpath = "//*[@text=\"Earning points\"]")
    @iOSXCUITFindBy(xpath = "//*[@value=\"Earning points\"]")
    public MobileElement earningPointsText;

    @AndroidFindBy(xpath = "//*[contains(@text,\"Earn a point for every dollar you spend on groceries\")]")
    @iOSXCUITFindBy(xpath = "//*[contains(@value,\"Earn a point for every dollar you spend on groceries\")]")
    public MobileElement earnPointForeveryDol;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,\"id/tv_rewards_title\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[1]/XCUIElementTypeStaticText[1]")
    public MobileElement howForUscreenHeading;

    @AndroidFindBy(xpath = "//*[@text=\"FAQ\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"FAQ\"]")
    public MobileElement faqInHowForUScreen;

    @AndroidFindBy(xpath = "//*[@text=\"Terms and Conditions\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Terms and Conditions\"]")
    public MobileElement termsAndConditionHowFU;

    @AndroidFindBy(xpath = "//*[@text=\"Terms and Conditions\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"back\"]")
    public MobileElement HowForUBackButton;

    @AndroidFindBy(xpath = "//*[@text=\"for U perks*\"]")
    @iOSXCUITFindBy(xpath = "//*[@value=\"for U perks*\"]")
    public MobileElement foruPerks;

    @AndroidFindBy(xpath = "//*[contains(@text,\"program detailed FAQ\")]")
    @iOSXCUITFindBy(xpath = "//*[contains(@value,\"program detailed FAQ\")]")
    public MobileElement faqText;

    @AndroidFindBy(xpath = "//*[contains(@text,\"PROGRAM TERMS & CONDITIONS\")]")
    @iOSXCUITFindBy(xpath = "//*[contains(@value,\"PROGRAM TERMS & CONDITIONS\")]")
    public MobileElement TandCText;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Done\"]")
    public MobileElement doneButton;


    @AndroidFindBy(xpath = "//*[contains(@resource-id,\"d/tvRewardScorecardTitle\")]")
    @iOSXCUITFindBy(xpath = "//*[contains(@label,\"You have 100 out of 100 points to your next reward button\")]")
    public MobileElement scorecardwithRewards;


    @AndroidFindBy(xpath = "//*[contains(@resource-id,\"id/tvPointsSummary\")] ")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
    public MobileElement howforUWithRewards;

    @iOSXCUITFindBy(xpath = "//*[@label=\"Close\"]")
    public MobileElement cookieClose;
//*[contains(@text,"Tom Thumb for U™ program detailed")]






}

