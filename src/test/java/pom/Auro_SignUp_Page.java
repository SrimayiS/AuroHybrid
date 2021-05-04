package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Auro_SignUp_Page extends Base_Page{

	@FindBy(id = "email-signup")
	private WebElement emailTextfield;
	
	@FindBy(id = "password-signup")
	private WebElement passwordTextfield;
	
	@FindBy(id = "first-name-signup")
	private WebElement firstNameTextfield;
	
	
	@FindBy(xpath = "//button[.='SIGN UP']")
	private WebElement signUpButton;
	
	@FindBy(xpath = "//a[.='Log in']")
	private WebElement loginLink;
	
	@FindBy(id = "sign-up-error-label")
	private WebElement alreadyRegisteredEmail;
	
	@FindBy(id = "email-signup-error")
	private WebElement emaiSignUplErrorMessage;
	
	@FindBy(id = "email-signup-error")
	private WebElement enterValidEmail;
	
	@FindBy(id = "email-signup-error")
	private WebElement pleaseEnterEmailError;
	
	@FindBy(id = "password-signup-error")
	private WebElement pleaseEnterPassword;
	
	@FindBy(xpath = "//button[@data-social-type='facebook']")
	private WebElement continueWithFacebookButton;
	
	@FindBy(id = "email")
	private WebElement faceBookEmailTextField;
	
	@FindBy(id = "pass")
	private WebElement faceBookPasswordTextField; 
	
	
	@FindBy(id = "loginbutton")
	private WebElement faceBookLoginButton;
	
	
	
	public Auro_SignUp_Page(WebDriver driver) {
		super(driver);
	}
	
	public void clickEmailTextfield() {
		emailTextfield.click();
	}
	
	public void clickLogin() {
		loginLink.click();
	}
	
	
	
	public void setEmail(String emailId) {
		emailTextfield.sendKeys(emailId);
	}
	
	public void setPassword(String passWord) {
		passwordTextfield.sendKeys(passWord);
	}
	
	public void setFirstName(String firstName) {
		firstNameTextfield.sendKeys(firstName);
	}
	public void clickSignUp() {
		signUpButton.click();
	}
	
	public void clickEmailTextField() {
		emailTextfield.click();
	}
	
	public void clickPasswordTextField() {
		passwordTextfield.click();
	}
	public void verifySignUpEmailErrormessageText(String EmailErrorMessageTEXT) {
		getText(emaiSignUplErrorMessage, 10, EmailErrorMessageTEXT);
		}
	
	public void verifyenterValidEmailErrormessageText(String EmailErrorMessageTEXT) {
		getText(enterValidEmail, 10, EmailErrorMessageTEXT);
		}
	
	
	public void clickContinueWithFaceBook() {
		continueWithFacebookButton.click();
		}
	
	public void switchWindow() {
		switchTowindow();
	}
	public void verifyALreadyRegisteredError(String AlreadyRegisteredText) {
		getText(alreadyRegisteredEmail, 10, AlreadyRegisteredText);
	}
	
	public void verifypleaseEnterPasswordError(String pleaseEnterPasswordErrorMessage) {
		getText(pleaseEnterPassword, 10, pleaseEnterPasswordErrorMessage);
	}
	
	public void verifypleaseEnterEmailError(String pleaseenterEmailErrorErrorMessage) {
		getText(pleaseEnterEmailError, 10, pleaseenterEmailErrorErrorMessage);
	}
	
	public void setFacebookEmail(String FbEmail) {
		faceBookEmailTextField.sendKeys(FbEmail);
	}
	
	public void setFacebookPassword(String FbPassword) {
		faceBookPasswordTextField.sendKeys(FbPassword);
	}
	
	public void clickFaceBookLoginButton() {
		faceBookLoginButton.click();
		
	}
	
    public void verifyAlreadyRegisteredTextErrorMessage()  {
		
		verifyElement(alreadyRegisteredEmail, 10);
	}
	
	
	
	
	 
}
