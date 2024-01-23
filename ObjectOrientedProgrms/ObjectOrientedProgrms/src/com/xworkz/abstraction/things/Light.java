package com.xworkz.abstraction.things;

public abstract class Light {
	public String powerRange;
	public abstract void getInformation();
	//static and instance method
	public static void getColour(String bulbColor, String lightColor) {
		
		System.out.println("getcolour is a static method using in abstract class");
	}
}
