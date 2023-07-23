class Beeru{
	
	static String brand;
	static float cost;
	int shelf;
	String color;
	
	
	Beeru(String brand,float cost,int shelf,String color)
	{
		System.out.println("invoking at argument in Beeru"); 
		this.brand=brand;
		this.cost=cost;
		this.shelf=shelf;
		this.color=color;
	}
	
	
	static{
		brand="GODREJ";
		cost=40000.00f;
		System.out.println("invoking at static in beeru"); 
	}
	
	static void printStatic()
	{
		
		System.out.println("invoking at static void in beeru"); 
		System.out.println(brand);
		System.out.println(cost);
	}
	
	
	
	void printInstance()
	{
		System.out.println("invoking at void Instance in beeru"); 
		System.out.println(shelf);
		System.out.println(color);
	}
	
}