package com.xworkz.task.equals.app;

public class Sniper {
	
	private String name;
	private int age;
	private String rifleModel;
	private double accuracy;
	private int shotsFired;
	private boolean isHidden;

	public Sniper() {

	}

	public Sniper(String name, int age, String rifleModel, double accuracy, int shotsFired, boolean isHidden) {
		super();
		this.name = name;
		this.age = age;
		this.rifleModel = rifleModel;
		this.accuracy = accuracy;
		this.shotsFired = shotsFired;
		this.isHidden = isHidden;
	}

	@Override
	public String toString() {
		System.out.println("invoking toString() in Sniper");
		return "Name:" + name + " Age:" + age + " Model:" + rifleModel + " Acuuracy:" + accuracy + " Shots Fired:"
				+ shotsFired + " Hidden:" + isHidden;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals() in Sniper");
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Sniper) {
				System.out.println("object is of Sniper");
				Sniper snip = (Sniper) obj;
				if (snip.name.equals(this.name) && snip.age == this.age && snip.rifleModel.equals(this.rifleModel)) {
					System.out.println("object and properties are same");
					return true;
				} else {
					System.err.println("object and properties are same");
				}
			} else {
				System.err.println("object is not of Sniper");
			}
		} else {
			System.err.println("obj is null");
		}
		return false;
	}

}
