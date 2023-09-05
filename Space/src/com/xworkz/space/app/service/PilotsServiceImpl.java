package com.xworkz.space.app.service;

import com.xworkz.space.app.repositry.PilotRepositry;

public class PilotsServiceImpl implements PilotService {
	
	private PilotRepositry pilotRepositry;
	
	public PilotsServiceImpl(PilotRepositry pilotRepositry) {
		this.pilotRepositry=pilotRepositry;
	}

	@Override
	public void pilots(String names) {
		System.out.println("invoking pilots from "+this.getClass().getSimpleName());
		if(names!=null && !names.isEmpty() && names.length() >=0 && names.length() >=3 )
		{
			System.out.println("pilot names is valid");
		}
		else {
			System.err.println("pilot names is invalid");
			}
		return;

	}

}
