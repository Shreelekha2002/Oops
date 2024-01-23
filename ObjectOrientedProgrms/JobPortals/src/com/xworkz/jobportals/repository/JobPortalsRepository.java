package com.xworkz.jobportals.repository;

public abstract interface JobPortalsRepository {
	boolean onSave(String portalName);
	String[] read();
	boolean update(String oldName, String newName);
}
