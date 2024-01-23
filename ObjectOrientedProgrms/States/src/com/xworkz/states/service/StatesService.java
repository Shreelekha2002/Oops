package com.xworkz.states.service;

public interface StatesService {
boolean validationAndSave(String stateName);
	
	boolean isExists(String stateName);
	
	boolean update(String oldStateName, String newStateName);
	
	void read();
	
	boolean delete(String stateName);
}
