package com.xworkz.Chaining.app.boot;
import com.xworkz.Chaining.app.*;

public class GoldRunner {
	public static void main(String[] args) {


		Gold gold= new Gold("KDM",10,58000,"KGF");
		System.out.println(gold.brand);
		System.out.println("gold.quantity");
		
		System.out.println("************");
		
		RoleGold rolegold=new RoleGold();
		System.out.println(rolegold.brand);
		System.out.println(rolegold.quantity);
		System.out.println(rolegold.price);
		System.out.println(rolegold.location);
	
	}

}
