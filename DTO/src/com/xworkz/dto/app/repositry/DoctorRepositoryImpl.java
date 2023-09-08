package com.xworkz.dto.app.repositry;

import com.xworkz.dto.app.dto.DoctorDto;

public class DoctorRepositoryImpl implements DoctorRepository {
	
	private DoctorRepository dto[] = new DoctorRepository[TOTAL_ITEMS];
	private int position;
	
	@Override
	public void save(DoctorDto dto) {
		System.out.println("invoking DoctorDto in"+this.getClass().getSimpleName());
		if(position< TOTAL_ITEMS) {
			this.dto[position]=(DoctorRepository) dto;
			System.out.println("stored dto at position "+this.position);
			this.position++;
		}
		else {
			System.err.println("stored items is more than stored items");
			
		}
	}

}