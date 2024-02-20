package org.browser;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static WebDriver driver;
	

	//public static WebDriver launchBrowser(String browserName, String urlOfWebsite) {
		//if(browserName.equalsIgnoreCase("chrome")) {
			WebDriver driver = new ChromeDriver();
//		}
//		else if (browserName.equalsIgnoreCase("firefox")) {
//			driver = new FirefoxDriver();
//		}
//		else if (browserName.equalsIgnoreCase("edge")) {
//			driver = new EdgeDriver();
//		}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	
	
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.get(urlOfWebsite);
		
		//return driver;
		
	}
	

	public static void putValueInTextBox(WebElement element, String value) {
		if (element.isDisplayed() && element.isEnabled()) {
			element.clear();
			element.sendKeys(value);
		}
	}

	public static void clickOnElement(WebElement element) {
		if (element.isDisplayed() && element.isEnabled()) {
			element.click();
		}
	}

	public static void closeBrowser() {
		driver.quit();
	}

	
//	public static String getTitleOfPage() {
//		 return driver.getTitle();
//	}
}


