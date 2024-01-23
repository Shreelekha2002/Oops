package com.xworkz.pancard.repository;

import com.xworkz.pancard.dto.PanCardDto;

public class PanCardRepositoryImplementation implements PanCardRepository{
	PanCardDto[] repository = new PanCardDto[5];
	int index=0;
	@Override
	public boolean onSave(PanCardDto panCardDto) {
		if(panCardDto!=null) {
			if(this.index<this.repository.length) {
				this.repository[this.index]=panCardDto ;
				this.index++;
				return true;
			}
		}
		return false;
	}
	@Override
	public PanCardDto[] read() {
		
		return repository;
	}
	@Override
	public boolean updateDto(String UserName, PanCardDto panCardDto) {
		for(int i=0; i<repository.length; i++) {
			if(repository[i]!=null) {
				if(repository[i].getUserName().equals(UserName))
				{
					repository[i]=panCardDto;
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public boolean deleteDto(String UserName) {
		if(repository!=null) {
		for(int i=0; i<repository.length; i++) {
			repository[i].equals(UserName);
			repository[i]=null;
			return true;
		}
		}
		return false;
	}

}
