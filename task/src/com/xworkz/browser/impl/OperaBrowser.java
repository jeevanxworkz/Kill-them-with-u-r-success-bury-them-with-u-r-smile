package com.xworkz.browser.impl;

import com.xworkz.browser.app.Internet;

public class OperaBrowser implements Internet {
	
	@Override
	public void connect() {
		System.out.println("invoking connect() in OperaBrowser");
		
	}

}
