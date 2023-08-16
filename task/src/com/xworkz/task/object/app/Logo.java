package com.xworkz.task.object.app;

public class Logo {

	private String brand;
	private String designer;
	private boolean lookingGood;
	private String color;
	private String logoimage;
	
	public Logo() {
		
	}
	public Logo(String brand,String designer,boolean lookingGood,String color,String logoimage) {
		super();
		this.brand=brand;
		this.designer=designer;
		this.lookingGood=lookingGood;
		this.color=color;
		this.logoimage=logoimage;
	}
		@Override
		public String toString() {
			System.out.println("invoking toString() from Logo0");
			return "brand:"+brand+"designer:"+designer+"lookingGood:"+lookingGood+"color:"+color+"logoimage:"+logoimage;		
			}
		}
