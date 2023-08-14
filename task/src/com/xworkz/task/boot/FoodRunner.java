package com.xworkz.task.boot;

import com.xworkz.task.app.Burger;
import com.xworkz.task.app.Food;

public abstract class FoodRunner {
	
	public static void main(String[] args) {
		System.out.println("invoking main in FoodRunner");

		Food food = new Burger();
		food.displayInfo();
		food.eat();
		food.printType();
		food.isHealthy();
		food.printHealthStatus();
		System.out.println("******abstract method********");
		food.prepareIngredients();
		food.cook();
		food.serve();
		food.getType();
		food.isVegetarian();

	}

}