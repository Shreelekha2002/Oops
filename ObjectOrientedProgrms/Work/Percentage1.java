public class Percentage1{
	public static void main(String args[])
{
int cloth_original_price=1000;
int charger_original_price=500;
int mobile_original_price=15000;
int bag_original_price=800;
int laptop_original_price=25000;

float cloth_discount=(10/100f)*(cloth_original_price);
	System.out.println("cloth discount is:"+cloth_discount);
float charger_discount=(20/100f)*(charger_original_price);
	System.out.println("charger discount is:"+charger_discount);
float mobile_discount=(30/100f)*(mobile_original_price);
	System.out.println("mobile discount is:"+mobile_discount);
float bag_discount=(5/100f)*(bag_original_price);
	System.out.println("bag discount is:"+bag_discount);
float laptop_discount=(15/100f)*(laptop_original_price);
	System.out.println("laptop discount is:"+laptop_discount);
	
float cloth_total_price=(cloth_original_price - cloth_discount);
	System.out.println("Total cloth price is:"+cloth_total_price);
float charger_total_price=(charger_original_price - charger_discount);
	System.out.println("total charger price is:"+charger_total_price);
float mobile_total_price=(mobile_original_price - mobile_discount);
	System.out.println("total mobile is:"+mobile_total_price);
float bag_total_price=(bag_original_price - bag_discount);
	System.out.println("total bag price is:"+ bag_total_price);
float laptop_total_price=(laptop_original_price - laptop_discount);
	System.out.println("total laptop price is:"+laptop_total_price);

float total_purchase_price=(cloth_total_price + charger_total_price + mobile_total_price + bag_total_price + laptop_total_price);
	System.out.println("Total purchase price is:"+total_purchase_price);
}
}	