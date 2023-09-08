package com.xworkz.dto.app.repositry;

import com.xworkz.dto.app.dto.AadharDTO;

public class AadharRepositoryImpl implements AadharRepository {
	
	private AadharRepository dto[] = new AadharRepository[TOTAL_ITEMS];
	private int position;
	
	@Override
	public void save(AadharDTO dtos) {
		System.out.println("invoking save in"+this.getClass().getSimpleName());
		if(position<TOTAL_ITEMS) {
			this.dto[position] = (AadharRepository) dtos;
			System.out.println("stored dto at position"+this.position);
			this.position++;
		}
		else {
			System.err.println("stored items is more than stored items");
			}
		}
	}