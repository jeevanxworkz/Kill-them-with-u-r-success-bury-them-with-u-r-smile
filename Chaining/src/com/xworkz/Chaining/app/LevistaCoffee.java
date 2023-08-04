package com.xworkz.Chaining.app;

public class LevistaCoffee extends Coffee {
	
	public LevistaCoffee (String location,String brand,int quantity,double price) {
		super(location,brand,quantity,price);
	}
	public LevistaCoffee() {
		this("BHADRAVATHI","NESCAFE",250,300);
	}
}
	
	
