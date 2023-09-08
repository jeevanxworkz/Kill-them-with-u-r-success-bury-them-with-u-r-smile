package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.WeatherDTO;

public interface WeatherService {
	
	default boolean ValidateAndSave(WeatherDTO dtos) {
		return false;
	}

}
