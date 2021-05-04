package testscript;

import org.testng.annotations.Test;

import generic.Precondition;
import pom.Auro_Categories_Page;
import pom.Auro_Checkout_Page;
import pom.Auro_Gift_Congratulation;
import pom.Auro_Goals_Page;
import pom.Auro_Home_Page;
import pom.Auro_Level_Page;
import pom.Auro_SignUp_Page;
import pom.Auro_new_member_offer;
import pom.GivetheGiftofFitness_Page;

public class Auro_Gift_Page extends Precondition {
	
	//gift card of 1 Month Plan
	@Test(invocationCount = 01)
	public void gift_Of_Fitness_1Month_Plan() throws InterruptedException   {
		
		GivetheGiftofFitness_Page GGF=new GivetheGiftofFitness_Page(driver);
		GGF.selectVisibletext("1-month plan at ₹99");
		GGF.getTextgiveTheGiftofFitness("Give the Gift of Fitness ");
		GGF.getShareTheBenefits("Share the benefits of an on-demand audio personal trainer with your friends, family or anyone else.");
		GGF.getTextunlockThePlan("Unlock a 1-month or a 12-month subscription to Auro Premium with unlimited access to our ever-increasing fitness content. ");
		GGF.setRecipientName("Batista");
		GGF.setRecipientEmail("ba123%@aurotest.com");
		GGF.setGiftMessage("Float like a Butterfly Sting Like a Bee");
		GGF.setgiftCardSenderName("asdf");
		GGF.setgiftCardSenderEmail("bn12@aurotest.com");
		
		
		Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		ACP.clickEnterCardNumber();
		ACP.clearEnterCardNumber();
		ACP.enterCardNumber("4242424242424242");
		ACP.enterExpDate("1221");
		ACP.entercVc("122");
		ACP.enterZipCode("12345");
		driver.switchTo().defaultContent();
		GGF.clicksendGiftCardButton();
		Thread.sleep(7000);
		Auro_Gift_Congratulation AGC=new Auro_Gift_Congratulation(driver);
		AGC.verifyCongratulationText("Thank you for sending the gift of fitness. ");
		
	}
	
	//gift card of 12 Month Plan
     	@Test(invocationCount = 0)
        public void gift_Of_Fitness_12Month_Plan() throws InterruptedException   {
		
		GivetheGiftofFitness_Page GGF=new GivetheGiftofFitness_Page(driver);
		GGF.selectVisibletext("12-month plan at ₹365");
		GGF.getTextgiveTheGiftofFitness("Give the Gift of Fitness ");
		GGF.getShareTheBenefits("Share the benefits of an on-demand audio personal trainer with your friends, family or anyone else.");
		GGF.getTextunlockThePlan("Unlock a 1-month or a 12-month subscription to Auro Premium with unlimited access to our ever-increasing fitness content. ");
		GGF.setRecipientName("Batista");
		GGF.setRecipientEmail("keertheshkunjar@aurotest.com");
		GGF.setGiftMessage("Float like a Butterfly Sting Like a Bee");
		GGF.setgiftCardSenderName("asdf");
		GGF.setgiftCardSenderEmail("srimayis2000@aurotest.com");
		
		
		Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		ACP.clickEnterCardNumber();
		ACP.clearEnterCardNumber();
		ACP.enterCardNumber("4242424242424242");
		ACP.enterExpDate("1221");
		ACP.entercVc("122");
		ACP.enterZipCode("12345");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		GGF.clicksendGiftCardButton();
		Thread.sleep(7000);
		Auro_Gift_Congratulation AGC=new Auro_Gift_Congratulation(driver);
		AGC.verifyCongratulationText("Thank you for sending the gift of fitness. ");
     	}
     	
	
	
	
	//Enter the Expired Card Credentials And verify "Your card has expired." Error Message
			@Test(priority = 0,invocationCount = 0)
			public void gift_of_fitness_Dothe_Payment_Entering_Expired_Card_Credentials() throws InterruptedException {
				
				
				GivetheGiftofFitness_Page GGF=new GivetheGiftofFitness_Page(driver);
				GGF.selectVisibletext("12-month plan at ₹365");
				GGF.getTextgiveTheGiftofFitness("Give the Gift of Fitness ");
				GGF.getShareTheBenefits("Share the benefits of an on-demand audio personal trainer with your friends, family or anyone else.");
				GGF.getTextunlockThePlan("Unlock a 1-month or a 12-month subscription to Auro Premium with unlimited access to our ever-increasing fitness content. ");
				GGF.setRecipientName("Batista");
				GGF.setRecipientEmail("ba123%@aurotest.com");
				GGF.setGiftMessage("Float like a Butterfly Sting Like a Bee");
				GGF.setgiftCardSenderName("asdf");
				GGF.setgiftCardSenderEmail("bn12@aurotest.com");
				Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
				
				driver.switchTo().frame(0);
				ACP.clickEnterCardNumber();
				ACP.clearEnterCardNumber();
				ACP.enterCardNumber("4000000000000069");
				ACP.enterExpDate("1221");
				ACP.entercVc("122");
				ACP.enterZipCode("12345");
				driver.switchTo().defaultContent();
				Thread.sleep(3000);
				GGF.clicksendGiftCardButton();
				Thread.sleep(1000);
				ACP.verifyExpiredCardMessage("Your card has expired.");
				
		}
			
