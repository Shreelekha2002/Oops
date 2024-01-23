package com.xworkz.Oops.things;
//achieving multiple inheritance
public class Animals implements Dog{
	
	@Override
	public void meow() {
		// TODO Auto-generated method stub
		System.out.println("the age of cat is "+age);
		System.out.println("Cat is meowing");
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("the name of dog is "+name);
		System.out.println("Dog is barking");
	}
	public static void characters(String color, String name) {
		color="peach";
		name="dogiii";
		System.out.println("name is "+name);
		System.out.println("The colour of dog is "+color);
	}
	public static void behaviors(String color, int weight) {
		color="black and white";
		weight=10;
		System.out.println("weight is "+weight);
		System.out.println("the colour of cat is "+color);
	}
//	@Override
//	default void weightOfCat() {
//		System.out.println("this is normal sentence");
//		}

}
