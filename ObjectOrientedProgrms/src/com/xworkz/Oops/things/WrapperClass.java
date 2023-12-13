package com.xworkz.Oops.things;

public class WrapperClass {
	public static void main(String args[]) {
		//Autoboxing converting int to String
		byte value=34;
		String byteValue=Byte.toString(value);
		System.out.println(byteValue);
		
		Byte b=Byte.valueOf(value);
		byte ba=Byte.valueOf(value);
		
		Byte t=new Byte((byte)36);

		//byte values=45;
		//Byte be=Byte.valueOf(values);
		System.out.println(t);		
	}

}