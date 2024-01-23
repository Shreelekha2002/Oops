package com.xworkz.Oops.things;

public class Projector {
	public String display;
	public int size;
	public int width;
	public String screenHeader="green";
	public String screenFooter="blue";
	public String screenColor="gray";
	
	public void screening() {
		System.out.println("this is without return type and without arguments method");
	}
	public void screening(String display) {
		this.display=display;
		System.out.println("this is the without returntype with arguments");
		System.out.println("screen is displaying "+display);
	}
	
	public int screening(int size, int width) {
		this.size=size;
		this.width=width;
		System.out.println("this is the with returntype with arguments method");
		System.out.println("the size of screen is "+size+" and "+width);
		return size;
		
	}
	public String screening(String screenHeader, String screenFooter) {
		System.out.println("screenheader is "+screenHeader);
		System.out.println("screenfooter is "+screenFooter);
		System.out.println("screen color "+screenColor);
		return screenHeader;
	}
}
