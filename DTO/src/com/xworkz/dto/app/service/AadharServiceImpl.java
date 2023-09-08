package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.AadharDTO;
import com.xworkz.dto.app.repositry.AadharRepository;
import com.xworkz.dto.app.repositry.PrinterRepository;

public class AadharServiceImpl implements AadharService {
	
	private AadharRepository aadharRepository;
	public AadharServiceImpl(AadharRepository aadharRepository) {
			this.aadharRepository=aadharRepository;
	}
	@Override
	public boolean validateAndSave(AadharDTO dto) {
		System.out.println("invoking save in"+this.getClass().getSimpleName());
		if(dto!=null) {
			this.aadharRepository.save(dto);
			return true;
		}
		else {
			System.err.println("dto is invalid cannot save...");
		}
		return false;
			}
	}
