package com.xworkz.crud.app.repositry;

public interface CountryRepositry {
	int TOTAL_ITEMS=10;
	void store(String countries);
	
	default boolean isExist(String countries) {
		return false;
	
	

}
	
	
}
