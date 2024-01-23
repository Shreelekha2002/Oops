package com.xworkz.watch.driver;

import com.xworkz.watch.things.Watch;

public class WatchRunner {
	public static void main(String args[]) {
		Watch watch = new Watch();
		System.out.println(watch);
		new Watch(22, "sonata", 1500, 2400);
		
	}
}
