package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AddToListOnWeeklyAdElements {
    // WeeklyAd Button Element from HaloNav
    @AndroidFindBy(xpath = "//*[@text=\"VIEW WEEKLY AD - Browse the Weekly Ad & create a shopping list\"]")
    @iOSXCUITFindBy(xpath = "//*[@name=\"VIEW WEEKLY AD - Browse the Weekly Ad & create a shopping list\"]")
    public MobileElement viewWeeklyAdButton;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.Button[3]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeButton[3]")
    public MobileElement weeklyAd3rd;

    @AndroidFindBy(xpath = "//*[@label=\"Back\"]")
    @iOSXCUITFindBy(xpath = "//*[@label=\"Back\"]")
    public MobileElement backToWeekAdPDF;

    @AndroidFindBy(xpath = "//*[starts-with(@text,'Fresh Express Salad Kit or Blend, Taylor Farms Chopped Salad Kit or Signature Farms® Snacking Tomatoes')]")
    @iOSXCUITFindBy(xpath = "//*[starts-with(@text,'Fresh Express Salad Kit or Blend, Taylor Farms Chopped Salad Kit or Signature Farms® Snacking Tomatoes')]")
    public MobileElement freshExpressSaladKitTwoForSix1;

    @AndroidFindBy(xpath = "//*[@text=\"Add to List\"]")
    @iOSXCUITFindBy(xpath = "//*[@name=\"Add to List\"]")
    public MobileElement addToListButton;

    @AndroidFindBy(xpath = "//*[@text=\"Remove from List\"]")
    @iOSXCUITFindBy(xpath = "//*[@name=\"Remove from List\"]")
    public MobileElement removeFromListButton;

    @AndroidFindBy(xpath = "//*[@text=\"MY LIST\"]")
    @iOSXCUITFindBy(xpath = "//*[@name=\"MY LIST\"]")
    public MobileElement myListTab;

    @AndroidFindBy(xpath = "//*[@text=\"Clipped deals\"]")
    @iOSXCUITFindBy(xpath = "//*[@name=\"Clipped deals\"]")
    public MobileElement clippedDeals;


    @AndroidFindBy(xpath = "//*[@text=\"Added Items (1)\"]")
    @iOSXCUITFindBy(xpath = "//*[@name=\"Added Items (1)\"]//*[@label=\"Added Items (1)\"]")
    public MobileElement addedItemsList;

    @AndroidFindBy(xpath = "//*[contains(@content-desc ,\"Valid\")]")
    @iOSXCUITFindBy(xpath = "//*[contains(@label ,\"Valid\")]")
    public MobileElement validityDate;

    @AndroidFindBy(xpath = "//*[@text=\"Fruits & Vegetables (1)\"]")
    @iOSXCUITFindBy(xpath = "//*[@name=\"Fruits & Vegetables (1)\"]")
    public MobileElement fruitsAndVegetablesList;

    @AndroidFindBy(xpath = "//*[@text=\"Fresh Express Salad Kit, Taylor Farms Chopped Salad Kit or Signature Farms® Snacking Tomatoes\"]")
    @iOSXCUITFindBy(xpath = "//*[@name=\"Fresh Express Salad Kit, Taylor Farms Chopped Salad Kit or Signature Farms® Snacking Tomatoes\"]")
    public MobileElement verifyFreshExpressSaladKitTwoForSix;



}
