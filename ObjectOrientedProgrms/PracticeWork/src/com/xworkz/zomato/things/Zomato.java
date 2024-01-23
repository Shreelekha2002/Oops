package com.xworkz.zomato.things;

public class Zomato {
	String address;
	String food;
	int price;
	String root;
	int salary;
	String color;
	
	
	public Zomato() {
		this("banglore");
		System.out.println("Details of Zomato");
	}
	public Zomato(String address) {
		this("biriyani", 200);
		this.address=address;
		System.out.println(address);
	}
	public Zomato(String food,int price) {
		this("hoskote root", 20000, "red");
		this.food=food;
		this.price=price;
		System.out.println(food+" "+price);
	}
	public Zomato(String root, int salary, String color) {
		this.root=root;
		this.salary=salary;
		this.color=color;
		System.out.println(root+" "+salary+" "+color);
	}
}
