package com.xworkz.Oops.driver;

import com.xworkz.Oops.things.MultilevelInheritance;
import com.xworkz.Oops.things.Student;
import com.xworkz.Oops.things.Address;

public class MultilevelInheritanceRunner {
	
	
	public static void main(String[] args) {
		MultilevelInheritance bbbbb = new MultilevelInheritance();
		MultilevelInheritance ccccc = new MultilevelInheritance("shree");
		Student first = new Student();
		Student a = new Student("naganal");
		//bbbbb.getDetails(1000);
		first.getDetails(1000);
		bbbbb.age=21;
		ccccc.game="chess";
		ccccc.music="telugu";
		ccccc.name="radhika";
		ccccc.age=1;
		a.address="kolar";
		a.age=23;
		first.district="kolar";
		first.address="banglore";
		first.age=22;
		first.name="akshu";
		System.out.println("the district is "+first.district);
		System.out.println("the address is "+first.address);
		Address second = new Address();
		Address aa = new Address("kolar", 563101);
		Address bb = new Address("banglore");
		aa.address="hjfgyjbh";
		second.address="kolar";
		second.age=21;
		second.district="kolar";
		second.name="Shree";
		second.pincode=563101;
		second.taluk="vemgal";
		MultilevelInheritance.getDetails(2, 3, 5);
		
		
	}
}
