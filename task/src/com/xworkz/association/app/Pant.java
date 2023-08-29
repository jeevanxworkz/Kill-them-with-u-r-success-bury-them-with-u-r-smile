package com.xworkz.association.app;

public class Pant {

	private String color;
	private Zip zip;
	
	public Pant(String color) {
		this.color=color;
	}
	public void setZip(Zip zip) {
		this.zip=zip;
	}
	public void Runner() {
		System.out.println("Runner in zip");
		this.zip.puttingZip();
	}
}
