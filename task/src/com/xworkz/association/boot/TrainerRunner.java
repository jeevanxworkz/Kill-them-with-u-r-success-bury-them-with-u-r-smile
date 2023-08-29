package com.xworkz.association.boot;
import com.xworkz.association.app.*;

public class TrainerRunner {
	
	public static void main(String[] args) {
		System.out.println("invoking main in LaptopRunner");
		double salary = 10000;
		Laptop lap = new Laptop();
		Trainer train = new Trainer(salary);
		train.setLaptop(lap);
		train.teaching();

	}

}