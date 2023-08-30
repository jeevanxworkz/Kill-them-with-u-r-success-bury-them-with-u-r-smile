package com.xworkz.browser.impl;

import com.xworkz.browser.app.PassportVerification;

public class CitizenLocation implements PassportVerification {
	
	@Override
	public void verifyCitizen() {
		System.out.println("invoking verifyCitizen() in CitizenLocation");
	}
	

}
