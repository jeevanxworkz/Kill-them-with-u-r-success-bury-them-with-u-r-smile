package com.xworkz.task.object.app;

public class Flag {
	
	private String Country;
	private String usedOn;
	private String Color;
	
	public Flag() {
		
	}
	
	public Flag(String Country,String usedOn,String Color) {
		super();
		this.Country=Country;
		this.usedOn=usedOn;
		this.Color=Color;
	}
	@Override
	public String toString() {
		System.out.println("invoking toString in Flag");
		return "Country:"+Country+"usedOn:"+usedOn+"Color:"+Color; 
	}
}
