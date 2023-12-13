package com.xworkz.Oops.things;

public class Govt {
	String governmentId;
	
	public Govt() {
		super();
		System.out.println("constructor without arguments");
	}
	public Govt(String governmentId) {
		super(governmentId);
		this.governmentId=governmentId;
		System.out.println(governmentId);
	}
	public Govt(String panCardNumber, String adharCardNumber) {
		super();
	}
}
