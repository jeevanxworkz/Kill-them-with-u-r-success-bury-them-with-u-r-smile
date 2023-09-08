package com.xworkz.task.equals.boot;
import com.xworkz.task.equals.app.*;

public class KallaRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in KallaRunner");

		Kalla kalla = new Kalla("Sudeep", 23, 8, true, "Mumbai", 1000);
		System.out.println(kalla);

		Kalla kalla1 = new Kalla("Basu", 24, 9, false, "Bengalore", 800);
		System.out.println(kalla1);
		System.out.println("************************");

		boolean same = kalla.equals(kalla1);
		System.out.println("Contetns are same:" + same);
	}

}