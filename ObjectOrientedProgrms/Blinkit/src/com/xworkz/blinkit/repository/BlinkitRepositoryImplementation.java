package com.xworkz.blinkit.repository;

import com.xworkz.blinkit.dto.BlinkitDto;

public class BlinkitRepositoryImplementation implements BlinkitRepository{
	BlinkitDto[] blinkitDtorepo=new BlinkitDto[5];
	int index=0;
	@Override
	public boolean onSave(BlinkitDto blinkitDto) {
		if(blinkitDto!=null) {
			if(this.blinkitDtorepo.length>this.index) {
			this.blinkitDtorepo[this.index]=blinkitDto;
			this.index++;
		
		}
//			System.out.println("saved");
//		}
//		else {
//			System.out.println("not saved");
		}
		return false;
	}
	@Override
	public BlinkitDto[] read() {
		// TODO Auto-generated method stub
		return blinkitDtorepo;
	}

}
