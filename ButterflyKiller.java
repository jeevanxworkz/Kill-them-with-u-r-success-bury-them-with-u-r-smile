class ButterflyKiller{
	
	public static void main(String[] args){
		
		System.out.println("invoking main method in ButterflyKiller");
		
		Butterfly butterfly=new Butterfly("multicolour","insect","animalia","eukaryota");
		Butterfly.printStatic();
		butterfly.printInstance();
		
		
		
	}
}