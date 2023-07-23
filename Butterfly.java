class Butterfly{
	
	static String multicolour;
	static String type;
	String kingdom;
	String domain;
	
	
	Butterfly(String multicolour,String type,String kingdom,String domain)
	{
		System.out.println("invoking at argument in Butterfly"); 
		this.multicolour=multicolour;
		this.type=type;
		this.kingdom=kingdom;
		this.domain=domain;
	}
	
	
	static{
		colour="multicolour";
		type="insect";
		System.out.println("invoking at static in butterfly"); 
	}
	
	static void printStatic()
	{
		
		System.out.println("invoking at static void in butterfly"); 
		System.out.println(multicolour);
		System.out.println(type);
	}
	
	
	
	void printInstance()
	{
		System.out.println("invoking at void Instance in butterfly"); 
		System.out.println(kingdom);
		System.out.println(domain);
	}
	
}