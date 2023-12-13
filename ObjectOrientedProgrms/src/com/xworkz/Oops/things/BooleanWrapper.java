package com.xworkz.Oops.things;

public class BooleanWrapper {
	public static void main(String args[]) {
		Boolean a = true;
		String b = Boolean.toString(a);
		System.out.println(b);
		
		Boolean c = Boolean.valueOf(b);
		boolean d = Boolean.valueOf(b);
		
		Boolean obj = new Boolean((boolean) false);
		System.out.println(obj);
	}
}
