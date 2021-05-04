package testscript;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import generic.ExcelSheet;
import generic.Precondition;
import junit.framework.Assert;
import pom.Auro_Categories_Page;
import pom.Auro_Checkout_Page;
import pom.Auro_ForgotYourPassWord_Page;
import pom.Auro_Goals_Page;
import pom.Auro_Home_Page;
import pom.Auro_Level_Page;
import pom.Auro_SignUp_Page;
import pom.Login_Page;

public class Stage_web_aurofit_30daysFree extends Precondition {

	
	
	@Test(priority = 1,invocationCount = 01)
	public void stage_web_aurofit_30daysFree_SignUp_enterCouponcode_Checkout_Subscribe() throws InterruptedException {
			
		test=extent.createTest("30daysFree- Valid SignUp do the payment avail offer");
	    test.log(Status.INFO, "30daysFree- Valid SignUp do the payment avail offer valid SignUp test script started executing");
	        Auro_Home_Page AH=new Auro_Home_Page(driver);
			AH.clickGet30DaysFreeButton();
			test.pass("clicked Get30DaysFree Button");
			//AH.clickstartFreeTrial();
			Thread.sleep(1000);
			
			
			Auro_Goals_Page AG=new Auro_Goals_Page(driver);
		    Thread.sleep(1000);
			AG.selectBuildStrength();
			test.pass("Selected goal as Build Strength");
			AG.clickNextButton();
			test.pass("Clicked Next Button");
			
			Auro_Level_Page AL=new Auro_Level_Page(driver);
			Thread.sleep(1000);
			AL.selectBeginner();
			test.pass("Selected  level as Beginner");
			AL.clickNextButton();
			test.pass("Clicked Next Button");
			
			Auro_Categories_Page AC=new Auro_Categories_Page(driver);
			AC.selectSpin();
			test.pass("Selected category as Spin");
			AC.clickNextButton();
			test.pass("Clicked Next Button");
			
			Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
			AS.clickEmailTextfield();
			test.pass("Clicked Email Text Field");
			Thread.sleep(1000);
			String Email=System.currentTimeMillis()+"keertheshkunjar"+"@aurotest.com";
			AS.setEmail(Email);
			test.pass("Entered Email -"+Email);
			AS.setPassword("assdf");
			test.pass("Entered Password");
			AS.setFirstName("Thesh");
			test.pass("Entered FirstName");
			
			AS.clickSignUp();
			test.pass("Clicked On SignUP");
			
			Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
			Thread.sleep(1000);
			
			ACP.scrollToElementstartFreeTrialButton();
			Thread.sleep(1000);
			//ACP.clickhaveApromoCode();
			ACP.enterCouponCode("BALANCED");
			test.pass("Entered CouponCode -BALANCED");
			ACP.clickApplyButton();
			test.pass("Clicked Apply Button");
			ACP.verifyCouponCodeApplied();
			test.pass("Verified Coupon Code");
			ACP.verify30DaysFreeText("30");
			test.pass("Verified Coupon Code applied and 30 days discount availed");
			Thread.sleep(2000);
			driver.switchTo().frame(0);
			ACP.clickEnterCardNumber();
			ACP.clearEnterCardNumber();
			ACP.enterCardNumber("4242424242424242");
			test.pass("Entered Card Number");
			ACP.enterExpDate("1221");
			test.pass("Entered Card Expiry Date");
			ACP.entercVc("122");
			test.pass("Entered Card cVc");
			ACP.enterZipCode("12345");
			test.pass("Entered Card ZIP code");
			driver.switchTo().defaultContent();
			ACP.clickStartFreeTrialButton();
			test.pass("Clicked on Start free Trial Button");
			Thread.sleep(10000);
			String actualurl = driver.getCurrentUrl();
			System.out.println(actualurl);
			Assert.assertEquals(actualurl, "https://stage-web.auro.fit/30days-free/signup/success");
			test.pass("Test Script Passed");
	}
	
	//valid signup with already registered email
			@Test(priority = 2,invocationCount = 01)
			public void stage_web_aurofit_30daysFree_SignUp_with_Already_Registed_Email() throws InterruptedException {
					
			    	test=extent.createTest("30daysFree-valid signup with already registered email");
				    test.log(Status.INFO, "30daysFree-valid signup with already registered email test script started executing");
				    Auro_Home_Page AH=new Auro_Home_Page(driver);
					AH.clickGet30DaysFreeButton();
					test.pass("clicked Get30DaysFree Button");
					//AH.clickstartFreeTrial();
					Thread.sleep(1000);
					
					
				    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
				    Thread.sleep(1000);
					AG.selectBuildStrength();
					test.pass("Selected goal as Build Strength");
					AG.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_Level_Page AL=new Auro_Level_Page(driver);
					Thread.sleep(1000);
					AL.selectBeginner();
					test.pass("Selected  level as Beginner");
					AL.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_Categories_Page AC=new Auro_Categories_Page(driver);
					AC.selectSpin();
					test.pass("Selected category as Spin");
					AC.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
					AS.clickEmailTextfield();
					test.pass("Clicked Email Text Field");
					Thread.sleep(1000);
					String Email="theshb1@aurotest.com";
					AS.setEmail(Email);
					test.pass("Entered Email -"+Email);
					AS.setPassword("assdf");
					test.pass("Entered Password");
					AS.setFirstName("Thesh");
					test.pass("Entered FirstName");
					
					AS.clickSignUp();
					test.pass("Clicked On SignUP");
					AS.verifyAlreadyRegisteredTextErrorMessage();
					test.pass("verified Already Registered ErrorMessage");
					
					
					
					
			}
			
