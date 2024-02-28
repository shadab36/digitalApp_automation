package com.automation.pages;

import com.automation.pageElements.SignInPageElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignInPage extends BasePage {
    private SignInPageElements signInPageElements = new SignInPageElements();
    public SignInPage(AppiumDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), signInPageElements);
    }

    public void enterUsername(String username) throws InterruptedException {
        waitForDisplayed(signInPageElements.switchEmail);
        signInPageElements.switchEmail.click();
        waitForDisplayed(signInPageElements.emailEditText);
        enterKey(signInPageElements.emailEditText, username);
    }

    public void enterPassword(String password){
        enterKey(signInPageElements.passwordEditText, password);
    }

    public void clickSignIn(){ signInPageElements.signInButton.click(); }

    public void clickCreateAccountButton(){
        signInPageElements.createAccountButton.click();
    }

    public void waitForSignInPageDisplayed() {
        waitVar.until(ExpectedConditions.visibilityOf(signInPageElements.signInTitle));
    }

    public void clickForgotPasswordLink() {
        signInPageElements.forgotPasswordLink.click();
    }

    public void clickCancelButton() {
            clickElement(signInPageElements.cancelButton);
    }

    public void waitForInvalidPasswordError() {
        waitForDisplayed(signInPageElements.invalidAccountErrorMessage);
    }

    public void verifyNoRecordError() {
        waitForDisplayed(signInPageElements.noAccountRecordError);
    }

    public boolean forgotPasswordNextButtonEnabled() {
        waitForDisplayed(signInPageElements.forgotPasswordNextButton);
        return signInPageElements.forgotPasswordNextButton.isEnabled();
    }
}
