package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.PrinterDTO;
import com.xworkz.dto.app.repositry.PrinterRepository;

public class PrinterServiceImpl implements PrinterService {
	
	private PrinterRepository printerREpository;
	public  PrinterServiceImpl(PrinterRepository printerRepository) {
		this.printerREpository=printerRepository;
	}
	@Override
    public boolean validateAndSave(PrinterDTO dto) {
		System.out.println("invoking save in"+this.getClass().getSimpleName());
		if(dto!=null) {
			this.printerREpository.save(dto);
			return true;
		}
		else {
			System.err.println("dto is invalid cannot save...");
		}
		return false;
			}
	}