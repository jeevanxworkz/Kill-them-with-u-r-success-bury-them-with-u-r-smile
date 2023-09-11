package com.xworkz.dto.app.repositry;

import com.xworkz.dto.app.dto.DeveloperDTO;

public interface DeveloperRepository {
	
	int TOTAL_ITEMS=5;
	 void save(DeveloperDTO dtos);
	 
   default boolean isExist(DeveloperDTO dtos) {
	   return false;
   }
   default DeveloperDTO findbyName(String name) {
	   return null;
   }
   default DeveloperDTO findbyWorkingFor(String workingFor) {
	   return null;

   }
   default DeveloperDTO findbyDesignation(String Designation) {
	   return null;

   }

}
