package com.xworkz.dto.boot;

import com.xworkz.dto.app.dto.DoctorDto;
import com.xworkz.dto.app.repositry.DoctorRepository;
import com.xworkz.dto.app.repositry.DoctorRepositoryImpl;
import com.xworkz.dto.app.service.DoctorService;
import com.xworkz.dto.app.service.DoctorServiceImpl;

public class DoctorRunner {
	public static void main(String[] args) {
		
	 DoctorRepository doctorRepository = new DoctorRepositoryImpl();
	 DoctorService doctorService = new DoctorServiceImpl(doctorRepository);
	 DoctorDto dto = new DoctorDto("jeevan","ksrj",2);
	 boolean repo=doctorService.ValidateAndSave(dto);
}
}
