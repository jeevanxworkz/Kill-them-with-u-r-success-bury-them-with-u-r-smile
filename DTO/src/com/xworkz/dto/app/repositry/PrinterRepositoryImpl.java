package com.xworkz.dto.app.repositry;

import com.xworkz.dto.app.dto.PrinterDTO;

public class PrinterRepositoryImpl implements PrinterRepository {
	
	private PrinterRepository dto[] = new PrinterRepository[TOTAL_ITEMS];
	private int position;

	@Override
	public void save(PrinterDTO dtos) {
		System.out.println("invoking newsPaperDTO in"+ this.getClass().getSimpleName());
		if(position<TOTAL_ITEMS) {
			this.dto[position]=(PrinterRepository) dtos;
			System.out.println("stored dto at position"+this.position);
			this.position++;
		}
		else {
			System.err.println("stored items is more than stored items");
		}

		}

	}
