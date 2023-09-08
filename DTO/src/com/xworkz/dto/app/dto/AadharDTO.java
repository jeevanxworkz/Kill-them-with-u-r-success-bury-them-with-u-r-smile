package com.xworkz.dto.app.dto;

import java.io.Serializable;

public class AadharDTO implements Serializable {
	private String name;
	private String city;
	private int number;
	
	public AadharDTO() {
		
	}

	public AadharDTO(String string, String string2, int i) {
	}

	@Override
	public String toString() {
		return "AadharDTO [name=" + name + ", city=" + city + ", number=" + number + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public int  getnumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number=number;

	}
	
}
