package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import generic.Precondition;
import pom.Auro_Checkout_Page;
import pom.Auro_new_member_offer;

public class Stage_web_newMem_40per_Off extends Precondition {

	

	
	//enter Already Registered mail and verify error message
	@Test(priority = 1,invocationCount = 1)
	public void enterAlreadyRegisteredmailid_and_verify_errormessage() throws InterruptedException {
		
		test=extent.createTest("new Mem_40per_Off-Enter already registered email id and verify-You cannot avail this offer as you are a subscribed user. Please contact support@auro.fit for further assistance.error message");
	    test.log(Status.INFO, "new Mem_40per_Off-Enter already registered email id and verify-You cannot avail this offer as you are a subscribed user. Please contact support@auro.fit for further assistance. Script started executing");
		Auro_new_member_offer ANM = new Auro_new_member_offer(driver);
		ANM.moveToGetAuroPremium();
		test.pass("Scrolled to Get Auro Premium");
		ANM.setMailid(validemail1);
		test.pass("entered email id-->"+validemail1);
		ANM.clickGetAuroPremium();
		test.pass("Clicked Get Auro Premium");
		ANM.verifyalreadyRegisterederrormessagewithLink(10, "You cannot avail this offer as you are a subscribed user. Please contact support@auro.fit for further assistance.");
		test.pass("verified-You cannot avail this offer as you are a subscribed user. Please contact support@auro.fit for further assistance.");
	}
	
	
	
	//verify 25 percentage Off
			@Test(priority = 2,invocationCount = 1)
			public void verify25perOff() throws InterruptedException {
				
				Auro_new_member_offer ANM = new Auro_new_member_offer(driver);
				test=extent.createTest("new Mem_40per_Off-verify 'Get 50% off premium fitness & wellness' text.");
			    test.log(Status.INFO, "new Mem_40per_Off-verify 'Get 50% off premium fitness & wellness' text. Script started executing.");
			    ANM.verify40PerOffText("Get 40% off premium fitness & wellness");
				test.pass("verified -'Get 40% off premium fitness & wellness' text.");
			}
	
	
	//enter not Registered mail id  and verify error message
	@Test(priority = 3,invocationCount = 1)
	public void enternotRegisteredmailid_and_verify_errormessage() {
		
		test=extent.createTest("new Mem_40per_Off-Enter Un  registered email id and verify-You're not a registered user. Please provide a password for registering your account.error message");
	    test.log(Status.INFO, "new Mem_40per_Off-Enter Un  registered email id and verify-You're not a registered user. Please provide a password for registering your account.error message. Script started executing");
		Auro_new_member_offer ANM = new Auro_new_member_offer(driver);
		ANM.moveToGetAuroPremium();
		test.pass("Scrolled to Get Auro Premium");
		ANM.setMailid(System.currentTimeMillis()+"@gmail.com");
		test.pass("Enter valid email id");
		ANM.clickGetAuroPremium();
		test.pass("Clicked Get Auro Premium Button");
		ANM.verifynotRegisterederrormessage(10, "You're not a registered user. Please provide a password for registering your account");
		test.pass("Verified -You're not a registered user. Please provide a password for registering your account.-error message");
	
	}
	
	
	//enter invalid email address  and 
	//verify error message  "Please enter a valid email address."
		@Test(priority = 4,invocationCount =1)
		public void enterInValidEmailAddress_and_verify_errormessage() {
			
			test=extent.createTest("new Mem_40per_Off-Enter In valid email id and verify-'Please enter a valid email address'.error message");
		    test.log(Status.INFO, "new Mem_40per_Off-Enter In valid email id and verify-'Please enter a valid email address'.error message. Script started executing");
			Auro_new_member_offer ANM = new Auro_new_member_offer(driver);
			ANM.moveToGetAuroPremium();
			test.pass("Scrolled to Get Auro Premium");
			ANM.setMailid(System.currentTimeMillis()+"gmail.com");
			test.pass("Entered Invalid Email id");
			ANM.clickGetAuroPremium();
			test.pass("Clicked Auro Premium Button");
			Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
			ANM.verifyentervalidmailerrormessage(10, "Please enter a valid email address.");
			test.pass("Verified 'Please enter a valid email address.' Error message");
		}
		
