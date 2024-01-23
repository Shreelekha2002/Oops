package com.xworkz.zomato.repository;

import com.xworkz.zomato.dto.ZomatoDto;

public class ZomatoRepositoryImplementation implements ZomatoRepository{

	private ZomatoDto[] dto=new ZomatoDto[3];
	private int index=0;
	
	@Override
	public boolean onsave(ZomatoDto zomatoDto) {
		if(zomatoDto!=null) {
			if(this.index<this.dto.length) {
				this.dto[this.index]=zomatoDto;
				this.index++;
				return true;
			}
		}
		return false;
	}
	
	@Override
	public ZomatoDto[] read() {
		return dto;
	}

	@Override
	public boolean update(String custumerEmail, ZomatoDto zomatoDto) {
		if(zomatoDto!=null) {
		for(int i=0;i<dto.length;i++) {
			if(dto[i]!=null) {
			if(dto[i].equals(zomatoDto)) {
			dto[i]=zomatoDto;
			return true;
		}}
		}}
		return false;
	}

	@Override
	public boolean delete(long contactNumber) {
		if(dto!=null) {
		for(int i=0;i<dto.length;i++) {
			if(dto[i]!=null) {
				if(dto[i].getContactNumber()==contactNumber) {
				dto[i]=null;
				return true;
			}
			}
		}}
		return false;
	}
	
}