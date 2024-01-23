package com.xworkz.Oops.things;

public class StringReverse {
	public static String reverse(String name) {
		String rev = "";
		int i=0;
		int length=name.length();
			for(i=length; i>0; i--) {
				rev += name.charAt(i-1);
			}
		return rev;
	}
	public static void main(String[] args) throws Exception
	{
		String s="shree";
		String result = reverse(s);
		System.out.println(result);
	}
}
