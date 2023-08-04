package com.xworkz.Chaining.app.boot;
import com.xworkz.Chaining.app.*;

public class MushroomRunner {
	public static void main(String[] args) {
		
		Mushroom mushroom= new Mushroom("KA","White",150,80);
		System.out.println(mushroom.location);
		System.out.println("mushroom.colour");
		
		System.out.println("************");
		
		ButtonMushroom buttonmushroom=new ButtonMushroom();
		System.out.println(buttonmushroom.location);
		System.out.println(buttonmushroom.colour);
		System.out.println(buttonmushroom.quantity);
		System.out.println(buttonmushroom.price);
		
		
	}

}
