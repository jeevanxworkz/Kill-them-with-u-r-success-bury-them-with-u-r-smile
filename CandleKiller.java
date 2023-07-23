class CandleKiller{
	
	public static void main(String[] args){
		
		System.out.println("invoking main method in CandleKiller");
		
		Candle candle=new Candle("indiancrystalcompany",99.00f,10,"white");
		Candle.printStatic();
		candle.printInstance();
		
		
		
	}
}