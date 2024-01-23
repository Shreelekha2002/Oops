package com.xworkz.outdoorgames.runner;

import com.xworkz.outdoorgames.repository.OutDoorGameRepositoryImplementation;
import com.xworkz.outdoorgames.repository.OutDoorGamesRepository;
import com.xworkz.outdoorgames.service.OutDoorGamesService;
import com.xworkz.outdoorgames.service.OutDoorGamesServiceImplementation;

public class OutDoorGamesRunner {
	public static void main(String[] args) {
	OutDoorGamesRepository outDoorGameRepository	= new OutDoorGameRepositoryImplementation();
	//	outDoorGameRepository.onSave("Cricket");
		OutDoorGamesService outDoorGamesService=new OutDoorGamesServiceImplementation(outDoorGameRepository);
		outDoorGamesService.saveAndValidate("Cricket");
		outDoorGamesService.saveAndValidate("FootBall");
		
	outDoorGamesService.update("Cricket", "shuttle");
	outDoorGamesService.read();
		outDoorGamesService.delete("FootBall");
		
	}
}
