package com.xworkz.stream.repository;

public class StreamRepositoryImplementation implements StreamRepository{
	String stream[] = new String[4];
	int index=0;
	@Override
	public boolean onSave(String streamName) {
		if(index<streamName.length()) {
			this.stream[index]=streamName;
			index++;
			return true;
		}
		return false;
	}

}
