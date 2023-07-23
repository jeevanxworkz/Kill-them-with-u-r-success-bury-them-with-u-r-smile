class HelmetKiller{
	
	public static void main(String[] args){
		
		System.out.println("invoking main method in HelmetKiller");
		
		Helmet helmet=new Helmet("vega",1999.00f,4,"black");
		Helmet.printStatic();
		helmet.printInstance();
		
		
		
	}
}