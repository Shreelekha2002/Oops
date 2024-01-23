package com.xworkz.fooditems.runner;

import com.xworkz.fooditems.repository.FooditemsRepository;
import com.xworkz.fooditems.repository.FooditemsRepositoryImplementation;
import com.xworkz.fooditems.service.FooditemsService;
import com.xworkz.fooditems.service.FooditemsServiceImplementation;

public class FooditemsRunner {
	public static void main(String[] args) {
		FooditemsRepository fooditemsRepository	= new FooditemsRepositoryImplementation();
//	boolean save=fooditemsRepository.onSave(null);
//	System.out.println("food item is saving "+save);
		FooditemsService fooditemsService = new FooditemsServiceImplementation(fooditemsRepository);
		fooditemsService.validateAndSave("dosa");
	}
}
