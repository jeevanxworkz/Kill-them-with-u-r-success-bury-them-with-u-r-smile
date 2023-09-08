package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.PrinterDTO;

public interface PrinterService {
	
	default boolean validateAndSave(PrinterDTO dtos) {
	return false;
}
}
