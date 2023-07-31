package com.associations.task.app.sports;

public class Hometown {
	public String name;
	public double pincode;
	public Area[] areas;
	
	public Hometown(String name,double pincode,Area[] areas) {
		
		this.name=name;
		this.pincode=pincode;
		this.areas=areas;
	}
	public void printInfo() {
		System.out.println("HomeTown Name is:"+name);
		System.out.println("pincode is:"+pincode);
		for(int index=0;index<areas.length;index++) {
			Area ref=this.areas[index];
			ref.printInfo();
			
		}
		
	}
	

}
