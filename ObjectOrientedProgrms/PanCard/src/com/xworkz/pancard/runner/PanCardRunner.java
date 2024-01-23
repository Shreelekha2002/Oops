package com.xworkz.pancard.runner;

import com.xworkz.pancard.dto.PanCardDto;
import com.xworkz.pancard.repository.PanCardRepository;
import com.xworkz.pancard.repository.PanCardRepositoryImplementation;
import com.xworkz.pancard.service.PanCardService;
import com.xworkz.pancard.service.PanCardServiceImplementation;

public class PanCardRunner {
	public static void main(String[] args) {
		PanCardDto panCardDto = new PanCardDto();
		PanCardRepository panCardRepository =	new PanCardRepositoryImplementation();
		PanCardService panCardService =	new PanCardServiceImplementation(panCardRepository);
		panCardDto.setPanNumber("Uyhjkfghj8");
		panCardDto.setAadharNumber(794248184636l);
		panCardDto.setContactNumber(9886141080l);
		panCardDto.setEmail("sri@msa517gmail.com");
		panCardDto.setPassword("Shree@123");
		panCardDto.setPresentAddress("Banglore");
		panCardDto.setUserName("Shreelekha123");
		panCardService.ValidateAndSave(panCardDto);
		panCardService.read();
		
		PanCardDto panCardDto1 = new PanCardDto();
		panCardService.updateDto("Shreelekha123", panCardDto1);
		panCardDto1.setUserName("Shreelekha123");
		panCardDto1.setContactNumber(9886561089l);
		panCardDto1.setAadharNumber(983148943783l);
		panCardDto1.setPassword("asjk@jghde");
		panCardDto1.setEmail("srilekha@m517gmail.com");
		panCardDto1.setPanNumber("JvGFT65489");
		
		panCardDto1.setPresentAddress("Kolar");
		panCardService.read();
		panCardService.delete("Shreelekha123");
		
		panCardService.read();
	}
}
