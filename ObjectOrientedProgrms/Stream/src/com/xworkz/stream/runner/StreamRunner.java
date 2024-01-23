package com.xworkz.stream.runner;

import com.xworkz.stream.repository.StreamRepository;
import com.xworkz.stream.repository.StreamRepositoryImplementation;
import com.xworkz.stream.service.StreamService;
import com.xworkz.stream.service.StreamServiceImplementation;

public class StreamRunner {
	public static void main(String[] args) {
		StreamRepository streamRepository= new StreamRepositoryImplementation();
//		boolean save = streamRepository.onSave(null);
//		System.out.println("the stream is saving "+save);
//		
		StreamService streamService	= new StreamServiceImplementation(streamRepository);
		streamService.validateAndSave("CSE");
		System.out.println("stream name is valid");
	}
}
