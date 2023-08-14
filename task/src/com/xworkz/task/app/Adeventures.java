package com.xworkz.task.app;

public abstract class Adeventures {
	
	private void roadTrip() {
		System.out.println("invoking RoadTrip Method.....");
	}

	public void manaliTrip() {
		System.out.println("invoking manali Trip Method.....");
	}

	protected void rajasthanTrip() {
		System.out.println("invoking rajasthan Trip Method.....");
	}

	void keralaTrip() {
		System.out.println("invoking Kerala Trip Method.....");
	}

	public void mumbaiTrip() {
		System.out.println("invoking MumbaiTrip Method.....");
	}

	public abstract void watergames();

	public abstract void skyDiving();

	public abstract void rollerCoster();

	public abstract void bungeeJump();

	protected abstract void paragliding();

}

