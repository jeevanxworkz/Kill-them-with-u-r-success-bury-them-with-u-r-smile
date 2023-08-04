package com.xworkz.Chaining.app;
import com.xworkz.Chaining.app.*;

public class DiamondRunner {
	
public static void main(String[] args) {
		
		Diamond diamond= new Diamond("harry winston","south africa",1,325000);
		System.out.println("diamond.brand");
		System.out.println("diamond.location");
		
		System.out.println("************");
		
		SyntheticDiamond syntheticdiamond=new SyntheticDiamond();
		System.out.println(syntheticdiamond.brand);
		System.out.println(syntheticdiamond.location);
		System.out.println(syntheticdiamond.quantity);
		System.out.println(syntheticdiamond.price);
	
	}

}
