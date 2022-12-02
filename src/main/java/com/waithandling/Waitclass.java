package com.waithandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.commonutils.PropertyManager;
import com.google.common.util.concurrent.Uninterruptibles;
import com.uidriver.manager.Uimanager;




public class Waitclass {

	
	private static final long secondsElementWait = PropertyManager.getGlobalElementWaitTimeProperty();;

	private Waitclass() {
		
		
	}
	
	public static void pageWait() {
		Uimanager.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PropertyManager.getGlobalPageWaitTimeProperty()));
	}
	
	public static  WebElement waitUntilClickable(By ele, boolean assertFlag) {
		
		 WebElement targetEle =  null;
		  try {
		    	targetEle  =  new WebDriverWait(Uimanager.getDriver(), Duration.ofSeconds(secondsElementWait))
		    			.until (ExpectedConditions.elementToBeClickable(ele));
		  }catch(Exception  e){
			   if(assertFlag) {
				    StackTraceElement[] s = new Throwable().getStackTrace();
				    StackTraceElement line = s[3];
				    StackTraceElement classLoc = s[0];
				    StackTraceElement methodName = s[1];
				   				    
			 	   throw new RuntimeException("\nException Occured {"+e+"}- please check the Locator and DOM"
			 	   		+ "\nLine.No   : "+line
			 			+ "\nMethodName: "+methodName
			 			+ "\nClassName : "+classLoc
			 	   		+ "\nelement   : ExpectedConditions.elementToBeClickable("+ele+"),"
			 	   		, e);
			   }else {
				   e.printStackTrace();
			   }
		  }
		  return targetEle;
	
}
	

	public static  WebElement waitUntilClickable(WebElement ele, boolean assertFlag) {
		
		 WebElement targetEle =  null;
		  try {
		    	targetEle  =  new WebDriverWait(Uimanager.getDriver(), Duration.ofSeconds(secondsElementWait)).until(
					              ExpectedConditions.elementToBeClickable(ele));
		  }catch(Exception  e){
			   if(assertFlag) {
				    StackTraceElement[] s = new Throwable().getStackTrace();
				    StackTraceElement line = s[3];
				    StackTraceElement classLoc = s[0];
				    StackTraceElement methodName = s[1];
				   				    
			 	   throw new RuntimeException("\nException Occured {"+e+"}- please check the Locator and DOM"
			 	   		+ "\nLine.No   : "+line
			 			+ "\nMethodName: "+methodName
			 			+ "\nClassName : "+classLoc
			 	   		+ "\nelement   : ExpectedConditions.elementToBeClickable("+ele+"),"
			 	   		, e);
			   }else {
				   e.printStackTrace();
			   }
		  }
		  return targetEle;
	}
	
	
	public static  WebElement waitUntilElementVisible(By ele, boolean assertFlag) {
		  WebElement targetEle =  null;
		  try {
		    	targetEle  =  new WebDriverWait(Uimanager.getDriver(), Duration.ofSeconds(secondsElementWait)).until(
					              ExpectedConditions.visibilityOfElementLocated(ele));
		  }catch(Exception e){
			if(assertFlag) {
				StackTraceElement[] s = new Throwable().getStackTrace();
			    StackTraceElement line = s[3];
			    StackTraceElement classLoc = s[0];
			    StackTraceElement methodName = s[1];
					    
		 	   throw new NoSuchElementException("\nException Occured- please check the Locator and DOM"
		 	   		+ "\nLine.No   : "+line
		 			+ "\nMethodName: "+methodName
		 			+ "\nClassName : "+classLoc
		 	   		+ "\nelement   : ExpectedConditions.visibilityOfElementLocated("+ele+"),"
		 	   		, e);
		 	   }else {
				e.printStackTrace();
			   }
		  }
		  return targetEle;
	}
	
	public static  WebElement waitUntilElementVisible(WebElement ele, boolean assertFlag) {
		  WebElement targetEle =  null;
		  try {
		    	targetEle  =  new WebDriverWait(Uimanager.getDriver(), Duration.ofSeconds(secondsElementWait)).until(
					              ExpectedConditions.visibilityOf(ele));
		  }catch(Exception e){
			if(assertFlag) {
				StackTraceElement[] s = new Throwable().getStackTrace();
			    StackTraceElement line = s[3];
			    StackTraceElement classLoc = s[0];
			    StackTraceElement methodName = s[1];
					    
		 	   throw new NoSuchElementException("\nException Occured- please check the Locator and DOM"
		 	   		+ "\nLine.No   : "+line
		 			+ "\nMethodName: "+methodName
		 			+ "\nClassName : "+classLoc
		 	   		+ "\nelement   : ExpectedConditions.visibilityOfElementLocated("+ele+"),"
		 	   		, e);
		 	   }else {
				e.printStackTrace();
			   }
		  }
		  return targetEle;
	}
	public static  List<WebElement> waitUntilElementsVisible(WebElement ele, boolean assertFlag) {
		  List<WebElement> targetEleLst =  null;
		  try {
		    	targetEleLst  =  new WebDriverWait(Uimanager.getDriver(), Duration.ofSeconds(secondsElementWait)).until(
					              ExpectedConditions.visibilityOfAllElements(ele));
		  }catch(Exception e){
			if(assertFlag) {
				StackTraceElement[] s = new Throwable().getStackTrace();
			    StackTraceElement line = s[3];
			    StackTraceElement classLoc = s[0];
			    StackTraceElement methodName = s[1];
					    
		 	   throw new NoSuchElementException("\nException Occured- please check the Locator and DOM"
		 	   		+ "\nLine.No   : "+line
		 			+ "\nMethodName: "+methodName
		 			+ "\nClassName : "+classLoc
		 	   		+ "\nelement   : ExpectedConditions.visibilityOfElementLocated("+ele+"),"
		 	   		, e);
		 	   }else {
				e.printStackTrace();
			   }
		  }
		  return targetEleLst;
	}
	
	public static void shortUnInteruptedSleep() {
	        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(6));	
	}
	
	public static void longUnInteruptedSleep() {
      Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));	
}
	
	
}

