package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repositry.TrainNoRepositry;

public class TrainNoServiceImpl implements TrainNoService {

	private TrainNoRepositry trainNoRepositry;
	public TrainNoServiceImpl(TrainNoRepositry trainNorepositry) {
	this.trainNoRepositry=trainNorepositry;
	}
	
	@Override
	public boolean store(int trainNo) {
		System.out.println("invoking validate and store to "+this.getClass().getSimpleName());
		if(trainNo >=500000 && trainNo<=1000000) {
			System.out.println("if TrainNo is valid...");
			if(!this.trainNoRepositry.isExist(trainNo)) {
				(this.trainNoRepositry).save(trainNo);
				return true;
			}
			else {
				System.err.println("trainNo already exist...");
			}
		}else {
			System.err.println("Stored valid is invalid, cannot save...");
		}
		return false;
	}

}
