package com.handson.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String asgs[])
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	}

}
