package com.xworkz.states.service;

import com.xworkz.states.repository.StatesRepository;

public class StatesServiceImplementation implements StatesService{
private StatesRepository statesRepository;
	
	public StatesServiceImplementation(StatesRepository statesRepository) {
		this.statesRepository=statesRepository;
	}
	
	@Override
	public boolean validationAndSave(String stateName) {
		if(stateName!=null) {
			if(stateName.isEmpty()||stateName.isBlank()) {
				System.out.println("state name shouldn't be empty or blank");
				return false;
			}else {
				boolean exist = isExists(stateName);
				if(exist!=true) {
				boolean save =statesRepository.onSave(stateName);
				if(save==true) {
					System.out.println("saved successfully");
				}else {
					System.out.println("not saved successfully");
				}
			}
				else {
					System.out.println("state name is already exits");
				}
		}
		}
		return false;
	}

	@Override
	public boolean isExists(String stateName) {
		String nameList[]=statesRepository.read();
		if(stateName!=null&&nameList!=null) {
			for(String name:nameList) {
				if(name!=null) {
					if(name.equals(stateName)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public boolean update(String oldStateName, String newStateName) {
		if(oldStateName!=null && newStateName!=null) {
			boolean exists=isExists(oldStateName);
			if(exists) {
				if(newStateName.isEmpty()) {
					System.out.println("empty");
					return false;
				}else if(newStateName.isBlank()) {
					System.out.println("blank");
					return false;
				}else if(!newStateName.contains("a")) {
					System.out.println("not contaons a");
					return false;
				}else if((!(newStateName.length()>2 && newStateName.length()<30))){
					System.out.println("name lies between 2 and 3");
					return false;
				}
				boolean exists1=isExists(newStateName);
				if(exists1) {
					System.out.println("name already present in data");
				}else {
					boolean update=update(oldStateName, newStateName);
					if(update) {
						System.out.println("updates");
					}else {
						System.out.println("not updates");
					}
				}
			}
		}
		return false;
	}

	@Override
	public void read() {
		String[] name=statesRepository.read();
		for(String names : name) {
		System.out.println(names);
		
		}
	}

	@Override
	public boolean delete(String stateName) {
		if(stateName!=null) {
			boolean delete=statesRepository.delete(stateName);
			if(delete) {
				System.out.println("deleted");
			}else {
				System.out.println("not deleted");
			}
		}
		return false;
	}

}
