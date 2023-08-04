package com.xworkz.Chaining.app.boot;
import com.xworkz.Chaining.app.*;

public class CoffeeRunner {
	public static void main(String[] args) {
		
		Coffee coffee= new Coffee("BHADRAVATHII","NESCAFE",250,300);
		System.out.println(coffee.location);
		System.out.println("coffee.brand");
		
		System.out.println("************");
		
		LevistaCoffee levistacoffee=new LevistaCoffee();
		System.out.println(levistacoffee.location);
		System.out.println(levistacoffee.brand);
		System.out.println(levistacoffee.quantity);
		System.out.println(levistacoffee.price);
	
	}

		
	}


