package com.xworkz.stream.service;

import com.xworkz.stream.repository.StreamRepository;

public class StreamServiceImplementation implements StreamService{
	public StreamRepository streamRepository;
	public StreamServiceImplementation(StreamRepository streamRepository) {
		this.streamRepository=streamRepository;
	}
	@Override
	public boolean validateAndSave(String streamName) {
		if(streamName!=null) {
			if(streamName.isEmpty()||streamName.isBlank()||streamName.length()<4||streamName.length()>25) {
				System.out.println("Check the stream name, and give proper stream name");
			}else {
			System.out.println("valid stream name");
			}
			boolean save=streamRepository.onSave(streamName);
			if(save==true) {
				System.out.println("the stream save succesfully");
			}
			else {
				System.out.println("the stream not save succesfully");
			}
			
		}else {
			System.out.println("the stream name is "+streamName);
		}
		return false;
	}
	
}
