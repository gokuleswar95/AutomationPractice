package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class LvbLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.opera.driver", 
				"C:\\Users\\GOKUL\\eclipse-workspace\\Selenium_2\\Driver\\operadriver.exe");
		WebDriver drive = new OperaDriver();
		drive.get("https://management.ind.in/forum/lakshmi-vilas-bank-net-banking-application-form-157353.html");
		Thread.sleep(2000);
		drive.findElement(By.xpath("//input[@id='navbar_username']")).sendKeys("vijay");
		Thread.sleep(1000);
		drive.findElement(By.xpath("//input[@id='navbar_password']")).sendKeys("585kksks66");
		Thread.sleep(1000);
		drive.findElement(By.xpath("//input[@name='cookieuser']")).click();
		Thread.sleep(1000);
		drive.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(3000);
		drive.close();
	}

}
