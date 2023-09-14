package com.xworkz.Engineer.app.repository;

import com.xworkz.Engineer.app.dto.EngineerDTO;

public class EngineerRepositoryimpl implements EngineerRepository {
	
	private EngineerDTO dtos[] = new EngineerDTO[TOTAL_ITEMS];
	private int position;

	@Override
	public void save(EngineerDTO dto) {

		System.out.println("invoking save in EngineerDTO"+this.getClass().getSimpleName());
		if(position<TOTAL_ITEMS) {
			this.dtos[position]=(EngineerDTO)dto;
			System.out.println("stored dto at position"+this.position);
			this.position++;
		}
		else
		{
			System.err.println("stored item is more than stored item");
		}
	}
	@Override
	public boolean isExist(EngineerDTO dto) {
		System.out.println("Running isExist in"+this.getClass().getSimpleName());
		for(int index=0; index<=position;) {
			EngineerDTO ref = this.dtos[index];
			if(ref!=null && ref.equals(dto))
				System.out.println("dto is already exist");
			return true;
		}
		return EngineerRepository.super.isExist(dto);

	}

}
