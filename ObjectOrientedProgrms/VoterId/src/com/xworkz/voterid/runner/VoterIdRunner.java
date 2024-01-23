package com.xworkz.voterid.runner;

import com.xworkz.voterid.dto.VoterIdDto;
import com.xworkz.voterid.repository.VoterIdRepository;
import com.xworkz.voterid.repository.VoterIdRepositoryImplementation;
import com.xworkz.voterid.service.VoterIdService;
import com.xworkz.voterid.service.VoterIdServiceImplementation;

public class VoterIdRunner {
	public static void main(String[] args) {
		VoterIdDto voterIdDto = new VoterIdDto();
		VoterIdRepository voterIdRepository = new VoterIdRepositoryImplementation();

		VoterIdService voterIdService = new VoterIdServiceImplementation(voterIdRepository);
		voterIdDto.setName("Shree");
		// voterIdDto.setName("Vanitha");
		// voterIdDto.setName("Shreelekha");
		voterIdDto.setAge(21);
		// voterIdDto.setAge(21);
	//	 voterIdDto.setAge(21);
		voterIdDto.setCurrentAddress("Kolar");
//		voterIdDto.setCurrentAddress("Banglore");
//	voterIdDto.setCurrentAddress("Kolar");
		voterIdDto.setAdharNumber(794248184636l);
//		voterIdDto.setAdharNumber(794248684636l);
//		//voterIdDto.setAdharNumber(794288184636l);
//		voterIdDto.setAdharNumber(79424818463l);
		// System.out.println(voterIdDto.toString());

		voterIdService.ValidateAndSave(voterIdDto);
		voterIdService.read();
		VoterIdDto voterIdDto1 = new VoterIdDto();
		voterIdService.updateDto("Shree", voterIdDto1);
		voterIdDto1.setName("Shree");
		voterIdDto1.setAdharNumber(794248184646l);
		voterIdDto1.setAge(23);
		voterIdDto1.setCurrentAddress("Tumkur");
		voterIdService.read();
		
		
		
	}
}
