package com.xworkz.task.app;

public abstract class Mall {
	
	public void enter() {
		System.out.println("this is enter  method");
	}
	public void exit() {
		System.out.println("this is exit  method");
	}
	public void shop() {
		System.out.println("this is shop  method");
	}
	public void payment() {
		System.out.println("this is payment  method");
	}
	public void viewAllStores() {
		System.out.println("this is viewAllStores method");
	}


   public abstract void openStore();
   public abstract void closeStore();
   public abstract void giveAssistance();
   public abstract void organizeEvent();
   public abstract void giveDiscount();
   

}