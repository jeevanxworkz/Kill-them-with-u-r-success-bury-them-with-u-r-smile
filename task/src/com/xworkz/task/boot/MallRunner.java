package com.xworkz.task.boot;

import com.xworkz.task.app.Mall;
import com.xworkz.task.app.OrionMall;

public abstract  class MallRunner {
	
	public static void main(String[] args) {
		System.out.println("Invoking mall in main");
		
		Mall mall=new OrionMall();
		System.out.println("calling abstract method");
		mall.openStore();
		mall.closeStore();
		mall.giveAssistance();
		mall.viewAllStores();
		mall.organizeEvent();
		mall.enter();
		mall.exit();
		mall.shop();
		mall.payment();
		mall.viewAllStores();
	}

}