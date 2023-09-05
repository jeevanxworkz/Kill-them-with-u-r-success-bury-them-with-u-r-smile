package com.xworkz.space.app.service;

import com.xworkz.space.app.repositry.GroceryRepositry;
import com.xworkz.space.app.repositry.PatientRepositry;

public class PatientServiceImpl implements PatientService {
	
	private PatientRepositry patientRepositry;

		public PatientServiceImpl(PatientRepositry patientRepositry) {
		this.patientRepositry=patientRepositry;
		}
		
		@Override
		public void name(String names) {
			System.out.println("invoking name from "+ this.getClass().getSimpleName());
			if(names!=null && !names.isEmpty() && names.length() >=0 && names.length() >=3)
			{
				System.out.println("Patient data is valid");
			}
			else {
				
				System.err.println("Patient data is invalid");

			}


		return;

	}

}
