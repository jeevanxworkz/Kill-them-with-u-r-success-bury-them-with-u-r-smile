package com.xworkz.browser.boot;

import com.xworkz.browser.app.*;
import com.xworkz.browser.impl.*;

public class BrowserMain {
	
	public static void main(String args[]) {
		Internet internet = new ChromeBrowser();
		
		Browser browser=new Browser();
		browser.setinternet(internet);
		browser.connect();
		
	}

}
