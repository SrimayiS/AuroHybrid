package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Auro_Home_Page extends Base_Page {
	
	@FindBy(xpath = "(//a[.='GET 30 DAYS FREE'])[1]")
	private WebElement get30DaysFreeButton;
	
	
	@FindBy(xpath ="(//a[.='JOIN THE RUN'])[1]")
	private WebElement joinTheRAce;
	
	@FindBy(xpath ="//a[.='Join now. ']")
	private WebElement joinNow;
	
	@FindBy(xpath ="(//a[.='GET FREE TRAINING PLAN'])[1]")
	private WebElement getFreeTrainingPlanLondonWinterRun;	
	
	@FindBy(xpath ="(//a[.='Next'])[1]")
	private WebElement nextArrow;
	
	@FindBy(xpath ="(//a[.='USE CODE RACE30 FOR 30 DAYS FREE'])[1]")
	private WebElement useCodeRACE30for30DaysFree;
	
	@FindBy(xpath ="(//a[.='REDEEM 1-YEAR VOUCHER'])[1]")
	private WebElement Redeem1YearVocher;
	
	@FindBy(xpath = "//a[contains(text(),'GET 45 DAYS FREE')]")
	private WebElement get45DaysFreeButton;
	
	
	@FindBy(xpath = "//a[contains(text(),'REDEEM YOUR PASS')]")
	private WebElement redeemYourPass;
	
			
	@FindBy(xpath ="//a[contains(text(),'REDEEM 90 DAYS VOUCHER')]")
	private WebElement redeem90DaysFreeButton;
	
	@FindBy(xpath = "//a[.='START FREE TRIAL']")
	private WebElement startFreeTrial;
	
	@FindBy(xpath = "(//a[.='START FREE TRIAL'])[2]")
	private WebElement startFreeTrialMinor;
	
	@FindBy(xpath = "//button[contains(.,'GET STARTED')]")
	private WebElement letsGetStarted;
	
	@FindBy(xpath = "//a[.='NHS discount']")
	private WebElement nhsDiscount;
	
	
			
	@FindBy(xpath = "(//a[.='JOIN THE CHALLENGE'])[1]")
	private WebElement christmasJoinTheChallenge;
	
	public Auro_Home_Page(WebDriver driver) {
		super(driver);
	}
	
	
	public void clickGet30DaysFreeButton() {
		
		get30DaysFreeButton.click();
	}
	
    public void clickGet45DaysFreeButton() {
		
    	get45DaysFreeButton.click();
	}
	
    public void clickRedeem90DaysFreeButton() {
		
    	redeem90DaysFreeButton.click();
	}
	
    public void clickRedeemYourPass() {
		
    	redeemYourPass.click();
	}
    
    public void clickstartFreeTrial() {
		
	  startFreeTrial.click();
	}

    public void clickletsGetStarted() {
		
    	letsGetStarted.click();
  	}


   public void clickjoinNow(){
		
	   joinNow.click();
  	}
   
   public void mouseHoverAction(){
		
	  moveToElement(startFreeTrialMinor);
   }
   
   public void clickJoinTheRace(){
		
		 joinTheRAce.click();
	   }
   
   
   public void clicknextArrow(){
		
		 nextArrow.click();
	   }
   
  
   
   public void clickuseCodeRACE30for30DaysFree() {
		
	   useCodeRACE30for30DaysFree.click();
	   }


public void clickGetFreeTrainingPlanLondonWinterRun() {
	// TODO Auto-generated method stub
	getFreeTrainingPlanLondonWinterRun.click();
}

public void clickRedeem1YearVoucher() {
	// TODO Auto-generated method stub
	Redeem1YearVocher.click();
}


public void clicknhsDiscount() {
	// TODO Auto-generated method stub
	nhsDiscount.click();
}

public void scrollToElementnhsDiscountLink() {
	scrollToSpecifivLocation(nhsDiscount);
}

public void scrollToElementchristmasJoinTheChallenge() {
	scrollToSpecifivLocation(christmasJoinTheChallenge);
}

public void clickchristmasJoinTheChallenge() {
	// TODO Auto-generated method stub
	christmasJoinTheChallenge.click();
}

}
