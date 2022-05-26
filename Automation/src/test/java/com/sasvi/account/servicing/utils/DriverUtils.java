package com.sasvi.account.servicing.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverUtils {
	
	
	private static WebDriver driver;
	
	
	public static WebDriver getDriver() {
		if (driver == null) {
			setDriver();
		}

		return driver;
	}
	
	
	private static void setDriver() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");

			ChromeOptions options = new ChromeOptions();
			WebDriver chromeDriver = new ChromeDriver(options);
			chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			chromeDriver.manage().window().maximize();
			System.out.println("Chrome Driver initialized");
			driver = chromeDriver;
		} catch (Exception e) {
			System.out.println("Chrome Driver not initialized. " + e.toString());
		}
	}

}
