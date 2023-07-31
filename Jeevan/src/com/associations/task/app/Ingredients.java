package com.associations.task.app;

public class Ingredients {
	
	public String name;
	public float quantity;
	public int cost;
	
	public Ingredients(String name,float quantity,int cost) {
		this.name=name;
		this.quantity=quantity;
		this.cost=cost;
	}
	    public void printInfo() {
	    	
			System.out.println(this.name);
			System.out.println(this.quantity);
			System.out.println(this.cost);
			
		}
	}


