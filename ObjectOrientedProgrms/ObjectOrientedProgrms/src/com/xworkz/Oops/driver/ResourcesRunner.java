package com.xworkz.Oops.driver;

import com.xworkz.Oops.things.Resources;

public class ResourcesRunner {
	public static void main(String args[]) {
		Resources resources=new Resources();
		resources.setResourceType("natural resources");
		resources.setAir("colourless");
		resources.setUseOfAir("used to breath");
		resources.setFood("dosa");
		resources.setUseOfFood("used to eat");
		resources.setMetals("iron");
		resources.setUseOfMetals("to make some iron materials");
		resources.setPlants("tomato plant");
		resources.setUseOfPlants("to make food");
		resources.setWater("colorless");
		resources.setUseOfWater("used to drink");
		
		System.out.println(resources.getAir());
		System.out.println(resources.getUseOfAir());
		System.out.println(resources.getFood());
		System.out.println(resources.getUseOfFood());
		System.out.println(resources.getMetals());
		System.out.println(resources.getUseOfMetals());
		System.out.println(resources.getPlants());
		System.out.println(resources.getUseOfPlants());
		System.out.println(resources.getResourceType());
		System.out.println(resources.getWater());
		System.out.println(resources.getUseOfWater());
	}
}
