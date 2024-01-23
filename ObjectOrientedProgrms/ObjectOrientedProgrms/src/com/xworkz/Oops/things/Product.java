package com.xworkz.Oops.things;

public class Product {
	private String soapName;
	private int soapPrice;
	private String bookName;
	private int bookPrice;
	private String coffeePowder;
	private int coffeePowderPrice;
	private String oilName;
	private int oilPrice;
	private String riceName;
	private int ricePrice;
	
	public static int value=10;
	public Product(String soapName, int soapPrice, String bookName, int bookPrice) {
		this.soapName=soapName;
		this.soapPrice=soapPrice;
		this.bookName=bookName;
		this.bookPrice=bookPrice;
		//System.out.println(soapName+"="+soapPrice+" "+bookName+"="+bookPrice);
		
	}
	
	public void setSoapName(String soapName) {
		this.soapName=soapName;
	}
	public String getSoapName() {
		return soapName;
	}
	public void setBookName(String bookName) {
		this.bookName=bookName;
	}

	public String getBookName() {
		return bookName;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice=bookPrice;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setSoapPrice(int soapPrice) {
		this.soapPrice=soapPrice;
	}
	public int getSoapPrice() {
		return soapPrice;
	}
	public void setCoffeePowder(String coffeePowder) {
		this.coffeePowder=coffeePowder;
		
	}
	public String getCoffeePowder() {
		return coffeePowder;
	}
	public void setCoffeePowderPrice(int coffeePowderPrice) {
		this.coffeePowderPrice=coffeePowderPrice;
	}
	public int getCoffeePowderPrice() {
		return coffeePowderPrice;
	}
	public void setOilName(String oilName) {
		this.oilName=oilName;
	} 
	public String getOilName() {
		return oilName;
	}
	public void setOilPrice(int oilPrice) {
		this.oilPrice=oilPrice;
	}
	public int getOilPrice() {
		return oilPrice;
	}
	public void setRiceName(String riceName) {
		this.riceName=riceName;
	}
	public String getRiceName() {
		return riceName;
	}
	public void setRicePrice(int ricePrice) {
		this.ricePrice=ricePrice;
	}
	public int getRicePrice() {
		return ricePrice;
	}
}