		    //Login with valid credentials
		    @Test(priority = 3,invocationCount = 01)
		    public void stage_web_aurofit_30daysFree_Login_With_Valid_Credentials() throws InterruptedException {
				
		    	test=extent.createTest("30daysFree-Valid Login");
			    test.log(Status.INFO, "30daysFree-Valid Login test script started executing");
			    Auro_Home_Page AH=new Auro_Home_Page(driver);
				AH.clickGet30DaysFreeButton();
				test.pass("clicked Get30DaysFree Button");
				//AH.clickstartFreeTrial();
				Thread.sleep(1000);
					
					
				    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
				    Thread.sleep(1000);
					AG.selectBuildStrength();
					test.pass("Selected goal as Build Strength");
					AG.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_Level_Page AL=new Auro_Level_Page(driver);
					Thread.sleep(1000);
					AL.selectBeginner();
					test.pass("Selected  level as Beginner");
					AL.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_Categories_Page AC=new Auro_Categories_Page(driver);
					AC.selectSpin();
					test.pass("Selected category as Spin");
					AC.clickNextButton();
					test.pass("Clicked Next Button");
					
					
				 
				    Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
				    Thread.sleep(2000);
				    AS.clickLogin();
				    test.pass("Clicked Login Button");
				
				
				    Login_Page LN=new Login_Page(driver);
				    LN.clickEmail();
				    LN.setEmail("theshc1@aurotest.com");
			     	test.pass("entered valid email"+" theshc1@aurotest.com");
			    	LN.clickPassword();
			    	LN.setPassword("asdf");
			    	test.pass("entered valid password"+" asdf");
			     	LN.clickLogin();
		     		Thread.sleep(3000);
		    		test.pass("Clicked Login");
				
				
				    Thread.sleep(7000);
			    	String actualurl = driver.getCurrentUrl();
			    	System.out.println(actualurl);
			    	Assert.assertEquals(actualurl, "https://stage-web.auro.fit/profile/account-details?mpt=30437bfe5210ff4cff7502c1b8519f495c89edf514c5e0b6153238eb1bcd41e3");
			    	test.pass("Test script Passed");
				
				
				
		}
		    
		    
		  //Login with  valid Email and invalid Password and verify the error message
			 @Test(priority = 4,invocationCount = 01)
		     public void stage_web_aurofit_30daysFree_LOGIN_VALID_EMAIL_INVALID_PASSWORD() throws InterruptedException {
				
				    test=extent.createTest("30daysFree- valid Email and invalid Password and verify the error message");
				    test.log(Status.INFO, "30daysFree- valid Email and invalid Password and verify the error message test script started executing");
				    Auro_Home_Page AH=new Auro_Home_Page(driver);
					AH.clickGet30DaysFreeButton();
					test.pass("clicked Get30DaysFree Button");
					//AH.clickstartFreeTrial();
					Thread.sleep(1000);
					
					
				    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
				    Thread.sleep(1000);
					AG.selectBuildStrength();
					test.pass("Selected goal as Build Strength");
					AG.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_Level_Page AL=new Auro_Level_Page(driver);
					Thread.sleep(1000);
					AL.selectBeginner();
					test.pass("Selected  level as Beginner");
					AL.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_Categories_Page AC=new Auro_Categories_Page(driver);
					AC.selectSpin();
					test.pass("Selected category as Spin");
					AC.clickNextButton();
					test.pass("Clicked Next Button");
					
					
				 
				    Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
				    Thread.sleep(2000);
				    AS.clickLogin();
				    test.pass("Clicked Login Button");
				
				
				    Login_Page LN=new Login_Page(driver);
				    LN.clickEmail();
				    LN.setEmail(validemail1);
			     	test.pass("entered valid email"+validemail1);
			    	LN.clickPassword();
			     	LN.setPassword(invalidpassword);
			     	test.pass("entered invalid password"+invalidpassword);
				    LN.clickLogin();
				    test.pass("Clicked login Button");
			    	Thread.sleep(2000);
			    	LN.verifypasswordErrormessageText("Invalid email or password");
			    	test.pass("verified  'Invalid email or password'  error message");
			    	test.pass("Test script Passed");
				
		}
			 
			 
			//Login Entering Invalid Email and Valid Password and verify the error message
				@Test(priority = 5,invocationCount = 01)
			    public void stage_web_aurofit_30daysFree_LOGIN_INVALID_EMAIL__VALIDPASSWORD() throws InterruptedException {
					
					test=extent.createTest("30daysFree-Login Entering Invalid Email and Valid Password and verify the error message");
				    test.log(Status.INFO, "30daysFree-Login Entering Invalid Email and Valid Password and verify the error message test script started executing");
				    Auro_Home_Page AH=new Auro_Home_Page(driver);
					AH.clickGet30DaysFreeButton();
					test.pass("clicked Get30DaysFree Button");
					//AH.clickstartFreeTrial();
					Thread.sleep(1000);
						
						
					    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
					    Thread.sleep(1000);
						AG.selectBuildStrength();
						test.pass("Selected goal as Build Strength");
						AG.clickNextButton();
						test.pass("Clicked Next Button");
						
						Auro_Level_Page AL=new Auro_Level_Page(driver);
						Thread.sleep(1000);
						AL.selectBeginner();
						test.pass("Selected  level as Beginner");
						AL.clickNextButton();
						test.pass("Clicked Next Button");
						
						Auro_Categories_Page AC=new Auro_Categories_Page(driver);
						AC.selectSpin();
						test.pass("Selected category as Spin");
						AC.clickNextButton();
						test.pass("Clicked Next Button");
						
						
					 
					    Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
					    Thread.sleep(2000);
					    AS.clickLogin();
					    test.pass("Clicked Login Button");
					
					
					    Login_Page LN=new Login_Page(driver);
					    LN.clickEmail();
					    LN.setEmail(invalidemail);
					    test.pass("Entered invalid email "+invalidemail);
				    	LN.clickPassword();
				     	LN.setPassword(validpassword1);
				     	test.pass("Entered valid Password "+validpassword1);
					
					    LN.clickLogin();
					    LN.verifyEmailErrormessageText("Please enter a valid email address.");
					    test.pass("verified  'Invalid email or password'  error message");
				    	test.pass("Test script Passed");
				  }	
				
				
				//Login Entering Unregistered Mail and check the error message
				@Test(priority = 6,invocationCount = 01)
			    public void stage_web_aurofit_30daysFree_LOGIN_UNREGISTEREDMAIL() throws InterruptedException {
					
					test=extent.createTest("30daysFree-Login Entering Unregistered Mail and check the error message");
				    test.log(Status.INFO, "30daysFree-Login Entering Unregistered Mail and check the error message test script started executing");
				    Auro_Home_Page AH=new Auro_Home_Page(driver);
					AH.clickGet30DaysFreeButton();
					test.pass("clicked Get30DaysFree Button");
					//AH.clickstartFreeTrial();
					Thread.sleep(1000);
						
					    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
					    Thread.sleep(1000);
						AG.selectBuildStrength();
						test.pass("Selected goal as Build Strength");
						AG.clickNextButton();
						test.pass("Clicked Next Button");
						
						Auro_Level_Page AL=new Auro_Level_Page(driver);
						Thread.sleep(1000);
						AL.selectBeginner();
						test.pass("Selected  level as Beginner");
						AL.clickNextButton();
						test.pass("Clicked Next Button");
						
						Auro_Categories_Page AC=new Auro_Categories_Page(driver);
						AC.selectSpin();
						test.pass("Selected category as Spin");
						AC.clickNextButton();
						test.pass("Clicked Next Button");
						
						
					 
					    Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
					    Thread.sleep(2000);
					    AS.clickLogin();
					    test.pass("Clicked Login Button");
					
					    Login_Page LN=new Login_Page(driver);
					    LN.clickEmail();
				    	LN.setEmail(unRegisteredmail);
				    	test.pass("Entered unregistered mail "+unRegisteredmail);
					    LN.clickPassword();
					    LN.setPassword(validpassword1);
					    test.pass("Entered  valid password "+validpassword1);
					    LN.clickLogin();
					    test.pass("Clicked Login");
					    Thread.sleep(1000);
				     	LN.verifyinvalidusernameorpassworderrormessageText("Invalid email or password");
				       	test.pass("verified error message 'Invalid email or password'");
				  }
				
				
				
