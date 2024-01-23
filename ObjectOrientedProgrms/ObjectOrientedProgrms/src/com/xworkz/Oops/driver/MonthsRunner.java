package com.xworkz.Oops.driver;

import java.time.Month;

import com.xworkz.Oops.things.Months;

public class MonthsRunner {
	public static void main(String[] args) {
		System.out.println(Months.APRIL);
		System.out.println(Months.JANUARY);
		
		switch(Months.FEBRAUARY) {
		
		case JANUARY:
			System.out.println("This is january");
			break;
		case FEBRAUARY:
			System.out.println("This is febrauary");
			break;
		case MARCH:
			System.out.println("This is march");
			break;
		case APRIL:
			System.out.println("This is april");
			break;
		case MAY:
			System.out.println("This is may");
			break;
		case JUNE:
			System.out.println("This is june");
			break;
		case JULY:
			System.out.println("This is july");
			break;
		case AUGUST:
			System.out.println("This is august");
			break;
		case SEPTEMBER:
			System.out.println("This is september");
			break;
		case OCTOBER:
			System.out.println("This is october");
			break;	
		case NOVEMBER:
			System.out.println("This is november");
			break;
		case DECEMBER:
			System.out.println("This is december");
			break;
		default:
			System.out.println("The given month is not belongs to the above months");
		}
	}
}
