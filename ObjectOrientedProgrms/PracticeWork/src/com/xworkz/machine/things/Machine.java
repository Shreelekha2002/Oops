package com.xworkz.machine.things;

public class Machine {
	String name;
	int voltage;
	String power;
 public Machine() {
	 this("DC Machine");
	 System.out.println("this is the machine program");
 }
 public Machine(String name) {
	 this(240, "AC POWER");
	 this.name=name;
	 System.out.println(name);
 }
 public Machine(int voltage, String power) {
 	this.voltage=voltage;
 	this.power=power;
 	System.out.println(voltage+" "+power);
}
 
}
