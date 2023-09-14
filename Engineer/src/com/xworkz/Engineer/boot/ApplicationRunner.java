package com.xworkz.Engineer.boot;

import com.xworkz.Engineer.app.dto.ApplicationDTO;
import com.xworkz.Engineer.app.repository.ApplicationRepository;
import com.xworkz.Engineer.app.repository.ApplicationRepositoryImpl;
import com.xworkz.Engineer.app.service.ApplicationService;
import com.xworkz.Engineer.app.service.ApplicationServiceImpl;

public class ApplicationRunner {
	public static void main(String[] args) {
		
		ApplicationRepository applicationRepository = new ApplicationRepositoryImpl();
		ApplicationService applicationService = new ApplicationServiceImpl(applicationRepository);
		
		ApplicationDTO dto = new ApplicationDTO(8310,"Jeevan K","HP","JavaScript","Java 1.8");
	
		ApplicationDTO dto1 = new ApplicationDTO(8310,"Jeevan K","HP","JavaScript","Java 1.8");

		applicationService.findbyName("Jeevan K");
		
		applicationService.findbyNameAndDevelopedby("Jeevan K","HP");	
	}
}	