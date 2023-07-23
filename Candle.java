class Candle{
	
	static String brand;
	static float price;
	int lengthInInch;
	String color;
	
	
	Candle(String brand,float price, int lengthInInch,String color)
	{
		System.out.println("invoking at argument in Candle"); 
		this.brand=brand;
		this.price=price;
		this.lengthInInch=lengthInInch;
		this.color=color;
	}
	
	
	static{
		brand="indiancrystalcompany";
		price=99.00f;
		System.out.println("invoking at static in candle"); 
	}
	
	static void printStatic()
	{
		
		System.out.println("invoking at static void in candle"); 
		System.out.println(brand);
		System.out.println(price);
	}
	
	
	
	void printInstance()
	{
		System.out.println("invoking at void Instance in candle"); 
		System.out.println(lengthInInch);
		System.out.println(color);
	}
	
}