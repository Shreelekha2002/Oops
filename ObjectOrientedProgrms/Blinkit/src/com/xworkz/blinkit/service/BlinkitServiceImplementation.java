package com.xworkz.blinkit.service;

import com.xworkz.blinkit.dto.BlinkitDto;
import com.xworkz.blinkit.repository.BlinkitRepository;


public class BlinkitServiceImplementation implements BlinkitService{
	private BlinkitRepository repository;
	public BlinkitServiceImplementation(BlinkitRepository repository) {
		this.repository=repository;
	}
	@Override
	public boolean validateAndSave(BlinkitDto blinkitDto) {
		boolean validateCustomerName=true;
		boolean validateCustomerEmail=true;
		boolean validateContactNumber=true;
		boolean validateItemName=true;
		
		if(blinkitDto!=null) {
			System.out.println("Dto is not null");
			if(blinkitDto.getName()==null||blinkitDto.getName().isEmpty()||blinkitDto.getName().isBlank()) {}
			System.out.println("Customer name is wrong");
			validateCustomerName=false;
		}
		if(blinkitDto.getEmail()==null||!blinkitDto.getEmail().contains("@")||blinkitDto.getEmail().isEmpty()||blinkitDto.getEmail().isBlank()) {
			System.out.println("email is wrong");
			validateCustomerEmail=false;
		}
		int count=0;
		long contactNumber=blinkitDto.getContactNumber();
		while(contactNumber>0) {
			contactNumber=contactNumber/10;
			count++;
		}
		if(count!=10) {
			System.out.println("contact number is wrong");
			validateContactNumber=false;
		}
		if(blinkitDto.getItemName().isEmpty()||blinkitDto.getItemName().isBlank()) {
			System.out.println("item name is wrong");
			validateItemName=false;
		}
		boolean save = repository.onSave(blinkitDto);
			if(save) {
				System.out.println("saved successfully");
			}else {
				System.out.println("not saved successfully");
			}
		return false;
	}
	private boolean isExists(BlinkitDto blinkitDto){
		BlinkitDto dtoList[]=this.repository.read();
		if(dtoList!=null) {
			for(BlinkitDto list:dtoList) {
				if(list!=null) {
					list.getEmail().equals(blinkitDto.getEmail());
					
					return true;
				}
				
			}
			
			
		}
		return false;
		
	}

}
