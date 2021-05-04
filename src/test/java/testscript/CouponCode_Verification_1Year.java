package testscript;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import generic.Precondition;
import pom.Auro_Categories_Page;
import pom.Auro_Checkout_Page;
import pom.Auro_Goals_Page;
import pom.Auro_Home_Page;
import pom.Auro_Level_Page;

public class CouponCode_Verification_1Year extends Precondition{


	@Test(invocationCount = 1)
	public void Web_One_Yearfree_select_LoseWeight_Beginner_Spin_validate_Coupon_Code() throws InterruptedException, IOException {
		
		test=extent.createTest("auroValidSignUp");
		test.log(Status.INFO, "auroValidSignUp test script started executing");
		Auro_Home_Page AH=new Auro_Home_Page(driver);
		//AH.clickGet30DaysFreeButton();
		AH.clickRedeem1YearVoucher();
		test.pass("clicked 'Redeem1YearVoucher' Button");
		
		
		
		Thread.sleep(1000);
	    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
		AG.selectLoseweight();
		test.pass("Select 'Loseweight' Button");
		AG.clickNextButton();
		test.pass("Click 'Next' Button");
		
		Auro_Level_Page AL=new Auro_Level_Page(driver);
		Thread.sleep(1000);
		AL.selectBeginner();
		test.pass("Select 'Beginner' Button");
		AL.clickNextButton();
		test.pass("Click 'Next' Button");
		
		
		Auro_Categories_Page AC=new Auro_Categories_Page(driver);
		Thread.sleep(1000);
		AC.selectSpin();
		test.pass("Select 'Spin' Button");
		AC.clickNextButton();
		test.pass("Click 'Next' Button");
		
		Auro_Checkout_Page ACP = new Auro_Checkout_Page(driver);
		ACP.scrollToElementstartFreeTrialButton();
		
		File File = new File("D:\\AURO1\\AuroProject\\NotePad\\Text_Data.txt");
		FileReader FR = new FileReader(File);
		BufferedReader reader = new BufferedReader(FR);
		System.out.println(reader);
		String s=null;
		int appliedCode=0;
		
			while((s=reader.readLine())!=null) {
				
				ACP.enterCouponCode(s);
				test.pass("Enter CouponCode"+s);
				ACP.clickApplyButton();
				test.pass("Click Apply Button");
				Thread.sleep(500);
				WebElement couponmessage = driver.findElement(By.id("coupon-message"));
				
				WebElement remove = driver.findElement(By.id("coupon-apply-btn"));
				if (couponmessage.getText().contentEquals("Congrats! Coupon code successfully applied")) {
					appliedCode++;
					test.pass("CouponCode "+s+" appllied., from position"+appliedCode);
					System.out.println(s+" coupon code APPLLIED  code position  "+appliedCode);
					Thread.sleep(500);
					remove.click();
					test.pass("CouponCode removed");
					Thread.sleep(500);
					
				}else {
					System.out.println(s+" coupon code NOT applied");
					test.fail("CouponCode NOT appllied");
					ACP.clearCouponCodeTextField();
					//Assert.fail();
				}
			}
		
		
		}
		
}

