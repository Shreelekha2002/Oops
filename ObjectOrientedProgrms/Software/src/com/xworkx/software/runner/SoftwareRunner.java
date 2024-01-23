package com.xworkx.software.runner;

import com.xworkx.software.repository.Software;
import com.xworkx.software.repository.SoftwareImplementation;
import com.xworkx.software.service.SoftwareService;
import com.xworkx.software.service.SoftwareServiceImplementation;

public class SoftwareRunner {
	public static void main(String[] args) {
		Software software =	new SoftwareImplementation();
	boolean save =	software.onSave("Microsoft");
		System.out.println("element saved "+save);
		
		SoftwareService softwareService = new SoftwareServiceImplementation(software);
		softwareService.validationAndSave("Microsoft");
		
	}
}
