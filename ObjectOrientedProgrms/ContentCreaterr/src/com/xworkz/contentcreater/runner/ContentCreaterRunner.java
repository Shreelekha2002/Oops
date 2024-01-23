package com.xworkz.contentcreater.runner;

import com.xworkz.contentcreater.dto.ContentCreaterDto;
import com.xworkz.contentcreater.repository.ContentCreaterRepository;
import com.xworkz.contentcreater.repository.ContentCreaterRepositoryImplementation;
import com.xworkz.contentcreater.service.ContentCreaterService;
import com.xworkz.contentcreater.service.ContentCreaterServiceImplementation;

public class ContentCreaterRunner {
	public static void main(String[] args) {
		ContentCreaterDto contentCreaterDto=new ContentCreaterDto();
		contentCreaterDto.setUserName("Shreelekha123");
		contentCreaterDto.setPassword("Shreelekha123@ss");
		//contentCreaterDto.setContentLength(" something that issubjects or nt: a table . noun. Usually contents.https://sevasindhuservices.karnataka.gov.in/applyPageForm.do");
		contentCreaterDto.setAmountPaid(200);
		contentCreaterDto.setEmail("Shreelekha123@campusuvce.in");
		contentCreaterDto.setPages("5");
		contentCreaterDto.setWebsite("http./gfdfyghbmn.hbuytg");
		
		ContentCreaterRepository contentCreaterRepository=new ContentCreaterRepositoryImplementation();
		
		ContentCreaterService contentCreaterService=new ContentCreaterServiceImplementation(contentCreaterRepository);
		contentCreaterService.validateAndSave(contentCreaterDto);
		contentCreaterService.read();
	
	}
}
