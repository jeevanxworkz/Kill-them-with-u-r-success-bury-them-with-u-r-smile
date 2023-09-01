package com.xworkz.space.boot;

import com.xworkz.space.app.repositry.ArtistRepositry;
import com.xworkz.space.app.repositry.ArtistRepositryImpl;

public class ArtistRepositryRunner {
	
	public static void main(String[] args) {
		
		ArtistRepositry Artistname = new ArtistRepositryImpl();
		Artistname.save("jeevan k");
		Artistname.save("rupesh k");
		Artistname.save("vinay hs");
		Artistname.save("sagar k");
		Artistname.save("vijay");
		Artistname.save("harshith");
		Artistname.save("rajini");
		Artistname.save("dhanush");
		Artistname.save("SK");
		Artistname.save("SANTA");
		
		
	}

}
