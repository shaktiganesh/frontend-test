package com.listeners;

import org.testng.IExecutionListener;
import org.testng.Reporter;

import com.utils.DriverProperty;

public class WebDriverListener implements IExecutionListener {

	public void onExecutionFinish() {
		Reporter.log("End of Test Execution");

	}

	public void onExecutionStart() {
		Reporter.log("Test Execution Started");
		DriverProperty.setUpChromeDriver();
		Reporter.log("Chrome Driver Successfully set in system property");

	}

}
