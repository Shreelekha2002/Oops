package com.xworkz.contentcreater.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class ContentCreaterDto {
	private String userName;
	private String password;
	private String email;
	private String website;
	private String pages;
	private String contentType;
	private String contentLength;
	private int amountPaid;
 }