				 //Enter the Expired Card Credentials And verify "Your card has expired." Error Message
				@Test(priority = 7,invocationCount = 01)
				public void stage_web_aurofit_30daysFree_Dothe_Payment_Entering_Expired_Card_Credentials() throws InterruptedException {
					
					test=extent.createTest("30daysFree-Enter the Expired Card Credentials And verify \"Your card has expired.\" Error Message");
				    test.log(Status.INFO, "30daysFree-Enter the Expired Card Credentials And verify \"Your card has expired.\" Error Message test script started executing");
				    Auro_Home_Page AH=new Auro_Home_Page(driver);
					AH.clickGet30DaysFreeButton();
					test.pass("clicked Get30DaysFree Button");
					//AH.clickstartFreeTrial();
					Thread.sleep(1000);
					
					
				    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
				    Thread.sleep(1000);
					AG.selectBuildStrength();
					test.pass("Selected goal as Build Strength");
					AG.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_Level_Page AL=new Auro_Level_Page(driver);
					Thread.sleep(1000);
					AL.selectBeginner();
					test.pass("Selected  level as Beginner");
					AL.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_Categories_Page AC=new Auro_Categories_Page(driver);
					AC.selectSpin();
					test.pass("Selected category as Spin");
					AC.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
					AS.clickEmailTextfield();
					test.pass("Clicked Email Text Field");
					Thread.sleep(1000);
					String Email=System.currentTimeMillis()+"keertheshkunjar"+"@aurotest.com";
					AS.setEmail(Email);
					test.pass("Entered Email -"+Email);
					AS.setPassword("assdf");
					test.pass("Entered Password");
					AS.setFirstName("Thesh");
					test.pass("Entered FirstName");
					
					AS.clickSignUp();
					test.pass("Clicked On SignUP");
					
					Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
					Thread.sleep(1000);
					
					ACP.scrollToElementstartFreeTrialButton();
					Thread.sleep(1000);
					ACP.enterCouponCode("BALANCED");
					test.pass("Entered CouponCode -BALANCED");
					ACP.clickApplyButton();
					test.pass("Clicked Apply Button");
					ACP.verifyCouponCodeApplied();
					test.pass("Verified Coupon Code");
					Thread.sleep(2000);
					ACP.verify30DaysFreeText("30");
					test.pass("Verified Coupon Code applied and 30 days discount availed");
					driver.switchTo().frame(0);
					ACP.clickEnterCardNumber();
					ACP.clearEnterCardNumber();
					ACP.enterCardNumber("4000000000000069");
					test.pass("Entered expered Card Number -4000000000000069");
					ACP.enterExpDate("1221");
					test.pass("Entered Card Expiry Date");
					ACP.entercVc("122");
					test.pass("Entered Card cVc");
					ACP.enterZipCode("12345");
					test.pass("Entered Card ZIP code");
					driver.switchTo().defaultContent();
					ACP.clickStartFreeTrialButton();
					test.pass("Clicked on Start free Trial Button");
					ACP.verifyExpiredCardMessage("Your card has expired.");
					test.pass("verified 'Your card has expired.' error message ");
					
					
					
			}
				   
	

		        //Enter the Card Credentials And verify "Your card's security code is incorrect." Error Message
				@Test(priority = 8,invocationCount = 01)
				public void stage_web_aurofit_30daysFree_Dothe_Payment_Entering_Credentials_Incorrect_Security_Code() throws InterruptedException {
					
					test=extent.createTest("30daysFree-Enter the Card Credentials And verify \"Your card's security code is incorrect.\" Error Message");
				    test.log(Status.INFO, "30daysFree-Enter the Card Credentials And verify \"Your card's security code is incorrect.\" Error Message test script started executing");
				    Auro_Home_Page AH=new Auro_Home_Page(driver);
					AH.clickGet30DaysFreeButton();
					test.pass("clicked Get30DaysFree Button");
					//AH.clickstartFreeTrial();
					Thread.sleep(1000);
					
					
				    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
				    Thread.sleep(1000);
					AG.selectBuildStrength();
					test.pass("Selected goal as Build Strength");
					AG.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_Level_Page AL=new Auro_Level_Page(driver);
					Thread.sleep(1000);
					AL.selectBeginner();
					test.pass("Selected  level as Beginner");
					AL.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_Categories_Page AC=new Auro_Categories_Page(driver);
					AC.selectSpin();
					test.pass("Selected category as Spin");
					AC.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
					AS.clickEmailTextfield();
					test.pass("Clicked Email Text Field");
					Thread.sleep(1000);
					String Email=System.currentTimeMillis()+"keertheshkunjar"+"@aurotest.com";
					AS.setEmail(Email);
					test.pass("Entered Email -"+Email);
					AS.setPassword("assdf");
					test.pass("Entered Password");
					AS.setFirstName("Thesh");
					test.pass("Entered FirstName");
					
					AS.clickSignUp();
					test.pass("Clicked On SignUP");
					
					Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
					Thread.sleep(1000);
					
					ACP.scrollToElementstartFreeTrialButton();
					Thread.sleep(1000);
					ACP.enterCouponCode("BALANCED");
					test.pass("Entered CouponCode -BALANCED");
					ACP.clickApplyButton();
					test.pass("Clicked Apply Button");
					ACP.verifyCouponCodeApplied();
					test.pass("Verified Coupon Code");
					ACP.verify30DaysFreeText("30");
					test.pass("Verified Coupon Code applied and 30 days discount availed");
					Thread.sleep(2000);
					driver.switchTo().frame(0);
					ACP.clickEnterCardNumber();
					ACP.clearEnterCardNumber();
					ACP.enterCardNumber("4000000000000127");
					test.pass("Entered Card Number");
					ACP.enterExpDate("1221");
					test.pass("Entered Card Expiry Date");
					ACP.entercVc("122");
					test.pass("Entered Card cVc");
					ACP.enterZipCode("12345");
					test.pass("Entered Card ZIP code");
					driver.switchTo().defaultContent();
					ACP.clickStartFreeTrialButton();
					test.pass("Clicked on Start free Trial Button");
					ACP.verifyIncorrectSecurityCodeMessagevisible();
					//ACP.verifyIncorrectSecurityCodeMessage("Your card's security code is incorrect.");
					test.pass("verified error message-'Your card's security code is incorrect.'");
					
				}
				
