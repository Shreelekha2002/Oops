package com.xworkx.software.service;

import com.xworkx.software.repository.Software;

public class SoftwareServiceImplementation implements SoftwareService{
	private Software software;
	
	public SoftwareServiceImplementation(Software software) {
		this.software=software;
	}
	
	@Override
	public boolean validationAndSave(String softwareName) {
		if(softwareName!=null) {
			if(softwareName.isEmpty()||softwareName.isBlank()||softwareName.length()>2&&softwareName.length()<30) {
				System.out.println("give the software name and valid software name");
			}else {
				System.out.println("validation not done");
				boolean exist = isExists(softwareName);
				if(exist!=true) {
				boolean save = software.onSave(softwareName);
				if(save==true) {
					System.out.println("saved successfully");
				}else {
					System.out.println("not saved successfully");
				}
			}
		}
		}
		return false;
	}

	@Override
	public boolean isExists(String softwareName) {
		String nameList[]=software.read();
		if(softwareName!=null&&nameList!=null) {
			for(String name:nameList) {
				if(name!=null) {
					if(name.equals(softwareName)) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
