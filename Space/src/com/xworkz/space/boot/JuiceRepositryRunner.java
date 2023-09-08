package com.xworkz.space.boot;

import com.xworkz.space.app.repositry.JuiceRepositryImpl;
import com.xworkz.space.app.service.JuiceRepositry;
import com.xworkz.space.app.service.JuiceService;
import com.xworkz.space.app.service.JuiceServiceImpl;

public class JuiceRepositryRunner {
	
	public static void main(String[] args) {
		
		JuiceRepositry juiceRepositry=new JuiceRepositryImpl();
		JuiceService juiceService = new JuiceServiceImpl(juiceRepositry);
		boolean saved = juiceService.ValidateandSave("fanta");
		System.out.println("saved+"+saved);
		
		
	}

}
