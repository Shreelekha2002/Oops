package com.xworkz.countries.runner;

import com.xworkz.countries.repository.CountriesRepository;
import com.xworkz.countries.repository.CountriesRepositoryImplementation;
import com.xworkz.countries.service.CountriesService;
import com.xworkz.countries.service.CountriesServiceImplementation;

public class CountriesRunner {
	public static void main(String[] args) {
		CountriesRepository  countriesRepository  =	new CountriesRepositoryImplementation();
	boolean save =	countriesRepository.onSave("Banglore");
	//countriesRepository.update("india", "ind");
		System.out.println("element saved "+save);
	//countriesRepository.update("India", "Ind");
	
		System.out.println("update names are calling");
		
//		CountriesService countriesService = new CountriesServiceImplementation(countriesRepository);
//		countriesService.validationAndSave("India");
		
	}
}
