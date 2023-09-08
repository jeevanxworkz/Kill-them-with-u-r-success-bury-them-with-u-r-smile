package com.xworkz.dto.boot;

import com.xworkz.dto.app.dto.NewspaperDTO;
import com.xworkz.dto.app.repositry.NewspaperRepository;
import com.xworkz.dto.app.repositry.NewspaperRepositoryImpl;
import com.xworkz.dto.app.service.NewspaperService;
import com.xworkz.dto.app.service.NewspaperServiceImpl;

public class NewspaperRunner {

	public static void main(String[] args) {
		
		NewspaperRepository newspaperRepository = new NewspaperRepositoryImpl();
		 NewspaperService newspaperService = new NewspaperServiceImpl(newspaperRepository);
		 NewspaperDTO dto = new NewspaperDTO("TOI","English",5);
		 boolean repo=newspaperService.ValidateAndsave(dto);	}
}