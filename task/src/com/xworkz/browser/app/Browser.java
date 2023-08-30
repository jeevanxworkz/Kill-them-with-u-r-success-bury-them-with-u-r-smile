package com.xworkz.browser.app;

public class Browser {
	private Internet internet;
	
	public void setinternet(Internet internet) {
		this.internet=internet;
	}
	public void connect() {
		System.out.println("invoking browsing() in browser");
		this.internet.connect();
	}

}
