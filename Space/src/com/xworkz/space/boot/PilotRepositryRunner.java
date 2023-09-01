package com.xworkz.space.boot;

import com.xworkz.space.app.repositry.PilotRepositry;
import com.xworkz.space.app.repositry.PilotRepositryImpl;

public class PilotRepositryRunner {
	public static void main(String[] args) {
		
		PilotRepositry pilottName = new PilotRepositryImpl();
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