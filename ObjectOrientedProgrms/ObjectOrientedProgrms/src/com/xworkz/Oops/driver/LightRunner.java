package com.xworkz.Oops.driver;

import com.xworkz.Oops.things.Light;

public class LightRunner {
	public static void main(String[] args) {
		Light light = new Light();
		light.color="gold";
		light.voltage=240;
		
		Light light1 = new Light();
		light1.color="gold";
		light1.voltage=240;
		Light light2 = new Light();
		light2.color="gold";
		light2.voltage=240;
		Light light3 = null;
		
		if(light1==light2) {
			System.out.println("the condition is true");
		}
		System.out.println(light.getClass());
		System.out.println(light.equals(light2));
		
	}
}
