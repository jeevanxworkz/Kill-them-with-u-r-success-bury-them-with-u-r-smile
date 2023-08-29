package com.xworkz.association.app;

public class Wood {
	
	private String name;
	private Paper paper;
	
	public Wood(String name) {
		this.name=name;
	}
	public void setPaper(Paper paper) {
		this.paper=paper;
	}
	public void Reading() {
		System.out.println("Reading in paper");
		this.paper.manufacruringPaper();
	}
}
