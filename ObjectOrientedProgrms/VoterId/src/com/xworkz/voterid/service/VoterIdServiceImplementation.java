package com.xworkz.voterid.service;

import com.xworkz.voterid.dto.VoterIdDto;
import com.xworkz.voterid.repository.VoterIdRepository;

public class VoterIdServiceImplementation implements VoterIdService {
	private VoterIdRepository voterIdRepository;

	public VoterIdServiceImplementation(VoterIdRepository voterIdRepository) {
		this.voterIdRepository = voterIdRepository;
	}

	@Override
	public boolean ValidateAndSave(VoterIdDto voterIdDto) {

		boolean validateName = true;
		boolean validateCurrentAddress = true;
		boolean validateAge = true;
		boolean validateAdharNumber = true;
		if (voterIdDto != null) {
			System.out.println("the dto not null");

			if (voterIdDto.getName().equals(null) || voterIdDto.getName().length() < 3) {
				System.out.println("wrong name");
				validateName = false;
			}
			if (voterIdDto.getCurrentAddress().equals(null)
					|| voterIdDto.getCurrentAddress().length() < 3 && voterIdDto.getCurrentAddress().length() > 25) {
				System.out.println("wrong address");
				validateCurrentAddress = false;
			}
			if (voterIdDto.getAge() < 17) {
				System.out.println("wrong age");
				validateAge = false;
			}
			long count = 0;
			long aadharnumber = voterIdDto.getAdharNumber();
			while (aadharnumber > 0) {
				aadharnumber = aadharnumber / 10;
				count++;
			}
			if (count != 12) {
				System.out.println("adhar number is wrong");
				validateAdharNumber = false;
			}
			System.out.println("======================");
			if (validateName && validateCurrentAddress && validateAge && validateAdharNumber) {
				System.out.println("");
			
				boolean adharExists = aadharNumberExist(voterIdDto.getAdharNumber());
				if (adharExists == false) {
//					boolean	exists=isExists(voterIdDto);
//					if(exists == false ) {
					boolean save = voterIdRepository.onSave(voterIdDto);
					if (save) {
						System.out.println("saved successfully");
					} else {
						System.out.println("not saved successfully");
					}
				}
			}
			}

		
		return false;
	}

	private boolean isExists(VoterIdDto voterIdDto) {
		VoterIdDto dtos[] = this.voterIdRepository.read();
		if (dtos != null) {
			for (VoterIdDto name : dtos) {
				if (name != null) {
					if (name.equals(voterIdDto)) {
						return true;
					}
				}
			}
		}

		return false;

	}

	private boolean aadharNumberExist(long adharNumber) {
		if (!(adharNumber < 0)) {
			VoterIdDto[] voIdDto = this.voterIdRepository.read();
			if (voIdDto != null) {
				for (int i = 0; i < voIdDto.length; i++) {
					if (voIdDto[i] != null) {
						if (voIdDto[i].getAdharNumber() == adharNumber) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@Override
	public boolean updateDto(String name, VoterIdDto voterIdDto) {
		VoterIdDto[] dtos=this.voterIdRepository.read();
		boolean update=voterIdRepository.updateDto(name, voterIdDto);
		if(update) {
			System.out.println("updated successfully");
		}else {
			System.out.println("not updated successfully");
		}
		return false;
	}

	@Override
	public void read() {
		VoterIdDto[] dtos=this.voterIdRepository.read();
		for(int i=0; i<dtos.length; i++) {
			if(dtos[i]!=null) {
				System.out.println(dtos[i]);
			}
		}
	}

}
