package com.xworkz.task.app;

public abstract class Burger extends Food {
	
	@Override
	public void prepareIngredients() {
		System.out.println("invoking prepareIngredients() in Burger");
	}

	@Override
	public void cook() {
		System.out.println("invoking prepareIngredients() in Burger");
	}

	@Override
	public void serve() {
		System.out.println("invoking serve() in Burger");
	}

	@Override
	public String getType() {
		System.out.println("invoking getType() in Burger");
		return "Burger";
	}

	@Override
	public boolean isVegetarian() {
		System.out.println("invoking isVegetarian() in Burger");
		return false;
	}

}