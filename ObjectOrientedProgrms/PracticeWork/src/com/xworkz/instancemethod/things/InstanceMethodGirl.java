package com.xworkz.instancemethod.things;

public class InstanceMethodGirl {
	public String name;
	public int age;
	public String qualification;
	public String address;
	public String email;
	public long contactNumber;
	public String fatherName;
	public String motherName;
	public int siblingsCount;
	public boolean siblingsPresent;
	public String siblingsName[];
	
	public InstanceMethodGirl() {
		System.out.println("this is constructor method");
	}
	public InstanceMethodGirl(String name, int age, String qualification, String address, String email, long contactNumber, String fatherName, String motherName, int siblingsCount, boolean siblingsPresent, String siblingsName[]) {
		this.name=name;
		this.age=age;
		this.qualification=qualification;
		this.address=address;
		this.email=email;
		this.contactNumber=contactNumber;
		this.fatherName=fatherName;
		this.motherName=motherName;
		this.siblingsCount=siblingsCount;
		this.siblingsPresent=siblingsPresent;
		this.siblingsName=siblingsName;
		
		System.out.println("name is "+name);
		System.out.println("age is "+age);
		System.out.println("Qualification is "+qualification);
		System.out.println("Address is "+address);
		System.out.println("Email id is "+email);
		System.out.println("Contact number is "+contactNumber);
		System.out.println("Father name is "+fatherName);
		System.out.println("Mother name is "+motherName);
		System.out.println("Number of siblings: "+siblingsCount);
		System.out.println("Siblings present is "+siblingsPresent);
		for(int i=0; i<siblingsName.length; i++) {
			
		System.out.println("Sibling name is "+siblingsName[i]);
		}
		
	}
	public void speak() {
		System.out.println("It is a speak method");
	}
	public void walk() {
		System.out.println("It is a walk method");
	}
	public void sleep() {
		System.out.println("It is a sleep method");
	}
	public void reading() {
		System.out.println("It is a reading method");
	}
	public void chatting() {
		System.out.println("It is a chatting method");
	}
	public void eating() {
		System.out.println("It is a eating method");
	}
	
}
