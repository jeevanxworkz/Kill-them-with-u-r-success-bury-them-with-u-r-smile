package com.xworkz.task.boot;
import com.xworkz.task.app.*;

public class MicrowaveRunner {
	
	public static void main(String[] args) {
		MicroWave microWave = new Oven();

		microWave.adjustTimer();
		microWave.powerOff();
		microWave.powerOn();
		microWave.setTemperature();
		microWave.stopTimer();
		microWave.bake();
		microWave.displayStatus();
		microWave.lightOff();
		microWave.lightOn();
		microWave.preHeat();

	}

}
