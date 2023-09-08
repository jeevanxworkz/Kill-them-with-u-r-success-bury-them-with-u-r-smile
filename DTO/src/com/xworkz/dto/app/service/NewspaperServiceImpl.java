package com.xworkz.dto.app.service;

import com.xworkz.dto.app.repositry.NewspaperRepository;

public  class NewspaperServiceImpl implements NewspaperService {
	
	public NewspaperRepository newspaperRepository;
	public NewspaperServiceImpl (NewspaperRepository newsPaperRepository) {
		this.newspaperRepository=newspaperRepository;
		
	}
	
	public boolean ValidateAndsave(NewspaperRepository dto) {
		System.out.println("invoking save in"+this.getClass().getSimpleName());
		if(dto!= null) {
			System.out.println("if dto is valid");
			this.newspaperRepository.save(dto);
			return true;
			}
		else {
			System.err.println("dto is invalid cannot save...");
	
		}
		return false;
	}
	
	

}
