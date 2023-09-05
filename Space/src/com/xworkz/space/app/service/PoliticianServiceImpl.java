package com.xworkz.space.app.service;

import com.xworkz.space.app.repositry.JacketRepositry;
import com.xworkz.space.app.repositry.PoliticianRepositry;

public class PoliticianServiceImpl implements PoliticianService {

	private PoliticianRepositry politicianRepositry;
	
	public PoliticianServiceImpl(PoliticianRepositry politicianRepositry) {
		this.politicianRepositry=politicianRepositry;
	}
	@Override
	public void name(String names) {
		System.out.println("invoking name from "+ this.getClass().getSimpleName());
		if(names!=null && !names.isEmpty() && names.length() >=0 && names.length() >=3) {
			{
	
	System.out.println("name data is valid");
}
			else{			
	System.err.println("name data is invalid");
}
return;
	}

}
