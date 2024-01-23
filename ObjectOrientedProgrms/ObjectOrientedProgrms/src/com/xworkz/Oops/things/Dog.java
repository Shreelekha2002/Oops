package com.xworkz.Oops.things;

public interface Dog extends Cat {
	String name="Gopi";
	
	public void bark();
	
	public static void characters(String color) {
		color="peach";
		System.out.println("this is the static  method of Dog");
		System.out.println("The colour of dog is "+color);
	}
	public static int lengthOfDog(int length) {
		length=25;
		System.out.println("the length of dog is "+length);
		return length;
	}
}
