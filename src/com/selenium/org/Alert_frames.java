package com.selenium.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOKUL\\eclipse-workspace\\Selenium_2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert2.dismiss();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("gcool");
		Thread.sleep(2000);
		alert3.accept();
		Thread.sleep(1000);
		driver.close();*/
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		/*driver.switchTo().frame("SingleFrame");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("frames");*/
		
		driver.findElement(By.xpath("(//a[text()='Iframe with in an Iframe'])[1]")).click();
		WebDriver outerframe = driver.switchTo().frame("Multiple");
		driver.switchTo().frame("outerframe");
		driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']")).sendKeys("sdss");
		//driver.findElement(By.xpath(""))
		//driver.findElement(By.xpath(""))
		//driver.findElement(By.xpath(""))
		//driver.findElement(By.xpath(""))
	}
}
