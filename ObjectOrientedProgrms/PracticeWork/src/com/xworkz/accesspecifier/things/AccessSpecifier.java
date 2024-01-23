package com.xworkz.accesspecifier.things;

public class AccessSpecifier {
	private AccessSpecifier() {
		System.out.println("this is the public access specifier");
	}
	public static void main(String args[]) {
		AccessSpecifier accessSpecifier = new AccessSpecifier();
	}
}
