package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.AadharDTO;

public interface AadharService {
	
	default boolean ValidateAndSave (AadharDTO dto){
		return false;
	}

	boolean validateAndSave(AadharDTO dto);

}