				//Enter the  Card Credentials And verify "An error occurred while processing your card. Try again in a little bit." Error Message while processing the Card
				@Test(priority = 9,invocationCount = 01)
				public void stage_web_aurofit_30daysFree_Dothe_Payment_Entering_Credentials_Error_while_processing_the_card() throws InterruptedException {
					
					test=extent.createTest("30daysFree-Enter the  Card Credentials And verify \"An error occurred while processing your card. Try again in a little bit.\" Error Message while processing the Card");
				    test.log(Status.INFO, "30daysFree-Enter the  Card Credentials And verify \"An error occurred while processing your card. Try again in a little bit.\" Error Message while processing the Card test script started executing");
				    Auro_Home_Page AH=new Auro_Home_Page(driver);
					AH.clickGet30DaysFreeButton();
					test.pass("clicked Get30DaysFree Button");
					//AH.clickstartFreeTrial();
					Thread.sleep(1000);
					
					
					
				    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
				    Thread.sleep(1000);
					AG.selectBuildStrength();
					test.pass("Selected goal as Build Strength");
					AG.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_Level_Page AL=new Auro_Level_Page(driver);
					Thread.sleep(1000);
					AL.selectBeginner();
					test.pass("Selected  level as Beginner");
					AL.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_Categories_Page AC=new Auro_Categories_Page(driver);
					AC.selectSpin();
					test.pass("Selected category as Spin");
					AC.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
					AS.clickEmailTextfield();
					test.pass("Clicked Email Text Field");
					Thread.sleep(1000);
					String Email=System.currentTimeMillis()+"keertheshkunjar"+"@aurotest.com";
					AS.setEmail(Email);
					test.pass("Entered Email -"+Email);
					AS.setPassword("assdf");
					test.pass("Entered Password");
					AS.setFirstName("Thesh");
					test.pass("Entered FirstName");
					
					AS.clickSignUp();
					test.pass("Clicked On SignUP");
					
					Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
					Thread.sleep(1000);
					
					ACP.scrollToElementstartFreeTrialButton();
					Thread.sleep(1000);
					ACP.enterCouponCode("BALANCED");
					test.pass("Entered CouponCode -BALANCED");
					ACP.clickApplyButton();
					test.pass("Clicked Apply Button");
					ACP.verifyCouponCodeApplied();
					test.pass("Verified Coupon Code");
					ACP.verify30DaysFreeText("30");
					test.pass("Verified Coupon Code applied and 30 days discount availed");
					Thread.sleep(2000);
					driver.switchTo().frame(0);
					ACP.clickEnterCardNumber();
					ACP.clearEnterCardNumber();
					ACP.enterCardNumber("4000000000000119");
					test.pass("Entered Card Number-4000000000000119");
					ACP.enterExpDate("1221");
					test.pass("Entered Card Expiry Date");
					ACP.entercVc("122");
					test.pass("Entered Card cVc");
					ACP.enterZipCode("12345");
					test.pass("Entered Card ZIP code");
					driver.switchTo().defaultContent();
					ACP.clickStartFreeTrialButton();
					test.pass("Clicked on Start free Trial Button");
					ACP.verifyProcessingErrorMessage("An error occurred while processing your card. Try again in a little bit.");
					test.pass("An error occurred while processing your card. Try again in a little bit.'");
				}
				
				
				//Enter the  Card Credentials And verify  "Your card number is invalid."Error Message
				@Test(priority = 10,invocationCount = 01)
					public void stage_web_aurofit_30daysFree_Dothe_Payment_Entering_Credentials_Invalid_CardNumber_ErrorMessage() throws InterruptedException {
							
					test=extent.createTest("30daysFree-Enter the  Card Credentials And verify  \"Your card number is invalid.\"Error Message");
				    test.log(Status.INFO, "30daysFree-Enter the  Card Credentials And verify  \"Your card number is invalid.\"Error Message test script started executing");
				    Auro_Home_Page AH=new Auro_Home_Page(driver);
					AH.clickGet30DaysFreeButton();
					test.pass("clicked Get30DaysFree Button");
					//AH.clickstartFreeTrial();
					Thread.sleep(1000);
					
					
				    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
				    Thread.sleep(1000);
					AG.selectBuildStrength();
					test.pass("Selected goal as Build Strength");
					AG.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_Level_Page AL=new Auro_Level_Page(driver);
					Thread.sleep(1000);
					AL.selectBeginner();
					test.pass("Selected  level as Beginner");
					AL.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_Categories_Page AC=new Auro_Categories_Page(driver);
					AC.selectSpin();
					test.pass("Selected category as Spin");
					AC.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
					AS.clickEmailTextfield();
					test.pass("Clicked Email Text Field");
					Thread.sleep(1000);
					String Email=System.currentTimeMillis()+"keertheshkunjar"+"@aurotest.com";
					AS.setEmail(Email);
					test.pass("Entered Email -"+Email);
					AS.setPassword("assdf");
					test.pass("Entered Password");
					AS.setFirstName("Thesh");
					test.pass("Entered FirstName");
					
					AS.clickSignUp();
					test.pass("Clicked On SignUP");
					
					Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
					Thread.sleep(1000);
					
					ACP.scrollToElementstartFreeTrialButton();
					Thread.sleep(1000);
					ACP.enterCouponCode("BALANCED");
					test.pass("Entered CouponCode -BALANCED");
					ACP.clickApplyButton();
					test.pass("Clicked Apply Button");
					ACP.verifyCouponCodeApplied();
					test.pass("Verified Coupon Code");
					ACP.verify30DaysFreeText("30");
					test.pass("Verified Coupon Code applied and 30 days discount availed");
					Thread.sleep(2000);
					driver.switchTo().frame(0);
					ACP.clickEnterCardNumber();
					ACP.clearEnterCardNumber();
					ACP.enterCardNumber("4242424242424241");
					test.pass("Entered Card Number-4242424242424241");
					ACP.enterExpDate("1221");
					test.pass("Entered Card Expiry Date");
					ACP.entercVc("122");
					test.pass("Entered Card cVc");
					ACP.enterZipCode("12345");
					test.pass("Entered Card ZIP code");
					driver.switchTo().defaultContent();
					ACP.clickStartFreeTrialButton();
					test.pass("Clicked on Start free Trial Button");
					Thread.sleep(1000);
				    ACP.verifyInvalidCardNumber("Your card number is invalid.");
				    test.pass("verified error message-'Your card number is invalid.'");
				    
					
				}
				
		
				//Enter incomplete card number and verify "Your card number is incomplete." Error message
				@Test(priority = 11,invocationCount = 01)
          public void stage_web_aurofit_30daysFree_LoseWeight_Beginner_Spin_Availoffer_Dothe_Payment_Entering_IncompleteCardNumber_Verify_ErrorMessage() throws InterruptedException {
					
					test=extent.createTest("30daysFree-Enter incomplete card number and verify \"Your card number is incomplete.\" Error message");
				    test.log(Status.INFO, "30daysFree-Enter incomplete card number and verify \"Your card number is incomplete.\" Error message test script started executing");
				    Auro_Home_Page AH=new Auro_Home_Page(driver);
					AH.clickGet30DaysFreeButton();
					test.pass("clicked Get30DaysFree Button");
					//AH.clickstartFreeTrial();
					Thread.sleep(1000);
					
					
				    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
				    Thread.sleep(1000);
					AG.selectBuildStrength();
					test.pass("Selected goal as Build Strength");
					AG.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_Level_Page AL=new Auro_Level_Page(driver);
					Thread.sleep(1000);
					AL.selectBeginner();
					test.pass("Selected  level as Beginner");
					AL.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_Categories_Page AC=new Auro_Categories_Page(driver);
					AC.selectSpin();
					test.pass("Selected category as Spin");
					AC.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
					AS.clickEmailTextfield();
					test.pass("Clicked Email Text Field");
					Thread.sleep(1000);
					String Email=System.currentTimeMillis()+"keertheshkunjar"+"@aurotest.com";
					AS.setEmail(Email);
					test.pass("Entered Email -"+Email);
					AS.setPassword("assdf");
					test.pass("Entered Password");
					AS.setFirstName("Thesh");
					test.pass("Entered FirstName");
					
					AS.clickSignUp();
					test.pass("Clicked On SignUP");
					
					Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
					Thread.sleep(1000);
					
					ACP.scrollToElementstartFreeTrialButton();
					Thread.sleep(1000);
					ACP.enterCouponCode("BALANCED");
					test.pass("Entered CouponCode -BALANCED");
					ACP.clickApplyButton();
					test.pass("Clicked Apply Button");
					ACP.verifyCouponCodeApplied();
					test.pass("Verified Coupon Code");
					ACP.verify30DaysFreeText("30");
					test.pass("Verified Coupon Code applied and 30 days discount availed");
					Thread.sleep(2000);
					driver.switchTo().frame(0);
					ACP.clickEnterCardNumber();
					ACP.clearEnterCardNumber();
					ACP.enterCardNumber("42424242424242");
					test.pass("Entered incomplete Card Number-42424242424242");
					driver.switchTo().defaultContent();
					ACP.clickStartFreeTrialButton();
		           
					test.pass("Clicked on Start free Trial Button");
					 ACP.verifyinCompleteCardNumberErrorErrorMessage();
					//ACP.verifyIncomleteCardNumberError("Your card number is incomplete.");
					test.pass("verified -'Your card number is incomplete.' error message");
					
				}
				
				
			
				
				//Enter incomplete ExpiryDate and Verify "Your card's expiration date is incomplete." Error Message 
				@Test(priority = 12,invocationCount = 01)
				public void stage_web_aurofit_30daysFree_Dothe_Payment_Incomplete_ExpiryDate_verifyErrorMessage() throws InterruptedException {
					
					test=extent.createTest("30daysFree-Enter incomplete ExpiryDate and Verify \"Your card's expiration date is incomplete.\" Error Message ");
				    test.log(Status.INFO, "30daysFree-Enter incomplete ExpiryDate and Verify \"Your card's expiration date is incomplete.\" Error Message  test script started executing");
				    Auro_Home_Page AH=new Auro_Home_Page(driver);
					AH.clickGet30DaysFreeButton();
					test.pass("clicked Get30DaysFree Button");
					//AH.clickstartFreeTrial();
					Thread.sleep(1000);
					
					
				    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
				    Thread.sleep(1000);
					AG.selectBuildStrength();
					test.pass("Selected goal as Build Strength");
					AG.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_Level_Page AL=new Auro_Level_Page(driver);
					Thread.sleep(1000);
					AL.selectBeginner();
					test.pass("Selected  level as Beginner");
					AL.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_Categories_Page AC=new Auro_Categories_Page(driver);
					AC.selectSpin();
					test.pass("Selected category as Spin");
					AC.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
					AS.clickEmailTextfield();
					test.pass("Clicked Email Text Field");
					Thread.sleep(1000);
					String Email=System.currentTimeMillis()+"keertheshkunjar"+"@aurotest.com";
					AS.setEmail(Email);
					test.pass("Entered Email -"+Email);
					AS.setPassword("assdf");
					test.pass("Entered Password");
					AS.setFirstName("Thesh");
					test.pass("Entered FirstName");
					
					AS.clickSignUp();
					test.pass("Clicked On SignUP");
					
					Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
					Thread.sleep(1000);
					
					ACP.scrollToElementstartFreeTrialButton();
					Thread.sleep(1000);
					ACP.enterCouponCode("BALANCED");
					test.pass("Entered CouponCode -BALANCED");
					ACP.clickApplyButton();
					test.pass("Clicked Apply Button");
					ACP.verifyCouponCodeApplied();
					test.pass("Verified Coupon Code");
					ACP.verify30DaysFreeText("30");
					test.pass("Verified Coupon Code applied and 30 days discount availed");
					Thread.sleep(2000);
					driver.switchTo().frame(0);
					ACP.clickEnterCardNumber();
					ACP.clearEnterCardNumber();
					ACP.enterCardNumber("4242424242424242");
					test.pass("Entered Card Number");
					ACP.enterExpDate("122");
					test.pass("Entered incomplete Card Expiry Date");
					driver.switchTo().defaultContent();
					ACP.clickStartFreeTrialButton();
					ACP.verifycardsExpiryDateISInCompleteMessage();
					test.pass("Clicked on Start free Trial Button");
					ACP.verifyIncompleteCardExpiryDate();
					test.pass("verified error message-'Your card's expiration date is incomplete.'");
					
			}
				
			
				//Enter incomplete CvC Code and Verify "Your card's security code is incomplete." Error Message 
				@Test(priority = 13,invocationCount = 01)
				public void stage_web_aurofit_30daysFree_LoseWeight_Beginner_Spin_Availoffer_Dothe_Payment_Incomplete_CvC_Code_verifyErrorMessage() throws InterruptedException {
					
					test=extent.createTest("30daysFree-Enter incomplete CvC Code and Verify \"Your card's security code is incomplete.\" Error Message ");
				    test.log(Status.INFO, "30daysFree-Enter incomplete CvC Code and Verify \"Your card's security code is incomplete.\" Error Message  test script started executing");
				    Auro_Home_Page AH=new Auro_Home_Page(driver);
					AH.clickGet30DaysFreeButton();
					test.pass("clicked Get30DaysFree Button");
					//AH.clickstartFreeTrial();
					Thread.sleep(1000);
					
					
				    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
				    Thread.sleep(1000);
					AG.selectBuildStrength();
					test.pass("Selected goal as Build Strength");
					AG.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_Level_Page AL=new Auro_Level_Page(driver);
					Thread.sleep(1000);
					AL.selectBeginner();
					test.pass("Selected  level as Beginner");
					AL.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_Categories_Page AC=new Auro_Categories_Page(driver);
					AC.selectSpin();
					test.pass("Selected category as Spin");
					AC.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
					AS.clickEmailTextfield();
					test.pass("Clicked Email Text Field");
					Thread.sleep(1000);
					String Email=System.currentTimeMillis()+"keertheshkunjar"+"@aurotest.com";
					AS.setEmail(Email);
					test.pass("Entered Email -"+Email);
					AS.setPassword("assdf");
					test.pass("Entered Password");
					AS.setFirstName("Thesh");
					test.pass("Entered FirstName");
					
					AS.clickSignUp();
					test.pass("Clicked On SignUP");
					
					Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
					Thread.sleep(1000);
					
					ACP.scrollToElementstartFreeTrialButton();
					Thread.sleep(1000);
					ACP.enterCouponCode("BALANCED");
					test.pass("Entered CouponCode -BALANCED");
					ACP.clickApplyButton();
					test.pass("Clicked Apply Button");
					ACP.verifyCouponCodeApplied();
					test.pass("Verified Coupon Code");
					ACP.verify30DaysFreeText("30");
					test.pass("Verified Coupon Code applied and 30 days discount availed");
					Thread.sleep(2000);
					driver.switchTo().frame(0);
					ACP.clickEnterCardNumber();
					ACP.clearEnterCardNumber();
					ACP.enterCardNumber("4242424242424242");
					test.pass("Entered Card Number");
					ACP.enterExpDate("1221");
					test.pass("Entered Card Expiry Date");
					ACP.entercVc("12");
					
					test.pass("Entered incomplete Card cVc");
					
					
					driver.switchTo().defaultContent();
					ACP.clickStartFreeTrialButton();
					test.pass("Clicked on Start free Trial Button");
					ACP.verifysecurityCodeIncompleteErrorMessage();
					//ACP.verifyIncomleteSecurityCodeError("Your card's security code is incomplete.");
					test.pass("verified error message-'Your card's security code is incomplete.'");
					
			}
				
		
				//Enter incomplete ZIP Code and Verify "Your postal code is incomplete." Error Message 
				@Test(priority = 14,invocationCount = 01)
				public void stage_web_aurofit_30daysFree_Dothe_Payment_Incomplete_ZIP_Code_verifyErrorMessage() throws InterruptedException {
					
					test=extent.createTest("30daysFree-Enter incomplete ZIP Code and Verify \"Your postal code is incomplete.\" Error Message");
				    test.log(Status.INFO, "30daysFree-Enter incomplete ZIP Code and Verify \"Your postal code is incomplete.\" Error Message test script started executing");
				    Auro_Home_Page AH=new Auro_Home_Page(driver);
					AH.clickGet30DaysFreeButton();
					test.pass("clicked Get30DaysFree Button");
					//AH.clickstartFreeTrial();
					Thread.sleep(1000);
					
					
				    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
				    Thread.sleep(1000);
					AG.selectBuildStrength();
					test.pass("Selected goal as Build Strength");
					AG.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_Level_Page AL=new Auro_Level_Page(driver);
					Thread.sleep(1000);
					AL.selectBeginner();
					test.pass("Selected  level as Beginner");
					AL.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_Categories_Page AC=new Auro_Categories_Page(driver);
					AC.selectSpin();
					test.pass("Selected category as Spin");
					AC.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
					AS.clickEmailTextfield();
					test.pass("Clicked Email Text Field");
					Thread.sleep(1000);
					String Email=System.currentTimeMillis()+"keertheshkunjar"+"@aurotest.com";
					AS.setEmail(Email);
					test.pass("Entered Email -"+Email);
					AS.setPassword("assdf");
					test.pass("Entered Password");
					AS.setFirstName("Thesh");
					test.pass("Entered FirstName");
					
					AS.clickSignUp();
					test.pass("Clicked On SignUP");
					
					Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
					Thread.sleep(1000);
					
					ACP.scrollToElementstartFreeTrialButton();
					Thread.sleep(1000);
					
					ACP.enterCouponCode("BALANCED");
					test.pass("Entered CouponCode -BALANCED");
					ACP.clickApplyButton();
					test.pass("Clicked Apply Button");
					ACP.verifyCouponCodeApplied();
					test.pass("Verified Coupon Code");
					ACP.verify30DaysFreeText("30");
					test.pass("Verified Coupon Code applied and 30 days discount availed");
					Thread.sleep(2000);
					driver.switchTo().frame(0);
					ACP.clickEnterCardNumber();
					ACP.clearEnterCardNumber();
					ACP.enterCardNumber("4242424242424242");
					test.pass("Entered Card Number");
					ACP.enterExpDate("1221");
					test.pass("Entered Card Expiry Date");
					ACP.entercVc("122");
					test.pass("Entered Card cVc");
					ACP.enterZipCode("1234");
					test.pass("Entered incomplete Card ZIP code");
					
					driver.switchTo().defaultContent();
					ACP.clickStartFreeTrialButton();
					test.pass("Clicked on Start free Trial Button");
					ACP.verifypostalCodeIsInCompleteErrorMessage();
					//ACP.verifyIncomletePostalCodeError("Your postal code is incomplete.");
					test.pass("verified error message -'Your postal code is incomplete.'");
					
			}
				
				

