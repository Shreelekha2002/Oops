package com.xworkz.googleapps.runner;

import com.xworkz.googleapps.dto.GoogleAppsDto;
import com.xworkz.googleapps.repository.GoogleAppsRepositoryImplementation;
import com.xworkz.googleapps.repository.GoogleAppsRepository;
import com.xworkz.googleapps.service.GoogleAppsService;
import com.xworkz.googleapps.service.GoogleAppsServiceImplementation;

public class GoogleAppsRunner {
	public static void main(String[] args) {
		GoogleAppsDto dtos=new GoogleAppsDto();
		dtos.setApplicationId("G001");
		dtos.setApplicationName("Gmail");
		dtos.setApplicationVersion("G1");
		dtos.setApplicationCost(0);
		dtos.setApplicationStorage(15);
		System.out.println(dtos.toString());
		GoogleAppsDto dtos1=new GoogleAppsDto();
		dtos1.setApplicationId("G001");
		dtos1.setApplicationName("Google drive");
		dtos1.setApplicationVersion("G1");
		dtos1.setApplicationCost(0);
		dtos1.setApplicationStorage(15);
		
		System.out.println(dtos1.toString());
		GoogleAppsDto dtos2=new GoogleAppsDto();
		dtos2.setApplicationId("G003");
		dtos2.setApplicationName("Gmail");
		dtos2.setApplicationVersion("G1");
		dtos2.setApplicationCost(0);
		dtos2.setApplicationStorage(15);
		System.out.println(dtos2.toString());
		GoogleAppsDto dtos3=new GoogleAppsDto();
		dtos3.setApplicationId("G004");
		dtos3.setApplicationName("Gmail");
		dtos3.setApplicationVersion("G1");
		dtos3.setApplicationCost(0);
		dtos3.setApplicationStorage(15);
		System.out.println(dtos3.toString());
		
		
		
		GoogleAppsRepository repo=new GoogleAppsRepositoryImplementation();
		GoogleAppsService service=new GoogleAppsServiceImplementation(repo);
		service.validateSave(dtos);
		service.validateSave(dtos1);
		service.validateSave(dtos2);
		service.validateSave(dtos3);
	
		
		service.read();
		
		
	}

}