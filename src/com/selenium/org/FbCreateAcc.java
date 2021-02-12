package com.selenium.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbCreateAcc {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOKUL\\eclipse-workspace\\Selenium_2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Gokul");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("Eswar");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-')]")).sendKeys("8906545773");
		driver.findElement(By.name("reg_email__")).sendKeys("8906545773");
		Thread.sleep(1000);
		driver.findElement(By.id("password_step_input")).sendKeys("hss554shgs");
		Thread.sleep(1000);
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("4");
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		//s.deselectByValue("4");
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("Apr");
		List<WebElement> list = s1.getOptions();
		for (WebElement x : list) {
			System.out.println(x.getText());
		}
		Thread.sleep(1000);
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByValue("1999");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(5000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//driver.quit();
	}
}
