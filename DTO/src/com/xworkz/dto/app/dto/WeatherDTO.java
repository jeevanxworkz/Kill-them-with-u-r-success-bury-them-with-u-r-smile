package com.xworkz.dto.app.dto;

import java.io.Serializable;

public class WeatherDTO implements Serializable {
	
	private String taluk;
	private String season;;
	
	public WeatherDTO() {
		
	}

	@Override
	public String toString() {
		return "WeatherDTO [taluk=" + taluk + ", season=" + season + "]";
	}
	public String getTaluk() {
		return taluk;
	}
	public void setTaluk(String taluk) {
		this.taluk=taluk;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season=season;
	}
}