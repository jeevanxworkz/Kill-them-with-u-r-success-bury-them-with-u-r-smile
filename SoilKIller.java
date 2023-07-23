class SoilKIller{
	
	public static void main(String[] args){
		
		System.out.println("invoking main method in SoilKIller");
		
		Soil soil=new Soil("brown","powder","raw materials","agriculture");
		Soil.printStatic();
		soil.printInstance();
		
		
		
	}
}