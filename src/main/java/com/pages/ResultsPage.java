package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultsPage extends BasePage {

	WebDriver driver;

	public ResultsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[@data-key='dw.sorting.price']")
	WebElement priceSort;

	@FindBy(xpath = "//div[contains(@class, 'resultPrice')]/div[contains(@class,'priceContainer')]/span/span[contains(@class,'priceMain')]")
	List<WebElement> trvlResultList;

	@FindBy(xpath = "//div[contains(@class,'SummaryItem')]//span[contains(text(),'train')]")
	WebElement train;

	@FindBy(xpath = "//div[contains(@class,'SummaryItem')]//span[contains(text(),'flight')]")
	WebElement flight;

	@FindBy(xpath = "//div[contains(@class,'SummaryItem')]//span[contains(text(),'bus')]")
	WebElement bus;

	@FindBy(xpath = "//span[text()='Next']")
	WebElement nextPage;

	@FindBy(xpath = "//div[contains(@class,'Paging__active')]")
	WebElement activePage;

	@FindBy(xpath = "//div[contains(@class,'tabsBody')]/div/div[1]//div/span[@data-key='dw.select']")
	WebElement select;

	@FindBy(xpath = "//span[contains(text(),'Alternative dates')]")
	WebElement altDate;

	List<Integer> sortedPrice = new ArrayList<Integer>();

	public Boolean flightIsDisplayed() {
		getChildWindow();
		if (flight.isDisplayed()) {
			return true;
		}

		return false;
	}

	public Boolean busIsDisplayed() {
		if (bus.isDisplayed()) {
			return true;
		}

		return false;
	}

}
