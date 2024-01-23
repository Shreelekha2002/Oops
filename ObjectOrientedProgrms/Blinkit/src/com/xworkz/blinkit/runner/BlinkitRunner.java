package com.xworkz.blinkit.runner;

import com.xworkz.blinkit.constant.ItemName;
import com.xworkz.blinkit.dto.BlinkitDto;
import com.xworkz.blinkit.repository.BlinkitRepository;
import com.xworkz.blinkit.repository.BlinkitRepositoryImplementation;

public class BlinkitRunner{
	public static void main(String[] args) {
		BlinkitDto blinkitDto=new BlinkitDto();
		blinkitDto.setContactNumber(9886616347l);
		blinkitDto.setEmail("srilekham517@gmail.com");
		blinkitDto.setItemCost(160);
		//blinkitDto.s(ItemName.DRYFRUITS);
		blinkitDto.setName("Megha");
		blinkitDto.setPlaceOrder(true);
		blinkitDto.setQuantity(2);
		blinkitDto.setTotalAmount(0);
		BlinkitRepository blinkitRepository=new BlinkitRepositoryImplementation();
		//blinkitRepository.onSave(blinkitDto);
		
	}
}
