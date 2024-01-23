public class Laptop_price{
	public static void main(String args[]){
		int laptop_price=20000;
		float laptop_discount=(10/100f)*laptop_price;
		float laptop_total_price=laptop_price - laptop_discount;
	System.out.println("Laptop price is:"+laptop_total_price);	
		
		//price for 10 laptops
		float ten_laptop_price=laptop_total_price*10;
	System.out.println("Price for 10 laptops:"+ten_laptop_price);
		float ten_laptop_discount=(5/100f)*ten_laptop_price;
	System.out.println("Total price for 10 laptops:"+ (ten_laptop_price - ten_laptop_discount));
	
	}


}