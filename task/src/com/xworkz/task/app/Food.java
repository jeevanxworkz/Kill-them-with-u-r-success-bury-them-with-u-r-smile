package com.xworkz.task.app;

public abstract class Food {
	
	public abstract void prepareIngredients();

	public abstract void cook();

	public abstract void serve();

	public abstract String getType();

	public abstract boolean isVegetarian();

	public void displayInfo() {
		System.out.println("invoking displayInfo() in Food");

	}

	public void eat() {
		System.out.println("invoking eat() in Food");
	}

	public void printType() {
		System.out.println("invoking printType() in Food");
	}

	public boolean isHealthy() {
		System.out.println("invoking isHealthy() in Food");
		return false;
	}

	public void printHealthStatus() {
		System.out.println("invoking printHealthStatus() in Food");
	}
}