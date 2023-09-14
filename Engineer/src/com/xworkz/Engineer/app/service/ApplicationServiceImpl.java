package com.xworkz.Engineer.app.service;

import com.xworkz.Engineer.app.dto.ApplicationDTO;
import com.xworkz.Engineer.app.repository.ApplicationRepository;

public class ApplicationServiceImpl implements ApplicationService {
	
	private ApplicationRepository applicationrepository;
	public ApplicationServiceImpl(ApplicationRepository applicationRepository) {
		this.applicationrepository=applicationRepository;
	}
	

	@Override
	public boolean ValidateAndsave(ApplicationDTO dtos) {
		System.out.println("invoking save in"+this.getClass().getSimpleName());
		if(dtos!=null)
		{
			System.out.println("dto is valid can save");
			int id=dtos.getid();
			String developedBy=dtos.getDevelopedby();
			String developedAt=dtos.getDevelopedat();
			String name=dtos.getName();
			String version=dtos.getVersion();
			if(id!=0 && id<=10000)
			{
				System.out.println("id is valid can save");
			}
			else
			{
				System.err.println("id is invalid cannot save");
				return false;
			}
			if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20 && developedBy!=null && !developedBy.isEmpty()
					&& developedBy.length()>=3 && developedBy.length()<=20 && developedAt!=null && !developedAt.isEmpty() && 
					developedAt.length()>=3 && developedAt.length()<=20 && version!=null && !version.isEmpty() && version.length()>=3 &&
					version.length()<=20)
			{
				System.out.println("all data is valid");
			}
			else
			{
				System.err.println("all data is invalid,cannot save");
				return false;
				
			}
			if(!this.applicationrepository.isExist(dtos))
			{
				this.applicationrepository.save(dtos);
				return true;
			}
		
		}
		else
		{
			System.err.println("dto is invalid");
		}
		return false;
	}

	@Override
	public ApplicationDTO findbyName(String name) {
		System.out.println("invoking findbyName in"+this.getClass().getSimpleName());
		if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20) {
			ApplicationDTO dto = this.findbyName(name);
			System.out.println("dto is found");
			return dto;
		}
		else
		{
			System.err.println("dto is not found");
		}
		return null;
	}

	@Override
	public ApplicationDTO findbyNameAndDevelopedby(String name, String developedby) {
		System.out.println("invoking findbyNameAndDevelopedby in"+this.getClass().getSimpleName());
		if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20) {
		if(developedby!=null && !developedby.isEmpty() && developedby.length()>=3 && developedby.length()<=20){
			ApplicationDTO dto = this.findbyName(name);
			ApplicationDTO dto1 = this.findbyNameAndDevelopedby(name, developedby);
			System.out.println("dto is found");
			return dto;
		}
		else
		{
			System.err.println("dto is not found");
	
		}
		}
		return null;
	}

	}
