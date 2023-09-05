package com.xworkz.space.service.boot;

import com.xworkz.space.app.repositry.JacketRepositry;
import com.xworkz.space.app.repositry.JacketRepositryImpl;
import com.xworkz.space.app.service.JacketServiceImpl;

public class JacketRunner {
	
	public static void main(String[] args) {
		
		JacketRepositry jacketRepositry = new JacketRepositryImpl();
		JacketServiceImpl jacketServiceImpl = new JacketServiceImpl(jacketRepositry);
		
		JacketService.names("ALLEN SOLLEY");
		JacketService.names("BIGBOSS");
		JacketService.names("TRIDENT");
		JacketService.names("HONDA");
		JacketService.names("BULL");
		JacketService.names("DECHATLAN");
		JacketService.names("ROYAL ENFIELD");
		JacketService.names("JAWA");
		JacketService.names("YAMAHA");
		JacketService.names("SUZUKI");
	}

}
