package com.xworkz.countries.repository;

public interface CountriesRepository {
boolean onSave(String countryName);
	
	String[] read();
	
	boolean update(String oldName, String newName);
}
