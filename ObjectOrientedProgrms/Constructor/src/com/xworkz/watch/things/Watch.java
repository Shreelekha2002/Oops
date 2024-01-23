package com.xworkz.watch.things;

public class Watch {
	public int num;
	public String brandName;
	public int watchPrice;
	
	public Watch() {
		System.out.println("this is a constructor program");
	}
	
	public Watch(int a, String b, int n, int m) {
		System.out.println("arguments passing");
		System.out.println(a);
		num=a;
		System.out.println(num);
		brandName=b;
		System.out.println(brandName);
		watchPrice=n;
		System.out.println(watchPrice+" "+watchPrice);
		watchPrice=m;
		System.out.println(watchPrice+" "+watchPrice);
		
	}
}
