package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.DoctorDto;

public interface DoctorService {
	
	default boolean ValidateAndSave(DoctorDto dto){
		return false;
		
	}
		
	}


