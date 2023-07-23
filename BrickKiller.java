class BrickKiller{
	
	public static void main(String[] args){
		
		System.out.println("invoking main method in BrickKiller");
		
		Brick brick=new Brick("KDM",12.00f,"rectangular","red");
		Brick.printStatic();
		brick.printInstance();
		
		
		
	}
}