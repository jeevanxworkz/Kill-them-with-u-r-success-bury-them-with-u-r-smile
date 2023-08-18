package com.xworkz.task.equals.boot;

import com.xworkz.task.equals.app.*;

public class SniperRunner {
	
	public static void main(String[] args) {
		System.out.println("invoking main SniperRunner");

		Sniper sniper = new Sniper("M24", 5, "M40A5", 0.97, 30, false);
		System.out.println(sniper);

		Sniper sniper1 = new Sniper("KAR98", 3, "M30A3", 0.95, 20, true);
		System.out.println(sniper1);
		System.out.println("****************************");

		boolean same = sniper.equals(sniper1);
		System.out.println("Contents are same:" + same);

	}

}