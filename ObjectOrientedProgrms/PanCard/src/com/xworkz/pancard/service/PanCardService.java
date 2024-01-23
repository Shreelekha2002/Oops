package com.xworkz.pancard.service;

import com.xworkz.pancard.dto.PanCardDto;

public interface PanCardService {
	public boolean ValidateAndSave(PanCardDto panCardDto);
	void read();
	
	public boolean updateDto(String UserName, PanCardDto panCardDto);
	
	boolean delete(String UserName);
}
