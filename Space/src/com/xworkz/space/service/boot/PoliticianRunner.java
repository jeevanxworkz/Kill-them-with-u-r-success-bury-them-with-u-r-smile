package com.xworkz.space.service.boot;

import com.xworkz.space.app.repositry.PatientRepositryImpl;
import com.xworkz.space.app.repositry.PoliticianRepositry;
import com.xworkz.space.app.service.PoliticianService;
import com.xworkz.space.app.service.PoliticianServiceImpl;

public class PoliticianRunner {
	public static void main(String[] args) {
		
		
		PatientRepositryImpl politicianRepositry = new PatientRepositryImpl();
		
		PoliticianService groceryService = new PoliticianServiceImpl(politicianRepositry);
		
		pilottName.save("ajith");
		pilottName.save("rajini");
		pilottName.save("dhanush");
		pilottName.save("vadivel");
		pilottName.save("allen");
		pilottName.save("morkel");
		pilottName.save("albie");
		pilottName.save("allen");
		pilottName.save("solley");
		pilottName.save("sagar");
		
		
	}
	
	

}
