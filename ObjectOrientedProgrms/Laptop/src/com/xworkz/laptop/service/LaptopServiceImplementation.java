package com.xworkz.laptop.service;

import com.xworkz.laptop.repository.LaptopRepository;

public class LaptopServiceImplementation implements LaptopService{
	private	LaptopRepository laptopRepository;
	public LaptopServiceImplementation(LaptopRepository laptopRepository) {
		this.laptopRepository=laptopRepository;
	}
	@Override
	public boolean validateAndSave(String laptopName) {
		if(laptopName!=null) {
			if(laptopName.isEmpty()||laptopName.isBlank()||!(laptopName.length()>2&&laptopName.length()<35)) {
				System.out.println("give proper name");
				return false;
			}else {
				boolean exists=isExists(laptopName);
				if(exists!=true) {
				boolean save=laptopRepository.onSave(laptopName);
				if(save) {
					System.out.println("saved succesfully");
				}else {
					System.out.println("not saved succesfully");
					}
				}else {
					System.out.println("name already present in data");
				}
			}
		}
		return false;
	}
	@Override
	public boolean isExists(String laptopName) {
		String nameList[]=laptopRepository.read();
		if(nameList!=null&&laptopName!=null) {
			for(String name:nameList) {
				if(name!=null) {
					name.equalsIgnoreCase(laptopName);
					
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public boolean update(String oldLaptopName, String newLaptopName) {
		
		if(oldLaptopName!=null&&newLaptopName!=null) {
			
			boolean exists1=isExists(oldLaptopName);
			
			if(exists1) {
				
			if(newLaptopName.isEmpty()||newLaptopName.isBlank()||!(newLaptopName.length()>2&&newLaptopName.length()<35)){
				
				return false;
				
			}else {
				System.out.println("enter into condition");
				boolean isExists2=isExists(newLaptopName);
				if(isExists2) {
				System.out.println("new name already present");
				}else {
				boolean update=update(oldLaptopName, newLaptopName);
				if(update) {
					System.out.println("updated successfully");
				}else {
					System.out.println("not updated succefully");
				}
			}
		}
			
			}
		
	}
		return false;
		
}
}
