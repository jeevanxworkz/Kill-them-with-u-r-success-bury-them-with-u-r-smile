class Helmet{
	
	static String brand;
	static float price;
	int noOfSafetystars;
	String color;
	
	
	Helmet(String brand,float price, int noOfSafetystars,String color)
	{
		System.out.println("invoking at argument in helmet"); 
		this.brand=brand;
		this.price=price;
		this.noOfSafetystars=noOfSafetystars;
		this.color=color;
	}
	
	
	static{
		brand="vega";
		price=1999.00f;
		System.out.println("invoking at static in helmet"); 
	}
	
	static void printStatic()
	{
		
		System.out.println("invoking at static void in helmet"); 
		System.out.println(brand);
		System.out.println(price);
	}
	
	
	
	void printInstance()
	{
		System.out.println("invoking at void Instance in helmet"); 
		System.out.println(noOfSafetystars);
		System.out.println(color);
	}
	
}