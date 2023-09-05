package com.xworkz.space.service.boot;

import com.xworkz.space.app.repositry.GroceryRepositry;
import com.xworkz.space.app.repositry.GroceryRepositryimpl;
import com.xworkz.space.app.service.GroceryServiceImpl;
import com.xworkz.space.app.service.Groceryservice;

public class GroceryRunner {
	
	public static void main(String[] args) {
		
		GroceryRepositry groceryRepositry = new GroceryRepositryimpl();
		
		Groceryservice groceryService = new GroceryServiceImpl(groceryRepositry);
		groceryService.ValidateandSave("jaggary");
		groceryService.ValidateandSave("egg");
		groceryService.ValidateandSave("sugar");
		groceryService.ValidateandSave("rice");
		groceryService.ValidateandSave("oil");
		groceryService.ValidateandSave("thor dall");
		groceryService.ValidateandSave("coconut oil");
		groceryService.ValidateandSave("noodle");
		groceryService.ValidateandSave("soap");
		groceryService.ValidateandSave("soap powder");
		
		
		
		
		
	}

}
