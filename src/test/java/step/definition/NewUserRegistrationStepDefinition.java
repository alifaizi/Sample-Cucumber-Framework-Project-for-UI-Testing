package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class NewUserRegistrationStepDefinition extends Base {

	page.objects.NewUserRegistrationPageObj newuserregistration = new page.objects.NewUserRegistrationPageObj();

	// This is just to create new account to be used to run in each time we run the Capstone project
	@Given("I am on Test Environment Home Page")
	public void i_am_on_test_environment_home_page() {
		String expectedText = "TEST ENVIRONMENT";
		String actualText = newuserregistration.gettestEnvironmentTextFromUI();
		Assert.assertEquals(expectedText, actualText);
		logger.info("The TEST ENVIRONMENT text was verified successfully");
	}  
	@When("I click on My Account button")
	public void i_click_on_my_account_button() {
		newuserregistration.clickOnmyAccountLink();
		logger.info("My Account button was clicked successfully");
	}   
	@And("I click on register link")
	public void i_click_on_register_link() {
		newuserregistration.clickOnRegisterLInkInDropDown();
		logger.info("Register link was clicked successfully.");
	}   
	@And("I fill the registration form")
	public void i_fill_the_registration_form(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		newuserregistration.enterFirstNameFieldEntry(data.get(0).get("firstname"));
		newuserregistration.enterLastNameFieldEntry(data.get(0).get("lastname"));
		newuserregistration.enterEmailInEntryField(data.get(0).get("email"));
		newuserregistration.enterTelephoneInTelephoneEntryField(data.get(0).get("telephone"));
		newuserregistration.enterPasswordInPasswordEntryField(data.get(0).get("password"));
		newuserregistration.enterConfirmPasswordInConfirmPasswordEntryField(data.get(0).get("confirmPassword"));
		logger.info("Registration was completed successfully"); 
	}
	@And("I subscribe to newsletter")
	public void i_subscribe_to_newsletter() {
		newuserregistration.clickOnYesNewsLetterRadioOption();
		logger.info("Subsciption radio button was clicked successfully");
	}
	@And("I agree to privacy policy")
	public void i_agree_to_privacy_policy() {
		newuserregistration.clickOnPrivacyPolicyCheckBoxSelect();
		logger.info("Privacy policy radio button slected successfully");  
	}
	@And("I click on continue button")
	public void i_click_on_continue_button() {
		newuserregistration.clickOnContinueButtonOnREgistrationPage();
		logger.info("Continue button was clicked successfully");  
	}
	@And("I validate my account is created successfully")
	public void i_validate_my_account_is_created_successfully() {
		String expectedMessage = "Your Account Has Been Created!";
		String actualMessage = newuserregistration.getSuccessMessageOnAccountCreated();
		Assert.assertEquals(expectedMessage, actualMessage);
		logger.info("The account created message displayed successfully");  
	}
}
