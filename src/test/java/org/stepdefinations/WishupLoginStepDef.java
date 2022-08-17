package org.stepdefinations;

import org.POM_Pages.WishupPageLogin;
import org.applicationHooks.AppHooks;
import org.testng.Assert;
import org.utilities.configReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class WishupLoginStepDef {
	public configReader cr;
	WishupPageLogin pl;
	@Given("User is on login page")
	public void user_is_on_login_page() {
		pl = new WishupPageLogin(AppHooks.driver);
	}
	@Then("Login page title is displayed as {string}")
	public void login_page_title_is_displayed_as(String expTitle) {
		pl.pageTitle(expTitle);
	}
	@Then("Login page URL is displayed as {string}")
	public void login_page_url_is_displayed_as(String expUrl) {
		pl.pageURL(expUrl);
	}
	@Then("Wishup logo is displayed")
	public void wishup_logo_is_displayed() {
		Assert.assertTrue(pl.isWishupLogoDisplayed());
	}
	@Then("Login option on corner is displayed")
	public void login_option_on_corner_is_displayed() {
		Assert.assertTrue(pl.isWishupLogoDisplayed());
	}
	@Then("Signup option on corner is displayed")
	public void signup_option_on_corner_is_displayed() {
		Assert.assertTrue(pl.isSignupOptOnCornerDisplayed());
	}
	@Then("Login screen is displayed")
	public void login_screen_is_displayed() {
		Assert.assertTrue(pl.isLoginOptOnCornerDisplayed());
	}
	@Then("Sign in with Google option is displayed")
	public void sign_in_with_google_option_is_displayed() {
		Assert.assertTrue(pl.isSignInWithGoogleOptDisplayed());
	}
	@Then("Email address field is displayed")
	public void email_address_field_is_displayed() {
		Assert.assertTrue(pl.isSignInWithGoogleOptDisplayed());
	}
	@Then("Password field is displayed")
	public void password_field_is_displayed() {
		Assert.assertTrue(pl.isPasswordFieldDisplayed());
	}
	@Then("Login button is displayed")
	public void login_button_is_displayed() {
		Assert.assertTrue(pl.isloginBtnDisplayed());
	}
	@Then("Forget your password? is displayed")
	public void forget_your_password_is_displayed() {
		Assert.assertTrue(pl.isforgetPwdOptDisplayed());
	}
	@Then("Click here to signup option is displayed")
	public void click_here_to_signup_option_is_displayed() {
		Assert.assertTrue(pl.isclickHereToSignupOptDisplayed());
	}
	@When("User enters {string} in Email address field")
	public void user_enters_in_email_address_field(String userID) {
		pl.enterEmailAddress(userID);
	}
	@When("User enters {string} in password field")
	public void user_enters_in_password_field(String password) {
		pl.enterPassword(password);
	}
	@When("Clicks on login button")
	public void clicks_on_login_button() {
		pl.enterLoginBtn();
	}
	@Then("Home page title is displayed as {string}")
	public void home_page_title_is_displayed_as(String expTitle) throws Exception {
		Thread.sleep(5000);
		String actTitle=AppHooks.driver.getTitle();
		Assert.assertTrue(expTitle.contains(actTitle));
	}
	@Then("Home page URL is displayed as {string}")
	public void home_page_url_is_displayed_as(String expUrl) throws Exception {
		Thread.sleep(5000);
		String actUrl=AppHooks.driver.getCurrentUrl();
		Assert.assertTrue(actUrl.contains(expUrl));
	}

}
