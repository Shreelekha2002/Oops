package com.xworkz.voterid.repository;

import com.xworkz.voterid.dto.VoterIdDto;

public class VoterIdRepositoryImplementation implements VoterIdRepository{
	private VoterIdDto[] VoterIdRef=new VoterIdDto[4];
	int index=0;
	@Override
	public boolean onSave(VoterIdDto voterIdDto) {
		if(voterIdDto!=null) {
		if(this.index<this.VoterIdRef.length) {
			this.VoterIdRef[this.index]=voterIdDto;
			this.index++;
			return true;
		}
		}
		return false;
	}
	@Override
	public VoterIdDto[] read() {
		
		return VoterIdRef;
	}
	@Override
	public boolean updateDto(String name, VoterIdDto voterIdDto) {
		
		
		
		for(int i=0; i<VoterIdRef.length; i++) {
			
			if(VoterIdRef[i]!=null) {
				System.out.println("-----------");
				if(VoterIdRef[i].getName().equals(name)) {
					VoterIdRef[i]=voterIdDto;
					return true;
				}
			}
		}
		return false;
	}

}
