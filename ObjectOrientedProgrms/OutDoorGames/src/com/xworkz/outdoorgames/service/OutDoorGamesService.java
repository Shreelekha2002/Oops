package com.xworkz.outdoorgames.service;

public interface OutDoorGamesService {
	boolean saveAndValidate(String gameName);
	boolean isExists(String gameName);
	void read();
	boolean update(String oldGameName, String newGameName);
	boolean delete(String gameName);
}
