package com.xworkz.countries.service;

import com.xworkz.countries.repository.CountriesRepository;

public class CountriesServiceImplementation implements CountriesService{
private CountriesRepository countriesRepository;
	
	public CountriesServiceImplementation(CountriesRepository countriesRepository) {
		this.countriesRepository=countriesRepository;
	}
	
	@Override
	public boolean validationAndSave(String countryName) {
		if(countryName!=null) {
			System.out.println("null checking");
			if(countryName.isEmpty()||countryName.isBlank()||countryName.length()>2&&countryName.length()<30) {
				System.out.println("give the software name and valid software name");
				return false;
			}else {
				System.out.println("validation not done");
				boolean exist = isExists(countryName);
				if(exist!=true) {
				boolean save = countriesRepository.onSave(countryName);
				if(save==true) {
					System.out.println("saved successfully");
				}else {
					System.out.println("not saved successfully");
				}
			}
		}
		}
		return false;
	}

	@Override
	public boolean isExists(String countryName) {
		String nameList[]=countriesRepository.read();
		System.out.println("read");
		if(countryName!=null&&nameList!=null) {
			for(String name:nameList) {
				if(name!=null) {
					if(name.equals(countryName)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public boolean update(String oldName, String newName) {
		if(oldName!=null&&newName!=null) {
			boolean exists=isExists(oldName);
			if(newName.isEmpty()) {
				System.out.println("is empty");
				return false;
			}
			if(newName.isBlank()) {
				System.out.println("is blank");
				return false;
			}
			if(newName.length()>3&&newName.length()<30) {
				System.out.println("length verified");
				return false;
			}
			boolean exists1=isExists(newName);
			System.out.println("present");
			}
		else {
			boolean update=countriesRepository.update(oldName, newName);
			if(update) {
				System.out.println("updatedd");
			}
			else {
				System.out.println("not updated");
			}
		
}
		return false;
	}

	@Override
	public void read() {
		String[] name=countriesRepository.read();
		for(String string:name) {
			System.out.println(string);
		}
	}
}