			//Enter the Card Credentials And verify "Your card's security code is incorrect." Error Message
					@Test(priority = 0,invocationCount = 0)
					public void gift_of_fitness_Dothe_Payment_Entering_Credentials_Incorrect_Security_Code() throws InterruptedException {
						
						GivetheGiftofFitness_Page GGF=new GivetheGiftofFitness_Page(driver);
						GGF.selectVisibletext("12-month plan at ₹365");
						GGF.getTextgiveTheGiftofFitness("Give the Gift of Fitness ");
						GGF.getShareTheBenefits("Share the benefits of an on-demand audio personal trainer with your friends, family or anyone else.");
						GGF.getTextunlockThePlan("Unlock a 1-month or a 12-month subscription to Auro Premium with unlimited access to our ever-increasing fitness content. ");
						GGF.setRecipientName("Batista");
						GGF.setRecipientEmail("ba123%@aurotest.com");
						GGF.setGiftMessage("Float like a Butterfly Sting Like a Bee");
						GGF.setgiftCardSenderName("asdf");
						GGF.setgiftCardSenderEmail("bn12@aurotest.com");
						
						Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
						Thread.sleep(2000);
						driver.switchTo().frame(0);
						ACP.clickEnterCardNumber();
						ACP.clearEnterCardNumber();
						ACP.enterCardNumber("4000000000000127");
						ACP.enterExpDate("1221");
						ACP.entercVc("122");
						ACP.enterZipCode("12345");
						driver.switchTo().parentFrame();
						Thread.sleep(2000);
						GGF.clicksendGiftCardButton();
						ACP.verifyIncorrectSecurityCodeMessagevisible();
						
					}
					
					//Enter the  Card Credentials And verify "An error occurred while processing your card. Try again in a little bit." Error Message while processing the Card
					@Test(priority = 0,invocationCount = 0)
					public void gift_of_fitness_Dothe_Payment_Entering_Credentials_Error_while_processing_the_card() throws InterruptedException {
						
						GivetheGiftofFitness_Page GGF=new GivetheGiftofFitness_Page(driver);
						GGF.selectVisibletext("12-month plan at ₹365");
						GGF.getTextgiveTheGiftofFitness("Give the Gift of Fitness ");
						GGF.getShareTheBenefits("Share the benefits of an on-demand audio personal trainer with your friends, family or anyone else.");
						GGF.getTextunlockThePlan("Unlock a 1-month or a 12-month subscription to Auro Premium with unlimited access to our ever-increasing fitness content. ");
						GGF.setRecipientName("Batista");
						GGF.setRecipientEmail("ba123%@aurotest.com");
						GGF.setGiftMessage("Float like a Butterfly Sting Like a Bee");
						GGF.setgiftCardSenderName("asdf");
						GGF.setgiftCardSenderEmail("bn12@aurotest.com");
						
						Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
						Thread.sleep(2000);						
						driver.switchTo().frame(0);
						
						ACP.clickEnterCardNumber();
						ACP.clearEnterCardNumber();
						ACP.enterCardNumber("4000000000000119");
						ACP.enterExpDate("1221");
						ACP.entercVc("122");
						ACP.enterZipCode("12345");
						driver.switchTo().parentFrame();
						Thread.sleep(2000);
						GGF.clicksendGiftCardButton();
						ACP.verifyProcessingErrorMessage("An error occurred while processing your card. Try again in a little bit.");
						
					}
					
					
					//Enter the  Card Credentials And verify  "Your card number is invalid."Error Message
					@Test(priority = 0,invocationCount = 0)
							public void select_LoseWeight_Beginner_Spin_Availoffer_Dothe_Payment_Entering_Credentials_Invalid_CardNumber_ErrorMessage() throws InterruptedException {
								
						GivetheGiftofFitness_Page GGF=new GivetheGiftofFitness_Page(driver);
						GGF.selectVisibletext("12-month plan at ₹365");
						GGF.getTextgiveTheGiftofFitness("Give the Gift of Fitness ");
						GGF.getShareTheBenefits("Share the benefits of an on-demand audio personal trainer with your friends, family or anyone else.");
						GGF.getTextunlockThePlan("Unlock a 1-month or a 12-month subscription to Auro Premium with unlimited access to our ever-increasing fitness content. ");
						GGF.setRecipientName("Batista");
						GGF.setRecipientEmail("ba123%@aurotest.com");
						GGF.setGiftMessage("Float like a Butterfly Sting Like a Bee");
						GGF.setgiftCardSenderName("asdf");
						GGF.setgiftCardSenderEmail("bn12@aurotest.com");
						
						Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
						Thread.sleep(2000);
						driver.switchTo().frame(0);
						ACP.clickEnterCardNumber();
						ACP.clearEnterCardNumber();
						ACP.enterCardNumber("4242424242424241");
						ACP.enterExpDate("1221");
						ACP.entercVc("122");
						ACP.enterZipCode("12345222");
						driver.switchTo().parentFrame();
						Thread.sleep(3000);
						GGF.clicksendGiftCardButton();
						Thread.sleep(1000);
						ACP.verifyInvalidCardNumber("Your card number is invalid.");
						
					}
					
					
					
