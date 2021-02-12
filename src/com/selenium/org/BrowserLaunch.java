package com.selenium.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserLaunch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOKUL\\eclipse-workspace\\Selenium_2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("abctech123@gmail.com");
		email.clear();
		email.sendKeys("sowmi@gmail.com");
		
		System.out.println("Displayed or not = "+email.isDisplayed());
		
		
		String attributeValue = email.getAttribute("id");
		System.out.println("attributeValue = "+attributeValue);
		String textboxValue = email.getAttribute("value");
		System.out.println("textboxValue = "+textboxValue);
		
		
		WebElement click_btn = driver.findElement(By.xpath("(//a[contains(@id,'u_')])[3]"));
		click_btn.click();
		System.out.println("Clickable or not = "+click_btn.isEnabled());
		
		
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.id("month"));
		
		Select s = new Select(month);
		List<WebElement> options = s.getOptions();
		
		for (WebElement x : options) {
			
			System.out.println(x.getText());
			
		}
		
		WebElement radio_btn = driver.findElement(By.xpath("(//input[contains(@id,'u_')])[6]"));
		radio_btn.click();
		System.out.println("Radio btn selected or not = "+radio_btn.isSelected());
		
		Thread.sleep(3000);
		driver.quit();

		
}

}
