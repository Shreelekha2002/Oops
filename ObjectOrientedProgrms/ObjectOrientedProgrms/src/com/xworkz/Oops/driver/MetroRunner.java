package com.xworkz.Oops.driver;

import com.xworkz.Oops.things.Metro;

public class MetroRunner {
	public static void main(String[] args) {
		Metro metro = new Metro();
		metro.metroColor="purple-gray";
		metro.fromAddress="Majestic";
		metro.toAddress="kengeri";
		metro.ticketPrice=35;
		
		Metro metro1 = new Metro();
		metro1.metroColor="purple-gray";
		metro1.fromAddress="Majestic";
		metro1.toAddress="kengeri";
		metro1.ticketPrice=35;
		
		Metro metro2 = new Metro();
		metro2.metroColor="purple-gray";
		metro2.fromAddress="Majestic";
		metro2.toAddress="kengeri";
		metro2.ticketPrice=35;
		
		if(metro1==metro2) {
			System.out.println("The two objects are true");
		}
		System.out.println(metro1.equals(metro2));
		
		System.out.println(metro.toString());
	}
}
