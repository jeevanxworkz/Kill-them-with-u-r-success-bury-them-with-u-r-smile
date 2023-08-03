package com.xworkz.inheritance.casting.app.util;

import com.xworkz.inheritance.casting.app.Zoo;
import com.xworkz.inheritance.casting.app.StateZoo;
import com.xworkz.inheritance.casting.app.NationalZoo;

public class ZooUtil {
	public static void ticket(Zoo zoo)
	{
		System.out.println("invoking ticket in ZooUtil");
		System.out.println(zoo.name);
		zoo.zooInfo();
		if(zoo instanceof StateZoo)
		{
			System.out.println("****************StateZoo***************");
			StateZoo stateZoo =(StateZoo)zoo;
			System.out.println(stateZoo.noOfAnimal);
			stateZoo.animal();
		}
		if(zoo instanceof NationalZoo)
		{
			System.out.println("*******************NationalZoo***************");
			NationalZoo nationalZoo =(NationalZoo)zoo;
			System.out.println(nationalZoo.location);
			nationalZoo.bird();
		}
	}

}


