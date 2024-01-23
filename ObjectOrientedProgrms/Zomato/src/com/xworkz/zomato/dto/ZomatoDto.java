package com.xworkz.zomato.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class ZomatoDto {
 
	private String custumerName;
	private long contactNumber;
	private String custumerEmail;
	private String foodItemName;
	private int costOfTheItem;
}