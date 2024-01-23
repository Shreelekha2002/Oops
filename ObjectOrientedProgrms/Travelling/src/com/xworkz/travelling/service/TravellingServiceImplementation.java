package com.xworkz.travelling.service;

import com.xworkz.travelling.repository.TravellingRepository;

public class TravellingServiceImplementation implements TravellingService {

	private TravellingRepository travellingRepository;

	public TravellingServiceImplementation(TravellingRepository travellingRepository) {
		this.travellingRepository = travellingRepository;
	}

	@Override
	public boolean validateAndSave(String placeName) {
		if (placeName == null) {
			System.out.println("place name is null");
			if (placeName.isEmpty() || placeName.isBlank() || placeName.length() < 3 && placeName.length() > 25) {
				System.out.println("valid succesfully done");
			} else {
				System.out.println("valid not succesfully done");
				boolean exist = isExist(placeName);
				if (exist != true) {
					boolean save = travellingRepository.onSave(placeName);
					if (save == true) {
						System.out.println("added successfully");
						return true;
					} else {
						System.out.println("not added successfully");
						return false;
					}
				} else {
					System.out.println("place name is already exist " + placeName);
				}
			}
		}
		return false;
	}

	@Override
	public boolean isExist(String placeName) {
		String[] placeList = travellingRepository.read();
		if (placeList != null && placeName != null) {
			for (String name : placeList) {
				if (name != null) {
					if (name.equalsIgnoreCase(placeName)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public boolean update(String oldName, String newName) {
		System.out.println("update running");
		if (newName != null && oldName != null) {
			System.out.println("null check done ");
			boolean oldValueCheck = isExist(oldName);
			System.out.println("isExist:" + oldValueCheck);
			if (oldValueCheck ==true) {
				System.out.println("Old element present:" + oldName);
				boolean updateResult=travellingRepository.update(oldName,newName);
				if(updateResult) {
					System.out.println("updated successfully");
				}else {
					System.out.println("not updated successfully");
				}
			}else {
				System.out.println("element is not present:"+oldName);
			}
		}
		return false;
	}

	@Override
	public boolean delete(String placeName) {
		if(placeName!=null) {
			boolean delete=travellingRepository.delete(placeName);
			if(delete) {
				System.out.println("deleted successfully");
			}else {
				System.out.println("not deleted successfully");
			}
		}
		return false;
	}

	
}
