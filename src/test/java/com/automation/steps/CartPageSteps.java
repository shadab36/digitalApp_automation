package com.automation.steps;

import com.automation.mobile.appium.AppiumDriverManager;
import com.automation.pages.CartPage;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CartPageSteps {
    public AppiumDriver driver = AppiumDriverManager.getDriver();
    CartPage cartPage = new CartPage(driver);

    @Then("^shopping cart page is displayed$")
    public void shopping_cart_page_is_displayed() {
        cartPage.waitForCartPageDisplayed();

    }



    @And("^user clicks first item on cart page$")
    public void user_click_first_item_on_cart_page() throws Throwable {
        cartPage.clickOnFirstITem();
    }

    @And("^verify preference removed from cart page$")
    public void preference_removed_from_cart_page() {
        //cartPage.waitForCartPageDisplayed();
      //     org.junit.Assert.assertTrue(homePage.verifyPreferenceDisplayed(preference));
     //   Assert.assertTrue(cartPage.verifyInStoreButton(arg1));
     //   Assert.assertTrue(cartPage.isInstoreButtonDisplayed());

    }
    @When("^user empty shopping cart$")
    public void user_empty_shopping_cart() throws Throwable {
        cartPage.waitForLoadingComplete();
        cartPage.emptyCart();
    }

    @Then("^shopping cart empty page is displayed$")
    public void shopping_cart_empty_page_is_displayed() throws Throwable {
        cartPage.waitForEmptyCartDisplayed();
    }

    @When("^user click check mark on shopping cart page$")
    public void user_click_check_mark_on_shopping_cart_page() throws Throwable {
        cartPage.clickRemoveIcon();
    }

    @Then("^shopping cart shows (\\d+) as total number$")
    public void shopping_cart_shows_as_total_number(int arg1) throws Throwable {
        Thread.sleep(1000);
        Assert.assertTrue(cartPage.verifyTotalNumber(arg1));
    }

    @When("^user increase the (\\d+)st item quantity by (\\d+) on shopping cart page$")
    public void userIncreaseTheStItemQuantityByOnShoppingCartPage(int item, int quantity) {
        cartPage.increaseItemQuantity(item, quantity);
        cartPage.waitForLoadingComplete();
    }

    @And("^user clicks checkout button on cart page$")
    public void userClicksCheckoutButtonOnCartPage() {
        cartPage.clickCheckout();
    }

    @And("^user clicks back button on cart page$")
    public void userClicksBackButtonOnCartPage() {
        cartPage.clickBackCTACheckout();
    }

    @And("^user toggle pickup to delivery$")
    public void userTogglePickupToDelivery() throws InterruptedException {
        Thread.sleep(1000);
        cartPage.togglePickupToDelivery();
    }
    @And("^user click on the day next to today$")
    public void userClickOnDayNectToToday() throws InterruptedException {
        Thread.sleep(1000);
        cartPage.dayNextToTodayCTA();
    }

    @And("^user click on Continue Payment on slot selection page$")
    public void userClickOnContinuePaymentOnCheckoutPage() {
        cartPage.continuePaymentCTA();
    }

    @And("^verify Add Address page is displayed$")
    public void verifyAddAddressPageDisplayed() {
        Assert.assertTrue(cartPage.verifyAddAddressPageIsDisplayed());
    }

    @And("^user click back arrow in Add Address page$")
    public void clickBackButtonAddAddressPage() {
        cartPage.clickBackButtonAddAddressPage();
    }


    @And("^close the slot selection screen$")
    public void closeSlotSelectionScreen() {
        cartPage.closeSlotSelectionScreen();
    }

    @And("^user clicks on Continue to slot selection$")
    public void userClicksOnContinueToSlotSelection() {
        cartPage.continueSlotSelectionCTA();
    }

    @And("^user clicks on Continue to review order$")
    public void userClicksOnContinueToReviewOrder() throws InterruptedException {
        cartPage.continueReviewOrderCTA();
    }

    @And("^user clicks on Continue to contact info$")
    public void userClicksOnContinueToContactInfo() {
        cartPage.continueContactInfoCTA();
    }
    @And("^user confirms the selection$")
    public void userConfirmsSelection() throws InterruptedException {
        cartPage.confirmSelection();
        Thread.sleep(3000);
    }

    @And("^user clicks Enter payment on Your order screen$")
    public void clickEnterPaymentOnYourOrderScreen() throws InterruptedException {
        cartPage.clickEnterPayment();
    }

    @When("^user click remove (\\d+)st on shopping cart page$")
    public void userClickRemoveStOnShoppingCartPage(int arg0) {
        cartPage.removeItem();
    }

    @When("^user click \"([^\"]*)\" button on (\\d+)st item on shopping cart page$")
    public void userClickButtonOnStItemOnShoppingCartPage(String arg0, int arg1) throws Throwable {
        cartPage.clickChangeQuantityButtonOnItem(arg0, arg1);
    }

    @And("^user clicks increase button for (\\d+) times on cart page$")
    public void userClicksIncreaseButtonForTimesOnCartPage(int arg0) {
        cartPage.clickSingleIncreaseMultipleTimes(arg0);
    }

    @And("^verify shopping cart is not empty$")
    public void verifyShoppingCartIsNotEmpty() {
        Assert.assertTrue(cartPage.cartNotEmpty());

    }

    @And("^checkout button is disabled on shopping cart$")
    public void checkoutButtonIsDisabledOnShoppingCart() {
        Assert.assertFalse(cartPage.checkoutButtonEnabled());
    }

    @And("^checkout button is enabled on the shopping cart$")
    public void checkoutButtonIsEnabledOnTheShoppingCart() {
        Assert.assertTrue(cartPage.checkoutButtonEnabled());
    }

    @And("^estimation total information icon is displayed$")
    public void estimationTotalInformationIconIsDisplayed() {
        cartPage.waitForEstimationTotalInformationIconDisplayed();
    }
    @And("^user clicks on estimation total information icon$")
    public void clickEstimationTotalInformationIcon() {
        cartPage.clickEstimationTotalInformationIcon();
    }
    @And("^user clicks on estimated rewards card savings information icon$")
    public void clickEstimatedRewardSavingsInformationIcon() {
        cartPage.clickEstimatedRewardSavingsInformationIcon();
    }

    @Then("^\"Estimated Total\" text is displayed$")
    public void estimationTotalTextisDisplayed() {
        cartPage.waitForEstimationTotalTextisDisplayed();
    }

    @Then("^\"Est. total\" text is displayed$")
    public void estTotalTextisDisplayed() {
        cartPage.waitForEstTotalTextisDisplayed();
    }
    @Then("^\"Estimated Reward Card Savings\" text is displayed$")
    public void estimatedRewardCardSavingsTextisDisplayed() {
        cartPage.waitForEstimatedRewardCardSavingsTextisDisplayed();
    }

    @Then("^\"Estimated Club Card Savings\" text is displayed$")
    public void estimatedClubCardSavingsTextisDisplayed() {
        cartPage.waitForEstimatedClubCardSavingsTextisDisplayed();
    }
    @When("^user clicks navigate back to the cart page$")
    public void userClicksNavigateBackToCartPage() {
        cartPage.navigateBackToCartPage();
    }

    @And("^user change quantity to \"([^\"]*)\" number of items for all item in shopping cart$")
    public void userChangeQuantityToNumberOfItemsForAllItemInShoppingCart(String quantity) throws InterruptedException {
        cartPage.changeAllItemQuantity(quantity);
    }

    @When("^user increase the all item quantity by (\\d+) on shopping cart page$")
    public void userIncreaseTheAllItemQuantityByOnShoppingCartPage(int step) {
        cartPage.increaseAllItemQuantity(step);
    }

    @When("^user decrease the all item quantity by (\\d+) on shopping cart page$")
    public void userDecreaseTheAllItemQuantityByOnShoppingCartPage(int step) {
        cartPage.decreaseAllItemQuantity(step);
    }

    @And("^Estimated Savings information icon is displayed on shopping cart page$")
    public void estimatedSavingsInformationIconIsDisplayedOnShoppingCartPage() {
        cartPage.waitForEstimatedSavingsTotalInformationIconDisplayed();
    }

    @When("^user swipe left to remove all item in shopping cart$")
    public void userSwipeLeftToRemoveAllItemInShoppingCart() {
        cartPage.swipeLeftToRemoveAllItem();
    }
    @When("^user swipe left to remove all items$")
    public void userSwipeLeftToRemoveAllItems() {
        cartPage.swipeLeftToRemoveItems();
    }
    @And("^user click remove icon in shopping cart$")
    public void userclickRemoveItemInShoppingCart() {
        cartPage.clickRemoveIcon();
    }

    @When("^user clicks global substitution checkbox on shopping cart page$")
    public void userClicksGlobalSubstitutionCheckboxOnShoppingCartPage() {
        cartPage.clickGlobalSubstitutionCheckbox();
    }

    @Then("^global substitution checkbox is enabled$")
    public void globalSubstitutionCheckboxIsEnabled() {
        Assert.assertTrue(cartPage.globalSubstitutionCheckboxEnabled());
        //value or enabled or checked
    }

    @Then("^global substitution checkbox is disabled$")
    public void globalSubstitutionCheckboxIsDisabled() {
        Assert.assertFalse(cartPage.globalSubstitutionCheckboxEnabled());
    }

    @And("^All item substitution checkbox is enabled$")
    public void allItemSubstitutionCheckboxIsEnabled() throws InterruptedException {
        Assert.assertTrue(cartPage.checkedNoSubstitutionForAllItems());
    }

    @And("^All item substitution checkbox is disabled$")
    public void allItemSubstitutionCheckboxIsDisabled() throws InterruptedException {
        Assert.assertFalse(cartPage.checkedNoSubstitutionForAllItems());
    }

    @And("^No Substitution text is displayed on the screen$")
    public void noSubstitutionTextIsDisplayedOnTheScreen() {
        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            cartPage.containTextDisplayed("No substitutions");
        } else {
            //cartPage.textDisplayed("No Substitutions");
        }
    }
    @Then("^cart summary is displayed on the shopping cart page$")
    public void cartSummaryIsDisplayedOnTheShoppingCartPage() {
        cartPage.waitForCartSummaryDisplayed();
    }
    @Then("^verify substitutionPreference text is removed$")
    public void substitutionTextisRemovedfromCartPage() {

        cartPage.removedSubstituion();


    }

    @Then("^verify in-store Header on the shopping cart page$")
    public void inStoreHeaderatCartPage() {

        cartPage.verifyinStoreHeader();

    }
    @When("^user remove milk from cart page and back to home page$")
    public void cartMilkRemove() throws InterruptedException {
        cartPage.milkRemove();
    }

    @Then("^verify Done button is displayed in cart page$")
    public void verifyDoneButtonInCartPage() {
        cartPage.verifyDoneButtonInCartPage();
    }

    @When("^verify checkout is not enabled$")
    public void isnotEnabledCheckout() {
        cartPage.CheckoutIsEnable();
    }
    @When("^user incremental first milk to be thirty dollar in cart page$")
    public void cartPageFirstMilkIncremental() throws InterruptedException {
        cartPage.cartPageFirstMilkIncremental();
    }
    @Then("^verify change shopping method is displayed$")
    public void changeShoppingMethodDisplayed() {
        cartPage.changeShoppingMethodDisplayed();
    }
    @Then("^verify pay in store is displayed$")
    public void payInStore() {
        cartPage.payInStore();
    }

    @Then("^verify Pay In-Store is disabled for Empty Shopping cart$")
    public void payInStoreDisabledForEmptyCart() {
        cartPage.payInStoreDisabledForEmptyCart();
    }

    @When("^user tabs on change shopping method$")
    public void clickChangeShoping() {
        cartPage.clickChangeShoppingMethod();
    }
    @When("^user tabs on Pay in store$")
    public void clickPayInstore() {
        cartPage.clickpayInstore();
    }
    @When("^user verify checkout button is enabled$")
    public void verifyCheckoutIsEnabled() {
        cartPage.CheckoutIsEnabled();
    }

    @When("^user verify cart page is displayed$")
    public void cartPageVerification() throws InterruptedException {
        cartPage.myCartVerification();
    }

    @Then("^user decrease the all item quantity on shopping cart page$")
    public void userDecreaseTheAllItemQuantityOnShoppingCartPage() {
        cartPage.decreaseAllItemQuantityFromCart();
    }

    @When("^user click on Cart in Edit Order$")
    public void userClickOnCartInEditOrder() {
        cartPage.clickCartInEditOrder();
    }

    @When("^user click back on cart page$")
    public void userClickBackOnCartPage() {
        cartPage.clickBackInEditOrder();
    }

    @And("^note to personal shopper search box should be displayed$")
    public void noteToPersonalShopperSearchBox() {
        cartPage.noteToPersonalShopperSearchBox();
    }

    @When("^enter \"([^\"]*)\" text in search box$")
    public void enterNoteToPersonalShopper(String arg0) {
        cartPage.enterNoteToPersonalShopper(arg0);
    }

    @Then("^verify \"([^\"]*)\" note is added in the Preferences search box$")
    public void verifyNoteToPersonalShopper(String arg0) {
        cartPage.verifyNoteToPersonalShopper(arg0);
    }

    @Then("^verify \"([^\"]*)\" radio button selected$")
    public void verifyRadioButtonSelected(String arg0) {
        cartPage.verifyRadioButtonSelected(arg0);
    }

    @Then("^verify Save button is enabled$")
    public void verifySaveButtonEnabled() {
        cartPage.verifySaveButtonEnabled();
    }

    @Then("^verify Cancel button is enabled$")
    public void verifyCancelButtonEnabled() {
        cartPage.verifyCancelButtonEnabled();
    }

    @And("^user scroll down to cart summary$")
    public void userScrollDownToCartsummary() {
        cartPage.scrollDownToCartSummary();
    }

    @Then("^verify Clipped Deals Banner is not showing on My Cart")
    public void verifyClippedDealBannerVisibility() throws Throwable{

        cartPage.verifyClippedBannerText();

    }

    @Then("^user removes the item from the cart")
    public void userRemoveItemsFromCart() throws InterruptedException{
        cartPage.removeItems();
    }

    @ Then ("^user clicks on back button on your orders page")
    public void ClicksBackButtonOnYourOrderPage() {
        cartPage.clickBackButtonOnYourOrderPage();
    }

    @And("^user validates on Tax info and fee information icon")
    public void validateOnInformationIcon() throws InterruptedException {
        cartPage.validateInfornmationIcon();
    }

    @And("^Validate Items Count on your Orders Screen")
    public void ValidateItemsCountOnYourOrders()
    {
        cartPage.ValidateItemscount();
    }

    @And("^Close pickup details screen")
    public void closePickupDetailsScreen()
    {
         cartPage.closepickupdetailsscreen();
    }

   @And("^Validate taxinfo sheet is displayed")
    public void validatetaxinfosheet()
    {
        cartPage.validatetaxinfosheet();
    }

    @And("^user validates on Estimated total info icon")
        public void validatEstTotalInfo()
        {
            cartPage.validateEstTotalInfo();
        }
    @And ("^Validate estimated total sheet is displayed")
    public void esttotalSheet()
    {
        cartPage.esttotalSheet();
    }

}
