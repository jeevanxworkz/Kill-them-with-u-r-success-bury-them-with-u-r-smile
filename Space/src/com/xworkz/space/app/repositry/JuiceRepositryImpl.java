package com.xworkz.space.app.repositry;

import com.xworkz.space.app.service.JuiceRepositry;

public class JuiceRepositryImpl implements JuiceRepositry {
	
	String[] juicess= new String [TOTAL_ITEMS];
	int position;
	
	@Override
	public void store(String juicess) {
		System.out.println("invoking store in juiceRepositry");
		if(position<TOTAL_ITEMS)
{
	this.juicess[position]=juicess;
	System.out.println("juice is+" + juicess +" stored at position" +position);
	System.out.println("Stored "+juicess+" in position "+this.position);
	this.position++;

}
	else {
		System.err.println("stored juicess is more than stored juicess");	
	}    
       
	}
	
	@Override
	public boolean isExist(String juicess) {
		for(int index=0;index<this.position;index++)
		{
			String temp=this.juicess[index];
			if(temp!=null && temp.equals(temp))
			{
				System.out.println("Juice name is already exist...");
			}
		}
		return false;
	}
	
	
}
