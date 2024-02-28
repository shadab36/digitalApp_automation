package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class GG_birthdaycardElements {

//    @AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[2]/android.widget.ImageView[2]")
//    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[3]/android.widget.TextView[1]")
//    @AndroidFindBy(xpath="//*[@text=\"Get a birthday treat on us!\"]")
      @AndroidFindBy(xpath="//*[@content-desc=\"Right arrow\" and @index=\"3\"]")

    @iOSXCUITFindBy(xpath = "//*[@label=\"Get a birthday treat on us\" and @name=\"imgBirthdayCardBannerImage\"]")
    public MobileElement bdaycard;



    @iOSXCUITFindBy(xpath = "//*[@label=\"Close\"]")
    @AndroidFindBy(xpath = "//*[@content-desc=\"Close\"]")
    public MobileElement crossSign;

//      @AndroidFindBy(xpath="//android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]")
    @AndroidFindBy(xpath = "//*[@text=\"MM / DD\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Enter your birthday\"]")
    public MobileElement dobedit;
    @AndroidFindBy(xpath = "//*[@text=\"Personalized Deals\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Personalized Deals\"]")
    public MobileElement pdeals;

    //    @AndroidFindBy(xpath="//android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    @AndroidFindBy(xpath = "//*[@text=\"Enter a valid birthday\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Enter a valid birthday\"]")
    public MobileElement entervaliddate;

    //    @AndroidFindBy(xpath="//android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.Button[1]")
    @AndroidFindBy(xpath = "//*[@text=\"Confirm\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label=\"Confirm\"]")
    public MobileElement confirmDOB;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.Button[1]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Close\"]")
    public MobileElement closeDOB;


    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.Button[1]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Enter your birthday Validation failed.\"]")
    public MobileElement cleareditbox;

//    @AndroidFindBy(xpath = "//*[@text=\"Get a little treat on your birthday, on us\"]")
    @AndroidFindBy(xpath = "//android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[1]")

    @iOSXCUITFindBy(xpath = "//*[@label=\"Get a little treat on your birthday, on us\"]")
    public MobileElement cardtitle;

    @AndroidFindBy(xpath = "//*[@text=\"Add your birthday below\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Add your birthday below\"]")
    public MobileElement cardsubtitle;

}