		//enter NO email address  and verify error message "This field is required."
				@Test(priority = 5,invocationCount =1)
				public void enterN0EmailAddress_and_verify_errormessage() {
					
					test=extent.createTest("new Mem_40per_Off-Enter no Email id and verify 'This field is required.' error message");
				    test.log(Status.INFO, "new Mem_40per_Off-Enter no Email id and verify 'This field is required.' error message. Script started executing");
					Auro_new_member_offer ANM = new Auro_new_member_offer(driver);
					ANM.moveToGetAuroPremium();
					test.pass("Scrolled to Get Auro Premium");
					ANM.clickGetAuroPremium();
					test.pass("Clicked  Get Auro Premium Button");
					ANM.newmemberEnterNOEmailAddress_verify_ErrorMessage("This field is required.");
					test.pass("veified 'This field is required.' error message");
				
				}
				
				//enter NO Password  and verify error message "This field is required."
				@Test(priority =6,invocationCount =1)
				public void enterNOpassword_and_verify_errormessage() {
					
					test=extent.createTest("new Mem_40per_Off-Enter no Password and verify 'This field is required.' error message");
				    test.log(Status.INFO, "new Mem_40per_Off-Enter no Password and verify 'This field is required.' error message. Script started executing");
					Auro_new_member_offer ANM = new Auro_new_member_offer(driver);
					ANM.moveToGetAuroPremium();
					test.pass("Scrolled to Get Auro Premium");
					ANM.setMailid(System.currentTimeMillis()+"@gmail.com");
					test.pass("Entered Invalid Email id");
					ANM.clickGetAuroPremium();
					test.pass("Clicked  Get Auro Premium Button");
					ANM.verify50PerOffNoPasswordText("You're not a registered user. Please provide a password for registering your account");
					test.pass("veified 'This field is required.' error message");
				
				}
	
	
	          //new member Valid register make payment 
			  @Test(priority = 7,invocationCount = 1)
		   	public void validRegister_Payment_new_member() throws InterruptedException {
				
				  

					test=extent.createTest("new Mem_40per_Off-Enter Valid Credentials Make payment and avail 50% OFF");
					test.log(Status.INFO, "new Mem_40per_Off-Enter Valid Credentials Make payment and avail 50% OFF. Script started executing");
					Auro_new_member_offer ANM = new Auro_new_member_offer(driver);
					ANM.moveToGetAuroPremium();
					test.pass("Scrolled to Get Auro Premium");
					Thread.sleep(2000);
					String Email=System.currentTimeMillis()+"thesh@aurotest.com";
					ANM.setMailid(Email);
					test.pass("Entered Valid Email-"+Email);
					Thread.sleep(2000);
					Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
					driver.switchTo().frame(0);
					Thread.sleep(2000);
					ACP.clickEnterCardNumber();
					ACP.clearEnterCardNumber();
					ACP.enterCardNumber("4242424242424242");
					test.pass("Entered Cardnumber-4242424242424242");
					ACP.enterExpDate("1221");
					test.pass("Entered Card Expiry Date-1221");
					ACP.entercVc("122");
					test.pass("Entered Card cVc-122");
					ACP.enterZipCode("12345");
					test.pass("Entered ZipCode-12345");
					driver.switchTo().defaultContent();
					ANM.setPassword("asdf");
					test.pass("Entered Password-asdf");
					ANM.clickGetAuroPremium();
					test.pass("Clicked Get Auro Premium");
					Thread.sleep(10000);
					String actualurl = driver.getCurrentUrl();
					System.out.println(actualurl);
					Assert.assertEquals(actualurl, "https://stage-web.auro.fit/40-off/signup-success");
					test.pass("verified 50% OFF valid  signup Success");
			}
	
	
	//Enter the Expired Card Credentials And verify "Your card has expired." Error Message
			@Test(priority = 8,invocationCount = 1)
			public void new_Member_enterEmail_password_Dothe_Payment_Entering_Expired_Card_Credentials() throws InterruptedException {
				
				test=extent.createTest("new Mem_40per_Off-Enter Expired Card credentials and verify -'Your card has expired.' Error message");
				test.log(Status.INFO, "new Mem_40per_Off-Enter Expired Card credentials and verify -'Your card has expired.' Error message. Script started executing");
				Auro_new_member_offer ANM = new Auro_new_member_offer(driver);
				ANM.moveToGetAuroPremium();
				test.pass("Scrolled to Get Auro Premium");
				Thread.sleep(2000);
				String Email=System.currentTimeMillis()+"thesh@aurotest.com";
				ANM.setMailid(Email);
				test.pass("Entered Valid Email-"+Email);
				Thread.sleep(2000);
				Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
				driver.switchTo().frame(0);
				Thread.sleep(2000);
				ACP.clickEnterCardNumber();
				ACP.clearEnterCardNumber();
				ACP.enterCardNumber("4000000000000069");
				test.pass("Entered Cardnumber-4000000000000069");
				ACP.enterExpDate("1221");
				test.pass("Entered Card Expiry Date-1221");
				ACP.entercVc("122");
				test.pass("Entered Card cVc-122");
				ACP.enterZipCode("12345");
				test.pass("Entered ZipCode-12345");
				driver.switchTo().defaultContent();
				ANM.setPassword("asdf");
				test.pass("Entered Password-asdf");
				ANM.clickGetAuroPremium();
				test.pass("Clicked Get Auro Premium");
				Thread.sleep(10000);
				ACP.verifyExpiredCardMessage("Your card has expired.");
				test.pass("verified-'Your card has expired.' Error message ");
				
}
			
