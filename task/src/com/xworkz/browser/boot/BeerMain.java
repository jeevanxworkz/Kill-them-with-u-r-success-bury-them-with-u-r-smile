package com.xworkz.browser.boot;

import com.xworkz.browser.app.Beer;
import com.xworkz.browser.impl.KingfisherStrong;

public class BeerMain {
	public static void main(String[] args)
	
	KingfisherStrong shop=new KingfisherStrong();

	Beer beer=new Beer();
	beer.setWineshop(shop);
	beer.drinkBeer();


}
