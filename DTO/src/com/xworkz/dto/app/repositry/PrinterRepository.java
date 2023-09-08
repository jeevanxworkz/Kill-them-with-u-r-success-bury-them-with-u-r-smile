package com.xworkz.dto.app.repositry;

import com.xworkz.dto.app.dto.PrinterDTO;

public interface PrinterRepository {
	
	int TOTAL_ITEMS=5;
	void save(PrinterDTO dtos) ;
}