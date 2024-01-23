package com.xworkz.Oops.driver;

import com.xworkz.Oops.things.Years;

public class YearsRunner {
	public static void main(String[] args) {
		System.out.println(Years.Year1); 
		System.out.println(Years.Year3);
		
		switch(Years.Year2) {
		case Year1:
			System.out.println("Engineering first year");
			break;
		case Year2:
			System.out.println("Engineering second year");
			break;	
		case Year3:
			System.out.println("Engineering third year");
			break;
		case Year4:
			System.out.println("Engineering forth year");
			break;	
		}
	}
}
