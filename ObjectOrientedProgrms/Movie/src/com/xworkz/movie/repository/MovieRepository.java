package com.xworkz.movie.repository;

public interface MovieRepository {
	
	boolean onSave(String movieName);
	
	String[] read();
	
	boolean update(String oldMovieName,String newMovieName);
	
	boolean delete(String movieName);
}
