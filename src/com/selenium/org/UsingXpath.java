package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOKUL\\eclipse-workspace\\Selenium_2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("https://twitter.com/login");
		Thread.sleep(3000);
		WebElement loginid = driver.findElement(By.xpath("//input[@name='session[username_or_email]'][1]"));
		loginid.sendKeys("gokul595@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("jfjf855");
		WebElement login_btn = driver.findElement(By.xpath("(//span[contains(text(),'Log in')])[2]"));
		login_btn.click();
		Thread.sleep(3000);
		driver.close();*/
		
		driver.get("http://www.greenstechnologys.com/");
		Thread.sleep(2000);
		WebElement cont_us_btn = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		cont_us_btn.click();
		Thread.sleep(2000);
		WebElement ent_name = driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		ent_name.sendKeys("gokul");
		Thread.sleep(1000);
		WebElement ent_email = driver.findElement(By.xpath("//input[@id='InputEmail1']"));
		ent_email.sendKeys("gokul@gmail.com");
		Thread.sleep(1000);
		WebElement ent_mobile = driver.findElement(By.xpath("//input[@id='InputSubject']"));
		ent_mobile.sendKeys("8045687884");
		Thread.sleep(1000);
		WebElement ent_course = driver.findElement(By.xpath("(//select[contains(@class,'form-c')])[1]"));
		ent_course.sendKeys("Selenium");
		//driver.findElement(By.xpath("(//select[contains(@class,'form-c')])[1]")).click();
		//driver.findElement(By.xpath("(//option[@value='Selenium']")).click();
		Thread.sleep(1000);
		WebElement ent_branch = driver.findElement(By.xpath("(//select[@name='branch'])[1]"));
		ent_branch.sendKeys("Adayar");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//select[@class='form-control'])[3]")).sendKeys("Immediately");
		
		Thread.sleep(1000);
		driver.findElement(By.name("comments")).sendKeys("hshshsh");
		Thread.sleep(1000);
		driver.close();
		
		
}
}
