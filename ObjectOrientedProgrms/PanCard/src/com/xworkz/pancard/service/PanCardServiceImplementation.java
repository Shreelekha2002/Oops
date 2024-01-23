package com.xworkz.pancard.service;

import com.xworkz.pancard.dto.PanCardDto;
import com.xworkz.pancard.repository.PanCardRepository;

public class PanCardServiceImplementation implements PanCardService{
	private PanCardRepository panCardRepository;
	public PanCardServiceImplementation(PanCardRepository panCardRepository) {
		this.panCardRepository=panCardRepository;
	}
	@Override
	
	public boolean ValidateAndSave(PanCardDto panCardDto) {
		boolean validateUserName=true;
		boolean validateAadharNumber=true;
		boolean validateEmail=true;
		boolean validateContactNumber=true;
		boolean validatePresentAddress=true;
		boolean validatePanCard=true;
		boolean validatePassword=true;
		
		if(panCardDto!=null) {
			if(panCardDto.getUserName().length()<2) {
				System.out.println("username is wrong");
				validateUserName= false;
			}
			long aadharNumber=panCardDto.getAadharNumber();
			int count=0;
			while(aadharNumber>0) {
				aadharNumber=aadharNumber/10;
				count++;
			}
			if(count!=12) {
				System.out.println("aadhar number is wrong");
				validateAadharNumber= false;
			}
			if(!(panCardDto.getEmail().contains("@"))||panCardDto.getEmail().length()<3) {
				System.out.println("Email is wrong");
				validateEmail= false;
			}
			
			long contactNumber=panCardDto.getContactNumber();
			int a=0;
			while(contactNumber>0) {
				contactNumber=contactNumber/10;
				a++;
			}
			
			if(a!=10) {
				System.out.println("contatct number is wrong");
				validateContactNumber= false;
			}
			if(panCardDto.getPresentAddress().length()<5) {
				System.out.println("current address is wrong");
				validatePresentAddress= false;
			}
			
			
			if(panCardDto.getPassword().length()<8||panCardDto.getPassword().length()>16)
			{
				System.out.println("password wrong");
				validatePassword= false;
			}
		boolean	isPanValid=isValidPanNumber(panCardDto.getPanNumber());
			if(isPanValid) {
				System.out.println("pan number is correct");
				validateAadharNumber=true;
			}else {
				System.out.println("pan number is wrong");
				return false;
			}
			
			if(validateAadharNumber&&validatePassword&&validatePresentAddress&&validateContactNumber&&validateEmail&&validateAadharNumber&&validateUserName) {
				
				boolean exists1=isExists(panCardDto);
				if(exists1==false){
					
				boolean save=panCardRepository.onSave(panCardDto);
				if(save) {
					System.out.println("saved succesfully");
				
				}else {
					System.out.println("not saved succesfully");
				}
			}
			}
			
		}
		return false;
	}
	private boolean isValidPanNumber(String panNumber) {
		if(panNumber!=null) {
		if(panNumber.length()!=10) {
			System.out.println("pan number is wrong");
			return false;
		}
		else {
			char firstChar = panNumber.charAt(0);
			char secondChar = panNumber.charAt(1);
			char lastChar = panNumber.charAt(panNumber.length()-1);
			
			boolean isFirstCharValid = Character.isUpperCase(firstChar);
			boolean isSecondCharValid = Character.isLowerCase(secondChar);
			boolean islastCharValid = Character.isDigit(lastChar);
		
		return isFirstCharValid && isSecondCharValid && islastCharValid;
		
		}
		}
		return false;
		
	}
	private boolean isExists(PanCardDto panCardDto){
		PanCardDto dtoList[]=this.panCardRepository.read();
		if(dtoList!=null) {
			for(PanCardDto list:dtoList) {
				if(list!=null) {
					list.equals(panCardDto);
					return true;
				}
			}
		}
		return false;
		
	}
	@Override
	public void read() {
		PanCardDto[] dto = panCardRepository.read();
		for(int i=0; i<dto.length; i++) {
			if(dto[i]!=null) {
			System.out.println(dto[i]);
				
			}
		}
		
		
	}
	@Override
	public boolean updateDto(String userName, PanCardDto panCardDto) {
		PanCardDto[] dtos = panCardRepository.read();
		boolean update = panCardRepository.updateDto(userName, panCardDto);
		if(update) {
			System.out.println("updated succesfully");
		}else {
			System.out.println("not updated succesfully");
		}
		
		return false;
	}
	@Override
	public boolean delete(String UserName) {
	boolean deleteDto	=panCardRepository.deleteDto(UserName);
	if(deleteDto) {
		System.out.println("deleted successfully");
	}else {
		System.out.println("not deleted successfully");
	}
		return false;
	}
	
}
