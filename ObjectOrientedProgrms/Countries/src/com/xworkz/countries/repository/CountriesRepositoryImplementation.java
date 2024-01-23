package com.xworkz.countries.repository;

public class CountriesRepositoryImplementation implements CountriesRepository{
	String[] countriesRepository = new String[5];
	int index=0;
	@Override
	public boolean onSave(String countryName) {
		if(index<countriesRepository.length) {
			countriesRepository[index]=countryName;
			index++;
			System.out.println(true);
			
		}
		return false;
	}
	@Override
	public String[] read() {
		
		return countriesRepository;
	}
	@Override
	public boolean update(String oldName, String newName) {
		for(int i=0; i<countriesRepository.length; i++) {
			if(countriesRepository[i].equalsIgnoreCase(oldName)) {
				countriesRepository[i]=newName;
				return true;
			}
		}
		return false;
	}

}
