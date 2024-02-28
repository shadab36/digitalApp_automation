package com.automation.steps;

import com.automation.mobile.appium.AppiumDevice;
import com.automation.mobile.appium.AppiumDeviceManager;
import com.automation.mobile.appium.AppiumDriverManager;
import com.automation.pages.*;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Assert;

public class CheckoutPageSteps {
  public AppiumDriver driver = AppiumDriverManager.getDriver();
  public AppiumDevice device = AppiumDeviceManager.getDevice();
  CheckoutPage checkoutPage = new CheckoutPage(driver);
  public BasePage basePage = new BasePage(driver);

  @Then("^\"Estimated Subtotal\" text is displayed in checkout page$")
  public void estimatedSubTotalIsDisplayed() {
    checkoutPage.waitForEstimatedSubTotalDisplayed();
  }

  @Then("^\"Estimated Total\" text is displayed in checkout page$")
  public void estimatedTotalIsDisplayed() {
    checkoutPage.waitForEstimatedTotalDisplayed();
  }

  @Then("^\"Estimated Reward Card Savings\" text is displayed in checkout page$")
  public void estimatedRewardCardSavingsTextIsDisplayed() {
    checkoutPage.waitForEstimatedRewardsSavingsTextDisplayed();
  }

  @And("user clicks on Pickup toggle")
  public void clickPickUpToggle() {

    checkoutPage.clickPickUpOnSlotSelection();
  }

  @And("user clicks on Delivery toggle")
  public void clickDeliveryToggle() {

    checkoutPage.clickDeliverySlotSelection();
  }

  @Then("^\"Credit on Account Applied\" text is displayed in checkout page$")
  public void creditOnAccountTextIsDisplayed() {
    checkoutPage.waitForCOADisplayed();
  }

  @Then("^\"Delivery Fee\" text is displayed in checkout page$")
  public void deliveryFeeTextIsDisplayed() {
    checkoutPage.waitForDeliveryFeeDisplayed();
  }

  @Then("^\"Delivery Subscription Fee\" text is displayed in checkout page$")
  public void deliverySubscriptionFeeTextIsDisplayed() {
    checkoutPage.waitForDeliverySubscriptionFeeDisplayed();
  }

  @Then("^verify \"Add address\" window is displayed$")
  public void addAddressWindowIsDisplayed() {
    checkoutPage.waitForAddAddressDisplayed();
  }

  @Then("^verify zip code will be shown with CTA of Add address")
  public void zipCodeDisplayed() {

    checkoutPage.displayZipCode();
  }

  @Then("verify address will be shown on slot selection screen")
  public void verify_address_will_be_shown_on_slot_selection_screen() {
    // Write code here that turns the phrase above into concrete actions
    checkoutPage.addressDetails();
  }

  @And("^User click on Add Address Button")
  public void addAddressButton() {

    checkoutPage.clickAddAddressButton();
  }

  @Then("^checkout page is displayed$")
  public void checkoutPageIsDisplayed() {
    checkoutPage.waitForCheckoutPageDisplayed();
  }

  @Then("^user enters \"([^\"]*)\" details$")
  public void userentersAddressDetails(String arg0) throws Throwable {
    checkoutPage.enterAddressDetails(arg0);
    //  deliverPage.selectDeliveryOption(arg0);
  }

  @And("^user clicks on the close CTA$")
  public void userclicks_closeCTA() {
    checkoutPage.closeCTA();
  }

  @Then("^user enters contact info$")
  public void user_entersContactInfo() {
    checkoutPage.enterContactInfo();
  }

  /*@And("^user clicks on Continue CTA$")
      public void userclicks_continueCTA() throws InterruptedException {
          checkoutPage.continueToPaymentCTA();
      }
  */

  @And("^user clicks on Save CTA$")
  public void userclicks_saveCTA() {
    checkoutPage.clickSaveCTA();
  }

  @And("^user clicks on Continue to payment CTA$")
  public void userclicks_continueToPaymentCTA() throws InterruptedException {
    checkoutPage.continueToPaymentCTA();
  }

  @And("^if Service Problem is displayed$")
  public void serviceProblemIsDisplayed() {
    checkoutPage.serviceProblemDisplayed();
  }

