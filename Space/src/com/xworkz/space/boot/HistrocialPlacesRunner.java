package com.xworkz.space.boot;

import com.xworkz.space.app.repositry.HistrocialPlacesRepositry;
import com.xworkz.space.app.repositry.HistrocialPlacesRepositryImpl;

public class HistrocialPlacesRunner {
	
public static void main(String[] args) {
		
	HistrocialPlacesRepositry HistrocialPlacesRepositry = new HistrocialPlacesRepositryImpl();
	HistrocialPlacesRepositry.save("ajith");
	HistrocialPlacesRepositry.save("rajini");
	HistrocialPlacesRepositry.save("dhanush");
	HistrocialPlacesRepositry.save("vadivel");
	HistrocialPlacesRepositry.save("allen");
	HistrocialPlacesRepositry.save("morkel");
	HistrocialPlacesRepositry.save("albie");
	HistrocialPlacesRepositry.save("allen");
	HistrocialPlacesRepositry.save("solley");
	HistrocialPlacesRepositry.save("sagar");
		
	}

}