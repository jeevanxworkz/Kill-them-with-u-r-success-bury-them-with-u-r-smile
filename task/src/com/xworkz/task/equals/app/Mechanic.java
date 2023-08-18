package com.xworkz.task.equals.app;

public class Mechanic {
	
	private String name;
	private int age;
	private String specialization;
	private int experienceYears;
	private boolean isAvailable;
	private double hourlyRate;

	public Mechanic() {

	}

	public Mechanic(String name, int age, String specialization, int experienceYears, boolean isAvailable,
			double hourlyRate) {
		super();
		this.name = name;
		this.age = age;
		this.specialization = specialization;
		this.experienceYears = experienceYears;
		this.isAvailable = isAvailable;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String toString() {
		System.out.println("invoking toString() in Mechanic");
		return "Name:" + name + " Age:" + age + " Specialiation:" + specialization + " Experience:" + experienceYears
				+ " Available:" + isAvailable + " Rate per Hour:" + hourlyRate;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals() in Mechanic");
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Mechanic) {
				System.out.println("object is of Mechanic");
				Mechanic mech = (Mechanic) obj;
				if (mech.name.equals(this.name) && mech.age == this.age
						&& mech.specialization.equals(this.specialization)
						&& mech.experienceYears == this.experienceYears) {
					System.out.println("object and properties are same");
					return true;
				} else {
					System.out.println("object and properties are not same");
				}
			} else {
				System.out.println("object is not of Mechanic");
			}
		} else {
			System.out.println("obj is null");
		}
		return false;
	}
}