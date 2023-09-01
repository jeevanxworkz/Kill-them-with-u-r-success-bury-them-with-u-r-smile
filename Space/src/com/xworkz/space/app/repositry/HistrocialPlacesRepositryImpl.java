package com.xworkz.space.app.repositry;

public class HistrocialPlacesRepositryImpl implements HistrocialPlacesRepositry {

	String[] HistrocialPlaces = new String[TOTAL_PLACES];
	int position;

@Override
public void save(String place) {
System.out.println("invoking save in HistrocialPlacesRepositry");
if(position<TOTAL_PLACES)
{
	this.HistrocialPlaces[position] = place;
	System.out.println("invoking save in HistrocialRepositry");
	System.out.println("Stored "+place+" in position "+this.position);
	this.position++;
}
else
{
	System.err.println("stored name is more than stored name");
}


}
}