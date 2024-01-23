package com.xworkz.laptop.service;

public interface LaptopService {
	boolean validateAndSave(String laptopName);
	
	boolean isExists(String laptopName);
	
	
	public boolean update(String oldLaptopName, String newLaptopName);
}
