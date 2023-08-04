package com.xworkz.Chaining.app;

public class WireRope extends Rope {
	
	public WireRope (String colour,String brand,int length,double price) {
		super(colour,brand,length,price);
	}
	public WireRope() {
		this("Black","SEKURE",250,1000);
	}
}
	
