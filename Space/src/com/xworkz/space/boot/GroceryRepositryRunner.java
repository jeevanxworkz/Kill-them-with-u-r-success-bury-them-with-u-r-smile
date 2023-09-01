package com.xworkz.space.boot;

import com.xworkz.space.app.repositry.GroceryRepositry;
import com.xworkz.space.app.repositry.GroceryRepositryimpl;

public class GroceryRepositryRunner {

	public static void main(String[] args) {
		
		GroceryRepositry Groceryiesprovision = new GroceryRepositryimpl();
		Groceryiesprovision.save("jaggary");
		Groceryiesprovision.save("egg");
		Groceryiesprovision.save("sugar");
		Groceryiesprovision.save("rice");
		Groceryiesprovision.save("oil");
		Groceryiesprovision.save("thor dall");
		Groceryiesprovision.save("coconut oil");
		Groceryiesprovision.save("noodle");
		Groceryiesprovision.save("soap");
		Groceryiesprovision.save("soap powder");
		
	}
}
