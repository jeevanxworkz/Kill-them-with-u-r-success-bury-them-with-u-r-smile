package com.xworkz.association.app;

public class Passenger {
	
	private String name;
	private Bus bus;
	
	public Passenger(String name) {
		this.name=name;
	}
	public void setBus(Bus bus) {
		this.bus=bus;
	}
	public void Sitting() {
		System.out.println("Sitting in bus");
		this.bus.travelling();
	}

}
