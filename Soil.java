class Soil{
	
	static String colour;
	static String type;
	String source;
	String importantFor;
	
	
	Soil(String colour,String type,String source,String importantFor)
	{
		System.out.println("invoking at argument in Soil"); 
		this.colour=colour;
		this.type=type;
		this.source=source;
		this.importantFor=importantFor;
	}
	
	
	static{
		colour="brown";
		type="powder";
		System.out.println("invoking at static in soil"); 
	}
	
	static void printStatic()
	{
		
		System.out.println("invoking at static void in soil"); 
		System.out.println(colour);
		System.out.println(type);
	}
	
	
	
	void printInstance()
	{
		System.out.println("invoking at void Instance in soil"); 
		System.out.println(source);
		System.out.println(importantFor);
	}
	
}