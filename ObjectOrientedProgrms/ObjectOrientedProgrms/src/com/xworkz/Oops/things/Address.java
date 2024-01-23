package com.xworkz.Oops.things;

public class Address extends Student{
	public static String taluk;
	public static int pincode;
	
	public Address() {
		this(taluk, pincode);
		System.out.println("This is a 3rd class default constructor");
	}
	public Address(String taluk, int pincode) {
		//constructor overloading
		this(taluk);
		this.taluk=taluk;
		this.pincode=pincode;
		System.out.println("this is a 3rd class 2 arg constructor");
	}
	public Address(String taluk) {
		super("BIJAPUR");
		this.taluk=taluk;
		System.out.println("thsi is a 3rd class 1 arg constructor");
		System.out.println("taluk is "+taluk);
	}
}
