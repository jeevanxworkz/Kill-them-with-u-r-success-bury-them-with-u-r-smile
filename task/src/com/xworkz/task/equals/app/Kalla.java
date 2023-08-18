package com.xworkz.task.equals.app;

public class Kalla {
	
	private String name;
	private int age;
	private int skillLevel;
	private boolean isWanted;
	private String hideoutLocation;
	private double moneyPerDay;

	public Kalla() {

	}

	public Kalla(String name, int age, int skillLevel, boolean isWanted, String hideoutLocation, double moneyPerDay) {
		super();
		this.name = name;
		this.age = age;
		this.skillLevel = skillLevel;
		this.isWanted = isWanted;
		this.hideoutLocation = hideoutLocation;
		this.moneyPerDay = moneyPerDay;
	}

	@Override
	public String toString() {
		System.out.println("invoking toString() in Kalla");
		return "Name:" + name + " Age:" + age + " Skill Level:" + skillLevel + " Wanted:" + isWanted
				+ " Hide out Location:" + hideoutLocation + " Money per Day:" + moneyPerDay;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("inovking equals() in Kalla");
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Kalla) {
				System.out.println("object is of Kalla");
				Kalla ka = (Kalla) obj;
				if (ka.name.equals(this.name) && ka.age == this.age && ka.skillLevel == this.skillLevel
						&& ka.isWanted == this.isWanted && ka.hideoutLocation.equals(this.hideoutLocation)
						&& ka.moneyPerDay == this.moneyPerDay) {
					System.out.println("object and properties are same");
					return true;
				} else {
					System.err.println("object and properties are not same");
				}
			} else {
				System.err.println("object is not of Kalla");
			}
		} else {
			System.err.println("obj is null");
		}
		return false;
	}
}