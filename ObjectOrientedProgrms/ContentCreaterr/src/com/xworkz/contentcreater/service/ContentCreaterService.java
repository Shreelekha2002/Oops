package com.xworkz.contentcreater.service;

import com.xworkz.contentcreater.dto.ContentCreaterDto;

public interface ContentCreaterService {
	boolean validateAndSave(ContentCreaterDto contentCreaterDto);
	void read();
	boolean update(String userName, ContentCreaterDto contentCreaterDto);
}
