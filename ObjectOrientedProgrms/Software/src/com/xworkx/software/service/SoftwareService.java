package com.xworkx.software.service;

public interface SoftwareService {
	//validation and save
	boolean validationAndSave(String softwareName);
	
	boolean isExists(String softwareName);
}
