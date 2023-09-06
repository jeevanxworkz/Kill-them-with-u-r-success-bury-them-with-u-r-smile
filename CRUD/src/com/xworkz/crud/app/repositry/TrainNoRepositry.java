package com.xworkz.crud.app.repositry;

public interface TrainNoRepositry {
	
	int TOTAL_NOS=10;
	void save(int trainNo);
	
	default boolean isExist(int trainNo) {
		return false;
	}

}