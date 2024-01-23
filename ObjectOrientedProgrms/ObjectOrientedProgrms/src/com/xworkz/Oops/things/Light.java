package com.xworkz.Oops.things;

public class Light {
	public String color;
	public String powerRange;
	public String wireConnection;
	public int voltage;
	
	public Light() {
		System.out.println("this is a constructor");
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			System.out.println("instance is null");
			return false;
		}
		
	if(!(obj instanceof Light)) {
		System.out.println("instance is not belongs to the Light");
		//
		return false;
	}
	//downcasting
	Light light = (Light)obj;
	
	if((this.color.equals(light.color))&&(this.voltage==light.voltage)) {
		System.out.println("the given condition is true");
		return true;
	}
	
	return false;
	
		
	}
}
