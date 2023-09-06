package com.xworkz.crud.app.repositry;

public interface PincodeRepositry {
	
	int TOTAL_CODES=10;
	void save(int pincode);
	
	default boolean isExist(int pincode) {
		return false;
		
	}
	

}