package com.xworkz.fooditems.repository;

public class FooditemsRepositoryImplementation implements FooditemsRepository{
	String fooditems[] = new String[3];
	int index=0;
	@Override
	public boolean onSave(String fooditemName) {
		if(index<fooditems.length) {
			fooditems[index]=fooditemName;
			index++;
			System.out.println("food is saved");
			return true;
		}
		return false;
	}

}
