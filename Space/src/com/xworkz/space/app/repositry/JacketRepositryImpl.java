package com.xworkz.space.app.repositry;

public class JacketRepositryImpl implements JacketRepositry {
	
	String[] Jackets = new String[TOTAL_BRANDS];
	int position;

	@Override
	public void save(String brands) {
	System.out.println("invoking save in JacketREpositry");
	if(position<TOTAL_BRANDS)
	{
		this.Jackets[position] = brands;
		System.out.println("invoking save in JacketREpositry");
		System.out.println("Stored "+brands+" in position "+this.position);
		this.position++;
	}
	else
	{
		System.err.println("stored brands is more than stored brands");
		
	}
		
	}
	

}
