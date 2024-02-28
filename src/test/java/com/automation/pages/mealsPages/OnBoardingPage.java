package com.automation.pages.mealsPages;

import com.automation.pageElements.meals.pageElements.OnBoardingFlowElements;
import com.automation.pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class OnBoardingPage extends BasePage {

    private OnBoardingFlowElements onBoardingFlowElements = new OnBoardingFlowElements();
    private MealsUtils mealsUtils = new MealsUtils(driver);

    public OnBoardingPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), onBoardingFlowElements);
    }

    public void clickSkipButton() {
        waitForClickableAndClick(onBoardingFlowElements.skipButton);
    }

    public void clickPickYourDietButton() {
        waitForClickableAndClick(onBoardingFlowElements.pickYourDietButton);
    }

    public boolean onboardingWelcomeScene() {
        waitForLoadingComplete();
        Boolean result = false;
        try {
            if (onBoardingFlowElements.onboardingWelcomeScene.isDisplayed()) {
                result = true;
            }
        } catch (Exception e) {
            result = false;
        }
        return result;
    }

    public MobileElement onBoardingFlowTextElement() {
        return onBoardingFlowElements.onboardingWelcomeScene;
    }

    public void clickBackButton() {
        onBoardingFlowElements.onboardingBackButton.click();
    }

    public boolean verifyOnboardingPageIsDisplayed() {
        waitForLoadingComplete();
        List result = new ArrayList();
        if (mealsUtils.checkMobileElementExist(onBoardingFlowElements.onboardingWelcomeScene)) {
            result.add(onBoardingFlowElements.onboardingWelcomeScene.isDisplayed());
            result.add(onBoardingFlowElements.pickYourDietButton.isDisplayed());
            result.add(onBoardingFlowElements.skipButton.isDisplayed());
        }
        return !result.contains(false) && !result.isEmpty();
    }
}
