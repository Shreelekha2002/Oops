package com.xworkz.movie.service;

public interface MovieService {
	boolean validatAndSave(String movieName);
	boolean isExists(String movieName);
	void read();
	boolean update(String oldMovieName, String newMovieName);
	boolean delete(String movieName);
}
