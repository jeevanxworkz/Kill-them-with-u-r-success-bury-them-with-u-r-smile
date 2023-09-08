package com.xworkz.dto.boot;

import com.xworkz.dto.app.dto.WeatherDTO;
import com.xworkz.dto.app.repositry.WeatherRepository;
import com.xworkz.dto.app.repositry.WeatherRepositoryImpl;
import com.xworkz.dto.app.service.WeatherService;
import com.xworkz.dto.app.service.WeatherServiceImpl;

public class WeatherRunner {
	
	public static void main(String[] args) {
		
		WeatherRepository weatherRepository = new WeatherRepositoryImpl();
		WeatherService weatherService = new WeatherServiceImpl(weatherRepository);
		WeatherDTO weatherDTO = new WeatherDTO("bhadravathi","Rainy");
		weatherService.ValidateAndSave(weatherDTO);
		
		
	}

}