  @And("^user clicks on close button on Payment Screen")
  public void clickOnCloseButton() {
    checkoutPage.clickCloseButtonOnPayment();
  }

  @Then("^user clicks on edit button on checkout page$")
  public void userClicksOnEditButtonCheckoutPage() {
    checkoutPage.clickEditButton();
  }

  @When("^user clicks on Not Right Now CTA$")
  public void userclicks_NotRightNowCTA() {
    checkoutPage.userclicksNotRightNowCTA();
  }

  @Then("^verify user will be taken to the Apple App Store$")
  public void navigatetoAppleStore() {
    //  checkoutPage.verifyHomePage();
    checkoutPage.navigateToAppleStore();
  }

  @Then("^verify the corresponding app is already installed on user's device will open up$")
  public void openAlreadyInstalledApp() {
    //  checkoutPage.verifyHomePage();
    //   otpPasswordPage.handleSSO(true);
    //  otpPasswordPage.verifyHomePage();
    checkoutPage.verifyAppLaunched();
  }

  @When("^user clicks on Open CTA$")
  public void userclicks_OpenCTA() {
    checkoutPage.userclicksOpenCTA();
  }

  @Then("^verify Not Right Now CTA is displayed$")
  public void notrightnowCTAIsDisplayed() {
    checkoutPage.notRightNowCTADisplayed();
  }

  @Then("^verify Download CTA is displayed$")
  public void downloadCTAIsDisplayed() {
    checkoutPage.downloadCTADisplayed();
  }

  @When("^user clicks on Download CTA$")
  public void userclicks_DownloadCTA() {
    checkoutPage.clickDownloadCTA();
  }

  @Then("^verify Open CTA is displayed$")
  public void openCTAIsDisplayed() {
    checkoutPage.openCTADisplayed();
  }

  @Then("^verify Continue CTA is displayed$")
  public void continueCTAIsDisplayed() {
    checkoutPage.continueCTADisplayed();
  }

  @Then("^verify Go Back CTA is displayed$")
  public void goBackCTAIsDisplayed() {
    checkoutPage.goBackCTADisplayed();
  }

  @And("^click on first item in the store list$")
  public void clickfirststorefromList() {
    checkoutPage.clickFirstStore();
  }

  @When("^user clicks on Continue CTA$")
  public void clickOnContinueCTA() {
    checkoutPage.clickContinueCTA();
  }

  @When("^user clicks on Go Back CTA$")
  public void clickOnGoBackCTA() {
    checkoutPage.clickGoBackCTA();
  }

  @Then("^verify Counter Pickup text is displayed on checkout page$")
  public void counterIsDisplayedOnTheScreen() {
    checkoutPage.counterPickupIsDisplayed();
  }

  @Then("^verify Kiosk Pickup text is displayed on checkout page$")
  public void kioskIsDisplayedOnTheScreen() {
    checkoutPage.kioskPickupIsDisplayed();
  }

  @Then("^verify Locker Pickup text is displayed on checkout page$")
  public void lockerIsDisplayedOnTheScreen() {
    checkoutPage.lockerPickupIsDisplayed();
  }

  @Then("^verify Pharmacy text is displayed on checkout page$")
  public void pharmacyIsDisplayedOnTheScreen() {
    checkoutPage.pharmacyIsDisplayed();
  }

  @Then("^verify DriveUp & Go text is displayed on checkout page$")
  public void driveUpGoIsDisplayedOnTheScreen() {
    checkoutPage.driveUpGoIsDisplayed();
  }

  @Then("^verify pop-up window will appear on the screen$")
  public void popupIsDisplayed() {
    checkoutPage.popUpDisplayed();
  }

  @Then("^verify user is taken to slot selection screen$")
  public void slotselectionscreenIsDisplayed() {
    checkoutPage.slotselectionScreenDisplayed();
  }

  @Then("^verify pop-up appears informing about the impact of changing the store$")
  public void changingStorePopupIsDisplayed() {
    checkoutPage.changeStorePopUpDisplayed();
  }

