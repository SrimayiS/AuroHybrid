package testscript;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import generic.Precondition;
import pom.Auro_Account_Details;
import pom.Auro_Categories_Page;
import pom.Auro_Goals_Page;
import pom.Auro_Home_Page;
import pom.Auro_Level_Page;
import pom.Auro_SignUp_Page;
import pom.Login_Page;

public class Cancellation_Flow extends Precondition{

	//Cancel Subscription
	 @Test(invocationCount = 01)
    public void stage_web_Cancel_Subscrition() throws InterruptedException {
		test=extent.createTest("Main Page Cancel Subscription");
		test.log(Status.INFO, "Main Page Cancel Subscription test script started executing");
		    
		Auro_Home_Page AH=new Auro_Home_Page(driver);
		//AH.clickGet30DaysFreeButton();
		AH.clickstartFreeTrial();
		test.pass("clicked on startFreeTrial Button");
		Thread.sleep(1000);
		AH.clickletsGetStarted();
		test.pass("clicked on letsGetStarted Button");
		
		
		Thread.sleep(1000);
	    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
		AG.selectLoseweight();
		test.pass("Selected goal as Lose Weight");
		AG.clickNextButton();
		test.pass("Clicked Next Button");
		
		Auro_Level_Page AL=new Auro_Level_Page(driver);
		Thread.sleep(1000);
		AL.selectBeginner();
		test.pass("Selected Level as Lose Beginner");
		AL.clickNextButton();
		test.pass("Clicked Next Button");
		
		Auro_Categories_Page AC=new Auro_Categories_Page(driver);
		Thread.sleep(1000);
		AC.selectSpin();
		test.pass("Selected Category as Spin");
		AC.clickNextButton();
		test.pass("Clicked Next Button");
		
		Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
		Thread.sleep(2000);
		
		AS.clickLogin();
		test.pass("Clicked on Login");
		Login_Page LN=new Login_Page(driver);
		LN.clickEmail();
		LN.setEmail("abc@auro.test");
		test.pass("entered email ");
		LN.clickPassword();
		LN.setPassword("asdf");
		test.pass("entered password ");
		Thread.sleep(2000);
		LN.clickLogin();
		test.pass("Clicked Login ");
		Thread.sleep(2000);
		
		Auro_Account_Details AAD=new Auro_Account_Details(driver);
		AAD.clickSubscriptionLink();
		test.pass("Clicked on Subscription Link ");
		Thread.sleep(2000);
		AAD.clickcancelFreeTrialLink();
		test.pass("Clicked on Cancel Subscription Link ");
		Thread.sleep(4000);
		AAD.clickNoThankYouILikeToMissThisGreatOfferLink();
		test.pass("Clicked on 'No Thank You I Like To Miss This Great Offer' Link ");
		Thread.sleep(2000);
		AAD.clickcancellationReasonOther();
		test.pass("Select Cancelation Reason OTHER ");
		Thread.sleep(2000);
		AAD.enterpleaseSpecifyText("Comment");
		test.pass("Specified the text");
		Thread.sleep(2000);
		AAD.clickcancelSubscriptionButton();
		test.pass("Clicked on Cancel Subscription Button");
		//AAD.YourSubscriptionHasNowBeenCancelledText("Your subscription has now been canceled.");
		
		
		
}
	 //claim offer
	//Login with valid credentials
	@Test(invocationCount = 0)
    public void stage_web_auro_Upgrade_Plan() throws InterruptedException {
		test=extent.createTest("Main Page claim offer");
		test.log(Status.INFO, "Main Page claim offer test script started executing");
		    
		Auro_Home_Page AH=new Auro_Home_Page(driver);
		//AH.clickGet30DaysFreeButton();
		AH.clickstartFreeTrial();
		test.pass("clicked on startFreeTrial Button");
		Thread.sleep(1000);
		AH.clickletsGetStarted();
		test.pass("clicked on letsGetStarted Button");
		
		
		Thread.sleep(1000);
	    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
		AG.selectLoseweight();
		test.pass("Selected goal as Lose Weight");
		AG.clickNextButton();
		test.pass("Clicked Next Button");
		
		Auro_Level_Page AL=new Auro_Level_Page(driver);
		Thread.sleep(1000);
		AL.selectBeginner();
		test.pass("Selected Level as Lose Beginner");
		AL.clickNextButton();
		test.pass("Clicked Next Button");
		
		Auro_Categories_Page AC=new Auro_Categories_Page(driver);
		Thread.sleep(1000);
		AC.selectSpin();
		test.pass("Selected Category as Spin");
		AC.clickNextButton();
		test.pass("Clicked Next Button");
		
		Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
		Thread.sleep(2000);
		
		AS.clickLogin();
		test.pass("Clicked on Login");
		Login_Page LN=new Login_Page(driver);
		LN.clickEmail();
		LN.setEmail("abc@auro.test");
		test.pass("entered email ");
		LN.clickPassword();
		LN.setPassword("asdf");
		test.pass("entered password ");
		Thread.sleep(2000);
		LN.clickLogin();
		test.pass("Clicked Login ");
		Thread.sleep(5000);
		
		Auro_Account_Details AAD=new Auro_Account_Details(driver);
		AAD.clickSubscriptionLink();
		test.pass("Clicked on Subscription Link ");
		Thread.sleep(2000);
		AAD.clickcancelFreeTrialLink();
		test.pass("Clicked on Cancel Free Trial Link");
		Thread.sleep(2000);
		AAD.yesPleaseButton();
		test.pass("Clicked on YES please button");
		Thread.sleep(2000);
		AAD.clickclaimOfferButton();
		test.pass("Clicked Claim Offer button");
		//AAD.YourAuroPlanHasBeenSuccessfullyUpdatedText("Thank you. Your Auro plan has been successfully updated!");
		
		
		
}
}
