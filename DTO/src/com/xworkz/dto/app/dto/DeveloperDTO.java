package com.xworkz.dto.app.dto;

import java.io.Serializable;

public class DeveloperDTO implements Serializable {
	
	private String name;
	private int experience;
	private double salary;
	private String workingFor;
	private String designation;
	private boolean difficult;
	
	
	public DeveloperDTO() {
		
	}


	public DeveloperDTO(String name, int experience, double salary, String workingFor, String designation, boolean difficult) {
		super();
		this.name=name;
		this.experience=experience;
		this.salary=salary;
		this.workingFor=workingFor;
		this.designation=designation;
		this.difficult=difficult;
	}
	
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof DeveloperDTO)
			{
				System.out.println("object is instanceof DeveloperDTO");
			}
			DeveloperDTO casted = (DeveloperDTO)obj;
			if(casted.name.equals(obj) && casted.experience==this.experience && casted.designation.equals(obj) && casted.difficult == this.difficult) 
			{
				System.out.println("instance is same");
				return true;
			}
				else {
					System.out.println("instance is not same");
					return false;
				}
				}
			return super.equals(obj);
			}


	@Override
	public String toString() {
		return "DeveloperDTO [name=" + name + ", experience=" + experience + ", salary=" + salary + ", workingFor="
				+ workingFor + ", designation=" + designation + ", difficult=" + difficult + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience=experience;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public String getWorkingFor() {
		return workingFor;
	}
	public void setWorkingFor(String workingFor) {
		this.workingFor=workingFor;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	public boolean getDifficult() {
		return difficult;
	}
	public void setDifficult(boolean difficult) {
		this.difficult=difficult;
		
	}

}
