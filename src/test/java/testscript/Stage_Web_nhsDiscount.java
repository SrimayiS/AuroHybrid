package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import generic.Precondition;
import pom.Auro_Categories_Page;
import pom.Auro_Checkout_Page;
import pom.Auro_Goals_Page;
import pom.Auro_Home_Page;
import pom.Auro_Level_Page;
import pom.Auro_NHSDiscount_Page;
import pom.Auro_SignUp_Page;

public class Stage_Web_nhsDiscount extends Precondition {

	
	//valid signup avail offer checkout 
		@Test(priority = 1,invocationCount = 01)
		public void stage_web_aurofit_MAINPAGE_SignUp_enterCouponcode_Checkout_Subscribe() throws InterruptedException {
				
		    	test=extent.createTest("Main Page Valid SignUp do the payment avail offer");
			    test.log(Status.INFO, "Main Page Valid SignUp do the payment avail offer valid SignUp test script started executing");
			    Auro_Home_Page AH=new Auro_Home_Page(driver);
				
				test.pass("clicked on startFreeTrial Button");
				AH.scrollToElementnhsDiscountLink();
				Thread.sleep(2000);
				AH.clicknhsDiscount();
				Auro_NHSDiscount_Page ANP = new Auro_NHSDiscount_Page(driver);
				ANP.clicknhsEmailTextfield();
				ANP.enterNhsEmail("abc@aurotest.com");
				ANP.clicksubmitButton();
		
				ANP.verifythankYouText("Thank you!");
				ANP.verifythankYouBunchForFillingText("Thanks a bunch for filling that out. It means a lot to us, just like you do!");
				
				
				
		}
}
