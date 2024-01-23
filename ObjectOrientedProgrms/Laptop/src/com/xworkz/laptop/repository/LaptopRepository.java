package com.xworkz.laptop.repository;

public interface LaptopRepository {
	public boolean onSave(String laptopName);
	String[] read();
	public boolean update(String oldLaptopName, String newLaptopName);
}
