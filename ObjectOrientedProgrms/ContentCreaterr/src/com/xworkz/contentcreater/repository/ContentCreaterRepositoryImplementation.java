package com.xworkz.contentcreater.repository;

import com.xworkz.contentcreater.dto.ContentCreaterDto;

public class ContentCreaterRepositoryImplementation implements ContentCreaterRepository{
	ContentCreaterDto[] contentCreaterDtoref=new ContentCreaterDto[7];
	int index=0;
	@Override
	public boolean onSave(ContentCreaterDto contentCreaterDto) {
		if(contentCreaterDto!=null) {
			if(this.contentCreaterDtoref.length>this.index) {
				this.contentCreaterDtoref[this.index]=contentCreaterDto;
				this.index++;
				return true;
			}
		}
		return false;
	}
	@Override
	public ContentCreaterDto[] read() {
		
		return contentCreaterDtoref;
	}
	@Override
	public boolean update(String userName, ContentCreaterDto contentCreaterDto) {
		for(int i=0; i<contentCreaterDtoref.length; i++) {
			if(contentCreaterDtoref[i]!=null) {
				if(contentCreaterDtoref[i].getUserName().equals(userName)) {
					contentCreaterDtoref[i]=contentCreaterDto;
					return true;
				}
			}
		}
		return false;
	}

}
