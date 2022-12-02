package com.webapplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
public class BaseClass implements InterfacePage {

	protected BaseClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
