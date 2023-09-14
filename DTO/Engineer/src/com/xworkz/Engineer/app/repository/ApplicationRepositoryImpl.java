package com.xworkz.Engineer.app.repository;

import com.xworkz.Engineer.app.dto.ApplicationDTO;

public class ApplicationRepositoryImpl implements ApplicationRepository {
	
	private ApplicationDTO dtos[] = new ApplicationDTO[TOTAL_ITEMS];
	private int position;
	
	
	

	@Override 
	public void save(ApplicationDTO dtos) {
		System.out.println("invoking ApplicatinDTO in"+this.getClass().getSimpleName());
		if(position<TOTAL_ITEMS) {
			this.dtos[position]=(ApplicationDTO)dtos;
			System.out.println("stored DTO at position"+this.position);
			this.position++;
		}
		else
		{
			System.err.println("stored item is more than stored item");
			
		}

	}
	@Override
	public boolean isExist(ApplicationDTO dtos) {
		System.out.println("Running isExist in"+this.getClass().getSimpleName());
		for(int index=0;index < this.position;index++) {
			ApplicationDTO ref = this.dtos[index];
			if(ref!=null && ref.equals(dtos)) {
				System.out.println("dto is already exist");
				return true;
			}
		}
		return ApplicationRepository.super.isExist(dtos);
	}
	@Override
	public ApplicationDTO findbyName(String name) {
		System.out.println("running findbyName"+name);
		for(int index = 0;index < this.position;index++) 
		{
			ApplicationDTO dto=this.dtos[index];
			if(dto.getName().equals(name)) {
				System.out.println("dto is found");
				return dto;
			}
			else 
			{
				System.err.println("dto is not found");
		return ApplicationRepository.super.findbyName(name);
			}
	}
		return null;
	}




@Override

public ApplicationDTO findbyNameAndDevelopedby(String Name,String Developedby) {
	System.out.println("running findbyNameAndDevelopedby"+Name);
	for(int index=0;index<this.position;) 
	{
		ApplicationDTO dto = this.dtos[index];
		if(dto.getName().equals(Name) && dto.getDevelopedby().equals(Developedby)) 
		{
			System.out.println("data is found");
			return dto;
		}
		else 
		{
			System.err.println("data is not found");
			return ApplicationRepository.super.findbyNameAndDevelopedby(Name,Developedby);

		}
	}
	return null;
}
}
	



	
	