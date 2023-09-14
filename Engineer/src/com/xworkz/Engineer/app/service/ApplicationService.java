package com.xworkz.Engineer.app.service;

import com.xworkz.Engineer.app.dto.ApplicationDTO;

public interface ApplicationService {
	
	boolean ValidateAndsave(ApplicationDTO dtos);
	
	ApplicationDTO findbyName(String name);
	
	ApplicationDTO findbyNameAndDevelopedby(String name,String developedby);
	
		
	}

