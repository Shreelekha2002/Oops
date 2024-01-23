package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.things.Light;
import com.xworkz.abstraction.things.LightDetails;

public class LightRunner{
	public static void main(String[] args) {
		Light light= new LightDetails();
		String print=light.powerRange="230 AC Volts";
		System.out.println("the power range for house and industries "+print);
		light.getColour("white", "gold-orange");
		light.getInformation();
	}
	

}
