package com.xworkz.Oops.driver;

import com.xworkz.Oops.things.Television;

public class TelevisionRunner {
	public static void main(String args[]) {
		
		Television television = new Television();
		Television television1 = new Television("samsung");
		Television television2 = new Television("153 meters", "black");
		Television television3 = new Television("10 kg", 25000, "square");
		Television television4 = new Television("dark light", true, "to watch movies and songs", "cool");
		Television television5 = new Television("Tv9", "jemini", "udaya", "udaya news", "jemini news");
		Television television6 = new Television("udaya music", "maa music", "maa tv", "gemini misic", "udaya news", "sports");
		
	}
}
