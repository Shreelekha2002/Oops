package com.xworkx.software.repository;

public interface Software {
	boolean onSave(String softwareName);
	
	String[] read();
}
