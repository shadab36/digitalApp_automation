package com.automation.pageElements.meals.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class OnBoardingFlowElements {

    //Todo - pending verification of unused elements, keeping for using it in future automation scenarios

    @iOSXCUITFindBy(iOSNsPredicate = "name == \"menu:id/onboarding-welcome\"")
    //@AndroidFindBy(xpath = "//*[@text=\"Your meals, your way\"]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'onboarding-welcome')]")
    public MobileElement onboardingWelcomeScene;

    @iOSXCUITFindBy(iOSNsPredicate = "type == \"XCUIElementTypeButton\" AND label == \"back\"")
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'back-button')]")
    public MobileElement onboardingBackButton;

    @iOSXCUITFindBy(iOSNsPredicate = "name == \"Pick your diet\"")
    @AndroidFindBy(xpath = "//*[@text=\"Pick your diet\"]")
    public MobileElement pickYourDietButton;

    @iOSXCUITFindBy(xpath = "//*[@name=\"Skip\"]")
    @AndroidFindBy(xpath = "//*[@text=\"Skip\"]")
    public MobileElement skipButton;

    @iOSXCUITFindBy(xpath = "//*[@name=\"mealsBannerImage\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"mealsBannerImage\"]")
    public MobileElement pickYourDietTextVerificationStep2Page;

    @iOSXCUITFindBy(xpath = "//*[@name=\"mealsBannerImage\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"mealsBannerImage\"]")
    public MobileElement pickYourDietSelectDiets;

    @iOSXCUITFindBy(xpath = "//*[@name=\"mealsBannerImage\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"mealsBannerImage\"]")
    public MobileElement nextButtonStep2Page;

    @iOSXCUITFindBy(xpath = "//*[@name=\"mealsBannerImage\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"mealsBannerImage\"]")
    public MobileElement anyAllergiesOrRestrictionsTextStep3Page;

    @iOSXCUITFindBy(xpath = "//*[@name=\"mealsBannerImage\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"mealsBannerImage\"]")
    public MobileElement anyAllergiesOrRestrictionsSelectAllergiesOrRestrictionsStep3;

    @iOSXCUITFindBy(xpath = "//*[@name=\"mealsBannerImage\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"mealsBannerImage\"]")
    public MobileElement nextButtonStep3Page;

    @iOSXCUITFindBy(xpath = "//*[@name=\"mealsBannerImage\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"mealsBannerImage\"]")
    public MobileElement howAboutDislikesTextStep4Page;

    @iOSXCUITFindBy(xpath = "//*[@name=\"mealsBannerImage\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"mealsBannerImage\"]")
    public MobileElement selectDislikesStep4Page;

    @iOSXCUITFindBy(xpath = "//*[@name=\"mealsBannerImage\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"mealsBannerImage\"]")
    public MobileElement seeAllButtonStep4Page;

    @iOSXCUITFindBy(xpath = "//*[@name=\"mealsBannerImage\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"mealsBannerImage\"]")
    public MobileElement seeAllButtonSelectDislikeTextStep4Page;

    @iOSXCUITFindBy(xpath = "//*[@name=\"mealsBannerImage\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"mealsBannerImage\"]")
    public MobileElement seeAllButtonFilterIngredientsSearchStep4Page;

    @iOSXCUITFindBy(xpath = "//*[@name=\"mealsBannerImage\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"mealsBannerImage\"]")
    public MobileElement seeAllButtonSelectIngredientsCheckBoxStep4Page;

    @iOSXCUITFindBy(xpath = "//*[@name=\"mealsBannerImage\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"mealsBannerImage\"]")
    public MobileElement seeAllButtonDoneButtonStep4Page;

    @iOSXCUITFindBy(xpath = "//*[@name=\"mealsBannerImage\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"mealsBannerImage\"]")
    public MobileElement nextButtonStep4Page;

    @iOSXCUITFindBy(xpath = "//*[@name=\"mealsBannerImage\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"mealsBannerImage\"]")
    public MobileElement totalServingsPerMealTextStep5Page;

    @iOSXCUITFindBy(xpath = "//*[@name=\"mealsBannerImage\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"mealsBannerImage\"]")
    public MobileElement selectTotalServingsPerMeal4ServingsButtonStep5Page;

    @iOSXCUITFindBy(xpath = "//*[@name=\"mealsBannerImage\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"mealsBannerImage\"]")
    public MobileElement selectTotalServingsPerMeal6ServingsButtonStep5Page;

    @iOSXCUITFindBy(xpath = "//*[@name=\"mealsBannerImage\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"mealsBannerImage\"]")
    public MobileElement doneButtonStep5Page;
}
