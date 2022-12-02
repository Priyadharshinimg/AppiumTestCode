package com.elementsenums;

import com.webapplication.Activites;
import com.webapplication.InterfacePage;


public enum PagesNames {

     Activit,
Dashboard,
Login,
Pysusermanager;

	private InterfacePage pageobject;
	
	
	private PagesNames() {
		
		
	}
	
	private InterfacePage getpageobject() {
		return pageobject;
	}
	
}
