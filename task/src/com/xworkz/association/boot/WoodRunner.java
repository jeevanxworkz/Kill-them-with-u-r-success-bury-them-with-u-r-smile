package com.xworkz.association.boot;

import com.xworkz.association.app.*;

public class WoodRunner {
	
	public static void main(String[] args) {
		System.out.println("invoking main in WoodRunner");
		String name = "Navneet";
		Paper paper = new Paper();
		Wood wood = new Wood(name);
		paper.setpaper(paper);
		paper.Reading();

	}

}