				//Enter Dead Card and verify 'Your card's expiration year is in the past.' Error Message 
				@Test(priority = 15,invocationCount = 01)
				public void stage_web_aurofit_30daysFree_Dothe_Payment_Enter_DeadCardCredentials_verifyErrorMessage() throws InterruptedException {
					
					test=extent.createTest("30daysFree-Enter Dead Card and verify 'Your card's expiration year is in the past.' Error Message");
				    test.log(Status.INFO, "30daysFree-Enter Dead Card and verify 'Your card's expiration year is in the past.' Error Message test script started executing");
				    Auro_Home_Page AH=new Auro_Home_Page(driver);
					AH.clickGet30DaysFreeButton();
					test.pass("clicked Get30DaysFree Button");
					//AH.clickstartFreeTrial();
					Thread.sleep(1000);
					
					
				    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
				    Thread.sleep(1000);
					AG.selectBuildStrength();
					test.pass("Selected goal as Build Strength");
					AG.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_Level_Page AL=new Auro_Level_Page(driver);
					Thread.sleep(1000);
					AL.selectBeginner();
					test.pass("Selected  level as Beginner");
					AL.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_Categories_Page AC=new Auro_Categories_Page(driver);
					AC.selectSpin();
					test.pass("Selected category as Spin");
					AC.clickNextButton();
					test.pass("Clicked Next Button");
					
					Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
					AS.clickEmailTextfield();
					test.pass("Clicked Email Text Field");
					Thread.sleep(1000);
					String Email=System.currentTimeMillis()+"keertheshkunjar"+"@aurotest.com";
					AS.setEmail(Email);
					test.pass("Entered Email -"+Email);
					AS.setPassword("assdf");
					test.pass("Entered Password");
					AS.setFirstName("Thesh");
					test.pass("Entered FirstName");
					
					AS.clickSignUp();
					test.pass("Clicked On SignUP");
					
					Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
					Thread.sleep(1000);
					
					ACP.scrollToElementstartFreeTrialButton();
					Thread.sleep(1000);
					
					ACP.enterCouponCode("BALANCED");
					test.pass("Entered CouponCode -BALANCED");
					ACP.clickApplyButton();
					test.pass("Clicked Apply Button");
					ACP.verifyCouponCodeApplied();
					test.pass("Verified Coupon Code");
					ACP.verify30DaysFreeText("30");
					test.pass("Verified Coupon Code applied and 30 days discount availed");
					Thread.sleep(2000);
					driver.switchTo().frame(0);
					ACP.clickEnterCardNumber();
					ACP.clearEnterCardNumber();
					ACP.enterCardNumber("4242424242424242");
					test.pass("Entered Card Number");
					ACP.enterExpDate("1210");
					test.pass("Entered past Card Expiry Date ");
					ACP.cardsExpiryDateInPastErrorMessage();
					ACP.entercVc("122");
					test.pass("Entered Card cVc");
					ACP.enterZipCode("12345");
					test.pass("Entered Card ZIP code");
					driver.switchTo().defaultContent();
					ACP.clickStartFreeTrialButton();
					test.pass("Clicked on Start free Trial Button");
					driver.switchTo().defaultContent();
					test.pass("verified error message-'Your card's expiration year is in the past.'");
					
					
					
					
			}
				// Enter invalid coupon code and verify the error message
				@Test(priority = 16,invocationCount = 01)
				public void stage_web_aurofit_30daysFree_SignUp_Enter_Invalid_CouponCode() throws InterruptedException {
						
				    	test=extent.createTest("30daysFree-Main Page Valid SignUp do the payment avail offer");
					    test.log(Status.INFO, "30daysFree-Main Page Valid SignUp do the payment avail offer valid SignUp test script started executing");
					    Auro_Home_Page AH=new Auro_Home_Page(driver);
						AH.clickGet30DaysFreeButton();
						test.pass("clicked Get30DaysFree Button");
						//AH.clickstartFreeTrial();
						Thread.sleep(1000);
						
						
					    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
					    Thread.sleep(1000);
						AG.selectBuildStrength();
						test.pass("Selected goal as Build Strength");
						AG.clickNextButton();
						test.pass("Clicked Next Button");
						
						Auro_Level_Page AL=new Auro_Level_Page(driver);
						Thread.sleep(1000);
						AL.selectBeginner();
						test.pass("Selected  level as Beginner");
						AL.clickNextButton();
						test.pass("Clicked Next Button");
						
						Auro_Categories_Page AC=new Auro_Categories_Page(driver);
						AC.selectSpin();
						test.pass("Selected category as Spin");
						AC.clickNextButton();
						test.pass("Clicked Next Button");
						
						Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
						AS.clickEmailTextfield();
						test.pass("Clicked Email Text Field");
						Thread.sleep(1000);
						String Email=System.currentTimeMillis()+"keertheshkunjar"+"@aurotest.com";
						AS.setEmail(Email);
						test.pass("Entered Email -"+Email);
						AS.setPassword("assdf");
						test.pass("Entered Password");
						AS.setFirstName("Thesh");
						test.pass("Entered FirstName");
						
						AS.clickSignUp();
						test.pass("Clicked On SignUP");
						
						Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
						Thread.sleep(1000);
						
						ACP.scrollToElementstartFreeTrialButton();
						Thread.sleep(1000);
						
						ACP.enterCouponCode("BALzANCED");
						test.pass("Entered CouponCode -BALAzNCED");
						ACP.clickApplyButton();
						test.pass("Clicked Apply Button");
						ACP.verifyInvalidCouponCodeMessage();
						test.pass("Verified Invalid Coupon Code");
						Thread.sleep(2000);
						driver.switchTo().frame(0);
						
						
				}
				
