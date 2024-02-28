package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.CacheLookup;

public class SignInPageElements {
    //sign in Text   "Sign In"

    @iOSXCUITFindBy(accessibility = "email")
    @AndroidFindBy( id= "com.safeway.client.android.safeway:id/switchCompat")
    public MobileElement switchEmail;

    @iOSXCUITFindBy(accessibility = "Sign In")
    @AndroidFindBy(id = "com.safeway.client.android.safeway:id/textInfo")
    public MobileElement signInTitle;

  // edit email
  @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Email\"]")
  @AndroidFindBy(id = "com.safeway.client.android.safeway:id/uma_edit_text")
  @CacheLookup
  public MobileElement emailEditText;

  // edit password
  @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"Password\"]")
  @AndroidFindBy(xpath = "(//android.widget.EditText[@text=\"-\"])[1]")
  @CacheLookup
  public MobileElement passwordEditText;

    //forgot Password
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Forgot Password' AND visible == 1")
    @AndroidFindBy(id = "buttonForgotPassword")
    @CacheLookup
    public MobileElement forgotPasswordLink;

    //sign in button
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Sign In' AND visible == 1")
    @AndroidFindBy(id = "buttonLogin")
    @CacheLookup
    public MobileElement signInButton;

    //create account button
    @iOSXCUITFindBy(accessibility = "Create Account")
    @AndroidFindBy(id = "signup_button")
    @CacheLookup
    public MobileElement createAccountButton;

    //cancel button
    @AndroidFindBy(accessibility = "Navigate up")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Cancel' AND visible == 1")
    public MobileElement cancelButton;

    //user and password mismatch error message
    @iOSXCUITFindBy(accessibility = "The email and password you entered do not match our records. Please try again.")
    @AndroidFindBy(id = "textViewServerError")
    @CacheLookup
    public MobileElement invalidAccountErrorMessage;

    //no account record error
    @iOSXCUITFindBy(accessibility = "The email address you have entered does not match our records. Please try again.")
    @AndroidFindBy(id = "alertTitle")
    public MobileElement noAccountRecordError;

    //forgot password page next button
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'NEXT' AND visible == 1")
    @AndroidFindBy(id = "buttonNext")
    public MobileElement forgotPasswordNextButton;

}
