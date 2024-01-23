package com.xworkz.Oops.things;

public class Bag {
	public String brand;
	public int cost;
	
	public Bag() {
		System.out.println("This is a constructor");
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			System.out.println("");
			return false;
		}
			if(!(obj instanceof Bag)) {
				System.out.println("obj is not belongs to the bag class");
				return false;
			}
			
			//downcasting
			Bag bag = (Bag)obj;
			if(this.brand.equals(bag.brand)&&(this.cost==bag.cost)) {
			System.out.println("the two objects are equal");
		return true;
			}
			return false;
	}
	@Override
	public String toString() {
		
		return "Bag [ brand : "+this.brand+", "+"cost : "+this.cost+"]";
		
	}
	
	
	
	
	
}