				// Login as Unsubscribed user
				@Test(priority = 17,invocationCount = 01)
				public void stage_web_aurofit_30daysFree__SIGNED_UP_UNSUBSCRIBED_USER() throws InterruptedException {
						
				    	test=extent.createTest("30daysFree-Login as Unsubscribed user");
					    test.log(Status.INFO, "30daysFree-Login as Unsubscribed user test script started executing");
					    Auro_Home_Page AH=new Auro_Home_Page(driver);
						AH.clickGet30DaysFreeButton();
						test.pass("clicked Get30DaysFree Button");
						//AH.clickstartFreeTrial();
						Thread.sleep(1000);
						
						
					    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
					    Thread.sleep(1000);
						AG.selectBuildStrength();
						test.pass("Selected goal as Build Strength");
						AG.clickNextButton();
						test.pass("Clicked Next Button");
						
						Auro_Level_Page AL=new Auro_Level_Page(driver);
						Thread.sleep(1000);
						AL.selectBeginner();
						test.pass("Selected  level as Beginner");
						AL.clickNextButton();
						test.pass("Clicked Next Button");
						
						Auro_Categories_Page AC=new Auro_Categories_Page(driver);
						AC.selectSpin();
						test.pass("Selected category as Spin");
						AC.clickNextButton();
						test.pass("Clicked Next Button");
						
						Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
						Thread.sleep(2000);
						
						AS.clickLogin();
						test.pass("Clicked on Login");
						Login_Page LN=new Login_Page(driver);
						LN.clickEmail();
						LN.setEmail("thesh1test@gmail.com");
						test.pass("entered email ");
						LN.clickPassword();
						LN.setPassword("asdf");
						test.pass("entered password ");
						Thread.sleep(2000);
						LN.clickLogin();
						test.pass("Clicked Login ");
						Thread.sleep(10000);
						String actualurl = driver.getCurrentUrl();
						System.out.println(actualurl);
						Assert.assertEquals(actualurl, "https://stage-web.auro.fit/profile/account-details?mpt=f9c7e6ad53bd304ee4ec3a9dc1354509c09f09deef2e98c00fa77e99e9177b05");
						test.pass("Test Script Passed");
						
				}
				
				
				// Login as Unsubscribed user
				@Test(priority = 18,invocationCount = 01)
				public void stage_web_30daysFree_ForgotPassword() throws InterruptedException {
						
				    	test=extent.createTest("30daysFree-Login as Unsubscribed user");
					    test.log(Status.INFO, "30daysFree-Login as Unsubscribed user test script started executing");
					    Auro_Home_Page AH=new Auro_Home_Page(driver);
						AH.clickGet30DaysFreeButton();
						test.pass("clicked Get30DaysFree Button");
						//AH.clickstartFreeTrial();
						Thread.sleep(1000);
						
					    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
					    Thread.sleep(1000);
						AG.selectBuildStrength();
						test.pass("Selected goal as Build Strength");
						AG.clickNextButton();
						test.pass("Clicked Next Button");
						
						Auro_Level_Page AL=new Auro_Level_Page(driver);
						Thread.sleep(1000);
						AL.selectBeginner();
						test.pass("Selected  level as Beginner");
						AL.clickNextButton();
						test.pass("Clicked Next Button");
						
						Auro_Categories_Page AC=new Auro_Categories_Page(driver);
						AC.selectSpin();
						test.pass("Selected category as Spin");
						AC.clickNextButton();
						test.pass("Clicked Next Button");
						
						
						Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
						Thread.sleep(2000);
						AS.clickLogin();
						test.pass("Clicked on Login");
						Auro_ForgotYourPassWord_Page AFP =new Auro_ForgotYourPassWord_Page(driver);
						Thread.sleep(2000);
						AFP.clickforgotYourPasswordLink();
						test.pass("Clicked Forgot Password Link");
						Thread.sleep(2000);
						AFP.clickiAgreeButton();
						Thread.sleep(2000);
						AFP.enteremailTextField("keertheshkunjar@gmail.com");
						test.pass("entered email");
						AFP.clickSendPasswordButton();
						test.pass("clicked Send Password Button");
						AFP.insructionsForPasswordText();
						test.pass("verified insructions For Password Text");
						
					//
						
				}
				
