package com.xworkz.inheritance.casting.app.util;

import com.xworkz.inheritance.casting.app.*;

public class BrowserUtil {
	public static void history(Browser browser)
	{
		System.out.println("invoking run in BrowserUtil");
		System.out.println("browser.searchEngine");
		browser.info();
		if(browser instanceof ChromeBrowser)
		{
			System.out.println("********ChromeBrowser********");
			ChromeBrowser chromeBrowser=(ChromeBrowser)browser;
			System.out.println("ChromeBrowser.Web");
			chromeBrowser.browsing();
		}
		if(browser instanceof OperaBrowser)
		{
			System.out.println("******* OperaBrowser***********");
			OperaBrowser operaBrowser=(OperaBrowser)browser;
			System.out.println("OperaBrowser.Web");
			operaBrowser.browsing();
		}
		if(browser instanceof FireFox)
		{
			System.out.println("********FireFox************");
			FireFox firefox=(FireFox)browser;
			System.out.println("FireFox.Web");
			firefox.browsing();
		}
		if(browser instanceof Edge)
		{
			System.out.println("***********Edge**********");
			Edge edge=(Edge)browser;
			System.out.println("Edge.Web");
			edge.browsing();
			
		
			}
			
		}
			
 }


