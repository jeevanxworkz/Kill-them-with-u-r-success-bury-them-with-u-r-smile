package com.xworkz.dto.app.dto;

import java.io.Serializable;

public class NewspaperDTO implements Serializable {
	private String name;
	private String lang;
	private double price;
	
	public NewspaperDTO() {
		
	}
	
	public NewspaperDTO(String string, String string2, int i) {
	}

	@Override
	public String toString() {
		return "NewspaperDTO [name=" + name + ", lang=" + lang + ", price=" + price + "]";
	}
	
	public String  getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
		}

}
