package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.driver.DriverManager;
import com.driver.LocalDriverFactory;
import com.pages.HomePage;
import com.pages.ResultsPage;
import com.utils.LoadProperty;

public class SearchResultsTest {

	WebDriver driver;
	HomePage homePage;
	ResultsPage resultsPage;

	@Parameters("browserName")
	@BeforeTest
	public void beforeTest(String browserName) {
		DriverManager.setWebDriver(LocalDriverFactory.createInstance(browserName));
		driver = DriverManager.getDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(LoadProperty.getProperty("baseurl"));

	}

	@Parameters(value = { "fromPlace", "toPlace" })
	@Test
	public void verifyFlightAndBus(String fromPlace, String toPlace) throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.travelSearch(fromPlace, toPlace);
		resultsPage = new ResultsPage(driver);
		Assert.assertTrue(resultsPage.flightIsDisplayed());
		Assert.assertTrue(resultsPage.busIsDisplayed());

	}

}
