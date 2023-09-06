package com.xworkz.crud.app.repositry;

public interface LocationRepositry {
	
	int TOTAL_ITEMS=10;
	void store(String locations);
	
	default boolean isExist(String locations) {
		return false;
	}
	
	

}