			//Enter the Card Credentials And verify "Your card's security code is incorrect." Error Message
			@Test(priority = 9,invocationCount = 1)
			public void new_Member_enterEmail_password_othe_Payment_Entering_Credentials_Incorrect_Security_Code() throws InterruptedException {
				test=extent.createTest("new Mem_40per_Off-Enter  Card credentials and verify -'Your card's security code is incorrect.' Error message");
				test.log(Status.INFO, "new Mem_40per_Off-Enter Expired Card credentials and verify -'Your card's security code is incorrect.' Error message. Script started executing");
				Auro_new_member_offer ANM = new Auro_new_member_offer(driver);
				ANM.moveToGetAuroPremium();
				test.pass("Scrolled to Get Auro Premium");
				Thread.sleep(2000);
				String Email=System.currentTimeMillis()+"thesh@aurotest.com";
				ANM.setMailid(Email);
				test.pass("Entered Valid Email-"+Email);
				Thread.sleep(2000);
				Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
				driver.switchTo().frame(0);
				Thread.sleep(2000);
				ACP.clickEnterCardNumber();
				ACP.clearEnterCardNumber();
				ACP.enterCardNumber("4000000000000127");
				test.pass("Entered Cardnumber-4000000000000127");
				ACP.enterExpDate("1221");
				test.pass("Entered Card Expiry Date-1221");
				ACP.entercVc("122");
				test.pass("Entered Card cVc-122");
				ACP.enterZipCode("12345");
				test.pass("Entered ZipCode-12345");
				driver.switchTo().defaultContent();
				ANM.setPassword("asdf");
				test.pass("Entered Password-asdf");
				ANM.clickGetAuroPremium();
				test.pass("Clicked Get Auro Premium");
				Thread.sleep(10000);
				ACP.verifyIncorrectSecurityCodeMessage("Your card's security code is incorrect.");
				test.pass("verified-'In correct security Code' error message. ");
				
			}
			
