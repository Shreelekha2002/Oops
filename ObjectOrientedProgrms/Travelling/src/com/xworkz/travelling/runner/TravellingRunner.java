package com.xworkz.travelling.runner;

import com.xworkz.travelling.repository.TravellingRepository;
import com.xworkz.travelling.repository.TravellingRepositoryImplementation;
import com.xworkz.travelling.service.TravellingService;
import com.xworkz.travelling.service.TravellingServiceImplementation;

public class TravellingRunner {
	public static void main(String[] args) {
		TravellingRepository travellingRepository =	new TravellingRepositoryImplementation();
	
		
		
		TravellingService travellingService = new TravellingServiceImplementation(travellingRepository);
		travellingService.validateAndSave("Banglore");
		//System.out.println("placeName is valid");
		travellingService.validateAndSave("Banglore");
		travellingService.validateAndSave("Banglore");
		travellingService.validateAndSave("Banglore");
		travellingService.validateAndSave("Banglore");
		travellingService.validateAndSave("Banglore");
		
		String oldName="Banglore";
		String newName="mysore";
		travellingService.update(oldName,newName);
		travellingService.delete("Banglore");
		
	}
}