  @Then("^verify pop-up window will get closed$")
  public void popupwindowIsClosed() {
    checkoutPage.waitForSelectpickupstoreisDisplayed();
  }

  @Then("^select pickup store is displayed on checkout page$")
  public void selectpickupstoreIsDisplayed() {
    checkoutPage.waitForSelectpickupstoreisDisplayed();
  }

  /*  @When("^user enters \"94566\" in the store list on checkout page$")
  public void userPullUpSheetonMap() {
      checkoutPage.enterZipCode();
  }*/
  @When("^user enters \"([^\"]*)\" in the store list on checkout page$")
  public void user_enters_in_zipcode(String zipcode) throws Throwable {
    String regex = "\\d+";
    checkoutPage.enterZipCode(zipcode);
    /*if (zipcode.equalsIgnoreCase("zipcode_diff")) {
        zipCodePage.enterZipCode(device.getConfigureData(BannerConfType.BANNER_ZIPCODE_DIFF));

    } else if (zipcode.matches(regex)) {
        zipCodePage.enterZipCode(zipcode);
    } else if (zipcode.equalsIgnoreCase("instore")) {
        zipCodePage.enterZipCode(device.getConfigureData(BannerConfType.BANNER_INSTOREZIPCODE));
    } else {
        zipCodePage.enterZipCode(device.getZipCode(zipcode));
    }*/
  }

  /*  @When("^user pull up sheet on the map$")
   public void userPullUpSheetonMap() {
  //     checkoutPage.pullUpSheetOnMap();
   }*/
  @When("^user clicks OrderInfo on checkout page$")
  public void userClicksOrderInfoOnCheckoutPage() {
    checkoutPage.clickOrderInfo();
  }

  @When("^user clicks payment on checkout page$")
  public void userClicksPaymentOnCheckoutPage() {
    checkoutPage.clickPayment();
  }

  @Then("^edit order confirmation page is displayed$")
  public void editOrderConfirmationPageIsDisplayed() {
    checkoutPage.waitForEditOrderConfirmationPageDisplayed();
  }

  @And("^user clicks \"([^\"]*)\" hyperlink on order confirmation page$")
  public void userClicksOrdersTextOnPage(String arg0) {
    checkoutPage.clickOrders();
  }

  @And("^place order button is clickable and click place order$")
  public void placeOrderButtonIsClickableAndClickPlaceOrder() {
    checkoutPage.waitForPlaceOrderButtonEnabled();
  }

  @When("^user clicks Done button$")
  public void userClicksDoneOrderConfirmationButton() {
    checkoutPage.clickDoneConfirmationButton();
  }

  @When("^user clicks promo code on checkout page$")
  public void userClicksPromoCodeOnCheckoutPage() {

    checkoutPage.clickPromoCode();
  }

  @Then("^promo code deals window is dislayed$")
  public void promoCodeDealsWindowIsDislayed() {
    checkoutPage.waitForPromoCodeWindow();
  }

  @Then("^verify promocode \"([^\"]*)\" gets applied")
  public void promoCodeApplied(String arg0) throws InterruptedException {

    checkoutPage.appliedPromoCode(arg0);
  }

  @And("^user deleted a promocode")
  public void deleteAppliedPromoCode() {
    checkoutPage.deletePromoCode();
  }

  @Then("^promo code \"([^\"]*)\" is removed and total adjusted accordingly$")
  public void promoCodeDeleted(String arg0) {

    checkoutPage.verifyPromoCodeVisibility(arg0);
  }

  @When("^user enters promo code \"([^\"]*)\" and click next$")
  public void userEntersPromoCodeAndClickNext(String arg0) throws Throwable {
    checkoutPage.enterPromoCode(arg0);
  }

  @When("^user clicks coa on checkout page$")
  public void userClicksCOAOnCheckoutPage() {
    checkoutPage.clickCOA();
  }

  /* @Then("^coa window is dislayed$")
  public void coaWindowIsDislayed() {
      checkoutPage.waitForCOAWindow();
  }*/

  @And("^user enters coa amount \"([^\"]*)\" and click next$")
  public void userEntersCOAAndClickNext(String arg0) throws Throwable {
    checkoutPage.enterCOAAmount(arg0);
  }

