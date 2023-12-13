package com.xworkz.Oops.things;

public class RoyalEnfield extends Bike{
	public String gearBox;
	
	public RoyalEnfield(int a) {
		System.out.println("constructor chaining");
		System.out.println(a);
	}
	public RoyalEnfield(String name) {
		this(100);
		System.out.println(name);
	}
	public RoyalEnfield() {
		this("Himalayan");
		System.out.println("this is a default constructor");
	}
}
