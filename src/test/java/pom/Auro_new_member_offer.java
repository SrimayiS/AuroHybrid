package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Auro_new_member_offer extends Base_Page {
	
	
	@FindBy(id = "email")
	private WebElement emailTextField;
	
	@FindBy(xpath = "//label[.='This field is required.']")
	private WebElement emailThisfieldisrequired;
	
	@FindBy(xpath = "//label[.='Please enter a valid email address.']")
	private WebElement enterValidmailId;
	
	@FindBy(xpath = "//label[contains(text(),'registered user. Please provide a ')]")
	private WebElement notRegistered;
	
	@FindBy(xpath = "//label[contains(text(),'offer as you already have premium access ')]")
	private WebElement alreadyRegistered;
	
	@FindBy(id = "email-custom-error")
	private WebElement alreadyRegisteredwithLink;
	
	//label[contains(text(),'registered user. Please provide a ')]
	@FindBy(id = "password")
	private WebElement passwordTextField;
	
	@FindBy(id = "complete-purchase-button")
	private WebElement getAuroPremium;
	
	@FindBy(xpath = "//input[@name='cardnumber']")
	private WebElement enterCardNumberTextField;
	
	@FindBy(name = "exp-date")
	private WebElement expDate;
	
	@FindBy(id = "card-errors")
	private WebElement incorrectSecurityCodenewmember;
	
	@FindBy(id = "card-errors")
	private WebElement newmemberIncompleteCardExpireDate;
	
	@FindBy(id =  "card-errors")
	private WebElement newmemberIncomleteSecurityCode;
	
	@FindBy(id = "card-errors")
	private WebElement newMemberIncomletePostalCode;
	
	@FindBy(id = "card-errors")
	private WebElement newmemberCardExpireDateInThePast;
	
	@FindBy(id = "card-errors")
	private WebElement newmemberCardExpireYearIsInvalid;
	
	@FindBy(id = "email-success")
	private WebElement noPasswordError50peroff;
	
	
	@FindBy(xpath = "(//div[contains(.,'enter a valid email address.')])[9]")
	private WebElement newmemberEnterValidEmailAddress;
	
	@FindBy(id = "email-error")
	private WebElement newmemberEnterNOEmailAddress;
	
	@FindBy(id = "password-error")
	private WebElement newmemberEnterNOpassword;
	
	@FindBy(xpath = "//h4[contains(text(),'Get 25% off premium fit')]")
	private WebElement newmember25perOffText;
	
	@FindBy(xpath = "//h4[contains(text(),'Get 50% off premium fit')]")
	private WebElement newmember50perOffText;
	
	@FindBy(xpath = "//strong[contains(text(),'Get 40% off premium fit')]")
	private WebElement newmember40perOffText;
	 
	
	
	public Auro_new_member_offer(WebDriver driver) {
		super(driver);
	}
	
	public void setMailid(String mailid) {
		emailTextField.sendKeys(mailid);
	}
	
	public void setPassword(String password) {
		passwordTextField.sendKeys(password);
	}
	
	public void verifyMailFieldRequired(int time,String expected ){
		getText(emailThisfieldisrequired, time, expected);
	}
	
	public void verifyentervalidmailerrormessage(int time,String expected){
		getText(enterValidmailId, time, expected);
	}
	
	public void verifynotRegisterederrormessage(int time,String expected){
		getText(notRegistered, time, expected);
	}
	
	public void verifyalreadyRegisterederrormessage(int time,String expected){
		getText(alreadyRegistered, time, expected);
	}
	
	public void verifyalreadyRegisterederrormessagewithLink(int time,String expected){
		getText(alreadyRegisteredwithLink, time, expected);
	}
	
	public void moveToGetAuroPremium() {
		scrollToSpecifivLocation(emailTextField);
	}
	
	public void clickGetAuroPremium() {
		getAuroPremium.click();
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
    
    public void newmemberverifyIncorrectSecurityCodeMessage(String IncorrectSecurityMessage)  {
		
		getText(incorrectSecurityCodenewmember, 10, IncorrectSecurityMessage);
	}
    
    public void newmemberverifyIncompleteCardExpiryDate(String IncompleteCouponCardExpireDate)  {
		
		getText(newmemberIncompleteCardExpireDate, 10, IncompleteCouponCardExpireDate);
	}
    
    public void newmemberverifyIncomleteSecurityCodeError(String verifyIncomleteSecurityCode)  {
		
		getText(newmemberIncomleteSecurityCode, 10, verifyIncomleteSecurityCode);
	}
    
    public void verifyNewMemberIncomletePostalCodeError(String enterIncomletePostalCode)  {
		
		getText(newMemberIncomletePostalCode, 10, enterIncomletePostalCode);
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
    
    public void verify25PerOffText(String Get25OffOffPremiumfitnessWellness)  {
 		
 		getText(newmember25perOffText, 10, Get25OffOffPremiumfitnessWellness);
 	}
    
    public void verify40PerOffText(String Get40OffOffPremiumfitnessWellness)  {
 		
 		getText(newmember40perOffText, 10, Get40OffOffPremiumfitnessWellness);
 	}

    
    public void verify50PerOffText(String Get50OffOffPremiumfitnessWellness)  {
		
		getText(newmember50perOffText, 10, Get50OffOffPremiumfitnessWellness);
	}
    
    public void verify50PerOffNoPasswordText(String Get50OffNoPasswordText)  {
		
		getText(noPasswordError50peroff, 10, Get50OffNoPasswordText);
	}
    
}
