package com.automation.pageElements.meals.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class RecipeListPageElements {

    //Todo - pending verification of unused elements, keeping for using it in future automation scenarios

    @iOSXCUITFindBy(iOSNsPredicate = "name == \"menu:id/add-recipe-button\"")
    @AndroidFindBy(xpath = "//*[@resource-id=\"menu:id/add-recipe-button\"]")
    public MobileElement addToMealPlanButton;

    @iOSXCUITFindBy(iOSNsPredicate = "name == \"menu:id/remove-recipe-button\"")
    @AndroidFindBy(xpath = "//*[@resource-id=\"menu:id/remove-recipe-button\"]")
    public MobileElement removeRecipeFromMealPlanButton;

    @iOSXCUITFindBy(iOSNsPredicate = "name == \"menu:id/recipe-list-thumb-0\"")
    @AndroidFindBy(xpath = "//*[@resource-id=\"menu:id/recipe-list-thumb-0\"]")
    public MobileElement firstRecipeInView;

    @iOSXCUITFindBy(iOSNsPredicate = "name == \"menu:id/recipe-list-thumb-1\"")
    @AndroidFindBy(xpath = "//*[@resource-id=\"menu:id/recipe-list-thumb-1\"]")
    public MobileElement secondRecipeInView;

    @iOSXCUITFindBy(iOSNsPredicate = "name == \"menu:id/recipe-title\"")
    @AndroidFindBy(xpath = "//*[@resource-id=\"menu:id/recipe-title\"]")
    public MobileElement recipeTitle;

    @iOSXCUITFindBy(iOSNsPredicate = "name == \"menu:id/recipe-content-loaded\"")
    @AndroidFindBy(xpath = "//*[@resource-id=\"menu:id/recipe-content-loaded\"]")
    public MobileElement recipeContent;

    @iOSXCUITFindBy(iOSNsPredicate = "name == \"menu:id/favorite-button\"")
    @AndroidFindBy(xpath = "//*[@resource-id=\"menu:id/favorite-button\"]")
    public MobileElement favoriteButton;

    @iOSXCUITFindBy(iOSNsPredicate = "name == \"menu:id/navbar-header\"")
    @AndroidFindBy(xpath = "//*[@resource-id=\"menu:id/navbar-header\"]")
    public MobileElement pageTitleHeader;

    @iOSXCUITFindBy(iOSNsPredicate = "name == \"menu:id/shop-ingredients-button\"")
    @AndroidFindBy(xpath = "//*[@resource-id=\"menu:id/shop-ingredients-button\"]")
    public MobileElement recipeDetailPageShopIngredientsButton;

    @iOSXCUITFindBy(iOSNsPredicate = "name == \"menu:id/nutrition-button\"")
    @AndroidFindBy(xpath = "//*[@resource-id=\"menu:id/nutrition-button\"]")
    public MobileElement recipeDetailPageNutritionButton;

    @iOSXCUITFindBy(iOSNsPredicate = "name == \"menu:id/set-servings-button\"")
    @AndroidFindBy(xpath = "//*[@resource-id=\"menu:id/set-servings-button\"]")
    public MobileElement numberOfServingsButton;

    @iOSXCUITFindBy(iOSNsPredicate = "name == \"menu:id/option-servings-2\"")
    @AndroidFindBy(xpath = "//*[@resource-id=\"menu:id/set-servings-2\"]")
    public MobileElement selectNumberOfServingsButtonTwoServings;

    @iOSXCUITFindBy(iOSNsPredicate = "name == \"menu:id/option-servings-4\"")
    @AndroidFindBy(xpath = "//*[@resource-id=\"menu:id/set-servings-4\"]")
    public MobileElement selectNumberOfServingsButtonFourServings;

    @iOSXCUITFindBy(iOSNsPredicate = "name == \"menu:id/option-servings-6\"")
    @AndroidFindBy(xpath = "//*[@resource-id=\"menu:id/set-servings-6\"]")
    public MobileElement selectNumberOfServingsButtonSixServings;

    @iOSXCUITFindBy(iOSNsPredicate = "name == \"menu:id/recipe-list-thumb-0-remove\"")
    @AndroidFindBy(xpath = "//*[@resource-id=\"menu:id/recipe-list-thumb-0-remove\"]")
    public MobileElement quickRemoveButtonRecipeListPageFirstItem;

    @iOSXCUITFindBy(iOSNsPredicate = "name == \"menu:id/recipe-list-thumb-0-add\"")
    @AndroidFindBy(xpath = "//*[@resource-id=\"menu:id/recipe-list-thumb-0-add\"]")
    public MobileElement quickAddButtonRecipeListPageFirstItem;

    @iOSXCUITFindBy(iOSNsPredicate = "name == \"menu:id/recipe-list-thumb-1-add\"")
    @AndroidFindBy(xpath = "//*[@resource-id=\"menu:id/recipe-list-thumb-1-add\"]")
    public MobileElement quickAddButtonRecipeListPageSecondItem;

    @iOSXCUITFindBy(iOSNsPredicate = "name == \"menu:id/recipe-list-thumb-1-add\"")
    @AndroidFindBy(xpath = "//*[@resource-id=\"menu:id/recipe-list-thumb-1-add\"]")
    public MobileElement quickAddButtonSecondItemRecipeListPage;

    @iOSXCUITFindBy(iOSNsPredicate = "name == \"menu:id/recipe-list-thumb-2-add\"")
    @AndroidFindBy(xpath = "//*[@resource-id=\"menu:id/recipe-list-thumb-2-add\"]")
    public MobileElement quickAddButtonThirdItemRecipeListPage;

    @iOSXCUITFindBy(iOSNsPredicate = "name == \"menu:id/recipe-list-thumb-0\"")
    @AndroidFindBy(xpath = "//*[@resource-id=\"menu:id/recipe-list-thumb-0\"]")
    public MobileElement recipesTile;

    @iOSXCUITFindBy(iOSNsPredicate = "name == \"menu:id/back-button\"")
    @AndroidFindBy(xpath = "//*[@resource-id=\"menu:id/back-button\"]")
    public MobileElement backButton;
}
