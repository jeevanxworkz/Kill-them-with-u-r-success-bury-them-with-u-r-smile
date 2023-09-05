package com.xworkz.space.app.service;

import com.xworkz.space.app.repositry.JacketRepositry;

public class JacketServiceImpl implements JacketService {
	
	private JacketRepositry jacketRepositry;
	
	public JacketServiceImpl(JacketRepositry jacketRepositry) {
	this.jacketRepositry=jacketRepositry;
	}
	@Override
	public void brands(String names) {
		System.out.println("invoking Brands from "+ this.getClass().getSimpleName());
		if(names!=null && !names.isEmpty() && names.length() >=0 && names.length() >=3)
		{
			System.out.println("Brands data is valid");
		}
		else {
			System.err.println("Brands data is invalid");
				
			}
		return;
	
		}


}
