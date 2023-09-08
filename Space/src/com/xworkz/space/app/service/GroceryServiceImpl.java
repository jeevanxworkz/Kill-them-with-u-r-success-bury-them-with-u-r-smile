package com.xworkz.space.app.service;

import com.xworkz.space.app.repositry.GroceryRepositry;

public class GroceryServiceImpl implements Groceryservice {
	
	private GroceryRepositry groceryRepositry;
	
	public GroceryServiceImpl(GroceryRepositry grtistRepositry) {
		this.groceryRepositry.save(grocery);;
	}

	@Override
	public void ValidateandSave (String grocery) {
		System.out.println("invoking ValidateandSave from "+ this.getClass().getSimpleName());
		if(grocery!=null && !grocery.isEmpty() && grocery.length() >=0 && grocery.length() >=3)
		{
			System.out.println("Grocery data is valid");
			this.groceryRepositry.save(grocery);
		}
		else {
			System.err.println("Grocery data is invalid");
		}
		
		
		return;
	}

}
