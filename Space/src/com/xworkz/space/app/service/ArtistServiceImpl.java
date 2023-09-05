package com.xworkz.space.app.service;

import com.xworkz.space.app.repositry.ArtistRepositry;

public class ArtistServiceImpl implements ArtistService {
	
	private ArtistRepositry artistRepositry;
	
	public ArtistServiceImpl(ArtistRepositry artistRepositry) {
		this.artistRepositry=artistRepositry;
	}

	@Override
	public void list(String names) {
		System.out.println("invoking list from "+ this.getClass().getSimpleName());
		if(names!=null && !names.isEmpty() && names.length() >=0 && names.length() >=3)
{
	System.out.println("artist data is valid");
}
else {
	System.err.println("artist data is invalid");
}

    return;

	}

}
