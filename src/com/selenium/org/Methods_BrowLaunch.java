package com.selenium.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods_BrowLaunch {
	/*public void chromeBrowser() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOKUL\\eclipse-workspace\\Selenium_2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	}
	public static void main(String[] args) throws InterruptedException {
		Methods_BrowLaunch meth = new Methods_BrowLaunch();
		meth.chromeBrowser();
		Thread.sleep(2000);	
	}*/
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOKUL\\eclipse-workspace\\Selenium_2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		//driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/login/");
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		
		//driver.close(); //to close current window
		driver.quit(); //to terminate the browser session
		
	}
	

}
