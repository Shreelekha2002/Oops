package com.xworkz.outdoorgames.service;

import com.xworkz.outdoorgames.repository.OutDoorGamesRepository;

public class OutDoorGamesServiceImplementation implements OutDoorGamesService{
	private OutDoorGamesRepository outDoorGamesRepository;
	
	
	public OutDoorGamesServiceImplementation(OutDoorGamesRepository outDoorGamesRepository) {
		// TODO Auto-generated constructor stub
		this.outDoorGamesRepository=outDoorGamesRepository;
	}

	@Override
	public boolean saveAndValidate(String gameName) {
		if(gameName!=null) {
			if(gameName.isEmpty()||gameName.isBlank()||!(gameName.length()>2&&gameName.length()<30)) {
				System.out.println("Name shoudn't be empty or blank");
				return false;
			}
			else {
				boolean exists=isExists(gameName);
				if(exists!=true) {
			boolean	save=outDoorGamesRepository.onSave(gameName);
			if(save==true) {
				System.out.println("saved succesfully");
			}else {
				System.out.println("not saved succesfully");
			}
				}else {
					System.out.println("name is already present in the data");
				}
			}
		}
		return false;
	}

	@Override
	public boolean isExists(String gameName) {
	String[]	nameList=outDoorGamesRepository.read();
	if(nameList!=null&&gameName!=null) {
		for(String name:nameList) {
			if(name!=null) {
				if(name.equalsIgnoreCase(gameName)) {
				return true;
				}
			}
		}
	}
		return false;
	}

	@Override
	public boolean update(String oldGameName, String newGameName) {
		if(oldGameName!=null&&newGameName!=null) {
			boolean exists1 = isExists(oldGameName);
				if(exists1) {
					if(newGameName.isEmpty()||newGameName.isBlank()||(!(newGameName.length()>2&&newGameName.length()<30))){
						System.out.println("data contains empty, blank");
						return false;
					}
					boolean exists2 = isExists(newGameName);
					
					if(exists2) {
						System.out.println("name already present in data");
					}else {
						boolean update=outDoorGamesRepository.update(oldGameName, newGameName);
						if(update) {
							System.out.println("new name updated");
						}else {
							System.out.println("new name not updated");
						}
					}
					}
					
					
				}
			
		
		return false;
	}

	@Override
	public void read() {
		String names[]=outDoorGamesRepository.read();
		for(String name:names) {
			System.out.println(name);
		}
		
	}

	@Override
	public boolean delete(String gameName) {
		
	if(gameName!=null) {
		
		boolean delete=outDoorGamesRepository.delete(gameName);
		System.out.println("entring into delete condition");
		if(delete) {
			System.out.println("deleted");
		}else {
			System.out.println("not deleted");
		}
		
	}else {
		System.out.println("name not present in data");
	}
		return false;
	}

}


