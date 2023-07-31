package com.associations.task.app.sports;

public class Sports {

	public String name;
	public Player[] players;
	
	public Sports(String name,Player[] players){
		this.name=name;
		this.players=players;
	}
	public void printInfo()
	{
		System.out.println("Sports name is: "+name);
		System.out.println("**************************");
		
	for(int index=0;index<this.players.length;index++) 
	{
		System.out.println("player details are");
		Player ref=this.players[index];
		ref.printInfo();
		System.out.println("*******************************");
	}
	
	}

}


