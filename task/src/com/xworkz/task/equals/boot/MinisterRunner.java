package com.xworkz.task.equals.boot;

import com.xworkz.task.equals.app.*;

public class MinisterRunner {
	
	public static void main(String[] args) {
		System.out.println("invoking main in MinisterRunner");
		
		Minister minister = new Minister("BS Yedurappa","BJP","ChiefMinister","Shikaripura",5,false);
				System.out.println("mInister");
		Minister minister2 = new Minister("BY Vijayendra","BJP","Minister","Shikaripura",5,false);
		        System.out.println("minister2");
		        System.out.println("---------------");
		        
		        boolean same=minister.equals(minister2);
		        System.out.println("all are same"+same);
	}
	

}
