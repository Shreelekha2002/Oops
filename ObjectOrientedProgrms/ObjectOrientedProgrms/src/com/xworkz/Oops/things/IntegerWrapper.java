package com.xworkz.Oops.things;

public class IntegerWrapper {
	public static void main(String args[]) {
		int value=20;
		String intValue = Integer.toString(value);
		System.out.println(intValue);
		
		Integer a=Integer.valueOf(value);
		int b=Integer.valueOf(value);
		
		Integer obj = new Integer((int) value);
		System.out.println(obj);
	}
}

/*public class FloatWrapper{
	public static void main(String args[]) {
		float a=1.2f;
		String floatValue=Float.toString(a);
		System.out.println(floatValue);
		
		Float b=Float.valueOf(a);
		float c=Float.valueOf(a);
		Float object = new Float((float) a);
		System.out.println(object);
	}
}*/