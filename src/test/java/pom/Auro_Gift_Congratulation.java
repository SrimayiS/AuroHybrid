package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Auro_Gift_Congratulation extends Base_Page {
	
	@FindBy(xpath = "//span[contains(text(),'Thank you for sending the gift of fitn')]")
	private WebElement loseweightButton;
	
	@FindBy(xpath = "//a[contains(text(),'Send another gift')]")
	private WebElement sendAnotherGiftButton;
	
	
	public Auro_Gift_Congratulation(WebDriver driver) {
		super(driver);
	}
	
	public void verifyCongratulationText(String expected) {
		getText(loseweightButton, 10, expected);
	}
	
	public void clicksendAnotherGiftButton() {
		sendAnotherGiftButton.click();
	}
	
	
}
