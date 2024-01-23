package com.xworkz.jobportals.service;

import com.xworkz.jobportals.repository.JobPortalsRepository;

public class JobPortalsServiceImplementation implements JobPortalsService{
	private JobPortalsRepository jobPortalsRepository;
		public JobPortalsServiceImplementation(JobPortalsRepository jobPortalsRepository) {
			this.jobPortalsRepository=jobPortalsRepository;
		}
	@Override
	public boolean validationAndSave(String portalName) {
		if(portalName!=null) {
			if(portalName.isEmpty()||portalName.isBlank()||portalName.length()<2&&portalName.length()<30) {
				System.out.println("check the name and provide proper name");
				return true;
			}else {
				System.out.println("valid name");
				return false;
			}
		}
		boolean exists = isExists(portalName);
		if(exists!=true) {
		boolean save=jobPortalsRepository.onSave(portalName);
		if(save) {
			System.out.println("added successfully");
		}else {
			System.out.println("not added successfully");
		}
		}
		return false;
	}
	@Override
	public boolean isExists(String portalName) {
		String[] portalList = jobPortalsRepository.read();
		if(portalList!=null && portalName!=null) {
			
			for(String name:portalList) {
				if(name!=null) {
					if(name.equals(portalName)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	@Override
	public boolean update(String oldName, String newName) {
		if(oldName!=null&&newName!=null) {
			boolean oldValueCheck=isExists(oldName);
			if(oldValueCheck == true) {
				boolean updateResult= jobPortalsRepository.update(oldName, newName);
					if(updateResult) {
						System.out.println("update successfully");
					}else {
						System.out.println("not update successfully");
					}
				
			}else {
				System.out.println("element is not present "+oldName);
			}
		}
		return false;
	}

}
