package com.xworkz.space.boot;
import com.xworkz.space.app.repositry.JacketRepositry;
import com.xworkz.space.app.repositry.JacketRepositryImpl;

public class JacketRepositryRunner {
	
public static void main(String[] args) {
		
		JacketRepositry Jacketname = new JacketRepositryImpl();
		Jacketname.save("ALLEN SOLLEY");
		Jacketname.save("BIGBOSS");
		Jacketname.save("TRIDENT");
		Jacketname.save("HONDA");
		Jacketname.save("BULL");
		Jacketname.save("DECHATLAN");
		Jacketname.save("ROYAL ENFIELD");
		Jacketname.save("JAWA");
		Jacketname.save("YAMAHA");
		Jacketname.save("SUZUKI");
		
		
	}

}