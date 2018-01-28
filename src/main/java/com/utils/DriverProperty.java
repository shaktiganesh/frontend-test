package com.utils;

import java.io.File;

public class DriverProperty {

	private static String MacDriver = LoadProperty.getProperty("chromedriver");

	// does the setup for chrome driver in mac

	public static void setUpChromeDriver() {
		File cDriver = new File(DriverProperty.class.getResource(MacDriver).getFile());

		if (!cDriver.canExecute()) {
			cDriver.setExecutable(true);
		}
		System.setProperty("webdriver.chrome.driver", DriverProperty.class.getResource(MacDriver).getFile());
	}

}
