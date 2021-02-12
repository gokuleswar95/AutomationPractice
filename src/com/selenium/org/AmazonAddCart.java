package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAddCart {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOKUL\\eclipse-workspace\\Selenium_2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		//driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[text()='Apple iPhone 7 (32GB) - Black']")).click();
		Thread.sleep(3000);
		driver.switchTo().activeElement();
		/*String iphone_url = driver.getCurrentUrl();
		System.out.println(iphone_url);
		driver.get(iphone_url);
		Thread.sleep(3000);*/
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.close();
		
	}
}
