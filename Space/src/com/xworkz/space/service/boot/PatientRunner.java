package com.xworkz.space.service.boot;

import com.xworkz.space.app.repositry.PatientRepositry;
import com.xworkz.space.app.repositry.PatientRepositryImpl;
import com.xworkz.space.app.service.PatientServiceImpl;

public class PatientRunner {
	
	public static void main(String[] args) {
		
	PatientRepositry patientRepositry = new PatientRepositryImpl();
	PatientServiceImpl patientServiceImpl = new PatientServiceImpl(patientRepositry);
	
	patientServiceImpl.name("ajith");
	patientServiceImpl.name("rajini");
	patientServiceImpl.name("dhanush");
	patientServiceImpl.name("vadivel");
	patientServiceImpl.name("allen");
	patientServiceImpl.name("morkel");
	patientServiceImpl.name("albie");
	patientServiceImpl.name("allen");
	patientServiceImpl.name("solley");
	patientServiceImpl.name("sagar");
	
	

}
}
