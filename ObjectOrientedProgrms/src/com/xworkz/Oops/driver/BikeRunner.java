package com.xworkz.Oops.driver;

import com.xworkz.Oops.things.Bike;
import com.xworkz.Oops.things.HeroHonda;
import com.xworkz.Oops.things.Pulser;
import com.xworkz.Oops.things.RoyalEnfield;

public class BikeRunner {
	public static void main(String args[]) {
	Bike bike = new Bike("diesel");
	HeroHonda heroHonda = new HeroHonda(25, 67);
	HeroHonda fuelCapacity= new HeroHonda("7 leters");
	Pulser pulser = new Pulser();
	pulser.bikeColor("gray");
	pulser.bikePrice(25675f, 50);
	pulser.bikeVersion("V5", "V8", "V10");
	RoyalEnfield royalEnfield = new RoyalEnfield ();
	royalEnfield.gearBox="6 gears";
	pulser.breakFormat="Same";
	bike.fuel="petrol";
	heroHonda.fuelCapacity="10 leters";
	
	System.out.println(bike.fuel+" "+heroHonda.fuelCapacity+" "+pulser.breakFormat+" "+royalEnfield.gearBox);
	System.out.println();
	
	}
}
