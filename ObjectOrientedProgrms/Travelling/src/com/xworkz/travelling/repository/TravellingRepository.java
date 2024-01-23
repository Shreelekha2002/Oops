package com.xworkz.travelling.repository;

public interface TravellingRepository {
	//onsave method
	boolean onSave(String placeName);
	//read method
	String[] read();
	boolean update(String oldName, String newName);
	
	boolean delete(String placeName);
	
}
