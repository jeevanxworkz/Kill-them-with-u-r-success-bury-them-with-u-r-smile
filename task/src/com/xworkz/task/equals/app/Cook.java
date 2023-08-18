package com.xworkz.task.equals.app;

public class Cook {
	
	private String name;
	private int age;
	private String specialIn;
	private int yearsOfExperience;
	private boolean isCertified;
	private boolean isFullTime;

	public Cook() {

	}

	public Cook(String name, int age, String specialIn, int yearsOfExperience, boolean isCertified,
			boolean isFullTime) {
		super();
		this.name = name;
		this.age = age;
		this.specialIn = specialIn;
		this.yearsOfExperience = yearsOfExperience;
		this.isCertified = isCertified;
		this.isFullTime = isFullTime;
	}

	@Override
	public String toString() {
		System.out.println("invoking toString() in Cook");
		return "Name:" + name + " Age:" + age + " Speciality:" + specialIn + " Experience:" + yearsOfExperience
				+ " Certified:" + isCertified + " FullTime:" + isFullTime;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equlas() in Cook");
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Cook) {
				System.out.println("object is of Cook");
				Cook co = (Cook) obj;
				if (co.name.equals(this.name) && co.age == this.age && co.specialIn.equals(this.specialIn)
						&& co.yearsOfExperience == this.yearsOfExperience && co.isCertified == this.isCertified) {
					System.out.println("object and Contents are same");
					return true;
				} else {
					System.err.println("object and Properties are not same");
				}
			} else {
				System.err.println("object is not of Cook");
			}
		} else {
			System.err.println("obj is cnull");
		}
		return false;
	}
}