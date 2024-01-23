package com.xworkz.college.repository;

public class CollegeRepositoryImplementation implements CollegeRepository{
	String college[] = new String[3];
	int index=0;
	@Override
	public boolean onSave(String collegeName) {
		if(index<college.length) {
			college[index]=collegeName;
			index++;
			return true;
		}
		return false;
	}
	

}
