package com.xworkz.dto.app.repositry;

import com.xworkz.dto.app.dto.WeatherDTO;

public interface WeatherRepository {
	
	int TOTAL_ITEMS=5;
	void save(WeatherDTO dtos);
}