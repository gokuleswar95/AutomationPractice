package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdidasAddCart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOKUL\\eclipse-workspace\\Selenium_2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://shop.adidas.co.in/");
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='searchTextBox']")).sendKeys("CM4735");
		driver.findElement(By.id("GoButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='productDescription clearfix productRowList']")).click();
		Thread.sleep(2000);
		/*driver.findElement(By.xpath(""))
		driver.findElement(By.xpath(""))
		driver.findElement(By.xpath(""))*/
	}

}