				// verify enter Valid Email Error message
				@Test(priority = 19,invocationCount = 01)
				public void stage_web_aurofit_30daysFree_verify_Enter_Valid_Email_Error_Message() throws InterruptedException {
						
				    	test=extent.createTest("30daysFree-Login as Unsubscribed user");
					    test.log(Status.INFO, "30daysFree-Login as Unsubscribed user test script started executing");
					    Auro_Home_Page AH=new Auro_Home_Page(driver);
						AH.clickGet30DaysFreeButton();
						test.pass("clicked Get30DaysFree Button");
						//AH.clickstartFreeTrial();
						Thread.sleep(1000);
						
						
					    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
					    Thread.sleep(1000);
						AG.selectBuildStrength();
						test.pass("Selected goal as Build Strength");
						AG.clickNextButton();
						test.pass("Clicked Next Button");
						
						Auro_Level_Page AL=new Auro_Level_Page(driver);
						Thread.sleep(1000);
						AL.selectBeginner();
						test.pass("Selected  level as Beginner");
						AL.clickNextButton();
						test.pass("Clicked Next Button");
						
						Auro_Categories_Page AC=new Auro_Categories_Page(driver);
						AC.selectSpin();
						test.pass("Selected category as Spin");
						AC.clickNextButton();
						test.pass("Clicked Next Button");
						
						Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
						AS.clickEmailTextfield();
						test.pass("Clicked Email Text Field");
						Thread.sleep(1000);
						String Email="aurotest.com";
						AS.setEmail(Email);
						test.pass("Entered Email -"+Email);
						AS.setPassword("assdf");
						test.pass("Entered Password");
						AS.setFirstName("Thesh");
						test.pass("Entered FirstName");
						
						AS.clickSignUp();
						test.pass("Clicked On SignUP");
						AS.verifyenterValidEmailErrormessageText("Please enter a valid email address.");
						test.pass("verified 'Please enter a valid email address.' error message");
						
				}
				
