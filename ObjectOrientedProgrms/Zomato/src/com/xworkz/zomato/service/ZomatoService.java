package com.xworkz.zomato.service;

import com.xworkz.zomato.dto.ZomatoDto;

public interface ZomatoService {

	boolean validateAndSave(ZomatoDto zomatodto);
	
	void read();
	
	boolean update(String custumerEmail,ZomatoDto zomatoDto);
	
	boolean delete(long contactNumber);
}