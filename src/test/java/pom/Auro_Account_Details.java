package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import generic.Base_Page;
import generic.Precondition;

public class Auro_Account_Details extends Base_Page {

	@FindBy(xpath = "//div[.='Subscription']")
	private WebElement subscriptionLink;
	
	@FindBy(xpath = "(//a['Cancel Free Trial?'])[5]")
	private WebElement cancelFreeTrial;
	
	
	@FindBy(xpath = "//input[@value='Other']")
	private WebElement cancellationReasonOther;
	
	@FindBy(xpath = "//button[@id='cancel-subscription-submit']")
	private WebElement cancelSubscriptionButton;
	 
			 
	@FindBy(xpath = "(//div[contains(.,'At Auro, we are always t')])[7])")
	private WebElement whyYouAreCancellingText;
	
	@FindBy(xpath = "//a[.='Cancel Free Trial?']")
	private WebElement cancelFreeTrialLink;
	
	
	@FindBy(xpath = "//textarea[@name='cancellation_comment']")
	private WebElement cancelComment;
	
	@FindBy(xpath = "//button[@id='cancel-subscription-submit']")
	private WebElement cancelFreeTrialButton;
	
	
	@FindBy(xpath = "//a[@id='accept-offer-button']")
	private WebElement yesPleaseButton;
	
	@FindBy(xpath = "//button[@id='claim-offer-button']")
	private WebElement claimOfferButton;
	
	@FindBy(xpath = "//div[.='Thank you. Your Auro plan has been successfully updated!']")
	private WebElement ThankyouYourAuroplanhasbeensuccessfullyupdated;
	
	
	@FindBy(xpath = "//a[contains(text(),'Cancel Subscripti')]")
	private WebElement CancelSubscriptionlink;
	
	@FindBy(xpath = "//a[@id='decline-offer-button']")
	private WebElement declineOfferButton;
	
	@FindBy(xpath = "//a[@id='decline-offer-button']")
	private WebElement NoThankYouILikeToMissThisGreatOfferLink;
	
	
	@FindBy(xpath = "//textarea[@name='cancellation_comment']")
	private WebElement pleaseSpecifyText;
	
	
	@FindBy(xpath = "//div[.='Your subscription has now been canceled.']")
	private WebElement YourSubscriptionHasNowBeenCancelled;
	
	
	
	@FindBy(xpath = "//div[.='Thank you. Your Auro plan has been successfully updated!']")
	private WebElement YourAuroPlanHasBeenSuccessfullyUpdated;
	
	public Auro_Account_Details(WebDriver driver) {
		super(driver);
	}
	
	public void clickSubscriptionLink() {
		subscriptionLink.click();
	}
	
	public void clickcancelFreeTrial() {
		cancelFreeTrial.click();
	}
	
	public void setwhyYouAreCancellingText(String specifywhyYouAreCancellingText) {
		getText(whyYouAreCancellingText, 10, specifywhyYouAreCancellingText);
	}
	
	
	
	public void clickcancellationReasonOther() {
		cancellationReasonOther.click();
	}
	
	public void setCancelComment(String CancelComment) {
		cancelComment.sendKeys(CancelComment);
	}
	
	public void clickcancelFreeTrialButton() {
		cancelFreeTrialButton.click();
	}
	
	public void yesPleaseButton() {
		yesPleaseButton.click();
	}
	
	public void clickclaimOfferButton() {
		claimOfferButton.click();
	}
	
	public void clickNoThankYouILikeToMissThisGreatOfferLink() {
		NoThankYouILikeToMissThisGreatOfferLink.click();
	}
	
	public void clickdeclineOfferButton() {
		declineOfferButton.click();
	}
	
	
	public void clickCancelSubscriptionLink() {
		CancelSubscriptionlink.click();
	}
	
	
	public void enterpleaseSpecifyText(String SpecifyCancelComment) {
		pleaseSpecifyText.sendKeys(SpecifyCancelComment);
	}
	
	public void clickcancelSubscriptionButton() {
		cancelSubscriptionButton.click();
	}
	
	public void clickcancelFreeTrialLink() {
		cancelFreeTrialLink.click();
	}
	
	
	
	
	public void YourSubscriptionHasNowBeenCancelledText(String YourSubscriptionHasNowBeenCancelledText) {
		getText(YourSubscriptionHasNowBeenCancelled, 10, YourSubscriptionHasNowBeenCancelledText);
	}
	

	
	public void YourAuroPlanHasBeenSuccessfullyUpdatedText(String YourAuroPlanHasBeenSuccessfullyUpdatedText) {
		getText(YourAuroPlanHasBeenSuccessfullyUpdated, 10, YourAuroPlanHasBeenSuccessfullyUpdatedText);
	}
	
	
}
