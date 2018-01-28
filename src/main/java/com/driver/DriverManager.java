package com.driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverManager {

	private static ThreadLocal<WebDriver> WebDriver = new ThreadLocal<WebDriver>();
	private static JavascriptExecutor jsExecutor;
	private static WebDriverWait wait;

	public static WebDriver getDriver() {
		return WebDriver.get();
	}

	public static void setWebDriver(WebDriver driver) {
		WebDriver.set(driver);
	}

	public static JavascriptExecutor rtnJSExecutor() {
		jsExecutor = (JavascriptExecutor) WebDriver.get();
		return jsExecutor;
	}

	public static WebDriverWait rtnWebdriverWait() {
		wait = new WebDriverWait(WebDriver.get(), 30);
		return wait;

	}

}