			//Enter the  Card Credentials And verify "Your card number is invalid."
			@Test(priority = 10,invocationCount = 1)
			public void new_Member_enterEmail_password_Dothe_Payment_Entering_Credentials_Invalid_CardNumber_ErrorMessage() throws InterruptedException {
				
				test=extent.createTest("new Mem_40per_Off-Enter  Card credentials and verify -'Your card number is invalid.' Error message");
				test.log(Status.INFO, "new Mem_40per_Off-Enter Expired Card credentials and verify -'Your card number is invalid.' Error message. Script started executing");
				Auro_new_member_offer ANM = new Auro_new_member_offer(driver);
				ANM.moveToGetAuroPremium();
				test.pass("Scrolled to Get Auro Premium");
				Thread.sleep(2000);
				String Email=System.currentTimeMillis()+"thesh@aurotest.com";
				ANM.setMailid(Email);
				test.pass("Entered Valid Email-"+Email);
				Thread.sleep(2000);
				Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
				driver.switchTo().frame(0);
				Thread.sleep(2000);
				ACP.clickEnterCardNumber();
				ACP.clearEnterCardNumber();
				ACP.enterCardNumber("4242424242424241");
				test.pass("Entered Cardnumber-4242424242424241");
				ACP.enterExpDate("1221");
				test.pass("Entered Card Expiry Date-1221");
				ACP.entercVc("122");
				test.pass("Entered Card cVc-122");
				ACP.enterZipCode("12345");
				test.pass("Entered ZipCode-12345");
				driver.switchTo().defaultContent();
				ANM.setPassword("asdf");
				test.pass("Entered Password-asdf");
				ANM.clickGetAuroPremium();
				test.pass("Clicked Get Auro Premium");
				Thread.sleep(10000);
				ACP.verifyInvalidCardNumber("Your card number is invalid.");
				test.pass("verified-'Your card number is invalid.' error message. ");
				
				
					
		
				}
			
			//Enter the  Card Credentials And verify "An error occurred while processing your card. Try again in a little bit." Error Message. 
			@Test(priority = 11,invocationCount = 1)
			public void new_Member_enterEmail_password_Dothe_Payment_Entering_Credentials_Error_while_processing_the_card1() throws InterruptedException {
			
				test=extent.createTest("new Mem_40per_Off-Enter  Card credentials and verify -'An error occurred while processing your card. Try again in a little bit.' Error message");
				test.log(Status.INFO, "new Mem_40per_Off-Enter Expired Card credentials and verify -'An error occurred while processing your card. Try again in a little bit.' Error message. Script started executing");
				Auro_new_member_offer ANM = new Auro_new_member_offer(driver);
				ANM.moveToGetAuroPremium();
				test.pass("Scrolled to Get Auro Premium");
				Thread.sleep(2000);
				String Email=System.currentTimeMillis()+"thesh@aurotest.com";
				ANM.setMailid(Email);
				test.pass("Entered Valid Email-"+Email);
				Thread.sleep(2000);
				Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
				driver.switchTo().frame(0);
				Thread.sleep(2000);
				ACP.clickEnterCardNumber();
				ACP.clearEnterCardNumber();
				ACP.enterCardNumber("4000000000000119");
				test.pass("Entered Cardnumber-4000000000000119");
				ACP.enterExpDate("1221");
				test.pass("Entered Card Expiry Date-1221");
				ACP.entercVc("122");
				test.pass("Entered Card cVc-122");
				ACP.enterZipCode("12345");
				test.pass("Entered ZipCode-12345");
				driver.switchTo().defaultContent();
				ANM.setPassword("asdf");
				test.pass("Entered Password-asdf");
				ANM.clickGetAuroPremium();
				test.pass("Clicked Get Auro Premium");
				Thread.sleep(10000);
				ACP.verifyProcessingErrorMessageVisible();
				test.pass("verified-'An error occurred while processing your card. Try again in a little bit.' error message. ");
				
			}
			
