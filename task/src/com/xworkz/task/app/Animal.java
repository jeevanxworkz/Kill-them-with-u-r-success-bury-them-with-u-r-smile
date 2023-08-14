package com.xworkz.task.app;

public abstract class Animal {
	
	public abstract void makeSound();

	public abstract void eat();

	public abstract void sleep();

	public abstract String getType();

	public abstract boolean isPet();

	public void displayInfo() {
		System.out.println("invoking displayInfo() in Animal ");
	}

	public void move() {
		System.out.println("invoking move() in Animal ");
	}

	public void printType() {
		System.out.println("invoking printType() in Animal ");
	}

	public boolean needsGrooming() {
		System.out.println("invoking needsGrooming() in Animal ");
		return false;
	}

	public void printGroomingStatus() {
		System.out.println("invoking printGroomingStatus() in Animal ");
	}
}