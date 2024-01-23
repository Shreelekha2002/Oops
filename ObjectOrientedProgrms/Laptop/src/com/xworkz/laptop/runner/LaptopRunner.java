package com.xworkz.laptop.runner;

import com.xworkz.laptop.repository.LaptopRepository;
import com.xworkz.laptop.repository.LaptopRepositoryImplementation;
import com.xworkz.laptop.service.LaptopService;
import com.xworkz.laptop.service.LaptopServiceImplementation;

public class LaptopRunner {
	public static void main(String[] args) {
	
	LaptopRepository laptopRepository=new LaptopRepositoryImplementation();
	//laptopRepository.onSave(null);
	//laptopRepository.onSave("HP laptop");
	
	LaptopService service=new LaptopServiceImplementation(laptopRepository);
	service.validateAndSave("Lenova");
	service.validateAndSave("ASUS");
	//service.validateAndSave("Lenova");
	
	service.update("SAMSUNG", "SAMSUNG");
	}
}
