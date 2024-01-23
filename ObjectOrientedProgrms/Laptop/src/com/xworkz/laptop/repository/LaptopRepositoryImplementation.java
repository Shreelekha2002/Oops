package com.xworkz.laptop.repository;

public class LaptopRepositoryImplementation implements LaptopRepository{
	public String names[]=new String[5];
	public int index=0;
	@Override
	public boolean onSave(String laptopName) {
		if(laptopName!=null) {
			if(index<names.length) {
				names[index]=laptopName;
				index++;
				//System.out.println("saving");
				System.out.println(laptopName);
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean update(String oldLaptopName, String newLaptopName) {
		for(int i=0; i<names.length; i++) {
			if(names[i]!=null) {
				if(names[i].equalsIgnoreCase(oldLaptopName)) {
					names[i]=newLaptopName;
					return true;
				}
			}
		
		}
		return false;
	}
	@Override
	public String[] read() {
		
		return names;
	}
	
	

}
