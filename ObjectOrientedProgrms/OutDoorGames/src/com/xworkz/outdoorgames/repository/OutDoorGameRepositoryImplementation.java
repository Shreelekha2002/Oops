package com.xworkz.outdoorgames.repository;

public class OutDoorGameRepositoryImplementation implements OutDoorGamesRepository{
	String repository[] = new String[10];
	int index=0;
	@Override
	public boolean onSave(String gameName) {
		if(index<repository.length) {
			repository[index]=gameName;
			index++;
			return true;
		}
		return false;
	}
	@Override
	public String[] read() {
		// TODO Auto-generated method stub
		return repository;
	}
	@Override
	public boolean update(String oldGameName, String newGameName) {
		for(int i=0; i<repository.length; i++) {
			if(repository[i].equalsIgnoreCase(oldGameName)) {
			repository[i]=newGameName;
			return true;
		}
		}
		return false;
	}
	@Override
	public boolean delete(String gameName) {
		if(repository!=null) {
			for(int i=0; i<repository.length; i++) {
				if(repository[i].equalsIgnoreCase(gameName));
				repository[i]=null;	
				return true;
				}
		}
			
		
		return false;
	}
	
	

}
