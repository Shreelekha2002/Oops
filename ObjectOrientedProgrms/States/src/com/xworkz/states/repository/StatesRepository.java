package com.xworkz.states.repository;

public interface StatesRepository {
	
	boolean onSave(String stateName);
	
	String[] read();
	
	boolean update(String oldStateName, String newStateName);
	
	boolean delete(String stateName);
}
