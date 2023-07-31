package com.associations.task.boot;
import com.associations.task.app.Toothpaste;
import com.associations.task.app.Company;
import com.associations.task.app.Ingredients;

public class ToothpasteRunner {
	public static void main (String[] args) {
		
		System.out.println("running main in ToothpasteRunner");
		String pasteName="MAX FRESH";
		String brand="Colgate";
		Company company=new Company("Colgate","Colgate-Palmolive Company","United States");
		
		Ingredients ingredients1 = new Ingredients("Lavanga", 5.8f, 10);

		Ingredients ingredients2 = new Ingredients("Garlic Powder", 6.90f, 28);

		Ingredients ingredients3 = new Ingredients("Salt", 0.56f, 8);

		Ingredients ingredients4 = new Ingredients("Ginger", 8.40f, 12);

		Ingredients ingredients5 = new Ingredients("Maricha", 10.700f, 38);

		Ingredients[] ingredients = { ingredients1, ingredients2, ingredients3, ingredients4, ingredients5 };

		Toothpaste toothpaste = new Toothpaste(pasteName, brand, company, ingredients);
		toothpaste.printInfo();

	}


		
	
	
			
	}
	

