package com.xworkz.association.app;

public class Mobile {
	
	private String name;
	private Charger charger;

	public Mobile(String name) {
		this.name = name;
	}

	public void setCharger(Charger charger) {
		this.charger = charger;
	}

	public void msg() {
		System.out.println("msg in mobile");
	}

	public void call() {
		System.out.println("call in Mobile");
	}

	public void typing() {
		System.out.println("typing in Mobile");
	}

	public void music() {
		System.out.println("music in mobile");
		this.charger.battery();
		this.charger.cable();
		this.charger.pin();
		this.charger.voltage();
	}

}