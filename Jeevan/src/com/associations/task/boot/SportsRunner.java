package com.associations.task.boot;
import com.associations.task.app.sports.Area;
import com.associations.task.app.sports.Building;
import com.associations.task.app.sports.Corporator;
import com.associations.task.app.sports.Floor;
import com.associations.task.app.sports.Hometown;
import com.associations.task.app.sports.Lift;
import com.associations.task.app.sports.Player;
import com.associations.task.app.sports.Sports;

public class SportsRunner{
	public static void main(String[] args) {
			System.out.println("running main in SportsRunner");
	String name="Cricket";
	
	
	
	Floor floor1=new Floor("First Floor",1);
	Floor floor2=new Floor("Second Floor",2);
	Floor floor3=new Floor("Third Floor",3);
	Floor floor4=new Floor("Fourth Floor",4);
	Floor floor5=new Floor("Fifth Floor",5);
	Floor floor6=new Floor("Sixth Floor",6);
	Floor floor7=new Floor("Seventh Floor",7);
	
	Floor[] floors= {floor1,floor2,floor3,floor4,floor5,floor6,floor7};
	
	Lift lift1=new Lift(1);
	Lift lift2=new Lift(2);
	
	Lift[] lifts= {lift1,lift2};
	
	Building building1=new Building(floors,lifts);
	Building building2=new Building(floors,lifts);
	
	Building[] buildings={building1,building2};
	
	Corporator corporator=new Corporator("Jeevan",buildings);
	
	Area area1=new Area("Shivamogga",corporator);
	Area area2=new Area("Bhadravathi",corporator);
	Area[] areas= {area1,area2};
	
	Hometown town=new Hometown("Bhadravathi",577301d,areas);
	
	Player player1=new Player("MS Dhoni",18,town,building1);
	Player player2=new Player("Suresh Raina",22,town,building2);
	Player[] players= {player1,player2};
	
	Sports sports=new Sports(name,players);
	sports.printInfo();
	
}

}
