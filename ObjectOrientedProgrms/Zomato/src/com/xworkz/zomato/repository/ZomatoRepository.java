package com.xworkz.zomato.repository;

import com.xworkz.zomato.dto.ZomatoDto;

public interface ZomatoRepository {

	boolean onsave(ZomatoDto zomatoDto);
	
	ZomatoDto[] read();
	
    boolean update(String custumerEmail,ZomatoDto zomatoDto);
    
    boolean delete(long contactNumber);
}