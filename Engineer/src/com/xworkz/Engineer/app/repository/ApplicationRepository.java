package com.xworkz.Engineer.app.repository;

import com.xworkz.Engineer.app.dto.ApplicationDTO;

public interface ApplicationRepository {
	
	int TOTAL_ITEMS=5;
	void save(ApplicationDTO dtos);
	
	default boolean isExist(ApplicationDTO dtos) {
		return false;
	}
	default ApplicationDTO findbyName(String name) {
		return null;
	}
	default ApplicationDTO findByNameAndDevelopedBy(String name,String Developedby) {
		return null;
		}

	default ApplicationDTO findbyNameAndDevelopedby(String Name, String findbyDevelopedby) {
		return null;
	}
	

}