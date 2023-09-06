package com.xworkz.crud.boot;

import com.xworkz.crud.app.repositry.LocationRepositry;
import com.xworkz.crud.app.repositry.LocationRepositryImpl;
import com.xworkz.crud.app.service.LocationService;
import com.xworkz.crud.app.service.LocationServiceImpl;

public class LocationRunner {
	
	public static void main(String[] args) {
		
		LocationRepositry locationRepositry = new LocationRepositryImpl();
		
		LocationService locationService = new LocationServiceImpl(locationRepositry);
		locationService.store("Bhadravathi");
		locationService.store("shivamogga");
		locationService.store("arsikere");
		locationService.store("bengaluru");
		locationService.store("coimbatore");

	}

}