  @Then("^credit Amount Applied is displayed on page$")
  public void coaAppliedIsDisplayedOnPage() {
    checkoutPage.waitForCOAApplied();
  }

  @And("^user select back button from coa page$")
  public void userSelectBackButtonFromCOAPage() {
    checkoutPage.clickBackButtonFromCOAPage();
  }

  @When("^user select back button to checkout page$")
  public void userSelectBackButtonToCheckoutPage() {
    checkoutPage.clickBackButtonFromPromoCode();
  }

  @When("^user select back button$")
  public void userSelectBackButton() {
    checkoutPage.clickBackButton();
  }

  @When("^user clicks Payment text on page$")
  public void userClicksPaymentTextPage() {
    checkoutPage.waitForLoadingComplete();
    checkoutPage.clickPayment();
  }

  @And("^\"([^\"]*)\" text is displayed on the screen$")
  public void textIsDisplayedOnTheScreen(String arg0) throws InterruptedException {
    // orderPage.waitForPageDisplayed();
    Thread.sleep(3000);
    Assert.assertTrue(checkoutPage.containTextDisplayed(arg0));
  }

  @And("^\"([^\"]*)\" text is not displayed on the screen$")
  public void textIsNotDisplayedOnTheScreen(String arg0) throws InterruptedException {
    // orderPage.waitForPageDisplayed();
    Thread.sleep(3000);
    Assert.assertFalse(checkoutPage.containTextDisplayed(arg0));
  }

  @When("^user enters \"([^\"]*)\" in phone number field on Contact window$")
  public void userEntersInPhoneNumberFieldOnContactWindow(String phoneNumber) {
    if (phoneNumber.equalsIgnoreCase("random")) {
      String areaCode =
          String.valueOf((int) (Math.random() * 7 + 2))
              + new SimpleDateFormat("DD").format(new Date());
      String phoneCode =
          String.valueOf((int) (Math.random() * 8 + 1))
              + new SimpleDateFormat("HHmmss").format(new Date());
      checkoutPage.enterPhoneNumber(areaCode + phoneCode);
    } else {
      checkoutPage.enterPhoneNumber(phoneNumber);
    }
  }

  @When("^user clear promo code from checkout page$")
  public void userClearPromoCodeFromCheckoutPage() {
    checkoutPage.clearPromoCode();
  }

  @And("^\"([^\"]*)\" text is displayed on the screen for California banner$")
  public void textIsDisplayedOnTheScreenForCaliforniaBanner(String arg0) throws Throwable {
    String banner = device.getBanner();
    if (banner.equalsIgnoreCase("vons")
        || banner.equalsIgnoreCase("safeway")
        || banner.equalsIgnoreCase("pavilions")) {
      checkoutPage.containTextDisplayed(arg0);
    }
  }

  @Then("^Verify error message for invalid promo code")
  public void errorMessage() {

    checkoutPage.displayErrorForInvalidPromoCode();
  }

  @When("^scroll down the screen$")
  public void scrollDownTheScreen() {
    checkoutPage.scrollDown();
  }

  @When("^scroll down the screen for Delivery order$")
  public void scrollDownTheScreenForDeliveryOrder() {
    checkoutPage.scrollDownForDeliverySlot();
  }

  @When("^user scroll down to total summary$")
  public void userScrollDownToTotalSummary() {
    checkoutPage.scrollDownToTotalSummary();
  }

  @When("^user clicks contact on checkout page$")
  public void userClicksContactOnCheckoutPage() {
    checkoutPage.clickContactDetail();
  }

  @Then("^user fills contact details$")
  public void userFillsContactDetails() throws Exception {
    checkoutPage.fillContactDetails();
  }

  @When("^user fills contact details and buffer contact number$")
  public void userFillsAndBufferContactDetails() {
    checkoutPage.fillAndBufferContactDetails();
  }

  @When("^user enter same phone number in Contact field$")
  public void userEnterSameNumberInContact() {
    checkoutPage.fillSameNumberInContact();
  }

  @When("^user click on confirm change button$")
  public void userClickOnConfirmChangeButton() {
    checkoutPage.confirmChanges();
  }

