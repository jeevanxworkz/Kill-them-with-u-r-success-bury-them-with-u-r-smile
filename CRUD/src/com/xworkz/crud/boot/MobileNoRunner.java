package com.xworkz.crud.boot;

import com.xworkz.crud.app.repositry.MobileNoRepositry;
import com.xworkz.crud.app.repositry.MobileNoRepositryImpl;
import com.xworkz.crud.app.service.MobileNoService;
import com.xworkz.crud.app.service.MobileNoServiceImpl;

public class MobileNoRunner {
	
	MobileNoRepositry mobileNoRepositry = new MobileNoRepositryImpl();
	
	MobileNoService mobileNoService = new MobileNoServiceImpl(mobileNoRepositry);
	mobileNoService.store(8310308343L);
	mobileNoService.store(7026220424L);

}
