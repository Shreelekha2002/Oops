package com.xworkz.Oops.things;

public class MultilevelInheritance {
	public String name;
	public int age;
	public String game;
	public String music;
	
	//constructor chaining
	public MultilevelInheritance() {
		super();
		
		System.out.println("this is a default constructor");
	}
	public MultilevelInheritance(String name) {
		this();
		this.name=name;
		System.out.println("the language name is "+name);
		System.out.println("this a 1 arg constructor");
	}
	public void getDetails(int fruit) {
		
		System.out.println("without argument method, overriding");
	}
//	public void getDetails(String game) {
//		//this(game, music);
//		
//		this.game=game;
//		System.out.println("this is 1 arg method"+"game is "+game);
//	}
//	public String getDetails(String game, String music) {
//		System.out.println(" this is 2 arg method"+" game and music is "+game+" and "+music);
//		return game;
//	}
	public static void getDetails(int a, int b, int c) {
		System.out.println("this is a static method");
	}
	
}
