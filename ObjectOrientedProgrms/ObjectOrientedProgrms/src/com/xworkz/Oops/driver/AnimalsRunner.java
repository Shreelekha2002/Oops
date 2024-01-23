package com.xworkz.Oops.driver;

import com.xworkz.Oops.things.Animals;

public class AnimalsRunner {
	public static void main(String[] args) {
		Animals behavior = new Animals();
		behavior.bark();
		behavior.meow();
		behavior.behaviors("black and white", 12);
		behavior.characters("peach", "dogii");
		
		
	}
}
