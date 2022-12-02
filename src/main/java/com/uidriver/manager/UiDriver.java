package com.uidriver.manager;

import java.util.Objects;

import org.openqa.selenium.TimeoutException;

import com.elementsenums.Browsers;
import com.runconstants.Runconstants;



public class UiDriver {


 private static final String url = null;

private UiDriver() {
	 
	 
	 
 }
 
 public static void initializeDriver(Browsers browser) {
	 
	 switch(browser){
	 case CHROME:
	 
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+Runconstants.getChromeDriverPath());
		 
		 
	 }
	 
 }

public static void launchUrl(String url) {
	
	try {
		Uimanager.getDriver().get(url);
	}catch(TimeoutException e) {
		//implementing due to a known issue
		//should be removed once issue is resolved 
		Uimanager.getDriver().navigate().refresh();
	}
	
}

public static void quitDriver() {
	if(Objects.nonNull(Uimanager.getDriver())) {
		Uimanager.getDriver().quit();
		Uimanager.unloadDriver();
		Uimanager.setDriver(null);
	
	
}


	
}
	 
 }