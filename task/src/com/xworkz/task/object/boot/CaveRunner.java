package com.xworkz.task.object.boot;
import com.xworkz.task.object.app.*;

public class CaveRunner {

	public static void main(String[] args) {
		
		System.out.println("invoking main in CaveRunner");

		Cave cave = new Cave("Crystal Gotto", "Bengalore", false, 120.3, 110.1, false, "LimeStone", "StandAlone", 320,
				1500);
		System.out.println(cave);

		Cave cave1 = new Cave("Echo Cavern", "West Bengal", true, 150.3, 90.1, true, "Lava Tube", "Part of System", 120,
				1200);
		System.out.println(cave1);

		Cave cave2 = new Cave("DarkWater Abyss", "South East", true, 80.3, 100.5, false, "Ice cave", "StandAlone", 550,
				1800);
		System.out.println(cave2);

	}

}
