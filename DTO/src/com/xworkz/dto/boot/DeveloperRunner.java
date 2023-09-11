package com.xworkz.dto.boot;

import com.xworkz.dto.app.dto.DeveloperDTO;
import com.xworkz.dto.app.repositry.DeveloperRepository;
import com.xworkz.dto.app.repositry.DeveloperRepositoryImpl;
import com.xworkz.dto.app.service.DeveloperService;
import com.xworkz.dto.app.service.DeveloperServiceImpl;

public class DeveloperRunner {
	
	public static void main(String[] args) {
		
		DeveloperRepository developerRepository = new DeveloperRepositoryImpl();
		DeveloperService developerService = new  DeveloperServiceImpl(developerRepository);
		
		DeveloperDTO dto = new DeveloperDTO("Jeevan k",2,40000,"capgemeni","Developer",true);
		developerService.ValidateAndsave(dto);
		
		DeveloperDTO dto1 = new DeveloperDTO("Jeevan k",2,40000,"capgemeni","Developer",true);
		developerService.ValidateAndsave(dto1);
		
		DeveloperDTO dto2 = developerService.findbyName("Jeevan k");

		
		DeveloperDTO dto3 = developerService.findbyWorkingFor("capgemeni");
		
		
		DeveloperDTO dto4 = developerService.findbyDesignation("Developer");
		
		
	}

}
