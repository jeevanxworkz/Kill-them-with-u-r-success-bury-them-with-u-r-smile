package com.xworkz.association.boot;

import com.xworkz.association.app.*;

public class ShirtRunner {
	
	public static void main(String[] args) {
		System.out.println("invoking main in ShirtRunner");
		String color = "White";
		Button but= new Button();
		Shirt shirt= new Shirt(color);
		shirt.setButton(but);
		shirt.Wearing();

	}

}