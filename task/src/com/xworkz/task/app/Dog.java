package com.xworkz.task.app;

public abstract class Dog extends Animal {
	
	@Override
	public void makeSound() {
		System.out.println("invoking makeSound() in Dog");
	}

	@Override
	public void eat() {
		System.out.println("invoking eat() in Dog");
	}

	@Override
	public void sleep() {
		System.out.println("invoking sleep() in Dog");
	}

	@Override
	public String getType() {
		System.out.println("invoking getType() in Dog");
		return "Dog";
	}

	@Override
	public boolean isPet() {
		System.out.println("invoking isPet() in Dog");
		return true;
	}
}
