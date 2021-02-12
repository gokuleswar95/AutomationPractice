package com.selenium.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationPrac {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOKUL\\eclipse-workspace\\Selenium_2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email_create")).sendKeys("gokl@gmail.com");
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("goccool");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("eswar");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("goluj@gmail.com");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("sjsjs65585");
		Thread.sleep(1000);
		WebElement day = driver.findElement(By.xpath("//select[@id='days']"));
		Select s = new Select(day);
		s.selectByValue("2");
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
		Select s1 =new Select(month);
		s1.selectByVisibleText("January ");
		Thread.sleep(1000);
		WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
		Select s2 = new Select(year);
		s2.selectByValue("1995");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='optin']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("goccool");
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("eswar");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("A2Z Infotech");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("A2Z Infotech");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Red Wine City");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Los Angeles");
		Thread.sleep(1000);
		WebElement state = driver.findElement(By.xpath("//select[@id='id_state']"));
		Select s3 = new Select(state);
		s3.selectByVisibleText("California");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("90006");
		Thread.sleep(1000);
		WebElement country = driver.findElement(By.xpath("//select[@id='id_country']"));
		Select s4 = new Select(country);
		s4.selectByValue("21");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='other']")).sendKeys("dhdhd dhdhhd hdhdhd hshshs");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("5558887744");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("Same as address");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
		Thread.sleep(5000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();
	}	
}
