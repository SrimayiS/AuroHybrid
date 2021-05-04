package generic;


import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.net.Urls;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Precondition implements AutoConstant  {

	public WebDriver driver;
	
	public static ExtentSparkReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest test; 
	
	
	public static final String USERNAME = "karthik591";
	public static final String AUTOMATE_KEY = "VLz2uStJnkaymxUYxF7F";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	@BeforeSuite
	public void setUp() {
		 reporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/TestCaseExecutionReports/index.html");
	 extent = new ExtentReports();
	extent.attachReporter(reporter);
	}
	
	//@org.testng.annotations.Parameters({"browser"})
	@BeforeMethod
	/*
	public void setUp1() throws MalformedURLException {
		
		WebDriverManager.firefoxdriver().setup();
		DesiredCapabilities caps = new DesiredCapabilities();
        
         caps.setCapability("os", "Windows");
         caps.setCapability("os_version", "10");
         caps.setCapability("browser", "Firefox");
         caps.setCapability("browser_version", "84.0");
         caps.setCapability("name", "karthik591's First Test");
         WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
         //# Write your test here
         //driver.quit();
		// driver=new FirefoxDriver();
		 driver.get("https://stage-web.auro.fit/london-winter-run");
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}*/
	//@Optional("chrome")
    public void setUp(@Optional("chrome")String browser) 
    { 
		System.out.println(browser);
		if(browser.contentEquals("chrome")) {
		/*	//WebDriverManager.operadriver().setup();
			WebDriverManager.chromedriver().setup();
			
			DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("os", "Windows");
			caps.setCapability("os_version", "10");
			caps.setCapability("browser", "chrome");
			caps.setCapability("browser_version", "87.0");
			caps.setCapability("name", "Keerthesh MAIN PAGE");
			
			/*ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--headless");
			driver=new ChromeDriver(opt);
		
			driver=new ChromeDriver();*/
			
			
			
			//WebDriverManager.operadriver().setup();
			WebDriverManager.chromedriver().setup();
			
			DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("os", "Windows");
			caps.setCapability("os_version", "10");
			caps.setCapability("browser", "operamini");
			caps.setCapability("browser_version", "Opera 68");
			caps.setCapability("name", "Keerthesh MAIN PAGE");
			
			/*ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--headless");
			driver=new ChromeDriver(opt);*/
		
			//driver=new ChromeDriver();
			//# Write your test here
			//driver.quit();
			
			driver = new ChromeDriver();
			 //driver.get("https://stage-web.auro.fit");
	         driver.get("https://stage-web.auro.fit");
			
			
			
			
			
			
			//# Write your test here
			//driver.quit();
		//	driver.get("https://stage-web.auro.fit/30days-free");
			//driver.get("https://stage-web.auro.fit/25-off");
			//driver = new OperaDriver();
		//	driver.get("https://stage-web.auro.fit/45days-free/");
			//driver.get("https://stage-web.auro.fit");
	        // driver.get("https://stage-web.auro.fit/gift");
			// driver.get("https://www.auro.fit/1year-free");
	         driver.manage().window().maximize();
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         
			
		}else if(browser.contentEquals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			
			DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("os", "Windows");
			caps.setCapability("os_version", "10");
			caps.setCapability("browser", "Firefox");
			caps.setCapability("browser_version", "87.0");
			caps.setCapability("name", "Keerthesh MAIN PAGE");
			driver=new FirefoxDriver();
			driver.get("https://stage-web.auro.fit/");
			//driver.get("https://www.auro.fit/1year-free");
			driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
		}else if(browser.contentEquals("opera")){
			WebDriverManager.operadriver().setup();
			//WebDriverManager.chromedriver().setup();
			
			DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("os", "Windows");
			caps.setCapability("os_version", "10");
			caps.setCapability("browser", "operamini");
			caps.setCapability("browser_version", "Opera 68");
			caps.setCapability("name", "Keerthesh MAIN PAGE");
			
			/*ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--headless");
			driver=new ChromeDriver(opt);*/
		
			//driver=new ChromeDriver();
			//# Write your test here
			//driver.quit();
			
			driver = new OperaDriver();
			 //driver.get("https://stage-web.auro.fit");
	         driver.get("https://stage-web.auro.fit");
		}
		   
    }
	
	
   
	@AfterMethod
	public void closeApplication(ITestResult res) {
		String TestName = res.getName();
		System.out.println("Testcase name is "+TestName);
		System.out.println("test case status is "+res.getStatus());
		if (ITestResult.FAILURE==res.getStatus()) {
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(new Screenshot().capture(driver, TestName)).build());
			
		}
		//driver.quit();
	}
	
	@AfterSuite
	public void clOse() {
		extent.setSystemInfo("windows", "10");
		test.assignAuthor("Keerthesh");
		test.assignCategory("Web Automation on Chrome");
		test.assignDevice("Laptop");
		extent.flush();
	}
}
