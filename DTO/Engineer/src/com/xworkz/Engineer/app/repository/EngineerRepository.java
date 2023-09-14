package com.xworkz.Engineer.app.repository;

import com.xworkz.Engineer.app.dto.EngineerDTO;

public interface EngineerRepository {

	int TOTAL_ITEMS=5;
	void save (EngineerDTO dtos);
	
	default boolean isExist(EngineerDTO dtos) {
		return false;
		
		
	}
}
