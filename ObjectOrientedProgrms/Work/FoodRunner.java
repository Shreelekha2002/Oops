public class FoodRunner{
	public static void main(String args[]){
	Food.foodDetails();
	Food.foodDetails(50);
	Food.foodDetails("Idli", 30);
	System.out.println(Food.foodDetails("poori", "vada", "pongal"));
	}
}