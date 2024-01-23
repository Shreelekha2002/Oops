package com.xworkz.instancemethod.driver;

import com.xworkz.instancemethod.things.InstanceMethodGirl;

public class InstanceMethodGirlRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceMethodGirl instanceMethodGirl = new InstanceMethodGirl();
		String siblingsName[]= {"Nagesh", "murthy", "karthik"};
		new InstanceMethodGirl("Shreelekha", 21, "B.tech", "Banglore", "srilekham517@mail.com", 9886141080l, "Munishamappa", "Munirathnamma", 3, true, siblingsName);
		instanceMethodGirl.speak();
		instanceMethodGirl.sleep();
		instanceMethodGirl.chatting();
		instanceMethodGirl.eating();
		instanceMethodGirl.reading();
		instanceMethodGirl.walk();
	}
	
}
