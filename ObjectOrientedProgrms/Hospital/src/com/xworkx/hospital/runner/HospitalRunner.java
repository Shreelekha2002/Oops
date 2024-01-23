package com.xworkx.hospital.runner;

import com.xworkz.hospital.repo.HospitalRepo;

public class HospitalRunner {
	public static void main(String[] args) {
		HospitalRepo hospitalRepo=new HospitalRepo();
		hospitalRepo.hospitalName="Victoria";
		System.out.println(hospitalRepo.hospitalName);
		HospitalRepo hospitalRepo1=new HospitalRepo();
		hospitalRepo1.hospitalName="SNR";
		System.out.println(hospitalRepo1.hospitalName);
	}
}
