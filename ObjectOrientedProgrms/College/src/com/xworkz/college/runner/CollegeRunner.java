package com.xworkz.college.runner;

import com.xworkz.college.repository.CollegeRepository;
import com.xworkz.college.repository.CollegeRepositoryImplementation;
import com.xworkz.college.service.CollegeService;
import com.xworkz.college.service.CollegeServiceImplementation;

public class CollegeRunner {
	public static void main(String[] args) {
		CollegeRepository collegeRepository =new CollegeRepositoryImplementation();
//		boolean save =	collegeRepository.onSave(null);
//		System.out.println("college name is saving "+save);
//		
		CollegeService collegeService =	new CollegeServiceImplementation(collegeRepository);
		collegeService.validateAndSave(null);
		System.out.println("collegeName valid");
	}
}
