package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Auro_NHSDiscount_Page extends Base_Page {

	@FindBy(id = "42b0daec552173e83c3d098f705b2e83-BjxRYgcGpkmJYuWubMR7FS")
	private WebElement nhsEmailTextfield;
	
	@FindBy(xpath = "//button[.='SUBMIT']")
	private WebElement submitButton;
	
	
	@FindBy(xpath = "//h1[.='Thank you!']")
	private WebElement thankYouText;
	
	
	@FindBy(xpath = "//p[contains(.,'Thanks a bunch for fillin')]")
	private WebElement thankYouBunchForFillingText;
	
	public Auro_NHSDiscount_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clicknhsEmailTextfield() {
		nhsEmailTextfield.click();
	}
	
	public void enterNhsEmail(String nhsEmail) {
		nhsEmailTextfield.sendKeys(nhsEmail);
	}
	
	
	public void clicksubmitButton() {
		submitButton.click();
	}

	 public void verifythankYouText(String thankYouTextMessage)  {
			
			getText(thankYouText, 10, thankYouTextMessage);
		}
	 
	 public void verifythankYouBunchForFillingText(String thankYouBunchForFillingTextmessage)  {
			
			getText(thankYouBunchForFillingText, 10, thankYouBunchForFillingTextmessage);
		}
}
