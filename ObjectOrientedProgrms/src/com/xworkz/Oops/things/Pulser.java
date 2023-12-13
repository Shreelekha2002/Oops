package com.xworkz.Oops.things;

public class Pulser extends Bike{
	public String breakFormat;
	public static void bikeColor(String bikeColor) {
		System.out.println("this is a method used in inheritance");
		System.out.println(bikeColor);
	}
	public static double bikePrice(double bikePrice, int bikeWeight) {
		System.out.println("the bike price and weight is :"+bikePrice+" and  "+bikeWeight);
		return bikePrice;
	}
	public static String bikeVersion(String firstVesrion, String secondVersion, String thirdVersion) {
		System.out.println("firstVesrion is "+firstVesrion+" "+"secondVersion is "+secondVersion+" "+"thirdVersion is "+thirdVersion);
		return firstVesrion;
	}
}
