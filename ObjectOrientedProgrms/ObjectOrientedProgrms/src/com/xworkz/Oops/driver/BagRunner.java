package com.xworkz.Oops.driver;

import com.xworkz.Oops.things.Bag;

public class BagRunner {
	public static void main(String[] args) {
		Bag bag = new Bag();
		bag.brand="WildCraft";
		bag.cost=1500;
		
		Bag bag1 = new Bag();
		bag1.brand="WildCraft";
		bag1.cost=1500;
		
		Bag bag2 = new Bag();
		bag2.brand="WildCraft";
		bag2.cost=1500;
		
		if(bag1.brand==bag2.brand) {
			System.out.println("");
		}
		
		System.out.println(bag1.equals(bag2));
		System.out.println("bag instance:"+bag.toString());
	}
}
