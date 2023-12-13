package com.xworkz.Oops.things;

public class FloatWrapper {
	public static void main(String args[]) {
		float a=1.2f;
		String floatValue=Float.toString(a);
		System.out.println(floatValue);
		
		Float b=Float.valueOf(a);
		float c=Float.valueOf(a);
		Float object = new Float((float) a);
		System.out.println(object);
	}
}
