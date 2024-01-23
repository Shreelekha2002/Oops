package com.xworkz.Oops.things;

public interface Cat {
	String age="2 yeras";
	
	public void meow();
	
	public static void behaviors(String color) {
		color="black and white";
		System.out.println("this is the static method");
		System.out.println("the colour of cat is "+color);
	}
	public static short lengthOfCat(short length) {
		length=10;
		System.out.println("the length of cat is "+length);
		return length;
	}
	default void weightOfCat() {
		System.out.println("this is normal sentence");
		}
	
	
}
