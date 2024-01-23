package com.xworkz.pancard.dto;
import lombok.Data;
//import lombok.AllArgsConstructor;
//
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;

//@Getter
//@Setter
//@ToString
//@NoArgsConstructor
//@AllArgsConstructor
//@EqualsAndHashCode
@Data

public class PanCardDto {


private String UserName;
private long AadharNumber;
private String email;
private long contactNumber;
private String presentAddress;
private String panNumber;
private String password;

}
