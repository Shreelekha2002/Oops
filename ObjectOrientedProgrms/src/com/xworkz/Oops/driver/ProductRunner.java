package com.xworkz.Oops.driver;

import com.xworkz.Oops.things.Product;
import static com.xworkz.Oops.things.Product.value;
public class ProductRunner {
	public static void main(String args[]) {
		Product product=new Product("LifeBoy", 30, "PlaneWhiteBook", 45);
		
		product.setSoapName("LifeBoy");
		product.setSoapPrice(30);
		System.out.println("the soap name and price is "+product.getSoapName()+" and "+product.getSoapPrice());
		product.setCoffeePowder("brue");
		product.setCoffeePowderPrice(60);
		System.out.println("the coffee name is "+product.getCoffeePowder()+" and price is "+product.getCoffeePowderPrice());
		product.setOilName("SunFlower Oil");
		product.setOilPrice(160);
		product.setRiceName("Sona Masuri");
		product.setRicePrice(120);
		System.out.println("the oil is "+product.getOilName()+"="+product.getOilPrice());
		System.out.println("the rice is "+product.getRiceName()+"="+product.getRicePrice());
		product.setBookName("Plane white book");
		product.setBookPrice(65);
		System.out.println("the book is "+product.getBookName()+"="+product.getBookPrice());
		
		System.out.println(Math.floor(245.5));
	}
}
;