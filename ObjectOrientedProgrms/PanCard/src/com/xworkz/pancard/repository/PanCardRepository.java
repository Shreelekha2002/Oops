package com.xworkz.pancard.repository;

import com.xworkz.pancard.dto.PanCardDto;

public interface PanCardRepository {
	public boolean onSave(PanCardDto panCardDto);
	PanCardDto[] read();
	public boolean updateDto(String UserName, PanCardDto panCardDto);
	
	boolean deleteDto(String UserName);
}
