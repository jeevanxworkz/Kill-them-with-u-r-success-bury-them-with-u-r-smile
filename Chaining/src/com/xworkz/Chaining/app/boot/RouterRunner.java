package com.xworkz.Chaining.app.boot;
import com.xworkz.Chaining.app.*;

public class RouterRunner {
	
	public static void main(String[] args) {
		
		Router router=new Router("AIRTEL",5,"BHADRAVATHI",10);
		System.out.println("Router.brand");
		System.out.println("Router.frequency");
		
		System.out.println("**************");
		
		NetworkHub networkhub=new NetworkHub();
		System.out.println("NetworkHub.brand");
		System.out.println("NetworkHub.frequency");
		System.out.println("NetworkHub.location");
		System.out.println("NetworkHub.connectingDevice");
		
		
	}

}
