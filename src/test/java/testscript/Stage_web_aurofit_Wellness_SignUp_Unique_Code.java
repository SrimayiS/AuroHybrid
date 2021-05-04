package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Precondition;
import pom.Auro_Categories_Page;
import pom.Auro_Checkout_Page;
import pom.Auro_Goals_Page;
import pom.Auro_Home_Page;
import pom.Auro_Level_Page;
import pom.Auro_SignUp_Page;

public class Stage_web_aurofit_Wellness_SignUp_Unique_Code extends Precondition {

	
	
@Test(priority = 0,invocationCount = 1)
public void Stage_web_30daysFreeSignUp_select_LoseWeight_Beginner_Spin_Availoffer_Dothe_Payment() throws InterruptedException {
		
	
		Auro_Home_Page AH=new Auro_Home_Page(driver);
		AH.clickRedeemYourPass();
		//AH.clickstartFreeTrial();
		Thread.sleep(1000);
		
		
	    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
	    Thread.sleep(2000);
		AG.selectBuildStrength();
		AG.clickNextButton();
		
		Auro_Level_Page AL=new Auro_Level_Page(driver);
		Thread.sleep(1000);
		AL.selectBeginner();
		AL.clickNextButton();
		
		Auro_Categories_Page AC=new Auro_Categories_Page(driver);
		AC.selectSpin();
		AC.clickNextButton();
		
		Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
		AS.clickEmailTextfield();
		Thread.sleep(2000);
		AS.setEmail(System.currentTimeMillis()+"@aurotest.com");
		AS.setPassword("assdf");
		AS.setFirstName("Ajuna");
		AS.clickSignUp();
		
		Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
		Thread.sleep(3000);
		
		ACP.scrollToElement();
		ACP.enterCouponCode("OFFER20");
		ACP.clickApplyButton();
		ACP.verifyCouponCodeApplied();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		ACP.clickEnterCardNumber();
		ACP.clearEnterCardNumber();
		ACP.enterCardNumber("4242424242424242");
		ACP.enterExpDate("1221");
		ACP.entercVc("122");
		ACP.enterZipCode("12345");
		driver.switchTo().defaultContent();
		ACP.clickStartFreeTrialButton();
		Thread.sleep(10000);
		String actualurl = driver.getCurrentUrl();
		System.out.println(actualurl);
		Assert.assertEquals(actualurl, "https://stage-web.auro.fit/30days-free/signup/success");
		
}
}
