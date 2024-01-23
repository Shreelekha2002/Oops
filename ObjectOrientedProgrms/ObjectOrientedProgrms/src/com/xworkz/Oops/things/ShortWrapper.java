package com.xworkz.Oops.things;

public class ShortWrapper {
	public static void main(String args[]) {
		short num=35;
		String shortNum = Short.toString(num);
		System.out.println(shortNum);
		
		Short a=Short.valueOf(num);
		short b=Short.valueOf(num);
		
		Short obj = new Short((short) 23);
		System.out.println(obj);
	}
}
