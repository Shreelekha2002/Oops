package com.xworkz.states.repository;

public class StatesRepositoryImplementation implements StatesRepository{
	String[] statesRepository = new String[5];
	int index=0;
	@Override
	public boolean onSave(String stateName) {
		if(index<statesRepository.length) {
			statesRepository[index]=stateName;
			index++;
			return true;
			
		}
		return false;
	}
	@Override
	public String[] read() {
		
		return statesRepository;
	}
	@Override
	public boolean update(String oldStateName, String newStateName) {
		for(int i=0; i<statesRepository.length; i++) {
			if(statesRepository[i].equalsIgnoreCase(oldStateName)) {
				statesRepository[i]=newStateName;
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean delete(String stateName) {
		if(statesRepository!=null) {
			for(int i=0; i<statesRepository.length; i++) {
				if(statesRepository[i].equalsIgnoreCase(stateName)) {
					statesRepository[i]=null;
					return true;
				}
			}
			
		}
		return false;
	}

}
