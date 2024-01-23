package com.xworkz.Interfaces.things;

public final class EqualsClass {
		public String name;
		public int age;
		
		public EqualsClass() {
			System.out.println("This is object equality checking program");
			
		}
		
		public boolean equals(Object obj) {
			if(obj==null) {
				System.out.println("instance is null");
				return false;
			}
			if(!(obj instanceof EqualsClass)) {
				System.out.println("object instance is not belongs to equalsClass");
				return false;
			}
			//downcasting
			EqualsClass equalsClass = (EqualsClass)obj;
			
			if(this.name.equals(equalsClass.name)&&(this.age==equalsClass.age)) {
				System.out.println("The two objects are equal");
				return true;
			}
			
			return false;
		}
}
