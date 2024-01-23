package com.xworkz.googleapps.service;

import com.xworkz.googleapps.dto.GoogleAppsDto;
import com.xworkz.googleapps.repository.GoogleAppsRepository;

public class GoogleAppsServiceImplementation implements GoogleAppsService {
	private GoogleAppsRepository repository;

	public GoogleAppsServiceImplementation(GoogleAppsRepository repository) {
		this.repository = repository;
	}

	boolean validateId = true;
	boolean validateName = true;

	@Override

	public boolean validateSave(GoogleAppsDto googleAppsDto) {
		if (googleAppsDto == null) {
			System.out.println("googleAppsDto is null");
			return false;

		} else {
			if (googleAppsDto.getApplicationId().equals("null") || 
					googleAppsDto.getApplicationId().equals(null)||
					(googleAppsDto.getApplicationId().length() < 3 &&
							googleAppsDto.getApplicationId().length() > 10)||
					!googleAppsDto.getApplicationId().startsWith("G"))
			{
				System.out.println("give correct application Id");
				validateId = false;
			}
			if (googleAppsDto.getApplicationName().equals(null) || 
					googleAppsDto.getApplicationName().equals("null")||
					(googleAppsDto.getApplicationName().length() < 3 &&
							googleAppsDto.getApplicationName().length() > 10)) 
			{ 
				System.out.println("give currect application name");  
				validateName = false;
			}
       
		
			if (validateId && validateName) {

				boolean exist = isExist(googleAppsDto);
				if (exist == false) {
					boolean save = this.repository.onSave(googleAppsDto);
					if (save) {
						System.out.println("dtos added successfully");
						return true;
					} else {
						System.out.println("dtos not added successfully");
						return false;
					}
				} else {
					System.out.println("dto is already exists");
				}
			}
		}
		return false;
	}

	private boolean isExist(GoogleAppsDto googleAppsDto) {
		GoogleAppsDto[] dtos = repository.read();
		if (dtos != null) {
			for (GoogleAppsDto name : dtos) {
				if (name != null) {
					if(name.getApplicationId().equals(googleAppsDto.getApplicationId())) {
//						System.out.println("application id is already exists");
						return true;
					}
						if(name.getApplicationName().equals(googleAppsDto.getApplicationName()))	
						 {
							//System.out.println("application name is already exists");
						return true;
						 
					}
				}
			}
		}
		return false;
	}

	public void read() {
		GoogleAppsDto[] dtos = repository.read();
		for (GoogleAppsDto dto : dtos) {
			System.out.println(dto);
		}
	}
}