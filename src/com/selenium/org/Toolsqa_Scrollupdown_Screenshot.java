package com.selenium.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toolsqa_Scrollupdown_Screenshot {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOKUL\\eclipse-workspace\\Selenium_2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3000)");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File dstFile = new File("C:\\Users\\GOKUL\\eclipse-workspace\\Selenium_2\\Screenshot\\toolsqa.png");
		FileUtils.copyFile(srcFile, dstFile);
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-3000)");
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		File srcFile1 = ts1.getScreenshotAs(OutputType.FILE);
		File dstFile1 = new File("C:\\Users\\GOKUL\\eclipse-workspace\\Selenium_2\\Screenshot\\toolsqa1.png");
		FileUtils.copyFile(srcFile1, dstFile1);
		Thread.sleep(2000);
		driver.close();
	}
}
