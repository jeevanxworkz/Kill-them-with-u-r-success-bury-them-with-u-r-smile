package com.xworkz.Chaining.app;

public class NetworkHub extends Router {
	
	public NetworkHub (String brand,double frequency,String location,int connectingDevice) {
		super(brand,frequency,location,connectingDevice);
	}
	public NetworkHub() {
		this("AIRTEL",5,"BHADRAVATHI",10);
		
		
	}

}
