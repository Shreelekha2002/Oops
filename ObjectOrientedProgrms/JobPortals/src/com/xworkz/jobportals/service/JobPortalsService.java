package com.xworkz.jobportals.service;

public abstract interface JobPortalsService {
	boolean validationAndSave(String portalName);
	
	boolean isExists(String portalName);

	boolean update(String oldName, String newName);
}
