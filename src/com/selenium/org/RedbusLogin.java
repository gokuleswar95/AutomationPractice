package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOKUL\\eclipse-workspace\\Selenium_2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@id='i-icon-profile']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='signInLink']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sign in with Google']")).click();
		Thread.sleep(2000);
		
	}

}
