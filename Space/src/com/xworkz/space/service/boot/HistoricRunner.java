package com.xworkz.space.service.boot;

import com.xworkz.space.app.repositry.HistrocialPlacesRepositry;
import com.xworkz.space.app.repositry.HistrocialPlacesRepositryImpl;
import com.xworkz.space.app.service.HistrocialService;

public class HistoricRunner {
	
	public static void main(String[] args) {
		
		HistrocialPlacesRepositryImpl historicalRepositry = new HistrocialPlacesRepositryImpl();
		HistrocialService historicalService = new HistrocialService(historicalRepositry);
		
		HistrocialService.places("Dharmastala");
		HistrocialService.places("kukke subramanya");
		HistrocialService.places("chola dynasty");
		HistrocialService.places("shivalaya");
		HistrocialService.places("hampi");
		HistrocialService.places("Thiruchendur");
		HistrocialService.places("palani");
		HistrocialService.places("maruthamalai");
		HistrocialService.places("narasimhaswamytemple");
		HistrocialService.places("belur");
		
	}

}
