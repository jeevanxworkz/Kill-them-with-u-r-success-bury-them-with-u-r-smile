class BeeruKiller{
	
	public static void main(String[] args){
		
		System.out.println("invoking main method in BeeruKiller");
		
		Beeru beeru=new Beeru("GODREJ",40000.00f,5,"pink");
		Beeru.printStatic();
		beeru.printInstance();
		
		
		
	}
}