package com.xworkz.space.boot;

import com.xworkz.space.app.repositry.PatientRepositry;
import com.xworkz.space.app.repositry.PatientRepositryImpl;

public class PatientRepositryRunner {
	
	public static void main(String[] args) {
		PatientRepositry patientName = new PatientRepositryImpl();
		patientName.save("ajith");
		patientName.save("rajini");
		patientName.save("dhanush");
		patientName.save("vadivel");
		patientName.save("allen");
		patientName.save("morkel");
		patientName.save("albie");
		patientName.save("allen");
		patientName.save("solley");
		patientName.save("sagar");
		
	}

}
