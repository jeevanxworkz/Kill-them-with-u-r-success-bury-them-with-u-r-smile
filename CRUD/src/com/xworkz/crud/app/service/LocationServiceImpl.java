package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repositry.LocationRepositry;

public class LocationServiceImpl implements LocationService {
	
	private LocationRepositry locatinRepositry;
	public LocationServiceImpl(LocationRepositry locationRepositry) {
		this.locatinRepositry=locationRepositry;
	}
	

	@Override
	public boolean store(String Location) {
		System.out.println("invoking validate and store to "+this.getClass().getSimpleName());
		if(Location !=null && ! Location.isEmpty() && Location.length() >=3 && Location.length() <=20) {
			System.out.println("if Locations is valid...");
			if(!this.locatinRepositry.isExist(Location)) {
				this.locatinRepositry.store(Location);
				return true;
			}
			else {
				System.err.println("location is already exist...");
			}
		}else {
			System.err.println("Stored valid is invalid, cannot save...");
			}
		return false;
	}

}
