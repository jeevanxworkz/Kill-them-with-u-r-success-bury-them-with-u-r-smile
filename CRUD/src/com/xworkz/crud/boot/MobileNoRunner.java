package com.xworkz.crud.boot;

import com.xworkz.crud.app.repositry.MobileNoRepositry;
import com.xworkz.crud.app.repositry.MobileNoRepositryImpl;
import com.xworkz.crud.app.service.MobileNoService;
import com.xworkz.crud.app.service.MobileNoServiceImpl;

public class MobileNoRunner {
	public static void main(String[] args) {
		
	
	MobileNoRepositry mobileNoRepositry = new MobileNoRepositryImpl();
	
	MobileNoServiceImpl   mobileNoService = new MobileNoServiceImpl(mobileNoRepositry);
	mobileNoService.validateAndSave(8310308343L);
	mobileNoService.validateAndSave(8310308343L);
	mobileNoService.validateAndSave(7892119582L);

	}
}
