package com.xworkz.inheritance.casting.app.util;
import com.xworkz.inheritance.casting.app.*;

public class ChocolateUtil {
	public static void taste(Chocolate chocolate)
	{
		System.out.println("invoking taste in ChocolateUtil ");
		System.out.println(chocolate.name);
		chocolate.chocolateInfo();
		if (chocolate instanceof DarkChocolate)
		{
			System.out.println("**************DarkChocolate***************");
			DarkChocolate darkChocolate=(DarkChocolate)chocolate;
			System.out.println(darkChocolate.price);
			darkChocolate.darkInfo();
		}
		if (chocolate instanceof CaramelChocolate)
		{
			System.out.println("****************CaramelChocolate**************");
			CaramelChocolate caramelChocolate=(CaramelChocolate)chocolate;
			System.out.println(caramelChocolate.quantity);
			caramelChocolate.ingredient();;
		}
	}

}


