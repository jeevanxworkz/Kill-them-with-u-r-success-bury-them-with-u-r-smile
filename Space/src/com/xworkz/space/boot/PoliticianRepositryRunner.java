package com.xworkz.space.boot;

import com.xworkz.space.app.repositry.PoliticianRepositry;
import com.xworkz.space.app.repositry.PoliticianRepositryImpl;

public class PoliticianRepositryRunner {
	
	public static void main(String[] args) {
	
		PoliticianRepositry politiciantName = new PoliticianRepositryImpl();
		politiciantName.save("ajith");
		politiciantName.save("rajini");
		politiciantName.save("dhanush");
		politiciantName.save("vadivel");
		politiciantName.save("allen");
		politiciantName.save("morkel");
		politiciantName.save("albie");
		politiciantName.save("allen");
		politiciantName.save("solley");
		politiciantName.save("sagar");
		
	}

}