					//Enter incomplete card number and verify "Your card number is incomplete." Error message
					@Test(priority = 0,invocationCount = 0)
	              public void gift_of_fitness_Dothe_Payment_Entering_IncompleteCardNumber_Verify_ErrorMessage() throws InterruptedException {
						
						GivetheGiftofFitness_Page GGF=new GivetheGiftofFitness_Page(driver);
						GGF.selectVisibletext("12-month plan at ₹365");
						GGF.getTextgiveTheGiftofFitness("Give the Gift of Fitness ");
						GGF.getShareTheBenefits("Share the benefits of an on-demand audio personal trainer with your friends, family or anyone else.");
						GGF.getTextunlockThePlan("Unlock a 1-month or a 12-month subscription to Auro Premium with unlimited access to our ever-increasing fitness content. ");
						GGF.setRecipientName("Batista");
						GGF.setRecipientEmail("ba123%@aurotest.com");
						GGF.setGiftMessage("Float like a Butterfly Sting Like a Bee");
						GGF.setgiftCardSenderName("asdf");
						GGF.setgiftCardSenderEmail("bn12@aurotest.com");
						
						Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
						Thread.sleep(2000);
						driver.switchTo().frame(0);
						ACP.clickEnterCardNumber();
						ACP.clearEnterCardNumber();
						ACP.enterCardNumber("40000000");
						
						driver.switchTo().parentFrame();
						Thread.sleep(2000);
						GGF.clicksendGiftCardButton();
						ACP.verifyIncomleteCardNumberError("Your card number is incomplete.");
						
					}
					
					
					 //Enter incomplete ExpiryDate and Verify "Your card's expiration date is incomplete." Error Message 
					@Test(priority = 0,invocationCount = 0)
					public void select_LoseWeight_Beginner_Spin_Availoffer_Dothe_Payment_Incomplete_ExpiryDate_verifyErrorMessage() throws InterruptedException {
						
						GivetheGiftofFitness_Page GGF=new GivetheGiftofFitness_Page(driver);
						GGF.selectVisibletext("12-month plan at ₹365");
						GGF.getTextgiveTheGiftofFitness("Give the Gift of Fitness ");
						GGF.getShareTheBenefits("Share the benefits of an on-demand audio personal trainer with your friends, family or anyone else.");
						GGF.getTextunlockThePlan("Unlock a 1-month or a 12-month subscription to Auro Premium with unlimited access to our ever-increasing fitness content. ");
						GGF.setRecipientName("Batista");
						GGF.setRecipientEmail("ba123%@aurotest.com");
						GGF.setGiftMessage("Float like a Butterfly Sting Like a Bee");
						GGF.setgiftCardSenderName("asdf");
						GGF.setgiftCardSenderEmail("bn12@aurotest.com");
						
						Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
						Thread.sleep(2000);
						driver.switchTo().frame(0);
						ACP.clickEnterCardNumber();
						ACP.clearEnterCardNumber();
						ACP.enterCardNumber("4242424242424242");
						ACP.enterExpDate("122");
						
						driver.switchTo().defaultContent();
						Thread.sleep(3000);
						GGF.clicksendGiftCardButton();
						ACP.giftCardverifyIncompleteCardExpiryDate("Your card's expiration date is incomplete.");
						
				}
					
