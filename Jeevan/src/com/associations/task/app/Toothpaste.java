package com.associations.task.app;

public class Toothpaste {
	public String pasteName;
	public String brand;
	public Company company;
	public Ingredients[] ingredients;
	
	public Toothpaste(String pasteName, String brand, Company company, Ingredients[] ingredients) {
		
		this.pasteName=pasteName;
		this.brand=brand;
		this.company=company;
		this.ingredients=ingredients;
		
	}
	
	public void printInfo() {
		
		System.out.println("Paste name: "+this.pasteName);
		System.out.println("Brand: "+this.brand);
		System.out.println("###################");
		
		company.printInfo();
		System.out.println("###################");
		for(int index=0;index < this.ingredients.length;index++)
		{
			
			System.out.println("Ingredients Details:");
			Ingredients ref=this.ingredients[index];
			ref.printInfo();
			System.out.println("###################");
		
		}
	

	}
	
	

	
	
	

}