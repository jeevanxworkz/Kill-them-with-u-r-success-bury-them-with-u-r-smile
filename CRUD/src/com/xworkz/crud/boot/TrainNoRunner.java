package com.xworkz.crud.boot;

import com.xworkz.crud.app.repositry.TrainNoRepositry;
import com.xworkz.crud.app.repositry.TrainNoRepositryImpl;
import com.xworkz.crud.app.service.TrainNoService;
import com.xworkz.crud.app.service.TrainNoServiceImpl;

public class TrainNoRunner {

	public static void main(String[] args) {
		
TrainNoRepositry trainNoRepositry = new TrainNoRepositryImpl();
		
		TrainNoService pincodeService = new TrainNoServiceImpl(trainNoRepositry);
		trainNoService.store(10114);
		trainNoService.store(10115);
	}

}