				// verify enter password Error message
				@Test(priority = 20,invocationCount = 01)
				public void stage_web_aurofit_30daysFree_verify_Enter_Password_Error_Message() throws InterruptedException {
						
				    	test=extent.createTest("30daysFree-Login as Unsubscribed user");
					    test.log(Status.INFO, "30daysFree-Login as Unsubscribed user test script started executing");
					    Auro_Home_Page AH=new Auro_Home_Page(driver);
						AH.clickGet30DaysFreeButton();
						test.pass("clicked Get30DaysFree Button");
						//AH.clickstartFreeTrial();
						Thread.sleep(1000);
						
					    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
					    Thread.sleep(1000);
						AG.selectBuildStrength();
						test.pass("Selected goal as Build Strength");
						AG.clickNextButton();
						test.pass("Clicked Next Button");
						
						Auro_Level_Page AL=new Auro_Level_Page(driver);
						Thread.sleep(1000);
						AL.selectBeginner();
						test.pass("Selected  level as Beginner");
						AL.clickNextButton();
						test.pass("Clicked Next Button");
						
						Auro_Categories_Page AC=new Auro_Categories_Page(driver);
						AC.selectSpin();
						test.pass("Selected category as Spin");
						AC.clickNextButton();
						test.pass("Clicked Next Button");
						
						Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
						AS.clickEmailTextfield();
						test.pass("Clicked Email Text Field");
						Thread.sleep(1000);
						String Email="au@rotest.com";
						AS.setEmail(Email);
						test.pass("Entered Email -"+Email);
						AS.setPassword("");
						test.pass("Entered no Password");
						AS.setFirstName("Thesh");
						test.pass("Entered FirstName");
						
						AS.clickSignUp();
						test.pass("Clicked On SignUP");
						AS.verifypleaseEnterPasswordError("Please enter your password");
						test.pass("verified 'Please enter your password' error message");
						
				}
	//Login with valid credentials
	 @Test(invocationCount = 0)
   public void Stage_web_30daysFreeLoGin_select_LoseWeight_Beginner_Spin_Availoffer_Dothe_Payment() throws InterruptedException, IOException {
		
		 
		Auro_Home_Page AH=new Auro_Home_Page(driver);
		AH.clickGet30DaysFreeButton();
		//AH.clickstartFreeTrial();
		Thread.sleep(1000);
		
		
		
		Thread.sleep(1000);
	    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
		AG.selectLoseweight();
		AG.clickNextButton();
		
		Auro_Level_Page AL=new Auro_Level_Page(driver);
		Thread.sleep(1000);
		AL.selectBeginner();
		AL.clickNextButton();
		
		Auro_Categories_Page AC=new Auro_Categories_Page(driver);
		Thread.sleep(1000);
		AC.selectSpin();
		AC.clickNextButton();
		
		Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
		Thread.sleep(2000);
		AS.clickLogin();
		
		
		Login_Page LN=new Login_Page(driver);
		LN.clickEmail();
		LN.setEmail(validemail1);
		LN.clickPassword();
		LN.setPassword(validpassword1);
		Thread.sleep(2000);
		LN.clickLogin();
		Thread.sleep(7000);
		String actualurl = driver.getCurrentUrl();
		System.out.println(actualurl);
		Assert.assertEquals(actualurl, "");
		
		
		
}
}
