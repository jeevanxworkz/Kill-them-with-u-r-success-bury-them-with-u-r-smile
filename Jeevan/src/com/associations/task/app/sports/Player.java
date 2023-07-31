package com.associations.task.app.sports;

public class Player {
	public String name;
	public int exp;
	public Hometown town;
	public Building building;
	public Player(String name,int exp,Hometown town,Building building) {
		
		this.name=name;
		this.exp=exp;
		this.town=town;
		this.building=building;
		
	}
	public void printInfo() {
		System.out.println("Player Name: "+name);
		System.out.println("Player experience: "+exp);
		System.out.println("***********************");
	    town.printInfo();
		System.out.println("***********************");
		building.printInfo();
	}

}
