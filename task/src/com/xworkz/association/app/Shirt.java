package com.xworkz.association.app;

public class Shirt {
	
	private String color;
	private Button button;
	
	public Shirt(String color) {
		this.color=color;
	}
	public void setButton(Button button) {
		this.button=button;
	}
	public void Wearing() {
		System.out.println("wearing in button");
		this.button.Wearing();
	}
}