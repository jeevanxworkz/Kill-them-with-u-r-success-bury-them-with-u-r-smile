package com.xworkz.Chaining.app.boot;
import com.xworkz.Chaining.app.*;

public class GroundRunner {
public static void main(String[] args) {
		
		Ground ground= new Ground("RamMandir","RAJAJINAGAR",10000,500);
		System.out.println("ground.name");
		System.out.println("ground.location");
		
		System.out.println("************");
		
		CricketGround cricketground=new CricketGround();
		System.out.println(cricketground.name);
		System.out.println(cricketground.location);
		System.out.println(cricketground.length);
		System.out.println(cricketground.capacity);
	
	}

		
	}
