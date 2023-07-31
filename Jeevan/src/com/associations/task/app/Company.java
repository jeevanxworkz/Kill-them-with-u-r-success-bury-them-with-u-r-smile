package com.associations.task.app;

public class Company {
	
	public String name;
	public String ceo;
	public String originCountrty;
	
	public Company(String name,String ceo,String originCountry) {
		this.name=name;
		this.ceo=ceo;
		this.originCountrty=originCountry;
	}
		public void printInfo() {
		
		System.out.println(this.name);
		System.out.println(this.ceo);
		System.out.println(this.originCountrty);
	}

}
