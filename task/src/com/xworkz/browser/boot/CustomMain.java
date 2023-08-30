package com.xworkz.browser.boot;
import com.xworkz.association.app.*;
import com.xworkz.browser.app.Custom;
import com.xworkz.browser.app.PassportVerification;

public class CustomMain {
	public static void main(String[] args) { 
	
	PassportVerification verification=new PassportVerification();

	Custom custom=new Custom();
	custom.setverification(verification);
	custom.verifyCitizen();
	}

}
