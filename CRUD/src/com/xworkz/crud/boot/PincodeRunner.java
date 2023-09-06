package com.xworkz.crud.boot;

import com.xworkz.crud.app.repositry.PincodeRepositry;
import com.xworkz.crud.app.repositry.PincodeRepositryImpl;
import com.xworkz.crud.app.service.PincodeService;
import com.xworkz.crud.app.service.PincodeServiceImpl;

public class PincodeRunner {
	
	public static void main(String[] args) {
		
PincodeRepositry pincodeRepositry = new PincodeRepositryImpl();
		
		PincodeService pincodeService = new PincodeServiceImpl(pincodeRepositry);
		pincodeService.ValidAndSave(577301);
		pincodeService.ValidAndSave(573103);
		
	}

}
