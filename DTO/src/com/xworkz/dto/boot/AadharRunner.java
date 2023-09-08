package com.xworkz.dto.boot;

import com.xworkz.dto.app.dto.AadharDTO;
import com.xworkz.dto.app.repositry.AadharRepository;
import com.xworkz.dto.app.repositry.AadharRepositoryImpl;
import com.xworkz.dto.app.service.AadharService;
import com.xworkz.dto.app.service.AadharServiceImpl;

public class AadharRunner {
	
	public static void main(String[] args) {
		
		 AadharRepository aadharRepository = new AadharRepositoryImpl();
		 AadharService aadharService = new AadharServiceImpl(aadharRepository);
		 AadharDTO dto = new AadharDTO("JEEVAN K","BHADRAVTAHI",1);
		 boolean repo=aadharService.ValidateAndSave(dto);
	}

}
