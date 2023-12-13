package com.xworkz.Oops.things;

public class HeroHonda extends Bike {
	public String fuelCapacity;
	public HeroHonda(String fuelCapacity) {
		this.fuelCapacity=fuelCapacity;
		System.out.println(fuelCapacity);
	}
	public HeroHonda(int a, int b) {
		System.out.println(a+" "+b);
	}
}
