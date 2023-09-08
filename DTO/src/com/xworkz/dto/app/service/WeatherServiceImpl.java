package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.WeatherDTO;
import com.xworkz.dto.app.repositry.WeatherRepository;

public class WeatherServiceImpl implements WeatherService {
	
	private WeatherRepository weatherRepository;
	public WeatherServiceImpl(WeatherRepository weatherRepository) {
		this.weatherRepository = weatherRepository;
	}
	public boolean validateAndSave(WeatherDTO dto) {
		System.out.println("invoking save in"+this.getClass().getSimpleName());
		if(dto!= null) {
			this.weatherRepository.save(dto);
			return true;
		}
		else {
			System.err.println("dto is inavlid cannot save...");
		}
		return false;
		}
		
	}
