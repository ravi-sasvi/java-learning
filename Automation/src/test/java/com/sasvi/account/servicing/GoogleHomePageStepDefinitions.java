package com.sasvi.account.servicing;

import org.junit.Assert;

import com.sasvi.account.servicing.pages.GoogleHomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GoogleHomePageStepDefinitions {
	
	private GoogleHomePage homePage = new GoogleHomePage();

	@When("I open the google home page")
	public void i_open_the_google_home_page() {
		homePage.openGoogleHomePage();
	}

	@Then("I see the About link")
	public void i_see_the_about_link() {
		Boolean aboutElementPresent = homePage.isAboutElementPresent();
	    Assert.assertTrue(aboutElementPresent);
	}
	
	

}
