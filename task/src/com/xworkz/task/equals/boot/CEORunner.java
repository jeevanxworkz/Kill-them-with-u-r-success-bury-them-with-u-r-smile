package com.xworkz.task.equals.boot;
import com.xworkz.task.equals.app.*;

public class CEORunner {
	
	public static void main(String[] args) {
		System.out.println("invoking main in CEORunner");
		
		CEO ceo = new CEO("Google","Sundar Pichai",48,"Ramashwaram",true);
		System.out.println("ceo");
		CEO ceo2 = new CEO("Microsoft","Satya Nadella",50,"Erode",true);
		System.out.println("CEO");
        System.out.println("---------------");
        
        boolean same=ceo.equals(ceo2;
        System.out.println("all are same"+same);
}


}
