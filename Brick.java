class Brick{
	
	static String brand;
	static float cost;
	String shape;
	String color;
	
	
	Brick(String brand,float cost,String shape,String color)
	{
		System.out.println("invoking at argument in Brick"); 
		this.brand=brand;
		this.cost=cost;
		this.shape=shape;
		this.color=color;
	}
	
	
	static{
		brand="KDM";
		cost=12.00f;
		System.out.println("invoking at static in brick"); 
	}
	
	static void printStatic()
	{
		
		System.out.println("invoking at static void in brick"); 
		System.out.println(brand);
		System.out.println(cost);
	}
	
	
	
	void printInstance()
	{
		System.out.println("invoking at void Instance in brick"); 
		System.out.println(shape);
		System.out.println(color);
	}
	
}