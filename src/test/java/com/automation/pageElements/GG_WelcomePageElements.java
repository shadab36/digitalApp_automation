package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;

import java.util.List;

public class GG_WelcomePageElements {
	

	@AndroidFindBy(id = "welcome_title")
	@iOSXCUITFindBy(accessibility = "lblWelcomeTitle")
	@CacheLookup
	public MobileElement welcomeTitle;

	@AndroidFindBy(id = "welcome_slogan")
	@iOSXCUITFindBy(accessibility = "lblWelcomeDescription")
	@CacheLookup
	public MobileElement welcomeText;

	@AndroidFindBy(id = "get_start_button")
	@iOSXCUITFindBy(accessibility = "btnWelcomeCreateYourDeals")
	@CacheLookup
	public MobileElement getStartedBtn;

	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Allow'")
	@AndroidFindBy(xpath = "//android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.Button[2]")
	public MobileElement allowNotificationButton;

	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Maybe Later'")
	public MobileElement maybeLaterButton;

	@iOSXCUITFindBy(accessibility = "imgvNotificationPermissionsIllustration")
	@CacheLookup
	public List<MobileElement> allowNotificationButtonVisiblity;

	@iOSXCUITFindBy(accessibility = "Allow")
	@AndroidFindBy(xpath = "//android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.Button[2]")
	@CacheLookup
	public MobileElement clickAllowInNotificationPopUp;

	@iOSXCUITFindBy(accessibility = "Continue")
	@AndroidFindBy(id = "selectbtn")
	public MobileElement continueButton;

	@AndroidFindBy(id = "et_login_email")
	public MobileElement usernameTextField;

	@AndroidFindBy(id = "et_login_password")
	public MobileElement passwordTextField;

	@AndroidFindBy(id = "button_login")
	@iOSXCUITFindBy(accessibility = "btnSignIn")
	public MobileElement signInButton;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'button_positive')]")
	public MobileElement okButton;

	@AndroidFindBy(accessibility = "A little different.\u2028A lot easier. Now, you can shop, save and pay with one app")
	@iOSXCUITFindBy(iOSNsPredicate = "name ENDSWITH 'OnboardDeals1'")
	public MobileElement onBoardingImageOne;

	@AndroidFindBy(id = "onboarding_image_two")
	@iOSXCUITFindBy(iOSNsPredicate = "name ENDSWITH 'OnboardDeals2'")
	public MobileElement onBoardingImageTwo;

	@AndroidFindBy(id = "onboarding_image_three")
	@iOSXCUITFindBy(iOSNsPredicate = "name ENDSWITH 'OnboardDeals3'")
	public MobileElement onBoardingImageThree;

	@AndroidFindBy(id = "onboarding_image_forth")
	@iOSXCUITFindBy(iOSNsPredicate = "name ENDSWITH 'OnboardDeals4'")
	public MobileElement onBoardingImageFourth;

	@AndroidFindBy(id = "get_start_button")
	@iOSXCUITFindBy(accessibility = "btnLetsGetStarted")
	public MobileElement letsGetStartedButton;

	@AndroidFindBy(id = "PENDING")
	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'lblOnboardingImageTitle'")
	public MobileElement littleDifferecneLotEasierTitle;

	@AndroidFindBy(accessibility = "close")
	@iOSXCUITFindBy(id = "PENDING")
    public WebElement closeBtn;

	@AndroidFindBy(id = "textLetsStarted")
	@iOSXCUITFindBy(iOSNsPredicate = "label == 'Let’s get started'")
	public MobileElement welcomePageMsg;

	@iOSXCUITFindBy(accessibility = "btnNotificationPermissionsAllow")
	public MobileElement allowpushNotification;

	@iOSXCUITFindBy(accessibility = "Not right now")
	public MobileElement notRightNowpushNotification;

	@iOSXCUITFindBy(accessibility = "Allow")
	public MobileElement allowNotificationPermissionPopup;

	@iOSXCUITFindBy(accessibility = "Don’t Allow")
	public MobileElement dontAllowNotificationPermissionPopup;
}
