package com.xworkz.dto.app.dto;

import java.io.Serializable;

public class DoctorDto implements Serializable {
	
	private String name;
	private String hospitalName;
	private int experience;
	
	public DoctorDto() {
		
	}
	public DoctorDto(String string, String string2, int i) {
	}
	@Override
	public String toString() {
		return "DoctorDto [name=" + name + ", hospitalName=" + hospitalName + ", experience=" + experience + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String gethospitalName() {
		return hospitalName;
	}
	public void sethospitalName(String hospitalName) {
		this.hospitalName=hospitalName;
	}
	public int getexperience() {
		return experience;
	}
	public void setexperience(int experience) {
		this.experience=experience;
		
	}

}
