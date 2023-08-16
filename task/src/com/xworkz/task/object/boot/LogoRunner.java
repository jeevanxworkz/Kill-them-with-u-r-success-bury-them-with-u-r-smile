package com.xworkz.task.object.boot;
import com.xworkz.task.object.app.*;

public class LogoRunner {
	
	public static void main(String[] args) {
		System.out.println("invoking main in LogoRunner");

		Logo logo = new Logo("SKDM","Jeevan",true,"Yellow","Shirt");
		System.out.println("logo");
		
		Logo logo1 = new Logo("RoyalEnfield","Jeevan",true,"Gold","Gun");
		System.out.println("logo1");
		
		Logo logo2 = new Logo("Hyundai","Jeevan",true,"Chrome","Two customer meeting");
		System.out.println("logo2");
		}

}
