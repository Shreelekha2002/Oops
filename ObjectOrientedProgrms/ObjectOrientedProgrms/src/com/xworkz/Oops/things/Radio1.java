package com.xworkz.Oops.things;

public class Radio1 extends Radio{
	String name;
	String brand;
	String price;
	String weight;
	int buttons;
	String size;
	String color;
	String shape;
	String sound;
	String news;
	
	public Radio1() {
		super();
		System.out.println("this is a default constructor for second class");
		
	}
	public Radio1(String name) {
		super("Radio");
		System.out.println(name);
	} 
	public Radio1(String brand, String news) {
		super("CARBONN", "2000");
		System.out.println(brand+" "+news);
	}
	public Radio1(String weight, String shape, String news) {
		super("black", "rectangle", "more", "present");
		System.out.println(weight+" "+shape+" "+news);
	}
	public Radio1(String weight, String shape, String news, String price) {
		
		super("2 kg", 2, "5 cm");
		System.out.println(weight+" "+shape+" "+news+" "+price);
	}
}
