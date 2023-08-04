package com.xworkz.Chaining.app.boot;
import com.xworkz.Chaining.app.*;

public class RopeRunner {
public static void main(String[] args) {
		
		Rope rope= new Rope("Black","SEKURE",250,1000);
		System.out.println(rope.colour);
		System.out.println("rope.brand");
		
		System.out.println("************");
		
		WireRope wirerope=new WireRope();
		System.out.println(wirerope.colour);
		System.out.println(wirerope.brand);
		System.out.println(wirerope.length);
		System.out.println(wirerope.price);
	
	}

		
	}





