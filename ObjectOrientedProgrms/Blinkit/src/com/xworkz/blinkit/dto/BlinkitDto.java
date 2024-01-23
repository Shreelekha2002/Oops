package com.xworkz.blinkit.dto;

//import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class BlinkitDto {
	private String name;
	private String email;
	private long contactNumber;
	private String itemName;
	private int itemCost;
	private int quantity;
	private float totalAmount;
	private boolean placeOrder;
	
}
