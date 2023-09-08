package com.xworkz.dto.app.repositry;

import com.xworkz.dto.app.dto.DoctorDto;

public interface DoctorRepository {
	
	int TOTAL_ITEMS=5;
	void save(DoctorRepository dto);
}