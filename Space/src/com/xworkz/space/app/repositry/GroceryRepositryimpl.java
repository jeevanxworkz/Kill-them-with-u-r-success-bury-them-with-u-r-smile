package com.xworkz.space.app.repositry;

public class GroceryRepositryimpl implements GroceryRepositry {
	
	String[] Groceryies = new String[TOTAL_ITEMS];
	int position;
	
	@Override
	public void save(String items) {
		System.out.println("invoking save in GroceryRepositry");
		if (position<TOTAL_ITEMS)
		{
		this.Groceryies[position]=items;
		System.out.println("Stored "+items+" in position "+this.position);
		this.position++;
		}
		else
		{
			System.err.println("Stored items is more than stored items");
		}
		
		
	}
		
}
		
		

