package com.xworkz.Oops.driver;

import com.xworkz.Oops.things.EducationDetails;

public class EducationDetailsRunner {
	public static void main(String[] args) throws CloneNotSupportedException{
		
	
	EducationDetails education = new EducationDetails();
	education.schemeName="free course";
	education.budget=200000;
	System.out.println("Original instance :"+education);
	
	EducationDetails education1 = (EducationDetails)education.clone();
	education1.budget=300000;
	System.out.println("copied instance :"+education1);
	}
}
