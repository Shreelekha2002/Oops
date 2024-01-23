package com.xworkz.Oops.driver;

import com.xworkz.Oops.things.Bmtc;

public class BmtcRunner {
	public static void main(String[] args) {
		Bmtc bmtc = new Bmtc();
	
		bmtc.from="banglore";
		bmtc.to="kolar";
		bmtc.ticketPrice=25;
		bmtc.place="BENGALURU";
		bmtc.name="BMTC";
		
		Bmtc bmtc1 = new Bmtc();
		bmtc1.from="majestic";
		bmtc1.to="kolar";
		Bmtc bmtc2 = new Bmtc();
		bmtc2.from="majestic";
		bmtc2.to="kolar";
		
		if(bmtc1==bmtc2) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		System.out.println(bmtc.getClass());
		System.out.println(bmtc1.equals(bmtc2));
	}
}
