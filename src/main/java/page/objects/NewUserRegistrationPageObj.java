package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class NewUserRegistrationPageObj extends Base{
	// This is just to create new account to be used to run in each time we run the Capstone project
	public NewUserRegistrationPageObj(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//h1//a[text()='TEST ENVIRONMENT']")
	private WebElement testEnvironmentTextFromUI;
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountLink;
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement registerLinkInDropDown;
	@FindBy(id = "input-firstname")
	private WebElement firstNameFieldEntry;
	@FindBy(id = "input-lastname")
	private WebElement lastNameFieldEntry;
	@FindBy(id = "input-email")
	private WebElement emailEntryField;
	@FindBy(id = "input-telephone")
	private WebElement telephoneEntryField;
	@FindBy(id = "input-password")
	private WebElement passwordEntryField;
	@FindBy(id = "input-confirm")
	private WebElement confirmPasswordEntryField;
	@FindBy(xpath = "(//input[@name=\"newsletter\"])[1]")
	private WebElement yesNewsLetterSelect;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement privacyPolicyCheckBoxSelect;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButtonOnRegisteringNewAccountSelect;
	@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
	private WebElement successMessageOnCreatingNewAccount;


	public String gettestEnvironmentTextFromUI() {
		String texttestEnvironmentTextFromRetailPage = testEnvironmentTextFromUI.getText();
		return texttestEnvironmentTextFromRetailPage;
		}
	public void clickOnmyAccountLink() {
		myAccountLink.click();
	}
	public void clickOnRegisterLInkInDropDown() {
		registerLinkInDropDown.click();
	}
	public void enterFirstNameFieldEntry(String firstname) {
		firstNameFieldEntry.sendKeys(firstname);
	}
	public void enterLastNameFieldEntry(String lastname) {
		lastNameFieldEntry.sendKeys(lastname);
	}
	public void enterEmailInEntryField(String email) {
		emailEntryField.sendKeys(email);
	}
	public void enterTelephoneInTelephoneEntryField(String telephone) {
		telephoneEntryField.sendKeys(telephone);
	}
	public void enterPasswordInPasswordEntryField(String password) {
		passwordEntryField.sendKeys(password);
	}
	public void enterConfirmPasswordInConfirmPasswordEntryField(String confirmpassword) {
		confirmPasswordEntryField.sendKeys(confirmpassword);
	}
	public void clickOnYesNewsLetterRadioOption() {
		yesNewsLetterSelect.click();
	}
	public void clickOnPrivacyPolicyCheckBoxSelect() {
		privacyPolicyCheckBoxSelect.click();
	}
	public void clickOnContinueButtonOnREgistrationPage() {
		continueButtonOnRegisteringNewAccountSelect.click();
	}
	public String getSuccessMessageOnAccountCreated() {
		String successMessageForCreatingNewAccount = successMessageOnCreatingNewAccount.getText();
		return successMessageForCreatingNewAccount;
	}

}