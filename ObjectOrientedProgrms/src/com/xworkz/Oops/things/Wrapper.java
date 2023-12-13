package com.xworkz.Oops.things;

/*public class Wrapper {
	public static void main(String args[]) {                                                                                                 
		int value=70;
		String integerValue = Integer.toString(value);
		System.out.println(integerValue);
	}
	Integer b=Integer.valueOf(value);
	int returnValue = Integer.integerValue();
	Integer t=new Integer((int) 45);
	
	int values=60;
	Integer a=Integer.valueOf(values);

}*/

public class Wrapper{
	public static void main(String args[]) {
		byte value=10;
		String byteValue=Byte.toString(value);
		System.out.println(byteValue);
		
		Byte b=Byte.valueOf(value);
		byte ba=Byte.valueOf(value);
		
		Byte t=new Byte((byte)30);
		
		byte values=45;
		Byte be=Byte.valueOf(values);
				
	}
}
