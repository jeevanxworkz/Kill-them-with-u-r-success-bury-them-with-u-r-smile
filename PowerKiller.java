class PowerKiller{
	
	public static void main(String[] args)
	{
		System.out.println("invoking main method in PowerKiller");
		Power rate=new Power('P',"L^2 MT^-3","Watt","kg.LM^2");	
		Power.printStatic();
		System.out.println("\n");
		rate.printInstance();
		
	}
}