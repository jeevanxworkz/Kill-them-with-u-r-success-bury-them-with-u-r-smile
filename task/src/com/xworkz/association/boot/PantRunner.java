package com.xworkz.association.boot;

import com.xworkz.association.app.*;

public class PantRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in PantRunner");
		String color = "Blue";
		Zip zip= new Zip();
		Pant pant= new Pant(color);
		zip.setZip(zip);
		pant.Runner();

	}

}