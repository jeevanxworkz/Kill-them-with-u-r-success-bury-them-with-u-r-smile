package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.DeveloperDTO;

public interface DeveloperService {
	
	 boolean ValidateAndsave (DeveloperDTO dtos);

	    DeveloperDTO findbyName(String name);
	   
	    DeveloperDTO findbyWorkingFor(String name);

	   DeveloperDTO findbyDesignation(String name);
	

}
