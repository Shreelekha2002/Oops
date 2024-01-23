package com.xworkz.travelling.service;

public interface TravellingService {
	boolean validateAndSave(String placeName);
	
	boolean isExist(String placeName);
	boolean update(String oldName,String newName);
	
	boolean delete(String placeName);
}
