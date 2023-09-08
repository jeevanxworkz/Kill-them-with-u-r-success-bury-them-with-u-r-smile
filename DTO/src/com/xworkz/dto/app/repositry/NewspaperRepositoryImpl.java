package com.xworkz.dto.app.repositry;

public abstract class NewspaperRepositoryImpl implements NewspaperRepository {
	
	private NewspaperRepository dto[] = new NewspaperRepository[TOTAL_ITEMS];
	private int position;
	

	
	@Override
	public void save(NewspaperRepository dto) {
		System.out.println("invoking newsPaperDTO in"+ this.getClass().getSimpleName());
		if(position< TOTAL_ITEMS)
		{
			this.dto[position]= dto;
			System.out.println("stored dto at position"+this.position);
			this.position++;
		}
		else {
			System.err.println("stored items is more than stored items");
		}
		
			
			
		}
	}