			//Enter incomplete ZIP Code and Verify "Your postal code is incomplete." Error Message 
			@Test(priority = 12,invocationCount = 1)
			public void new_Member_enterEmail_password_Dothe_Payment_Incomplete_ZIP_Code_verifyErrorMessage() throws InterruptedException {
				
				test=extent.createTest("new Mem_40per_Off-Enter  In complete ZIP Code  and verify -'Your postal code is incomplete.' Error message");
				test.log(Status.INFO, "new Mem_40per_Off-Enter  In complete ZIP Code  and verify -'Your postal code is incomplete.' Error message. Script started executing");
				Auro_new_member_offer ANM = new Auro_new_member_offer(driver);
				ANM.moveToGetAuroPremium();
				test.pass("Scrolled to Get Auro Premium");
				Thread.sleep(2000);
				String Email=System.currentTimeMillis()+"thesh@aurotest.com";
				ANM.setMailid(Email);
				test.pass("Entered Valid Email-"+Email);
				Thread.sleep(2000);
				Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
				driver.switchTo().frame(0);
				Thread.sleep(2000);
				ACP.clickEnterCardNumber();
				ACP.clearEnterCardNumber();
				ACP.enterCardNumber("4242424242424242");
				test.pass("Entered Cardnumber-4242424242424242");
				ACP.enterExpDate("1221");
				test.pass("Entered Card Expiry Date-1221");
				ACP.entercVc("122");
				test.pass("Entered Card cVc-122");
				ACP.enterZipCode("123");
				test.pass("Entered ZipCode-123");
				driver.switchTo().defaultContent();
				ANM.setPassword("asdf");
				test.pass("Entered Password-asdf");
				ANM.clickGetAuroPremium();
				test.pass("Clicked Get Auro Premium");
				Thread.sleep(10000);
				ANM.verifyNewMemberIncomletePostalCodeError("Your postal code is incomplete.");
				test.pass("verified-'Your postal code is incomplete.' error message. ");
				
			
		}
			
			//Enter incomplete card number and verify "Your card number is incomplete." Error message
			@Test(priority = 13,invocationCount = 1)
            public void new_Member_enterEmail_password_Dothe_Payment_Entering_IncompleteCardNumber_Verify_ErrorMessage() throws InterruptedException {
			
				test=extent.createTest("new Mem_40per_Off-Enter  In complete Card number  and verify -'Your card number is incomplete.' Error message");
				test.log(Status.INFO, "new Mem_40per_Off-Enter   In complete Card number  and verify -'Your card number is incomplete.' Error message. Script started executing");
				Auro_new_member_offer ANM = new Auro_new_member_offer(driver);
				ANM.moveToGetAuroPremium();
				test.pass("Scrolled to Get Auro Premium");
				Thread.sleep(2000);
				String Email=System.currentTimeMillis()+"thesh@aurotest.com";
				ANM.setMailid(Email);
				test.pass("Entered Valid Email-"+Email);
				Thread.sleep(2000);
				Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
				driver.switchTo().frame(0);
				Thread.sleep(2000);
				ACP.clickEnterCardNumber();
				ACP.clearEnterCardNumber();
				ACP.enterCardNumber("4242424242");
				test.pass("Entered Cardnumber-4242424242");
				ACP.enterExpDate("1221");
				test.pass("Entered Card Expiry Date-1221");
				ACP.entercVc("122");
				test.pass("Entered Card cVc-122");
				ACP.enterZipCode("123");
				test.pass("Entered ZipCode-123");
				driver.switchTo().defaultContent();
				ANM.setPassword("asdf");
				test.pass("Entered Password-asdf");
				ANM.clickGetAuroPremium();
				test.pass("Clicked Get Auro Premium");
				Thread.sleep(10000);
				ACP.verifyIncomleteCardNumberError("Your card number is incomplete.");
				test.pass("verified-'Your card number is incomplete.' error message. ");
				
			
			
				
			
			}
			
			
			//Enter incomplete CvC Code and Verify "Your card's security code is incomplete." Error Message 
			@Test(priority = 14,invocationCount = 1)
			public void new_Member_enterEmail_password_Dothe_Payment_Incomplete_CvC_Code_verifyErrorMessage() throws InterruptedException {
				test=extent.createTest("new Mem_40per_Off-Enter  In complete Security code  and verify -'Your card's security code is incomplete.' Error message");
				test.log(Status.INFO, "new Mem_40per_Off-Enter   In complete Security code  and verify -'Your card's security code is incomplete.' Error message. Script started executing");
				Auro_new_member_offer ANM = new Auro_new_member_offer(driver);
				ANM.moveToGetAuroPremium();
				test.pass("Scrolled to Get Auro Premium");
				Thread.sleep(2000);
				String Email=System.currentTimeMillis()+"thesh@aurotest.com";
				ANM.setMailid(Email);
				test.pass("Entered Valid Email-"+Email);
				Thread.sleep(2000);
				Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
				driver.switchTo().frame(0);
				Thread.sleep(2000);
				ACP.clickEnterCardNumber();
				ACP.clearEnterCardNumber();
				ACP.enterCardNumber("4242424242424242");
				test.pass("Entered Cardnumber-4242424242424242");
				ACP.enterExpDate("1221");
				test.pass("Entered Card Expiry Date-1221");
				ACP.entercVc("1");
				test.pass("Entered Card cVc-1");
				ACP.enterZipCode("123");
				test.pass("Entered ZipCode-123");
				driver.switchTo().defaultContent();
				ANM.setPassword("asdf");
				test.pass("Entered Password-asdf");
				ANM.clickGetAuroPremium();
				test.pass("Clicked Get Auro Premium");
				Thread.sleep(10000);
				ANM.newmemberverifyIncomleteSecurityCodeError("Your card's security code is incomplete.");
				test.pass("verified-'Your card's security code is incomplete.' ");
			
		}
			
