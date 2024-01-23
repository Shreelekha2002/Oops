package com.xworkz.travelling.repository;

public class TravellingRepositoryImplementation implements TravellingRepository{
	//declare array using new keyword
	private String travelling[] = new String[3];
	int index=0;

	@Override
	public boolean onSave(String placeName) {
		if(index<travelling.length) {
			this.travelling[index]=placeName;
			index++;
			System.out.println("added succesfully");
			return true;
		}else {
			System.out.println("not added succesfully");
		}
		return false;
	}
	

	@Override
	public String[] read() {
		return travelling;
	}


	@Override
	public boolean update(String oldName, String newName) {
		for(String name:travelling) {
			if(name!=null) {
				if(name.equalsIgnoreCase(oldName)) {
						name=newName;
						return true;
				}
			}
		}
		return false;
	}


	@Override
	public boolean delete(String placeName) {
		if(placeName!=null) {
			for(int i=0; i<travelling.length; i++) {
				travelling[i].equalsIgnoreCase(placeName);
				travelling[i]=null;
				return true;
			}
		}
		return false;
	}
	
}
