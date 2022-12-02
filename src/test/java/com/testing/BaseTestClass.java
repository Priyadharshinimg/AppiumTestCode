package com.testing;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.commonutils.PropertyManager;
import com.uidriver.manager.UiDriver;

;

public class BaseTestClass {

	
	private BaseTestClass() {
		
		
	}

	@BeforeMethod
	public void launchUrl() {
		UiDriver.initializeDriver(PropertyManager.getBrowsersTypeProperty());
		UiDriver.launchUrl(PropertyManager.getUrlProperty());
		Reporter.log("Url Launched: "+PropertyManager.getUrlProperty());	
	}
	
	@AfterMethod
	public void tearDown() {
		UiDriver.quitDriver();
		Reporter.log("Browser Closed");
	}
	
}
