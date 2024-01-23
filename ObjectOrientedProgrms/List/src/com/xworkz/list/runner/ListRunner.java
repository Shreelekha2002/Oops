package com.xworkz.list.runner;

import java.util.ArrayList;
import java.util.List;

public class ListRunner {
	public static void main(String[] args) {
		List namesList=new ArrayList();
		namesList.add("Shree");
		namesList.add("sssss");
		namesList.add(1, "aaaaaa");
		namesList.addAll(namesList);
		namesList.addAll(namesList);
		//namesList.clear();
		System.out.println(namesList);
	}
}
