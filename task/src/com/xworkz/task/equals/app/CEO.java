package com.xworkz.task.equals.app;

public class CEO {
	
	private String companyName;
	private String name;
	private int since;
	private int age;
	private String birthPlace;
	private boolean isNRI;

public CEO() {
	
}

public CEO(String companyName, String name, int since, int age, String birthPlace, boolean isNRI) {
	super();
	this.companyName = companyName;
	this.name = name;
	this.since = since;
	this.age = age;
	this.birthPlace = birthPlace;
	this.isNRI = isNRI;
}
	@Override
	public String toString() {
		System.out.println("invoking toString() in CEO");
		return "companyName:"+companyName+"name:"+name+"since:"+since+"age:"+age+"birthPlace:"+birthPlace+"isNRI:"+isNRI;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals() in CEO ");
		if(obj != null) {
			System.out.println("obj is not null");
			if(obj instanceof CEO) {
				System.out.println("object is of CEO");
				CEO ceo=(CEO)obj;
				if(ceo.name.equals(this.birthPlace) && ceo.companyName == this.companyName){
					System.out.println("all are same");
					return true;
				}else {
					System.out.println("all are not same");
				}
			}else {
				System.out.println("obj is not CEO");
			}
		}else {
			System.out.println("object is null");
		}
		return true;
					
				}
					
					
			}
