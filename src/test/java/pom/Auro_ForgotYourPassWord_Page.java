package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Auro_ForgotYourPassWord_Page extends Base_Page {

	WebDriver driver;
	
	@FindBy(xpath = "//a[.='Forgot your password?']")
	private WebElement forgotYourPasswordLink;
	
	@FindBy(id = "login_email")
	private WebElement emailTextField;
	
	@FindBy(name = "login_forgot_submit")
	private WebElement sendPasswordButton;
	
	@FindBy(xpath = "//a[.=' I agree']")
	private WebElement iAgreeButton;
	//span[.='An email with instructions for creating a new password has been sent to you.']
	
	@FindBy(xpath = "//span[.='An email with instructions for creating a new password has been sent to you.']")
	private WebElement insructionsForPassword;
	
	public Auro_ForgotYourPassWord_Page(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void clickforgotYourPasswordLink() {
		forgotYourPasswordLink.click();
		}
	
	public void enteremailTextField(String Email) {
		emailTextField.sendKeys(Email);
		}
	
	public void clickSendPasswordButton() {
		sendPasswordButton.click();
		}
	
	public void clickiAgreeButton() {
		iAgreeButton.click();
		}
     public void insructionsForPasswordText()  {
		
		verifyElement(insructionsForPassword, 10);
	}
}
