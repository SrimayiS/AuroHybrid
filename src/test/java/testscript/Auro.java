package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import generic.ExcelSheet;
import generic.Precondition;
import pom.Auro_Categories_Page;
import pom.Auro_Checkout_Page;
import pom.Auro_Goals_Page;
import pom.Auro_Home_Page;
import pom.Auro_Level_Page;
import pom.Auro_SignUp_Page;

public class Auro extends Precondition {
	
	@Test(invocationCount = 1)
	public void auroValidSignUp() throws InterruptedException {
		
		test=extent.createTest("auroValidSignUp");
		test.log(Status.INFO, "auroValidSignUp test script started executing");
		
		
		Auro_Home_Page AH=new Auro_Home_Page(driver);
		AH.clickstartFreeTrial();
		test.pass("clicked 'startFreeTrial' Button");
		AH.clickletsGetStarted();
		test.pass("clicked 'letsGetStarted' Button");
	    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
	    Thread.sleep(1000);
	    
		AG.selectBuildStrength();
		test.pass("Selected 'BuildStrength'");
		AG.clickNextButton();
		test.pass("Clicked next button");
		
		Auro_Level_Page AL=new Auro_Level_Page(driver);
		Thread.sleep(1000);
		AL.selectBeginner();
		test.pass("Selected 'Beginner'");
		AL.clickNextButton();
		test.pass("Clicked next button");
		
		Auro_Categories_Page AC=new Auro_Categories_Page(driver);
		AC.selectSpin();
		test.pass("Selected 'Spin'");
		AC.clickNextButton();
		test.pass("Clicked next button");
		
		Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
		AS.clickEmailTextfield();
		AS.clickEmailTextfield();
		Thread.sleep(1000);
		AS.setEmail(System.currentTimeMillis()+"@aurotest.com");
		test.pass("Entered valid email");
		AS.setPassword("assdf");
		test.pass("Entered valid Password");
		AS.setFirstName("Keerthesh");
		test.pass("Entered FirstName");
		AS.clickSignUp();
		test.pass("Clicked Sign up button");
		
		Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
		Thread.sleep(1000);
		
		ACP.scrollToElementstartFreeTrialButton();
		ACP.clickhaveApromoCode();
		ACP.enterCouponCode("PURE1");
		test.pass("Entered valid Coupon Code");
		ACP.clickApplyButton();
		test.pass("clicked Apply Button ");
		ACP.verifyCouponCodeApplied();
		test.pass(" verified coupon code and offer is availed");
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		ACP.clickEnterCardNumber();
		ACP.clearEnterCardNumber();
		ACP.enterCardNumber("4242424242424242");
		test.pass("valid card number is entered");
		ACP.enterExpDate("1221");
		test.pass("valid expiry date is entered");
		ACP.entercVc("12");
		test.pass("valid cVc is entered ");
		ACP.enterZipCode("12345");
		test.pass("valid ZipCode is entered");
		driver.switchTo().defaultContent();
		ACP.clickStartFreeTrialButton();
		test.pass("clicked 'StartFreeTrialButton'");
		Thread.sleep(8000);
		String actualurl = driver.getCurrentUrl();
		System.out.println(actualurl);
		Assert.assertEquals(actualurl, "https://stage-web.auro.fit/fitness-assessment/success");
		test.log(Status.INFO, "auroValidSignUp test script Successfully executed");
		
	}
}
