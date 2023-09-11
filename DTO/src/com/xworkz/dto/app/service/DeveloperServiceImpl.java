package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.DeveloperDTO;
import com.xworkz.dto.app.repositry.DeveloperRepository;

public class DeveloperServiceImpl implements DeveloperService {
	
	private DeveloperRepository developerRepository;
	public DeveloperServiceImpl(DeveloperRepository developerRepository) {
		this.developerRepository=developerRepository;
	}
	@Override
	public boolean ValidateAndsave(DeveloperDTO dtos) {
		System.out.println("invoking save in"+this.getClass().getSimpleName());
		if(dtos!=null) {
			this.developerRepository.save(dtos);
			return true;
		}
		else
		{
			System.err.println("dto is invalid cannot save...");
			
	}
	return false;
	}
	@Override
	public DeveloperDTO findbyName(String name) {

		System.out.println("Runnig findByName in "+this.getClass().getSimpleName());
		if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20)
		{
			DeveloperDTO dto=this.findbyName(name);
			System.out.println("Name is valid, will find"+dto);
			return dto;
		}
		else
		{
			System.err.println("No dto matched");
		}
		return null;
	}
	@Override
	public DeveloperDTO findbyWorkingFor(String name) {
		
		System.out.println("Running findbyWorkingfor in"+this.getClass().getSimpleName());
		if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20) {
			DeveloperDTO dto1=this.findbyWorkingFor(name);
			System.out.println("name is valid, will find");
			return dto1;
		}
		else {
			System.err.println("No dto matched");
		}
     		return null;
	}
	@Override
	public DeveloperDTO findbyDesignation(String name) {
		System.out.println("Running findbyDesignation in"+this.getClass().getSimpleName());
		if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20) {
			DeveloperDTO dto2=this.findbyDesignation(name);
			System.out.println("name is valid , will find");
			return dto2;
		}
			else 
			{
				System.err.println("No dto matched");
		}
		return null;
	}
			

}