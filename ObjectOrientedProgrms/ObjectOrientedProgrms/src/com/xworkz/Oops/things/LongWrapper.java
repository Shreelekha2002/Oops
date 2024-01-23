package com.xworkz.Oops.things;

public class LongWrapper {
	public static void main(String args[]) {
		short a=21;
		String b = Short.toString(a);
		System.out.println(b);
		
		Short c = Short.valueOf(a);
		short d = Short.valueOf(a);
		
		
		Short obj = new Short((short) 32);
		System.out.println(obj);
	}
}