					//Enter incomplete CvC Code and Verify "Your card's security code is incomplete." Error Message 
					@Test(priority = 0,invocationCount = 0)
					public void gift_of_fitness_Dothe_Payment_Incomplete_CvC_Code_verifyErrorMessage() throws InterruptedException {
						
						GivetheGiftofFitness_Page GGF=new GivetheGiftofFitness_Page(driver);
						GGF.selectVisibletext("12-month plan at ₹365");
						GGF.getTextgiveTheGiftofFitness("Give the Gift of Fitness ");
						GGF.getShareTheBenefits("Share the benefits of an on-demand audio personal trainer with your friends, family or anyone else.");
						GGF.getTextunlockThePlan("Unlock a 1-month or a 12-month subscription to Auro Premium with unlimited access to our ever-increasing fitness content. ");
						GGF.setRecipientName("Batista");
						GGF.setRecipientEmail("ba123%@aurotest.com");
						GGF.setGiftMessage("Float like a Butterfly Sting Like a Bee");
						GGF.setgiftCardSenderName("asdf");
						GGF.setgiftCardSenderEmail("bn12@aurotest.com");
						
						Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
						Thread.sleep(2000);
						driver.switchTo().frame(0);
						ACP.clickEnterCardNumber();
						ACP.clearEnterCardNumber();
						ACP.enterCardNumber("4242424242424242");
						ACP.enterExpDate("1221");
						ACP.entercVc("12");
						
						driver.switchTo().defaultContent();
						Thread.sleep(3000);
						GGF.clicksendGiftCardButton();
						ACP.giftCardverifyIncomleteSecurityCodeError("Your card's security code is incomplete.");
						
				}
					
					//Enter incomplete ZIP Code and Verify "Your postal code is incomplete." Error Message 
					@Test(priority = 0,invocationCount = 0)
					public void select_LoseWeight_Beginner_Spin_Availoffer_Dothe_Payment_Incomplete_ZIP_Code_verifyErrorMessage() throws InterruptedException {
						
						GivetheGiftofFitness_Page GGF=new GivetheGiftofFitness_Page(driver);
						GGF.selectVisibletext("12-month plan at ₹365");
						GGF.getTextgiveTheGiftofFitness("Give the Gift of Fitness ");
						GGF.getShareTheBenefits("Share the benefits of an on-demand audio personal trainer with your friends, family or anyone else.");
						GGF.getTextunlockThePlan("Unlock a 1-month or a 12-month subscription to Auro Premium with unlimited access to our ever-increasing fitness content. ");
						GGF.setRecipientName("Batista");
						GGF.setRecipientEmail("ba123%@aurotest.com");
						GGF.setGiftMessage("Float like a Butterfly Sting Like a Bee");
						GGF.setgiftCardSenderName("asdf");
						GGF.setgiftCardSenderEmail("bn12@aurotest.com");
						
						Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
						Thread.sleep(2000);
						driver.switchTo().frame(0);
						ACP.clickEnterCardNumber();
						ACP.clearEnterCardNumber();
						ACP.enterCardNumber("4242424242424242");
						ACP.enterExpDate("1221");
						ACP.entercVc("122");
						ACP.enterZipCode("122");
						
						driver.switchTo().defaultContent();
						Thread.sleep(3000);
						GGF.clicksendGiftCardButton();
						ACP.giftCardverifyIncomletePostalCodeError("Your postal code is incomplete.");
						
				}
					
					

