package com.xworkz.association.boot;

import com.xworkz.association.app.*;

public class PassengerRunner {
	
	public static void main(String[] args) {
		System.out.println("invoking main in PassengerRunner");
		String name = "Jeevan K";
		Bus bus = new Bus();
		Passenger pass = new Passenger(name);
		pass.setBus(bus);
		pass.Sitting();

	}

}