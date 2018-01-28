package com.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.driver.DriverManager;

public class BasePage {

	WebDriver driver;
	JavascriptExecutor executor = DriverManager.rtnJSExecutor();
	WebDriverWait wait = DriverManager.rtnWebdriverWait();

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void listSearch(List<WebElement> elementList, String toPlace) {

		for (WebElement element : elementList) {
			if (element.getText().contains(toPlace)) {
				element.click();
			}

		}
	}

	// Switch to new window
	public void getChildWindow() {
		String child = null;
		String parent = driver.getWindowHandle();
		Set<String> windowSet = driver.getWindowHandles();
		Iterator<String> it = windowSet.iterator();
		while (it.hasNext()) {
			child = it.next();
		}
		if (!parent.equals(child)) {
			driver.switchTo().window(child);
		}

	}

}