					//Enter Dead Card and verify 'Your card's expiration year is in the past.' Error Message 
					@Test(priority = 0,invocationCount = 0)
					public void select_LoseWeight_Beginner_Spin_Availoffer_Dothe_Payment_Enter_DeadCardCredentials_verifyErrorMessage() throws InterruptedException {
						
						GivetheGiftofFitness_Page GGF=new GivetheGiftofFitness_Page(driver);
						GGF.selectVisibletext("12-month plan at ₹365");
						GGF.getTextgiveTheGiftofFitness("Give the Gift of Fitness ");
						GGF.getShareTheBenefits("Share the benefits of an on-demand audio personal trainer with your friends, family or anyone else.");
						GGF.getTextunlockThePlan("Unlock a 1-month or a 12-month subscription to Auro Premium with unlimited access to our ever-increasing fitness content. ");
						GGF.setRecipientName("Batista");
						GGF.setRecipientEmail("ba123%@aurotest.com");
						GGF.setGiftMessage("Float like a Butterfly Sting Like a Bee");
						GGF.setgiftCardSenderName("asdf");
						GGF.setgiftCardSenderEmail("bn12@aurotest.com");
						
						Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
						Thread.sleep(2000);
						driver.switchTo().frame(0);
						ACP.clickEnterCardNumber();
						ACP.clearEnterCardNumber();
						ACP.enterCardNumber("4242424242424242");
						ACP.enterExpDate("1218");
						
						driver.switchTo().defaultContent();
						GGF.clicksendGiftCardButton();
						
						ACP.verifyExpirationDateIsInThePastErrorMessage("Your card's expiration year is in the past.");
						
				}
					
