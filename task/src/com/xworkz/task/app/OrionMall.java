package com.xworkz.task.app;

public abstract class OrionMall extends Mall {
	
	@Override
	public void openStore() {
		System.out.println("This is an abstract methods-openStore");
	}

	@Override
	public void closeStore() {
		System.out.println("This is an abstract methods-closeStore");
		
	}

	@Override
	public void giveAssistance() {
		System.out.println("This is an abstract methods-giveAssistance");
		
	}

	@Override
	public void organizeEvent() {
		System.out.println("This is an abstract methods-organize event");
		
	}

	@Override
	public void giveDiscount() {
		System.out.println("This is an abstract methods-giveDiscount");
	}

}