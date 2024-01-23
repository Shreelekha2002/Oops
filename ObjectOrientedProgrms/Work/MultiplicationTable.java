public class MultiplicationTable{
		public static void main(String args[]){
			//clsint n=2; //generate table upto 2 numbers
			//nested loop to generate the multiplication table
			for(int i=1; i<=5; i++){
				for(int j=1; j<=10;j++){
					
					System.out.println(i+"x"+j+"="+(i*j));
				}
				System.out.println(); //Move to the next line for the next number
			}
		}
}