  @Then("^user see Edit Order page$")
  public void userSeeEditOrderPage() {
    checkoutPage.verifyEditOrderPage();
  }

  @And("^verify Non-SNAP items screen is opened$")
  public void verifyNonSnapItemsScreenIsDisplayed() {
    checkoutPage.verifyNonSnapItemsDisplayed();
  }

  @And("^user captures name of product adding in cart$")
  public void userCapturesNameOfProductAddingInCart() {
    checkoutPage.captureNameOfProduct();
  }

  @And("^user buffers \"([^\"]*)\" product name$")
  public void userBuffersProductName(String arg0) {
    checkoutPage.bufferNameOfProduct(arg0);
  }

  @When("^user clicks \"([^\"]*)\" item Item Preferences text on page$")
  public void userClicksItemTextOnPage(String arg0) {
    checkoutPage.waitForLoadingComplete();
    checkoutPage.clickItemTextOnScreen(arg0);
  }

  @And("^User see Snap option for payment$")
  public void userSeeSnapOptionForPayment() {
    checkoutPage.verifySnapPaymentOption();
  }

  @And("^user click on Snap option for payment$")
  public void userClickOnSnapOptionForPayment() {
    checkoutPage.clickSnapOptionForPayment();
  }

  @Then("^user should be able to see popup to remove non snap items$")
  public void userSeePopupToRemoveNonSnapItems() {
    checkoutPage.verifyPopupToRemoveNonSnapItems();
  }

  @When("^user clicks on View Cart in the popup$")
  public void userclickOnViewCart() {
    checkoutPage.userClickOnViewCart();
  }

  @And("^user see delivery Fee tool tip$")
  public void userSeeDeliveryFeeToolTip() {
    checkoutPage.verifyDeliveryFeeTooltipOption();
  }

  @And("^user see salesTax tool tip$")
  public void userSeeSalesTaxToolTip() {
    checkoutPage.verifySalesTaxTooltipOption();
  }

  @And("^user see Estimated total tool tip$")
  public void userSeeEstimatedTotalToolTip() {
    checkoutPage.verifyEstimatedTotalTooltipOption();
  }

  @Then("^user should be able to see Auth message below Estimated Total$")
  public void userSeeAuthMessage() {
    checkoutPage.verifyAuthMessageDisplayed();
  }

  @Then("^user should be able to see Looking for your savings text$")
  public void lookingForSavingsText() {
    checkoutPage.lookingForSavingsText();
  }

  @Then("^user should be able to see savings message$")
  public void userSeeSavingsMessage() {
    checkoutPage.verifySavingsMessageDisplayed();
  }

  @Then("^user should be able to see terms use message$")
  public void userSeeTermsUseMessage() {
    checkoutPage.verifyTermsUseMessageDisplayed();
  }

  @And("^scroll Down for Cart Summary$")
  public void scrollDownForCartSummary() {
    checkoutPage.scrollDownForCartSummary();
  }

  @And("user clicks on Continue to CVV")
  public void userClicksOnContinueCVV() {
    checkoutPage.continueToCVVCTA();
  }

  @Then("^User should see inline message as \"([^\"]*)\"$")
  public void verifySnapEBTInlineMessage(String message) {
    checkoutPage.verifyInlineMessage(message);
  }

  @Then("^user should be able to see Snap EBT Issue PopUp$")
  public void userSeeSnapEBTIssuePopUp() {
    checkoutPage.verifySnapEBTIssuePopup();
  }

  @When("^user clicks Cart Tab on payment page")
  public void userClickOnCartTab() {
    checkoutPage.userClickOnCartTab();
  }

  @And("^verify Non-SNAP items displayed$")
  public void verifyNonSnapItems() {
    checkoutPage.verifyNonSnapItems();
  }

  @And("^user click back button from pdp$")
  public void userClickBackButton() {
    checkoutPage.clickBack();
  }

  @Then("user sees the snap option")
  public void userSeesTheSnapOption() {
    checkoutPage.VerifyEBTDisplayed();
  }

  @When("user selects the snap option")
  public void userSelectsTheSnapOption() {
    checkoutPage.VerifyEBTDisplayed();
  }
}
