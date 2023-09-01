package com.xworkz.space.app.repositry;

public class ArtistRepositryImpl implements ArtistRepositry {
	
	String[] Artists = new String[TOTAL_NAMES];
	int position;

	@Override
	public void save(String name) {
	System.out.println("invoking save in ArtistRepositry");
	if(position<TOTAL_NAMES)
	{
		this.Artists[position]=name;
		System.out.println("invoking save in ArtistRepositry");
		System.out.println("Stored "+name+" in position "+this.position);
		this.position++;
	}
	else
	{
	System.err.println("stored names is more than stored name");	
	}
		
	}
	

}
