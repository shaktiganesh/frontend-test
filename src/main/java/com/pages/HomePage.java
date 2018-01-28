package com.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.driver.DriverManager;

public class HomePage extends BasePage {

	WebDriver driver;

	@FindBy(id = "departureCity")
	WebElement departureCity;

	@FindBy(id = "arrivalCity")
	WebElement arrivalCity;

	@FindBy(xpath = "//div[@tabindex='3']")
	WebElement calendar;

	// Departure date is assumed to be current date for this scenario
	@FindBy(xpath = "//span[contains(.,'today')]")
	WebElement dptDate;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement srchButton;

	@FindBy(xpath = "//ul[@id='ui-id-1']//li/a")
	List<WebElement> frmList;

	@FindBy(xpath = "//ul[@id='ui-id-2']//li/a")
	List<WebElement> toList;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	// Search for places to travel between
	public void travelSearch(String fromPlace, String toPlace) {
		JavascriptExecutor executor = DriverManager.rtnJSExecutor();
		departureCity.sendKeys(fromPlace);
		listSearch(frmList, fromPlace);
		arrivalCity.sendKeys(toPlace);
		listSearch(toList, toPlace);
		calendar.click();
		executor.executeScript("arguments[0].click();", dptDate);
		srchButton.click();
		Reporter.log("Search successful on home page");

	}

}
