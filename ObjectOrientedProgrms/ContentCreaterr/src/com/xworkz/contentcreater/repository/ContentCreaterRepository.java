package com.xworkz.contentcreater.repository;

import com.xworkz.contentcreater.dto.ContentCreaterDto;

public interface ContentCreaterRepository {

		boolean onSave(ContentCreaterDto contentCreaterDto);
		
		ContentCreaterDto[] read();
		
		boolean update(String userName, ContentCreaterDto contentCreaterDto);
}
