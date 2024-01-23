package com.xworkz.states.runner;

import com.xworkz.states.repository.StatesRepository;
import com.xworkz.states.repository.StatesRepositoryImplementation;
import com.xworkz.states.service.StatesService;
import com.xworkz.states.service.StatesServiceImplementation;

public class StatesRunner {
	public static void main(String[] args) {
		StatesRepository  statesRepository  =	new StatesRepositoryImplementation();
	boolean save =	statesRepository.onSave("Karnataka");
//		System.out.println("element saved "+save);
//		statesRepository.onSave("andra");
		
		StatesService statesService = new StatesServiceImplementation(statesRepository);
		statesService.validationAndSave("Karnataka");
		statesService.validationAndSave("AndraPradesh");
		
		statesService.update("Karnataka", "TamilNadu");
		
	}
}
