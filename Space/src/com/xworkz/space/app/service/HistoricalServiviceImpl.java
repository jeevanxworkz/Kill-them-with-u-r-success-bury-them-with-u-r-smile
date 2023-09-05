package com.xworkz.space.app.service;

import com.xworkz.space.app.repositry.HistrocialPlacesRepositry;
import com.xworkz.space.app.repositry.PoliticianRepositry;

public class HistoricalServiviceImpl implements HistrocialService {
	

	private HistrocialPlacesRepositry histrocialRepositry;
	public HistoricalServiviceImpl(HistrocialPlacesRepositry historicalRepositry) {
		this.histrocialRepositry=historicalRepositry;
	}
	@Override
	public void places(String location) {
		System.out.println("invoking places from "+ this.getClass().getSimpleName());
		if(location!=null && !location.isEmpty() && location.length() >=0 && location.length() >=3) {
			{
	
	System.out.println("places data is valid");
}
			else{			
	System.err.println("places data is invalid");
}
return;

	}

}
