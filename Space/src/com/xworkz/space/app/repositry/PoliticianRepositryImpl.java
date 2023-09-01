package com.xworkz.space.app.repositry;

public class PoliticianRepositryImpl implements PoliticianRepositry {

	String[] Politicians = new String[TOTAL_NAMES];
			int position;
	
	@Override
	public void save(String name) {
		System.out.println("invoking save in PoliticianRepositry");
		if(position<TOTAL_NAMES)
		{
			this.Politicians[position] = name;
			System.out.println("invoking save in PoliticianRepositry");
			System.out.println("Stored "+name+" in position "+this.position);
			this.position++;
		}
		else
		{
			System.err.println("stored name is more than stored name");
		}
		
		
	}
	

}
