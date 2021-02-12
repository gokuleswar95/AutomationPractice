package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logins {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOKUL\\eclipse-workspace\\Selenium_2\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();	
		
		driver.get("https://www.facebook.com/");
		WebElement loginid = driver.findElement(By.id("email"));
		loginid.sendKeys("gokul595@gmail.com");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("gokul12456");		
		WebElement click = driver.findElement(By.name("login"));
		click.click();
		Thread.sleep(3000);
		
		
		driver.navigate().to("https://www.instagram.com/?hl=en");
		Thread.sleep(3000);
		WebElement userid = driver.findElement(By.name("username"));
		userid.sendKeys("gokul595@gmail.com");
		WebElement passcode = driver.findElement(By.name("password"));
		passcode.sendKeys("12458djd");
		//WebElement clicks = driver.findElement(By);
		//clicks.click();
		Thread.sleep(3000);
		
		driver.navigate().to("https://twitter.com/login");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.name("session[username_or_email]"));
		username.sendKeys("gkul13456@gmail.com");
		WebElement password = driver.findElement(By.name("session[password]"));
		password.sendKeys("jdjd45214");
		//WebElement clickss = driver.findElement(By.className("css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0"));
		//clickss.click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
