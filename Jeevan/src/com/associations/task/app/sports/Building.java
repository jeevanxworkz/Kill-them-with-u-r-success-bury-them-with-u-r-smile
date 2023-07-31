package com.associations.task.app.sports;

public class Building {
	public Floor[] floors;
	public Lift[] lifts;
	
	public Building(Floor[] floors,Lift[] lifts) {
		this.floors=floors;
		this.lifts=lifts;
		
	}
	public void printInfo() {
		for(int index=0;index<lifts.length; index++) {
			System.out.println("Floors details are:");
			Floor ref=this.floors[index];
			ref.printInfo();
			System.out.println("*********************");
		}
		for(int index=0;index<lifts.length; index++) {
			System.out.println("lifts detatils are:");
			Lift ref=this.lifts[index];
			ref.printInfo();
			System.out.println("*********************");
		}
	}

}
