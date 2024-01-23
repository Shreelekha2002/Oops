package com.xworkz.jobportals.repository;

public class JobPortalsRepositoryImplementation implements JobPortalsRepository{
	String portal[] = new String[5];
	int index=0;
	@Override
	public boolean onSave(String portalName) {
		if(portalName!=null) {
			portal[index]= portalName;
			index++;
			System.out.println("null checking");
			return true;
		}
		return false;
	}
	@Override
	public String[] read() {
		
		return portal;
	}
	@Override
	public boolean update(String oldName, String newName) {
		for(int i=0; i<portal.length; i++) {
			if(portal[i]!=null) {
			
				if(portal[i].equalsIgnoreCase(oldName)) {
					portal[i]=newName;
					return true;
				}
			}
		}
		
		return false;
	}

}
