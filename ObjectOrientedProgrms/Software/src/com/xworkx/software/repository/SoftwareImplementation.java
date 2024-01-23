package com.xworkx.software.repository;

public class SoftwareImplementation implements Software{
	String[] software = new String[5];
	int index=0;
	@Override
	public boolean onSave(String softwareName) {
		if(index<software.length) {
			software[index]=softwareName;
			index++;
			System.out.println(true);
			
		}
		return false;
	}
	@Override
	public String[] read() {
		
		return null;
	}

}
