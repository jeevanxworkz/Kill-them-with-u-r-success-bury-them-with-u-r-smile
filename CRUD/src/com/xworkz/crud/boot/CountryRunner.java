package com.xworkz.crud.boot;

import com.xworkz.crud.app.repositry.CountryRepositry;
import com.xworkz.crud.app.repositry.CountryRepositryImpl;
import com.xworkz.crud.app.service.CountryService;
import com.xworkz.crud.app.service.CountryServiceImpl;

public class CountryRunner {
	
	public static void main(String[] args) {
		CountryRepositry countryRepositry = new CountryRepositryImpl();
		
		CountryService countryservice = new CountryServiceImpl(countryRepositry);
		
		countryservice.store("INDIA");
		countryservice.store("USA");
		countryservice.store("AUSTRALIA");
		countryservice.store("AFRICA");
		countryservice.store("SOUTHAFRICA");

	}

}
