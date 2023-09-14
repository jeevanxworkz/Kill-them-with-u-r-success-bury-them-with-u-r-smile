package com.xworkz.garage.app.util.GarageUtil;

import java.util.Optional;

import com.xworkz.garage.app.GarageUtil;

public class GarageRunner {

	public static void main(String[] args) {
		
		Optional<String>optional = GarageUtil.getName("MS","Dhoni");
		if(optional.isPresent())
		{
			String ref=optional.get();
			System.out.println(ref);
		}
		else
		{
			System.out.println("optional ");
		}
	}
}
