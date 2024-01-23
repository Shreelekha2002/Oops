package com.xworkz.Oops.things;

public class Student extends MultilevelInheritance {
	public String address;
	public String district;
	
	public Student() {
		super();
		System.out.println("this is a 2nd class default constructor");
	}
	public Student(String address) {
		super("KANNADA");
		this.address=address;
		System.out.println("this is a 2nd class 1 arg constructor");
		System.out.println("the name is "+name);
		System.out.println("the address is "+address);
	}
	@Override
     public void getDetails(int fruit) {
		System.out.println("without argument method, overriding,  implementation type");
		//System.out.println(fruit);
	}
}
