package com.xworkz.inheritance.casting.app.util;

import com.xworkz.inheritance.casting.app.*;

public class ShowroomUtil {
	public static void run(Showroom showroom)
	{
		System.out.println("invoking run in ShowroomUtil");
		System.out.println(showroom.location);
		showroom.showroomInfo();
		if(showroom instanceof WatchShowroom)
		{
			System.out.println("**************WatchShowroom*************");
			WatchShowroom watchShowroom=(WatchShowroom)showroom;
			System.out.println(watchShowroom.showroomName);
			watchShowroom.sell();
		}
		if(showroom instanceof MobileShowroom)
		{
			System.out.println("****************MobileShowroom*************");
			MobileShowroom MobileShowroom=(MobileShowroom)showroom;
			System.out.println(MobileShowroom.service);
			MobileShowroom.mobileInfo();;
		}
		
	}

}

