package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repositry.CountryRepositry;

public class CountryServiceImpl implements CountryService {
	
	private CountryRepositry countryRepositry;
	public CountryServiceImpl(CountryRepositry countryRepositry) {
		
	}
	

	@Override
	public boolean store(String Countries) {
		System.out.println("invoking store to"+this.getClass().getSimpleName());
		if(Countries != null && !Countries.isEmpty() && Countries.length() >=3 && Countries.length() <=20) {
			System.out.println("if Countries is valid...");
			if(!this.countryRepositry.isExist(Countries)) {
				this.countryRepositry.store(Countries);
				return true;
			}
			else {
				System.err.println("Countries is already exist...");
			}
		}else {
			System.err.println("stored valid is invalid, cannot save...");
			
		}
		return false;
	}

}
