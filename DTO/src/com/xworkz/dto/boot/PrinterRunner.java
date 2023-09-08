package com.xworkz.dto.boot;

import com.xworkz.dto.app.dto.PrinterDTO;
import com.xworkz.dto.app.repositry.PrinterRepository;
import com.xworkz.dto.app.repositry.PrinterRepositoryImpl;
import com.xworkz.dto.app.service.PrinterService;
import com.xworkz.dto.app.service.PrinterServiceImpl;

public class PrinterRunner {
	public static void main(String[] args) {
		
		PrinterRepository printerRepository = new PrinterRepositoryImpl();
		PrinterService printerService = new PrinterServiceImpl(printerRepository);
		PrinterDTO DTO = new PrinterDTO("HP","black",1999);
		boolean repo=printerService.validateAndSave(DTO);
		
	}

}
