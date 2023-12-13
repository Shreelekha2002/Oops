package com.xworkz.Oops.things;

public class Radio extends Object{
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
	
	public Radio() {
		super();
		System.out.println("this is a default constructor");
		
	}
	public Radio(String name) {
		
		System.out.println(name);
	}
	public Radio(String brand, String price) {
		System.out.println(brand+" "+price);
	}
	public Radio(String weight, int buttons, String size) {
		System.out.println(weight+" "+buttons+" "+size);
	}
	public Radio(String color, String shape, String sound, String news) {
		System.out.println(color+" "+shape+" "+sound+" "+news);
	}
}
