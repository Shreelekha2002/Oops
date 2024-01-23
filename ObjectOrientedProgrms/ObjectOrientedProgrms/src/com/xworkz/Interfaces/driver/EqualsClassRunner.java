package com.xworkz.Interfaces.driver;

import com.xworkz.Interfaces.things.EqualsClass;

 public class EqualsClassRunner {
	public static void main(String[] args) {
		EqualsClass equalsClass = new EqualsClass();
		equalsClass.name="Shree";
		equalsClass.age=21;
		
		EqualsClass equalsClass1 = new EqualsClass();
		equalsClass1.name="Shree";
		equalsClass1.age=21;
		
		EqualsClass equalsClass2 = new EqualsClass();
		equalsClass2.name="Shree";
		equalsClass2.age=21;
		
		if(equalsClass1==equalsClass2) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		System.out.println(equalsClass.getClass());
		System.out.println(equalsClass1.equals(equalsClass2));
		}
	
}
