public class Food{
	static String name1;
	static int name1Price;
	static String name2;
	static int name2Price;
	static String name3;
	static int name3Price;
	static String name4;
	static int name4Price;
	static String name5;
	static int name5Price;
	static String name6;
	static int name6Price;
	static String name7;
	static int name7Price;
	static String name8;
	static int name8Price;
	static String name9;
	static int name9Price;
		public static void foodDetails(){
			name1="Dosa";
			System.out.println("the food is: "+name1);
		}
		public static void foodDetails(int foodPrice){
			name1Price=foodPrice;
			System.out.println("food price is: "+name1Price);
		}
		public static void foodDetails(String foodName2, int foodPrice2){
			name2=foodName2;
			name2Price=foodPrice2;
			System.out.println("Second food is: "+name2);
			System.out.println("price is: "+name2Price);
		}
		public static String foodDetails(String foodName3, String foodName4, String foodName5){
			name3=foodName3;
			name4=foodName4;
			name5=foodName5;
			//System.out.println("The food names are "+name3+" "+name4+" "+name5);
			return name3;

		}
		
}
//Dance - 35 variables
//Institute - 15 var