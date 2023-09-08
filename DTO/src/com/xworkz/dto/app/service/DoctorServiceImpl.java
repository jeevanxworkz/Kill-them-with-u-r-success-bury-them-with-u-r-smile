package com.xworkz.dto.app.service;

import com.xworkz.dto.app.repositry.DoctorRepository;

public class DoctorServiceImpl implements DoctorService {
	
	public DoctorRepository doctorRepository;
	public DoctorServiceImpl (DoctorRepository doctorRepository) {
		this.doctorRepository=doctorRepository;
		
	}
	public boolean ValidateAndsave(DoctorRepository dto) {
		System.out.println("invoking save in"+this.getClass().getSimpleName());
		if(dto!= null) {
			System.out.println("if dto is valid");
			this.doctorRepository.save(dto);
			return true;
			}
		else {
			System.err.println("dto is invalid cannot save...");
	
		}
		return false;
	}
	
	

}
