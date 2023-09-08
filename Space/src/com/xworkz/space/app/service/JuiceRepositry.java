package com.xworkz.space.app.service;

public interface JuiceRepositry {
	int TOTAL_ITEMS=10;
	void store(String juicess);
	
	default  boolean isExist(String juicess) {
	return false;
}
}