			//Enter incomplete expiration date and Verify "Your card's expiration date is incomplete." Error Message 
			@Test(priority = 15,invocationCount = 1)
			public void new_Member_enterEmail_password_Dothe_Payment_Incomplete_Expiredate_verifyErrorMessage() throws InterruptedException {
				
				test=extent.createTest("new Mem_40per_Off-Enter  In complete Expiry Date  and verify -'Your card's expiration date is incomplete.' Error message");
				test.log(Status.INFO, "new Mem_40per_Off-Enter   In complete Expiry Date   and verify -'Your card's expiration date is incomplete.' Error message. Script started executing");
				Auro_new_member_offer ANM = new Auro_new_member_offer(driver);
				ANM.moveToGetAuroPremium();
				test.pass("Scrolled to Get Auro Premium");
				Thread.sleep(2000);
				String Email=System.currentTimeMillis()+"thesh@aurotest.com";
				ANM.setMailid(Email);
				test.pass("Entered Valid Email-"+Email);
				Thread.sleep(2000);
				Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
				driver.switchTo().frame(0);
				Thread.sleep(2000);
				ACP.clickEnterCardNumber();
				ACP.clearEnterCardNumber();
				ACP.enterCardNumber("4242424242424242");
				test.pass("Entered Cardnumber-4242424242424242");
				ACP.enterExpDate("12");
				test.pass("Entered Card Expiry Date-12");
				ACP.entercVc("123");
				test.pass("Entered Card cVc-1");
				ACP.enterZipCode("12345");
				test.pass("Entered ZipCode-12345");
				driver.switchTo().defaultContent();
				ANM.setPassword("asdf");
				test.pass("Entered Password-asdf");
				ANM.clickGetAuroPremium();
				test.pass("Clicked Get Auro Premium");
				Thread.sleep(10000);
				ANM.newmemberverifyIncompleteCardExpiryDate("Your card's expiration date is incomplete.");
				test.pass("verified-'Your card's expiration date is incomplete.' ");
		
				}
			
