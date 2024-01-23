package com.xworkz.Oops.driver;

import com.xworkz.Oops.things.CloneMethod;

public class CloneMethodRunner {
	public static void main(String[] args) {
		CloneMethod cloneMethod = new CloneMethod();
		
		System.out.println(cloneMethod.x+" "+cloneMethod.y);
		
		CloneMethod cloneMethod1 = cloneMethod;
		cloneMethod1.x=100;
		System.out.println(cloneMethod.x+" "+cloneMethod.y);
		System.out.println(cloneMethod1.x+" "+cloneMethod1.y);
	}
}
