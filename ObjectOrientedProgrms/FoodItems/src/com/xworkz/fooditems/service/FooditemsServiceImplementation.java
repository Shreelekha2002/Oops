package com.xworkz.fooditems.service;

import com.xworkz.fooditems.repository.FooditemsRepository;

public class FooditemsServiceImplementation implements FooditemsService {
	
	private FooditemsRepository fooditemsRepository;
	public FooditemsServiceImplementation(FooditemsRepository fooditemsRepository) {
		this.fooditemsRepository=fooditemsRepository;
	}

	@Override//1
	public boolean validateAndSave(String fooditemName) {
		if (fooditemName != null) {
			if (fooditemName.isEmpty() || fooditemName.isBlank() || fooditemName.length() < 3
					|| fooditemName.length() > 25) {
				System.out.println("Check the food name, give proper food name");
			} else {
				System.out.println("valid food name");
				
				//onsave()
			boolean	save = fooditemsRepository.onSave(fooditemName);
			if(save==true) {
				System.out.println("saved succesfully");
			}else {
				System.out.println("not saved succesfully");
			}
			}
		}else {
			System.out.println("the food is "+fooditemName);
		}
		return false;
	}

}
