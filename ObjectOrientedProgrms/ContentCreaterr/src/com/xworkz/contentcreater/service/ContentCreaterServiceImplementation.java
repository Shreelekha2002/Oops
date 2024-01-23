package com.xworkz.contentcreater.service;

import com.xworkz.contentcreater.dto.ContentCreaterDto;
import com.xworkz.contentcreater.repository.ContentCreaterRepository;

public class ContentCreaterServiceImplementation implements ContentCreaterService{
	private ContentCreaterRepository contentCreaterRepository;
	public ContentCreaterServiceImplementation(ContentCreaterRepository contentCreaterRepository) {
		this.contentCreaterRepository=contentCreaterRepository;
	}
	@Override
	public boolean validateAndSave(ContentCreaterDto contentCreaterDto) {
		boolean validateUserName=true;
		boolean validateEmail=true;
		boolean validatePages=true;
		boolean validateContentLength=true;
		boolean validateAmountPaid=true;
		if(contentCreaterDto!=null) {
			System.out.println("dto is not null");
			if(contentCreaterDto.getUserName().equals(null)||contentCreaterDto.getUserName().length()<2) {
				System.out.println("name is wrong");
				validateUserName= false;
			}
			if(contentCreaterDto.getEmail().contains("@")||contentCreaterDto.getEmail().length()<3||!contentCreaterDto.getEmail().contains(contentCreaterDto.getUserName())) {
				System.out.println("Email is wrong");
				validateEmail=false;
			}
			if(contentCreaterDto.getPages().length()<1) {
				System.out.println("pages are wrong");
				validatePages=false;
			}
			if(contentCreaterDto.getContentLength()==null||contentCreaterDto.getContentLength().length()<30||contentCreaterDto.getContentLength().length()>100) {
				System.out.println("correct the length of content");
				validateContentLength=false;
			}
			if(contentCreaterDto.getAmountPaid()<100||contentCreaterDto.getAmountPaid()>1000) {
				System.out.println("amount should be change");
				validateAmountPaid=false;
			}
			if(validateUserName&&validateEmail&&validatePages&&validateContentLength&&validateAmountPaid) {
			boolean exists=isExists(contentCreaterDto);
			if(exists==false) {
			boolean save=contentCreaterRepository.onSave(contentCreaterDto);
			if(save) {
				System.out.println("saved successfully");
				
			}else {
				System.out.println("not saved successfully");
			}
			}
		}
		}
		return false;
	}
	@Override
	public void read() {
		ContentCreaterDto[] dtolist=contentCreaterRepository.read();
		for(int i=0; i<dtolist.length; i++) {
		
		if(dtolist[i]!=null) {
			System.out.println(dtolist[i]);
		}
	}
	}
	private boolean isExists(ContentCreaterDto contentCreaterDto) {
		ContentCreaterDto dtos[] = this.contentCreaterRepository.read();
		if (dtos != null) {
			for (ContentCreaterDto name : dtos) {
				if (name != null) {
					if (name.equals(contentCreaterDto)) {
						return true;
					}
				}
			}
		}

		return false;

	}
	@Override
	public boolean update(String userName, ContentCreaterDto contentCreaterDto) {
		ContentCreaterDto[] dto=this.contentCreaterRepository.read();
	boolean update = contentCreaterRepository.update(userName, contentCreaterDto);
	if(update) {
		System.out.println("updated successfully");
	}else {
		System.out.println("not updated successfully");
	}
		return false;
	}
}