			//Enter  expiration date and Verify "Your card's expiration year is in the past." Error Message 
			@Test(priority = 16,invocationCount = 1)
			public void new_Member_enterEmail_password_Dothe_Payment__ExpiredateInThePast_verifyErrorMessage() throws InterruptedException {
		
				test=extent.createTest("new Mem_40per_Off-Enter past expiration date and Verify \"Your card's expiration year is in the past.\" Error Message ");
				test.log(Status.INFO, "new Mem_40per_Off-Enter past expiration date and Verify \"Your card's expiration year is in the past.\" Error Message ");
				Auro_new_member_offer ANM = new Auro_new_member_offer(driver);
				ANM.moveToGetAuroPremium();
				test.pass("Scrolled to Get Auro Premium");
				Thread.sleep(2000);
				String Email=System.currentTimeMillis()+"thesh@aurotest.com";
				ANM.setMailid(Email);
				test.pass("Entered Valid Email-"+Email);
				Thread.sleep(2000);
				Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
				driver.switchTo().frame(0);
				Thread.sleep(2000);
				ACP.clickEnterCardNumber();
				ACP.clearEnterCardNumber();
				ACP.enterCardNumber("4242424242424242");
				test.pass("Entered Cardnumber-4242424242424242");
				ACP.enterExpDate("1209");
				test.pass("Entered Card Expiry Date-1209");
				ACP.entercVc("123");
				test.pass("Entered Card cVc-1");
				ACP.enterZipCode("12345");
				test.pass("Entered ZipCode-12345");
				driver.switchTo().defaultContent();
				ANM.setPassword("asdf");
				test.pass("Entered Password-asdf");
				ANM.clickGetAuroPremium();
				test.pass("Clicked Get Auro Premium");
				Thread.sleep(10000);
				ANM.verifynewmemberExpirationDateIsInThePastErrorMessage("Your card's expiration year is in the past.");
				test.pass("verified-'Your card's expiration year is in the past.' ");
				
		}
			 
			//Enter  expiration date and Verify "Your card's expiration year is invalid." Error Message 
			@Test(priority = 17,invocationCount = 1)
              public void new_Member_enterEmail_password_Dothe_Payment__ExpirationYearIsInvalid_verifyErrorMessage() throws InterruptedException {
				
				test=extent.createTest("new Mem_40per_Off-Enter In valid expiration date and Verify \"Your card's expiration year is invalid.\" Error Message ");
				test.log(Status.INFO, "new Mem_40per_Off-Enter In valid expiration date and Verify \"Your card's expiration year is invalid.\" Error Message ");
				Auro_new_member_offer ANM = new Auro_new_member_offer(driver);
				ANM.moveToGetAuroPremium();
				test.pass("Scrolled to Get Auro Premium");
				Thread.sleep(2000);
				String Email=System.currentTimeMillis()+"thesh@aurotest.com";
				ANM.setMailid(Email);
				test.pass("Entered Valid Email-"+Email);
				Thread.sleep(2000);
				Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
				driver.switchTo().frame(0);
				Thread.sleep(2000);
				ACP.clickEnterCardNumber();
				ACP.clearEnterCardNumber();
				ACP.enterCardNumber("4242424242424242");
				test.pass("Entered Cardnumber-4242424242424242");
				ACP.enterExpDate("1299");
				test.pass("Entered Card Expiry Date-1299");
				ACP.entercVc("123");
				test.pass("Entered Card cVc-123");
				ACP.enterZipCode("12345");
				test.pass("Entered ZipCode-12345");
				driver.switchTo().defaultContent();
				ANM.setPassword("asdf");
				test.pass("Entered Password-asdf");
				ANM.clickGetAuroPremium();
				test.pass("Clicked Get Auro Premium");
				Thread.sleep(10000);
				ANM.verifynewmemberExpirationDateIsInvalidErrorMessage("Your card's expiration year is invalid.");
				test.pass("verified-'Your card's expiration year is invalid.' ");
		
				
			}
}
