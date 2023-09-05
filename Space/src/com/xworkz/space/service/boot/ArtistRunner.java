package com.xworkz.space.service.boot;

import com.xworkz.space.app.repositry.ArtistRepositry;
import com.xworkz.space.app.repositry.ArtistRepositryImpl;
import com.xworkz.space.app.service.ArtistService;
import com.xworkz.space.app.service.ArtistServiceImpl;

public class ArtistRunner {
	
	public static void main(String[] args) {
		
		ArtistRepositry artistRepositry = new ArtistRepositryImpl();
		ArtistServiceImpl srtistServiceImpl = new ArtistServiceImpl(artistRepositry);
		
		ArtistService.list("jeevan k");
		ArtistService.list("rupesh k");
		ArtistService.list("vinay hs");
		ArtistService.list("sagar k");
		ArtistService.list("vijay");
		ArtistService.list("harshith");
		ArtistService.list("rajini");
		ArtistService.list("dhanush");
		ArtistService.list("SK");
		ArtistService.list("SANTA");
		
		
		
	}

}
