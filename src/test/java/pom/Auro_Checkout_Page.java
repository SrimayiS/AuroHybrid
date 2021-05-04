package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Auro_Checkout_Page extends Base_Page {
	WebDriver driver;
	
	@FindBy(xpath = "//a[.='Have a promo code?']")
	private WebElement haveApromoCode;
	
	@FindBy(id = "checkout-coupon")
	private WebElement enterCouponCodeTestfield;
	
	@FindBy(id = "coupon-apply-btn")
	private WebElement applyButton;
	
	@FindBy(name = "cardnumber")
	private WebElement enterCardNumberTextField;
	
	@FindBy(name = "exp-date")
	private WebElement expDate;
	
	@FindBy(id = "complete-purchase-button")
	private WebElement startFreeTrialButton;
	
	@FindBy(name = "cvc")
	private WebElement cVc;
	
	@FindBy(id = "card-errors")
	private WebElement cardsExpiryDateInPast;
	
	@FindBy(id = "card-errors")
	private WebElement cardsExpiryDateISInComplete;
	
	@FindBy(id = "card-errors")
	private WebElement securityCodeIncompleteError;
	
	@FindBy(id = "card-errors")
	private WebElement inCompleteCardNumberError;
	
	@FindBy(id = "card-errors")
	private WebElement postalCodeIsInComplete;
	
	@FindBy(name = "postal")
	private WebElement zipCode;
	
	@FindBy(xpath = "//p[@id='coupon-message']")
	private WebElement couponMesage;
	
	@FindBy(xpath="//p[@id='coupon-message']")
	private WebElement InvalidCouponCard;
	//span[.='27.37']
	@FindBy(xpath = "//div[.='Your card has expired.']")
	private WebElement expiredCard;
	
	@FindBy(id = "card-errors")
	private WebElement incorrectSecurityCode;
	
	@FindBy(id = "card-errors")
	private WebElement incorrectSecurityCodenewmember;
	
	@FindBy(id ="card-errors")
	private WebElement incorrectSecurityCodeGiftCard;
	
	@FindBy(id = "card-errors")
	private WebElement ProcessingCardError;
	
	@FindBy(id = "card-errors")
	private WebElement InvalidCardNo;
	
	@FindBy(id ="card-errors")
	private WebElement IncompleteCardExpireDate;
	
	@FindBy(id = "card-errors")
	private WebElement newmemberIncompleteCardExpireDate;
	
	@FindBy(id = "card-errors")
	private WebElement GiftCardIncompleteCardExpireDate;
	
	@FindBy(id = "card-errors")
	private WebElement IncomleteSecurityCode;
	
	@FindBy(id = "card-errors")
	private WebElement newmemberIncomleteSecurityCode;
	
	@FindBy(id = "card-errors")
	private WebElement giftCardIncomleteSecurityCode;
	
	@FindBy(xpath = "//div[.='Your card number is incomplete.']")
	private WebElement IncomleteCardNumber; 
	
	@FindBy(xpath = "(//div[contains(.,'Your postal code is incomplete.')])[14]")
	private WebElement IncomletePostalCode;
	
	@FindBy(xpath = "(//div[contains(.,'Your postal code is incomplete.')])[10]")
	private WebElement giftCardIncomletePostalCode;
	
	@FindBy(xpath = "(//div[contains(.,'Your postal code is incomplete.')])[9]")
	private WebElement newMemberIncomletePostalCode;
	
	@FindBy(xpath = "//div[contains(.,'expiration year is in the past.')]")
	private WebElement CardExpireDateInThePast;
	
	@FindBy(xpath = "(//div[contains(.,'expiration year is in the past.')])[9]")
	private WebElement newmemberCardExpireDateInThePast;
	
	@FindBy(xpath = "(//div[contains(.,'expiration year is invalid.')])[9]")
	private WebElement newmemberCardExpireYearIsInvalid;
	
	@FindBy(xpath = "(//div[contains(.,'enter a valid email address.')])[9]")
	private WebElement newmemberEnterValidEmailAddress;
	
	@FindBy(xpath = "(//div[contains(.,'This field is required.')])[9]")
	private WebElement newmemberEnterNOEmailAddress;
	
	@FindBy(xpath = "(//div[contains(.,'This field is required.')])[9]")
	private WebElement newmemberEnterNOpassword;
	
	@FindBy(xpath="//span[.='27.37']")
	private WebElement afterCouponHOLDAPP;
	
	
	@FindBy(xpath="//p[.='₹27.36/month']")
	private WebElement availedDiscountSweatCoin;
	
	
	@FindBy(xpath="//span[.='24.33']")
	private WebElement availedDiscountByRMR20;
	
	
	@FindBy(xpath="//p[.='Three-month plan']")
	private WebElement threeMonthPlanText;
	
	@FindBy(xpath="(//span[.='£5.00'])[1]")
	private WebElement pound5Text;
	

	
	@FindBy(xpath="(//span[.='59.99'])[1]")
	private WebElement pound59_99Text;
	
	@FindBy(xpath="(//span[contains(.,' billed annually after three months')])[1]")
	private WebElement BilledAnuallyAfter3MonthsText;
	
	@FindBy(xpath="(//div[contains(.,'h plan has ended, you will automatically be enrolled onto an annual pla')])[11]")
	private WebElement AfteryourThreeMonthConfirmationMessage;
	
	@FindBy(xpath="(//span[.='30'])[2]")
	private WebElement days30Free;
	
	@FindBy(xpath="(//span[.='45'])[2]")
	private WebElement days45Free;
	
	public Auro_Checkout_Page(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}


	
	public void clickhaveApromoCode() {
		haveApromoCode.click();
	}
	public void clickCouponCode() {
		enterCouponCodeTestfield.click();
	}
	
	public void enterCouponCode(String Couponcode) {
		enterCouponCodeTestfield.sendKeys(Couponcode);
	}
	
	public void clickApplyButton() {
		applyButton.click();
	}
	
	public void clickEnterCardNumber() throws InterruptedException {
		
		enterCardNumberTextField.click();
	}
	
	public void clearEnterCardNumber() {
		enterCardNumberTextField.clear();
	}
	
	
	public void enterCardNumber(String Cardnum) throws InterruptedException {
		
		enterCardNumberTextField.sendKeys(Cardnum);
		
	}
	
	public void enterExpDate(String expDAte) {
		expDate.sendKeys(expDAte);
	}
	
	public void entercVc(String cVcCode) {
		cVc.sendKeys(cVcCode);
	}
	
	public void enterZipCode(String Zip) {
		zipCode.sendKeys(Zip);
	}
	
	public void clickStartFreeTrialButton() throws InterruptedException {
		
		startFreeTrialButton.click();
	}
	
   public void verifyCouponCodeMessage(String CouponCodeMessage)  {
		
		getText(couponMesage, 10, CouponCodeMessage);
	}
   
   
   
   public void verifyCouponCodeHOLDAPPapplied(String CouponCodeMessage)  {
		
		getText(afterCouponHOLDAPP, 10, CouponCodeMessage);
	}
   
   public void verifyInvalidCouponCodeMessage()  {
		
	   verifyElement(InvalidCouponCard, 10);
	}
   
   
   public void verifyinCompleteCardNumberErrorMessage()  {
		
	   verifyElement(inCompleteCardNumberError, 10);
	}
   
   
   
   public void verifyCouponCodeApplied()  {
		
		verifyElement(couponMesage, 10);
	}
   
   
   public void verifyCouponCodeErrorMessage()  {
		
		verifyElement(InvalidCouponCard, 10);
	}
   
   public void verifyinCompleteCardNumberErrorErrorMessage()  {
		
		verifyElement(inCompleteCardNumberError, 10);
	}

   
   public void verifycardsExpiryDateISInCompleteMessage()  {
		
	   verifyElement(cardsExpiryDateISInComplete, 10);
	}
   
   public void verifyExpiredCardMessage(String ExpiredCardMessage)  {
		
		getText(expiredCard, 10, ExpiredCardMessage);
	}
   
   public void verifyIncorrectSecurityCodeMessage(String IncorrectSecurityMessage)  {
		
		getText(incorrectSecurityCode, 10, IncorrectSecurityMessage);
	}
   
   public void verifyIncorrectSecurityCodeMessagevisible()  {
		
	   verifyElement(incorrectSecurityCode, 10 );
	}
  
   public void cardsExpiryDateInPastErrorMessage()  {
		
		verifyElement(cardsExpiryDateInPast, 10);
	}
   
   public void verifypostalCodeIsInCompleteErrorMessage()  {
		
		verifyElement(postalCodeIsInComplete, 10);
	}
   
   public void verifysecurityCodeIncompleteErrorMessage()  {
		
		verifyElement(securityCodeIncompleteError, 10);
	}
   
   
   
   public void newmemberverifyIncorrectSecurityCodeMessage(String IncorrectSecurityMessage)  {
		
		getText(incorrectSecurityCodenewmember, 10, IncorrectSecurityMessage);
	}
   
   public void giftcardverifyIncorrectSecurityCodeMessage(String IncorrectSecurityMessage)  {
		
		getText(incorrectSecurityCodeGiftCard, 10, IncorrectSecurityMessage);
	}
   
   
   public void verifyProcessingErrorMessage(String ProcessingErrorMessage)  {
		
		getText(ProcessingCardError, 10, ProcessingErrorMessage);
	}
   
   public void verifyProcessingErrorMessageVisible()  {
	   verifyElement(ProcessingCardError, 10);
		
	}
   
   public void verifyInvalidCardNumber(String InvalidCardNumberErrorMessage)  {
		
		getText(InvalidCardNo, 10, InvalidCardNumberErrorMessage);
	}
   
   public void verifyInvalidCouponCardError(String InvalidCouponCardError)  {
		
		getText(InvalidCouponCard, 10, InvalidCouponCardError);
	}
   
   public void verifyIncompleteCardExpiryDate()  {
		
	   verifyElement(IncompleteCardExpireDate, 10);
	}
   
   public void newmemberverifyIncompleteCardExpiryDate(String IncompleteCouponCardExpireDate)  {
		
		getText(newmemberIncompleteCardExpireDate, 10, IncompleteCouponCardExpireDate);
	}
   
   public void giftCardverifyIncompleteCardExpiryDate(String IncompleteCouponCardExpireDate)  {
		
 		getText(GiftCardIncompleteCardExpireDate, 10, IncompleteCouponCardExpireDate);
 	}
 
   public void verifyIncomleteSecurityCodeError(String verifyIncomleteSecurityCode)  {
		
		getText(IncomleteSecurityCode, 10, verifyIncomleteSecurityCode);
	}
   
   public void newmemberverifyIncomleteSecurityCodeError(String verifyIncomleteSecurityCode)  {
		
		getText(newmemberIncomleteSecurityCode, 10, verifyIncomleteSecurityCode);
	}
   
   public void giftCardverifyIncomleteSecurityCodeError(String verifyIncomleteSecurityCode)  {
		
 		getText(giftCardIncomleteSecurityCode, 10, verifyIncomleteSecurityCode);
 	}
   
   
   public void verifyIncomletePostalCodeError(String enterIncomletePostalCode)  {
		
		getText(IncomletePostalCode, 10, enterIncomletePostalCode);
	}
   
   public void giftCardverifyIncomletePostalCodeError(String enterIncomletePostalCode)  {
		
		getText(giftCardIncomletePostalCode, 10, enterIncomletePostalCode);
	}
   
   public void verifyNewMemberIncomletePostalCodeError(String enterIncomletePostalCode)  {
		
		getText(newMemberIncomletePostalCode, 10, enterIncomletePostalCode);
	}
	
   public void verifyIncomleteCardNumberError(String enterIncomleteCardNumber)  {
		
		getText(IncomleteCardNumber, 10, enterIncomleteCardNumber);
	}
   
   public void verifyExpirationDateIsInThePastErrorMessage(String ExpirationDateInThePast)  {
		
		getText(CardExpireDateInThePast, 10, ExpirationDateInThePast);
	}
   
   public void verifynewmemberExpirationDateIsInThePastErrorMessage(String ExpirationDateInThePast)  {
		
		getText(newmemberCardExpireDateInThePast, 10, ExpirationDateInThePast);
	}
   
   public void verifynewmemberExpirationDateIsInvalidErrorMessage(String ExpirationDateInThePast)  {
		
		getText(newmemberCardExpireYearIsInvalid, 10, ExpirationDateInThePast);
	}
   
   public void verifynewmemberEnterValidEmailAddressErrorMessage(String enTervalidEmailaddress)  {
		
		getText(newmemberEnterValidEmailAddress, 10, enTervalidEmailaddress);
	}
   
   public void newmemberEnterNOEmailAddress_verify_ErrorMessage(String ThisFieldIsrequired)  {
		
		getText(newmemberEnterNOEmailAddress, 10, ThisFieldIsrequired);
	}
   
   public void newmemberEnterNOpassword_verify_ErrorMessage(String ThisFieldIsrequired)  {
		
		getText(newmemberEnterNOpassword, 10, ThisFieldIsrequired);
	}
   
   public void newmemberEnterNOpassword_verify_ErrorMessageText(String ThisFieldIsrequired)  {
		
		getText(couponMesage, 10, ThisFieldIsrequired);
	}
   
   
   
	public void verifyUrl(String Eurl,int time) {
		verifyUrl(Eurl,time);
	}
	public void scrollToElement() {
		scrollToSpecifivLocation(enterCouponCodeTestfield);
	}
	
	
	public void scrollToElementstartFreeTrialButton() {
		scrollToSpecifivLocation(startFreeTrialButton);
	}
	
	 public void verifyCouponCodeVisible()  {
			
			if (couponMesage.isDisplayed()) {
				System.out.println("Coupon Code applied");
			}else {
				System.out.println("Coupon Code applied NOT applied");	
			}
		}
	 
	 
	 public void clearCouponCodeTextField() {
		 enterCouponCodeTestfield.clear();
		}
	 
	public void verifyAvailedDiscountSweatCoinPriceText(String sweatCoinPriceText) {
		// TODO Auto-generated method stub
		getText(availedDiscountSweatCoin, 10, sweatCoinPriceText);
		
	}
	
	public void verifyAvailedDiscountRMR20PriceText(String RMR20PriceText) {
		// TODO Auto-generated method stub
		getText(availedDiscountByRMR20, 10, RMR20PriceText);
		
	}
	 
	public void verifyThreeMonthPlanText(String ThreeMonthPlanText) {
		// TODO Auto-generated method stub
		getText(threeMonthPlanText, 10, ThreeMonthPlanText);
		
	}
		
		public void pound5PriceText(String pound5PriceText) {
			// TODO Auto-generated method stub
			getText(pound5Text, 10, pound5PriceText);
			
		}
		
		public void verify59_99PoundText(String PoundText59_99) {
			// TODO Auto-generated method stub
			getText(pound59_99Text, 10, PoundText59_99);
			
		}
		
		public void verifyBilledAnuallyAfter3MonthText(String AfterYourThreeMonthPlanHasEndedTextConfirmation) {
			// TODO Auto-generated method stub
			getText(BilledAnuallyAfter3MonthsText, 10, AfterYourThreeMonthPlanHasEndedTextConfirmation);
			
		}
		
		
		public void verify30DaysFreeText(String verify30DaysFreeText) {
			// TODO Auto-generated method stub
			getText(days30Free, 10, verify30DaysFreeText);
			
		}
		
		
		public void verify45DaysFreeText(String verify45DaysFreeText) {
			// TODO Auto-generated method stub
			getText(days45Free, 10, verify45DaysFreeText);
			
		}
		
		public void verifyAfteryourThreeMonthConfirmationMessageText(String AfteryourThreeMonthConfirmationMessageText) {
			// TODO Auto-generated method stub
			getText(AfteryourThreeMonthConfirmationMessage, 10, AfteryourThreeMonthConfirmationMessageText);
			
		}
		
		
}
