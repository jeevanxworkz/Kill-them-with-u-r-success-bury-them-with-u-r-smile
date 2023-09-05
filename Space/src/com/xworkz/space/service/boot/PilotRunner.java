package com.xworkz.space.service.boot;

import com.xworkz.space.app.repositry.PilotRepositry;
import com.xworkz.space.app.repositry.PilotRepositryImpl;
import com.xworkz.space.app.service.PilotsServiceImpl;

public class PilotRunner {
	

	PilotRepositry pilotRepositry = new PilotRepositryImpl();
	PilotsServiceImpl pilotServiceImpl = new PilotsServiceImpl(pilotRepositry);
	
	pilotService.pilots("ajith");
	pilotService.pilots("rajini");
	pilotService.pilots("dhanush");
	pilotService.pilots("vadivel");
	pilotService.pilots("allen");
	pilotService.pilots("morkel");
	pilotService.pilots("albie");
	pilotService.pilots("allen");
	pilotService.pilots("solley");
	pilotService.pilots("sagar");
	
}

