package com.xworkz.voterid.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

public class VoterIdDto {
	
	
	private String name;
	private String currentAddress;
	private int age;
	private long adharNumber;
}
