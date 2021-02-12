package com.selenium.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensGetTextScreenshot {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOKUL\\eclipse-workspace\\Selenium_2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("http://www.greenstechnologys.com/index.html");
		WebElement OMR_add = driver.findElement(By.xpath("(//div[@class='trainer-info'])[2]"));
		System.out.println("============OMR Address============");
		String attribute = OMR_add.getText();
		System.out.println(attribute);
		System.out.println();
		//Ques No. 3,14
		
		driver.navigate().to("http://www.greenstechnologys.com/testimonial.html");
		WebElement shekar = driver.findElement(By.xpath("//div[text()='Sekhar C (Infosys, Chennai)']"));
		String text = shekar.getText();
		System.out.println(text+" Statement");
		WebElement shekar1 = driver.findElement(By.xpath("(//div[@class='testimonial-section'])[19]"));
		String text2 = shekar1.getText();
		System.out.println(text2);*/
		
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		WebElement ovr_Review = driver.findElement(By.xpath("(//div[@class='box'])[9]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ovr_Review);
		TakesScreenshot ts =(TakesScreenshot)driver;
		File scr_File = ts.getScreenshotAs(OutputType.FILE);
		File dst_File = new File("C:\\Users\\GOKUL\\eclipse-workspace\\Selenium_2\\Screenshot\\greensreview.png");
		FileUtils.copyFile(scr_File, dst_File);
		Thread.sleep(2000);
		
		WebElement address = driver.findElement(By.xpath("(//div[@class='box'])[4]"));
		js.executeScript("arguments[0].scrollIntoView(false);", address);
		File scr_File1 = ts.getScreenshotAs(OutputType.FILE);
		File dst_File1 = new File("C:\\Users\\GOKUL\\eclipse-workspace\\Selenium_2\\Screenshot\\greensaddress.png");
		FileUtils.copyFile(scr_File1, dst_File1);
		driver.close();
	}
}
