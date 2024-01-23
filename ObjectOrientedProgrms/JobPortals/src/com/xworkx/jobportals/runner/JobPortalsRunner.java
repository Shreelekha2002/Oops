package com.xworkx.jobportals.runner;

import com.xworkz.jobportals.repository.JobPortalsRepository;
import com.xworkz.jobportals.repository.JobPortalsRepositoryImplementation;
import com.xworkz.jobportals.service.JobPortalsService;
import com.xworkz.jobportals.service.JobPortalsServiceImplementation;

public class JobPortalsRunner {
	public static void main(String[] args) {
		JobPortalsRepository jobPortalsRepository=new JobPortalsRepositoryImplementation();
//		boolean save = jobPortalsRepository.onSave("naukari");
//		System.out.println("portal name is saving " +save);
		jobPortalsRepository.update("Banglore", "Mysore");
		JobPortalsService jobPortalsService=new JobPortalsServiceImplementation(jobPortalsRepository);
		jobPortalsService.validationAndSave("LinkedIn");
		
		String oldName = "Banglore";
		String newName = "Mysore";
		jobPortalsService.update(oldName, newName);
	}
}
