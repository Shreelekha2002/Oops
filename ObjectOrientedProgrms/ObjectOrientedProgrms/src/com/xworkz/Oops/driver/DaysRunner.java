package com.xworkz.Oops.driver;

import com.xworkz.Oops.things.Days;

public class DaysRunner {
	public static void main(String[] args) {
		System.out.println(Days.SATURDAY);
		
		switch(Days.MONDAY) {
		case SUNDAY:
			System.out.println("The day is Sunday");
			break;
		case TUESDAY:
			System.out.println("The day is Tuesday");
			break;	
		case MONDAY:
			System.out.println("The day is Monday");
			break;
		case WEDNESDAY:
			System.out.println("The day is Wednesday");
			break;
		case THURSDAY:
			System.out.println("The day is Thursday");
			break;
		case FRIDAY:
			System.out.println("The day is Friday");
			break;
		case SATURDAY:
			System.out.println("The day is Saturday");
			break;	
		default :
			System.out.println("The day is not belongs in any day");
		}
	}
}
