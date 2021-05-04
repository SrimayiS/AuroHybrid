package testscript;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Demo {
	
	
	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor Js =(JavascriptExecutor) driver;
		Js.executeScript("window.location='https://www.fb.com'");
		Object returnedValue = Js.executeScript("return document.title");
		System.out.println(returnedValue);
		Object returnedDomain = Js.executeScript("return document.domain");
		System.out.println(returnedDomain);
		
		Js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(4000);
		Js.executeScript("window.scrollTo(0,document.body.scrollTop)");
			}
	
}

