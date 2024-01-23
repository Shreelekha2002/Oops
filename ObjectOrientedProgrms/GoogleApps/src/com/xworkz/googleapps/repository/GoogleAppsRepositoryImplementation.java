package com.xworkz.googleapps.repository;

import com.xworkz.googleapps.dto.GoogleAppsDto;

public class GoogleAppsRepositoryImplementation implements GoogleAppsRepository{
private GoogleAppsDto[] googleAppsDtoList=new GoogleAppsDto[4];
private int index=0;
	@Override
	public boolean onSave(GoogleAppsDto googleAppsDto) {
		if(this.index<this.googleAppsDtoList.length) {
			this.googleAppsDtoList[this.index]=googleAppsDto;
			index++;
			return true;
		}
		
		return false;
	}
	@Override
	public GoogleAppsDto[] read() {
		return googleAppsDtoList;
	}

}