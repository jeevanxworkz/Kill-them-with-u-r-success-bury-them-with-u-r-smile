class DoorbellRing{
	public static void main(String[] args)
	{
	System.out.println("<<<<<<<<<<DOORBELL>>>>>>>>>>");
	{
		System.out.println("\n");
		
		Doorbell bell=new Doorbell("Wireless");
		System.out.println("Type :"+bell.type);
		System.out.println("No of batteries :"+bell.numberOfBatteries);
		System.out.println("Sound Range :"+bell.soundRange);
		System.out.println("No of Tunes :"+bell.numberOftunes);
		System.out.println("Color :"+bell.color);
		System.out.println("Tune Type :"+bell.tuneType);
		System.out.println("Price :"+bell.price);
		
		System.out.println("**************");
		
		Doorbell bell1=new Doorbell("Wireless",1);
		System.out.println("Type :"+bell1.type);
		System.out.println("No of batteries :"+bell1.numberOfBatteries);
		System.out.println("Sound Range :"+bell1.soundRange);
		System.out.println("No of Tunes :"+bell1.numberOftunes);
		System.out.println("Color :"+bell1.color);
		System.out.println("Tune Type :"+bell1.tuneType);
		System.out.println("Price :"+bell1.price);
		
		System.out.println("**************");
		
		Doorbell bell2=new Doorbell("Wireless",1,300);
		System.out.println("Type :"+bell2.type);
		System.out.println("No of batteries :"+bell2.numberOfBatteries);
		System.out.println("Sound Range :"+bell2.soundRange);
		System.out.println("No of Tunes :"+bell2.numberOftunes);
		System.out.println("Color :"+bell2.color);
		System.out.println("Tune Type :"+bell2.tuneType);
		System.out.println("Price :"+bell2.price);
		
		System.out.println("**************");
		
		Doorbell bell3=new Doorbell("Wireless",1,300,56);
		System.out.println("Type :"+bell3.type);
		System.out.println("No of batteries :"+bell3.numberOfBatteries);
		System.out.println("Sound Range :"+bell3.soundRange);
		System.out.println("No of Tunes :"+bell3.numberOftunes);
		System.out.println("Color :"+bell3.color);
		System.out.println("Tune Type :"+bell3.tuneType);
		System.out.println("Price :"+bell3.price);
		
		
		System.out.println("**************");
		
		Doorbell bell4=new Doorbell("Wireless",1,300,56,"Black");
		System.out.println("Type :"+bell4.type);
		System.out.println("No of batteries :"+bell4.numberOfBatteries);
		System.out.println("Sound Range :"+bell4.soundRange);
		System.out.println("No of Tunes :"+bell4.numberOftunes);
		System.out.println("Color :"+bell4.color);
		System.out.println("Tune Type :"+bell4.tuneType);
		System.out.println("Price :"+bell4.price);
		
		
		System.out.println("**************");
		
		Doorbell bell5=new Doorbell("Wireless",1,300,56,"Black","Ding Dong,Ringing,Chiming and Buzzing");
		System.out.println("Type :"+bell5.type);
		System.out.println("No of batteries :"+bell5.numberOfBatteries);
		System.out.println("Sound Range :"+bell5.soundRange);
		System.out.println("No of Tunes :"+bell5.numberOftunes);
		System.out.println("Color :"+bell5.color);
		System.out.println("Tune Type :"+bell5.tuneType);
		System.out.println("Price :"+bell5.price);
		
		
		System.out.println("**************");
		
		Doorbell bell6=new Doorbell("Wireless",1,300,56,"Black","Ding Dong,Ringing,Chiming and Buzzing",1200);
		System.out.println("Type :"+bell.type);
		System.out.println("No of batteries :"+bell6.numberOfBatteries);
		System.out.println("Sound Range :"+bell6.soundRange);
		System.out.println("No of Tunes :"+bell6.numberOftunes);
		System.out.println("Color :"+bell6.color);
		System.out.println("Tune Type :"+bell6.tuneType);
		System.out.println("Price :"+bell6.price);
	}
		
		
	}
}