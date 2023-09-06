package com.xworkz.crud.app.repositry;

public interface MobileNoRepositry {
	
int TOTAL_MOBILE_NO_S=5;
	
	void save(long mobileNo);
	
	default boolean isExist(long mobileNo)
	{
		return false;
	}
}
