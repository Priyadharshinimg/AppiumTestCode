package com.waithandling;

import org.openqa.selenium.By;



public final class Uielementshanding {
	
	private Uielementshanding() {
		
		
	}
	public static void clickElementBy(By locator) {
		Uielementshanding.waitUntilClickable(locator,true).click();
	}
	
	
}
