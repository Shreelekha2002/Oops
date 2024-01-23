package com.xworkz.inheritance.driver;

import com.xworkz.inheritance.things.ApplicationDetails;

public class ApplicationRunner {
	
	public static void main(String[] args) {
		ApplicationDetails a=new ApplicationDetails();
		a.applicationPrice=20;
		a.name="vvv";
		System.out.println(a.applicationPrice);
		System.out.println(a.name);
	}

}
