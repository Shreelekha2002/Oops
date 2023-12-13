package com.xworkz.Oops.driver;

import com.xworkz.Oops.things.Earth;
import com.xworkz.Oops.things.Mars;
import com.xworkz.Oops.things.SolarSystem;

public class SolarSystemRunner {
	public static void main(String args[])
    {
        SolarSystem s = new SolarSystem();
        Earth e = new Earth();
        Mars m = new Mars();
        e.a=5;
        e.b=6;
        e.name="Shree";
        m.age=21;
        
        System.out.println(e.a);
        System.out.println(e.b);
        System.out.println(e.name);
        System.out.println(m.age);
        System.out.println(s);
        System.out.println(e);
        System.out.println(m);
    }

}
