package com.xworkz.space.app.repositry;

public class PilotRepositryImpl implements PilotRepositry {
	
	String[] Pilots = new String[TOTAL_NAMES];
	int position;

@Override
public void save(String name) {
System.out.println("invoking save in PilotRepositry");
if(position<TOTAL_NAMES)
{
	this.Pilots[position] = name;
	System.out.println("invoking save in PilotRepositry");
	System.out.println("Stored "+name+" in position "+this.position);
	this.position++;
}
else
{
	System.err.println("stored name is more than stored name");
}


}


}