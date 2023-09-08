package com.xworkz.dto.app.repositry;

import com.xworkz.dto.app.dto.WeatherDTO;

public class WeatherRepositoryImpl implements WeatherRepository {
	
	private WeatherRepository dto[] = new  WeatherRepository[TOTAL_ITEMS];
	private int position;
	

	@Override
	public void save(WeatherDTO dtos) {
		System.out.println("invoking save in"+this.getClass().getSimpleName());
		if(position<TOTAL_ITEMS) {
			this.dto[position]=(WeatherRepository)dtos;
			System.out.println("stored dto at position"+this.position);
			this.position++;
		}
		else {
			System.err.println("stored items is more than stored items");
		}
	}

}
