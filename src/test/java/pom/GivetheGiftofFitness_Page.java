package pom;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class GivetheGiftofFitness_Page extends Base_Page{
	
	@FindBy(xpath = "//strong[contains(text(),'Give the Gift of Fitness')]")
	private WebElement giveTheGiftofFitnesstext;
	
	@FindBy(xpath = "(//span[contains(.,'Share the benefits of an on-demand audio personal trainer wit')])[1]")
	private WebElement shareAudioPersonalTrainerwithFriends;
	
	@FindBy(xpath = "//select[@id='plan-dropdown']")
	private WebElement dropDown;
	
	@FindBy(xpath = "//span[contains(.,'Unlock a 1-month or a 12-month subscription to Auro Premium wi')]")
	private WebElement unlockThePlan;
	
	@FindBy(xpath = "//input[@id='recipient_name']")
	private WebElement recipientNameTextField;
	
	@FindBy(xpath = "//input[@id='recipient_email']")
	private WebElement recipientEmailTextField;
	
	@FindBy(xpath = "//textarea[@id='gift_card_message']")
	private WebElement giftCardMessageTextField;

	
	@FindBy(xpath = "//input[@id='gift_card_sender_name']")
	private WebElement giftCardSenderNameTextField;

	@FindBy(xpath = "//input[@id='gift_card_sender_email']")
	private WebElement giftCardSenderEmailTextField;
	
	@FindBy(xpath = "//input[@id='complete-purchase-button']")
	private WebElement sendGiftCardButton;

	public GivetheGiftofFitness_Page(WebDriver driver) {
		super(driver);	
	}
	
	public void getTextgiveTheGiftofFitness(String expected) {
		getText(giveTheGiftofFitnesstext, 10, expected);
	}
	
	public void getShareTheBenefits(String expected) {
		getText(shareAudioPersonalTrainerwithFriends, 10, expected);
	}
	
	public void getTextunlockThePlan(String expected) {
		getText(unlockThePlan, 10, expected);
	}
	
	public void selectVisibletext(String VisibleText) {
		selectTheValueFromDropDown(dropDown, VisibleText);
	}
	
	public void setRecipientName(String RecipientName) {
		recipientNameTextField.sendKeys(RecipientName);
	}
	
	public void setRecipientEmail(String RecipientEmail) {
		recipientEmailTextField.sendKeys(RecipientEmail);
	}
	
	public void setGiftMessage(String giftMessage) {
		giftCardMessageTextField.sendKeys(giftMessage);
	}
	
	public void setgiftCardSenderName(String giftCardSenderName) {
		giftCardSenderNameTextField.sendKeys(giftCardSenderName);
	}
	
	public void setgiftCardSenderEmail(String giftCardSenderEmail) {
		giftCardSenderEmailTextField.sendKeys(giftCardSenderEmail);
	}
	
	public void clicksendGiftCardButton() {
		sendGiftCardButton.click();
	}
	
}
