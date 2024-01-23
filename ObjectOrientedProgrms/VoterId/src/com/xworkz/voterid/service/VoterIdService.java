package com.xworkz.voterid.service;

import com.xworkz.voterid.dto.VoterIdDto;

public interface VoterIdService {
	boolean ValidateAndSave(VoterIdDto voterIdDto);
	
	boolean updateDto(String name, VoterIdDto voterIdDto);
void read();
}
