package com.xworkz.outdoorgames.repository;

public interface OutDoorGamesRepository {
	public boolean onSave(String gameName);
	
	String[] read();
	
	boolean update(String oldGameName, String newGameName);
	
	boolean delete(String gameName);
	
	
}
