package com.sasvi.account.servicing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sasvi.account.servicing.utils.DriverUtils;

public class GoogleHomePage {
	
	private WebDriver driver;
	
	@FindBy(linkText = "About")
	public WebElement aboutLinkEelement;
	
	public GoogleHomePage() {
		driver = DriverUtils.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getAboutElement() {
		return aboutLinkEelement;
	}
	
	public boolean isAboutElementPresent() {
		return getAboutElement() != null;
	}
	
	public void openGoogleHomePage() {
		driver.get("https://www.google.com/");
	}
}
