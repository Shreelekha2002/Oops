package com.xworkz.water.things;

public class Water {
	public String waterColor;
	public String storage;
	public String uses;
	public int priceForOneLiter;
	
	public Water() {
		System.out.println("This is the program for water");
	}
	public Water(String waterColor, String storage, String uses, int priceForOneLiter) {
		this.waterColor=waterColor;
		this.storage=storage;
		this.uses=uses;
		this.priceForOneLiter=priceForOneLiter;
		System.out.println("water color is"+waterColor);
		System.out.println("we can store in"+storage);
		System.out.println("Water is used to "+uses);
		System.out.println("Price For One Liter is "+priceForOneLiter);
		
	}
}
