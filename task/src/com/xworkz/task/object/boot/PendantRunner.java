package com.xworkz.task.object.boot;
import com.xworkz.task.object.app.*;

public class PendantRunner {
	
	public static void main(String[] args) {
		System.out.println("invoking main in PendantRunner");

		Pendant pendant = new Pendant("Eternal Blossem", "18K Gold", "Filigree Swirls", "Aqua Blue", 2, 10, "Emerald",
				"Rolo Chain", 10000, "Sophia Anderson", "Wedding", "India");
		System.out.println(pendant);

		Pendant pendant1 = new Pendant("Celestial Harmony", "Sterling Silver", "Lotus Mandala", "Rose Gold", 5, 15,
				"Sapphire", "Box Chain", 20000, "Manoj", "Anniversary", "China");
		System.out.println(pendant1);

		Pendant pendant2 = new Pendant("Mystic Gem", "Rose Gold with Platinum", "Ancient Symbols", "Blue", 8, 12,
				"Opal", "Figaro Chain", 30000, "Rajesh", "Birthday", "Japan");
		System.out.println(pendant2);

	}

}