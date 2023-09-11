package com.xworkz.dto.app.repositry;

import com.xworkz.dto.app.dto.DeveloperDTO;

public class DeveloperRepositoryImpl implements DeveloperRepository {
	
	private DeveloperDTO dtos[] = new DeveloperDTO[TOTAL_ITEMS];
	private int position;
	
	@Override
	public void save(DeveloperDTO dtos) {
		System.out.println("invoking DeveloperDTO in"+ this.getClass().getSimpleName());
		if(position<TOTAL_ITEMS) {
			this.dtos[position]=(DeveloperDTO)dtos;
			System.out.println("stored dto at position"+this.position);
			this.position++;
		}else
		{
			System.err.println("stored item is more than stored item");
		}

	}
	
	
	@Override
	public boolean isExist(DeveloperDTO dtos) {
		System.out.println("Running isExist in"+this.getClass().getSimpleName());
		for(int index = 0; index < this.position;index++) {
			DeveloperDTO ref = this.dtos[index];
			if(ref!= null && ref.equals(dtos)) {
				System.out.println("dto is already exist");
				return true;
			}
		}
		return DeveloperRepository.super.isExist(dtos);
			
		}
	@Override
	public DeveloperDTO findbyName(String name) {
		System.out.println("running findbyName, arg passed" +name);
		for(int index=0;index < this.position; index++)
		{
			DeveloperDTO dto = this.dtos[index];
			if (dto.getName().equals(name)) 
			{
				System.out.println("dto is found with name");
				return dto;
			}
			else 
			{
				System.err.println("dto is not found");
				return DeveloperRepository.super.findbyName(name);

			}
			}
			return null;
	}
	
	@Override
	public DeveloperDTO findbyWorkingFor(String workingFor) {
		System.out.println("running findbyworkingFor"+workingFor);
		for(int index=0;index<this.position;index++) 
		{
			DeveloperDTO dto=this.dtos[index];
			if(dto.getName().equals(workingFor)) 
			{
				System.out.println("dto is found");
				return dto;
			}
			else 
			{
				System.err.println("name is not found");
				return DeveloperRepository.super.findbyWorkingFor(workingFor);

			}
		}
		return null;
	}

	@Override
	
	public DeveloperDTO findbyDesignation(String Designation) {
		System.out.println("running findbyDesignation"+Designation);
		for(int index=0;index<this.position;index++) 
		{
			DeveloperDTO dto = this.dtos[index];
			if(dto.getName().equals(Designation)) 
			{
				System.out.println("data is found");
				return dto;
			}
			else 
			{
				System.err.println("data is not found");
				return DeveloperRepository.super.findbyDesignation(Designation);

			}
		}
		return null;
				
			}
	}