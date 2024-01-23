package com.xworkz.college.service;

import com.xworkz.college.repository.CollegeRepository;

public class CollegeServiceImplementation implements CollegeService{
	private CollegeRepository collegeRepository;
	public CollegeServiceImplementation(CollegeRepository collegeRepository) {
		this.collegeRepository=collegeRepository;
	}
	@Override
	public boolean validateAndSave(String collegeName) {
		if(collegeName!=null) {
			if(collegeName.isEmpty()||collegeName.isBlank()||collegeName.length()<4||collegeName.length()>20) {
				System.out.println("Check the college name, and give proper name");
			}else {
				System.out.println("valid college name");
			}
			boolean save = collegeRepository.onSave(collegeName);
			if(save==true) {
				System.out.println("the name validate succefully");
			}else {
				System.out.println("the name not validate succefully");
			}
				
			
		}
		else {
			System.out.println("the college name is "+collegeName);
		}
		return false;
	}
	

}
