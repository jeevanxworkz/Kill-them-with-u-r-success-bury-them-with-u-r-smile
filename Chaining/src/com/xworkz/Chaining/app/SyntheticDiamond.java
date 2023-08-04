package com.xworkz.Chaining.app;

public class SyntheticDiamond extends Diamond {
	
	public SyntheticDiamond (String brand,String location,int quantity,double price) {
		super(brand,location,quantity,price);
	}
	public SyntheticDiamond() {
		this("harry winston","south africa",1,325000);
	}
}