					//Enter  expiration date and Verify "Your card's expiration year is invalid." Error Message 
					@Test(priority = 0,invocationCount = 0)
		              public void new_Member_enterEmail_password_Dothe_Payment__ExpirationYearIsInvalid_verifyErrorMessage() throws InterruptedException {
						
						GivetheGiftofFitness_Page GGF=new GivetheGiftofFitness_Page(driver);
						GGF.selectVisibletext("12-month plan at ₹365");
						GGF.getTextgiveTheGiftofFitness("Give the Gift of Fitness ");
						GGF.getShareTheBenefits("Share the benefits of an on-demand audio personal trainer with your friends, family or anyone else.");
						GGF.getTextunlockThePlan("Unlock a 1-month or a 12-month subscription to Auro Premium with unlimited access to our ever-increasing fitness content. ");
						GGF.setRecipientName("Batista");
						GGF.setRecipientEmail("ba123%@aurotest.com");
						GGF.setGiftMessage("Float like a Butterfly Sting Like a Bee");
						GGF.setgiftCardSenderName("asdf");
						GGF.setgiftCardSenderEmail("bn12@aurotest.com");
						
						Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
						Thread.sleep(2000);
						driver.switchTo().frame(0);
						ACP.clickEnterCardNumber();
						ACP.clearEnterCardNumber();
						ACP.enterCardNumber("4242424242424242");
						ACP.enterExpDate("1299");
						
						
						driver.switchTo().defaultContent();
						GGF.clicksendGiftCardButton();
						Thread.sleep(1000);
						ACP.verifynewmemberExpirationDateIsInvalidErrorMessage("Your card's expiration year is invalid.");
		}
	
					
					//Enter incomplete ZIP Code and Verify "Your postal code is incomplete." Error Message 
					@Test(priority = 0,invocationCount = 0)
		              public void new_Member_enterEmail_password_Dothe_Payment__PostalCode_IsIncomplete_verifyErrorMessage() throws InterruptedException {
						
						GivetheGiftofFitness_Page GGF=new GivetheGiftofFitness_Page(driver);
						GGF.selectVisibletext("12-month plan at ₹365");
						GGF.getTextgiveTheGiftofFitness("Give the Gift of Fitness ");
						GGF.getShareTheBenefits("Share the benefits of an on-demand audio personal trainer with your friends, family or anyone else.");
						GGF.getTextunlockThePlan("Unlock a 1-month or a 12-month subscription to Auro Premium with unlimited access to our ever-increasing fitness content. ");
						GGF.setRecipientName("Batista");
						GGF.setRecipientEmail("ba123%@aurotest.com");
						GGF.setGiftMessage("Float like a Butterfly Sting Like a Bee");
						GGF.setgiftCardSenderName("asdf");
						GGF.setgiftCardSenderEmail("bn12@aurotest.com");
						
						Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
						Thread.sleep(1000);
						
						driver.switchTo().frame(0);
						ACP.clickEnterCardNumber();
						ACP.clearEnterCardNumber();
						ACP.enterCardNumber("4242424242424242");
						//test.pass("Entered Card Number");
						ACP.enterExpDate("1221");
						//test.pass("Entered Card Expiry Date");
						ACP.entercVc("122");
						//test.pass("Entered Card cVc");
						ACP.enterZipCode("12");
						//test.pass("Entered incomplete Card ZIP code");
						
						driver.switchTo().defaultContent();
						ACP.clickStartFreeTrialButton();
						//test.pass("Clicked on Start free Trial Button");
						ACP.verifypostalCodeIsInCompleteErrorMessage();
						//ACP.verifyIncomletePostalCodeError("Your postal code is incomplete.");
						//test.pass("verified error message -'Your postal code is incomplete.'");
		}
					
					
					
					
					
					
					
					
					//Enter incomplete ZIP Code and Verify "Your Security code is incomplete." Error Message 
					@Test(priority = 0,invocationCount = 0)
		              public void new_Member_enterEmail_password_Dothe_Payment__SecurityCode_Is_Incomplete_verifyErrorMessage() throws InterruptedException {
						
						GivetheGiftofFitness_Page GGF=new GivetheGiftofFitness_Page(driver);
						GGF.selectVisibletext("12-month plan at ₹365");
						GGF.getTextgiveTheGiftofFitness("Give the Gift of Fitness ");
						GGF.getShareTheBenefits("Share the benefits of an on-demand audio personal trainer with your friends, family or anyone else.");
						GGF.getTextunlockThePlan("Unlock a 1-month or a 12-month subscription to Auro Premium with unlimited access to our ever-increasing fitness content. ");
						GGF.setRecipientName("Batista");
						GGF.setRecipientEmail("ba123%@aurotest.com");
						GGF.setGiftMessage("Float like a Butterfly Sting Like a Bee");
						GGF.setgiftCardSenderName("asdf");
						GGF.setgiftCardSenderEmail("bn12@aurotest.com");
						
						Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
						Thread.sleep(1000);
						driver.switchTo().frame(0);
						ACP.clickEnterCardNumber();
						ACP.clearEnterCardNumber();
						ACP.enterCardNumber("4242424242424242");
						//test.pass("Entered Card Number");
						ACP.enterExpDate("1221");
						//test.pass("Entered Card Expiry Date");
						ACP.entercVc("1");
						//test.pass("Entered Card cVc");
						ACP.enterZipCode("12345");
						//test.pass("Entered incomplete Card ZIP code");
						
						
						driver.switchTo().defaultContent();
						Thread.sleep(1000);
						GGF.clicksendGiftCardButton();
						
						ACP.verifysecurityCodeIncompleteErrorMessage();
						//ACP.verifyIncomleteSecurityCodeError("Your card's security code is incomplete.");
						test.pass("verified error message-'Your card's security code is incomplete.'");		
		}
					
					
					//Enter incomplete  Expiry Date and Verify "Your card's expiration date is incomplete." Error Message 
					@Test(priority = 0,invocationCount = 0)
		              public void new_Member_enterEmail_password_Dothe_Payment__Expiry_Date_Is__Incomplete_verifyErrorMessage() throws InterruptedException {
						
						GivetheGiftofFitness_Page GGF=new GivetheGiftofFitness_Page(driver);
						GGF.selectVisibletext("12-month plan at ₹365");
						GGF.getTextgiveTheGiftofFitness("Give the Gift of Fitness ");
						GGF.getShareTheBenefits("Share the benefits of an on-demand audio personal trainer with your friends, family or anyone else.");
						GGF.getTextunlockThePlan("Unlock a 1-month or a 12-month subscription to Auro Premium with unlimited access to our ever-increasing fitness content. ");
						GGF.setRecipientName("Batista");
						GGF.setRecipientEmail("ba123%@aurotest.com");
						GGF.setGiftMessage("Float like a Butterfly Sting Like a Bee");
						GGF.setgiftCardSenderName("asdf");
						GGF.setgiftCardSenderEmail("bn12@aurotest.com");
						
						Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
						Thread.sleep(1000);
						driver.switchTo().frame(0);
						ACP.clickEnterCardNumber();
						ACP.clearEnterCardNumber();
						ACP.enterCardNumber("4242424242424242");
						//test.pass("Entered Card Number");
						ACP.enterExpDate("12");
						
						driver.switchTo().defaultContent();
						GGF.clicksendGiftCardButton();
					//	ACP.verifycardsExpiryDateISInCompleteMessage();
						test.pass("Clicked on Start free Trial Button");
						ACP.verifyIncompleteCardExpiryDate();
						test.pass("verified error message-'Your card's expiration date is incomplete.'");
						
					
		}
	
					
					
					
}
