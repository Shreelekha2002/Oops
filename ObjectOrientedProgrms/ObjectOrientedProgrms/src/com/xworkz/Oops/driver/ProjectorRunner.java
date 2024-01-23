package com.xworkz.Oops.driver;

import com.xworkz.Oops.things.Projector;

public class ProjectorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Projector projector = new Projector();
		projector.screening();
		projector.screening("Programs");
		projector.screening(20, 25);
		projector.screening();
		
	}

}
