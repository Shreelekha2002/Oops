package com.xworkz.Oops.things;

public class Television {
	String brand;
	String lengthOfTv;
	String colorOfTv;
	String weightOfTv;
	int Price;
	String shape;
	String display;
	boolean big;
	
	public Television() {
		
		this("Tv9", "jemini", "udaya", "udaya news", "jemini news");
		System.out.println("This is constructor chaining for the same class");
		
	}
	public Television(String brand) {
		this("153 meters", "black");
		this.brand=brand;
		System.out.println("The tv brand is "+brand);
	}
	public Television(String lengthOfTv, String colorOfTv) {
		this("10 kg", 25000, "square");
		this.lengthOfTv=lengthOfTv;
		this.colorOfTv=colorOfTv;
		System.out.println("The length of tv is "+lengthOfTv+" "+"the color of tv is "+colorOfTv);
	}
	public Television(String weightOfTv, int Price, String shape) {
		this.weightOfTv=weightOfTv;
		this.Price=Price;
		this.shape=shape;
		System.out.println("The weight of tv is "+weightOfTv+" "+"the price of tv is "+Price+" "+"The shape of tv is "+shape);
		
	}
	public Television(String display, boolean big, String uses, String vision) {
		this("samsung");
		this.display=display;
		this.big=big;
		System.out.println("the display is "+display+" "+"the size os tv is "+big+" "+"the use of tv is "+uses+" "+" the vision of tv is "+vision);
	}
	public Television(String channel1, String channel2, String channel3, String channel4, String channel5) {
		this("udaya music", "maa music", "maa tv", "gemini misic", "udaya news", "sports");
		System.out.println("the tv channels are "+channel1+" "+channel2+" "+channel3+" "+channel4+" "+channel5);
	}
	public Television(String channel6, String channel7, String channel8, String channel9, String channel10, String channel11) {
		this("dark light", true, "to watch movies and songs", "cool");
		System.out.println("the tv channels are "+channel6+" "+channel7+" "+channel8+" "+channel9+" "+channel10+" "+channel10);
	} 
}
