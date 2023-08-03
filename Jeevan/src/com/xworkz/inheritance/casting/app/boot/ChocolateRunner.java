package com.xworkz.inheritance.casting.app.boot;
import com.xworkz.inheritance.casting.app.CaramelChocolate;
import com.xworkz.inheritance.casting.app.Chocolate;
import com.xworkz.inheritance.casting.app.DarkChocolate;
import com.xworkz.inheritance.casting.app.util.ChocolateUtil;

public class ChocolateRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in ChocolateRunner");
		System.out.println("...............................");
		Chocolate chocolate = new Chocolate();
		DarkChocolate darkChocolate = new DarkChocolate();
		CaramelChocolate caramelChocolate = new CaramelChocolate();
		ChocolateUtil.taste(chocolate);
		System.out.println("...............................");
		ChocolateUtil.taste(darkChocolate);
		System.out.println("...............................");
		ChocolateUtil.taste(caramelChocolate);

	}

}


