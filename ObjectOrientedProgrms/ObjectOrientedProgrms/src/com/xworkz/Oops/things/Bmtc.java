package com.xworkz.Oops.things;

public class Bmtc {
	public String name;
	public String place;
	public int ticketPrice;
	public String from;
	public String to;
	
	public Bmtc() {
		System.out.println("this is a constructor");
	}
	public boolean equals(Object obj) {
		if(obj == null) {
			System.out.println("instance is null");
			return false;
		}
		
	
	if(!(obj instanceof Bmtc)) {
		System.out.println("instance is not belongs to the bmtc");
	return false;
	}
	Bmtc bmtc = (Bmtc)obj;
	
	
	if((this.from==bmtc.from )&&(this.to==bmtc.to)) {
		System.out.println("the condition is true");
		return true;
		}
			return false;
		
	}
}

