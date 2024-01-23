package com.xworkz.Oops.things;

public class Metro {
	public String metroColor;
	public String fromAddress;
	public String toAddress;
	public int ticketPrice;
	
	public Metro() {
		System.out.println("constructor");
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			System.out.println("the object is not null");
			return false;
		}
		if(!(obj instanceof Metro)) {
			System.out.println("The obj is not belongs to the instance of Metro class");
			return false;
		}
		
		//downcasting
		Metro metro = (Metro)obj;
		if((this.metroColor.equals(metro.metroColor))&&(this.fromAddress.equals(metro.fromAddress))&&(this.toAddress.equals(metro.toAddress))&&(this.ticketPrice==metro.ticketPrice)) {
			System.out.println("The two objects are equal");
			return true;
		}
		
		return false;
	}
	@Override
	public String toString() {
		
		return "Metro [ "+"Metro colour "+this.metroColor+", "+"From address "+this.fromAddress+", "+"To address "+this.toAddress+", "+"Ticket price "+this.ticketPrice+"]";
		
	}
	
}
