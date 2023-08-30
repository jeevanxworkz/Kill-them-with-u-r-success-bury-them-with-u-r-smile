package com.xworkz.browser.app;

public class Custom {
	private passportVerification Verification;
	
	public void setverification(Verification verification) {
		this.verification=verification;
	}
	public void verifyCitizen() {
		System.out.println("invoking passport() in Custom");
		this.Verification.verify();
	}

}
