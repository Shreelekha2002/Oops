package com.xworkz.redbus.things;

public class Redbus {
	String name;
	String root;
	int seats;
	String busColor;
	String seatColor;
	int ticketPrice;
	String busName;
	String conductorName;
	String driverName;
	public Redbus() {
		this("banglore", 34);
		System.out.println("It is a government bus");
		
	}
	public Redbus(String name) {
		this("red", "blue", 70);
		this.name=name;
		System.out.println(name);
	}
	public Redbus(String root, int seats) {
		this("REDBUS");
		this.root=root;
		this.seats=seats;
		System.out.println(root+" "+seats);
	}
	public Redbus(String busColor, String seatColor, int ticketPrice) {
		this.busColor=busColor;
		this.seatColor=seatColor;
		this.ticketPrice=ticketPrice;
		System.out.println(busColor+" "+seatColor+" "+ticketPrice);
	}
}
