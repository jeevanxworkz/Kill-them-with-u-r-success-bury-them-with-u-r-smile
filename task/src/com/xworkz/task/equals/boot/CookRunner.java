package com.xworkz.task.equals.boot;

import com.xworkz.task.equals.app.*;

public class CookRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in CookRunner");

		Cook cook = new Cook("Ramesh", 30, "Dosa", 2, true, false);
		System.out.println(cook);

		Cook cook1 = new Cook("Sagar", 25, "Idli", 3, true, true);
		System.out.println(cook1);
		System.out.println("*************************");

		boolean same = cook.equals(cook1);
		System.out.println("Contents are same:" + same);

	}

}