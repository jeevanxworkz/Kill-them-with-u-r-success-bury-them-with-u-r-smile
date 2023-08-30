package com.xworkz.browser.app;

public class Beer implements wineshop {
	
	private WineShop wineshop;

	public void drinkBeer() {
		System.out.println("invoking drinkBeer() in Wineshop...");
		this.wineshop.drinkBeer();
	}

	public void setWineshop(WineShop wineshop) {
		this.wineshop = wineshop;
	}
}