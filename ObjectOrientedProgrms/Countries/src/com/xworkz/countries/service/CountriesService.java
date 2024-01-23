package com.xworkz.countries.service;

public interface CountriesService {
boolean validationAndSave(String countryName);
	
	boolean isExists(String countryName);
	
	boolean update(String oldName, String newName);
	void read();
}
