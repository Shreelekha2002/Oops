package com.xworkz.voterid.repository;

import com.xworkz.voterid.dto.VoterIdDto;

public interface VoterIdRepository {
	boolean onSave(VoterIdDto voterIdDto);
	
	VoterIdDto[] read();
	
	boolean updateDto(String name, VoterIdDto voterIdDto);
}
