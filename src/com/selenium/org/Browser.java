package com.selenium.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Browser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOKUL\\eclipse-workspace\\Selenium_2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.close();
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\GOKUL\\eclipse-workspace\\Selenium_2\\Driver\\msedgedriver.exe");
		WebDriver driver1 = new EdgeDriver();
		driver1.get("https://www.facebook.com/");
		driver1.close();
		
		System.setProperty("webdriver.opera.driver", 
				"C:\\Users\\GOKUL\\eclipse-workspace\\Selenium_2\\Driver\\operadriver.exe");
		WebDriver driver2 = new OperaDriver();
		driver2.get("https://www.facebook.com/");
		driver2.close();
	}

}
