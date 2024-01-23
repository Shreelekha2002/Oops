package com.xworkz.Oops.driver;

import com.xworkz.Oops.things.Colors;

public class ColorsRunner {
	public static void main(String[] args) {
		
		System.out.println(Colors.PINK);
		
		switch(Colors.RED) {
		case GRAY: System.out.println("The color is gray");
		break;
		case PINK: System.out.println("The color is pink");
		break;
		case BLUE: System.out.println("The color is blue");
		break;
		case RED: System.out.println("The color is red");
		break;
		default:
			System.out.println("The given color is not belongs to the color list");
		
	
		}
	}
}
