package com.xworkz.vehical.things;

public class Vehical {
	int vehicalNum;
	String vehicalName;
	int vehicalPrice;
	String vehicalColor;
	String brand;
	String subName;
	public Vehical() {
		this(12345);
		System.out.println("This is a vehical");
	}
	public Vehical(int vehicalNum) {
		this("Bike", 200000);
		this.vehicalNum=vehicalNum;
		System.out.println(vehicalNum);
		
	}
	public Vehical(String vehicalName, int vehicalPrice ) {
		this("gray", "royal enfield", "himalayan");
		this.vehicalName=vehicalName;
		this.vehicalPrice=vehicalPrice;
	}
	public Vehical(String vehicalColor, String brand, String subName) {
	this.vehicalColor=vehicalColor;
	this.brand=brand;
	this.subName=subName;
	
	}
}
