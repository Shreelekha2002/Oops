public class Array{
	
	static int num[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	static String names[]={"Anusha", "Ammu", "Shree", "Akshu", "Kiri", "Apple", "Orange", "Grapes", "Pomo", "Kivi"};
	static char alphabets[]={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
	static long price[]={1000, 26377, 65386, 7832, 76982, 8926, 72829, 532791, 32459, 32308};
	static boolean array[]={true, false, false, true, false, true, true, false, true, false};
	static short a[]={12, 687, 97, 87, 76, 679, 388, 356, 878, 987};
	static String variable[]={"aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii", "jjj"};
	static int value[]={11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
	static float percentage[]={99f, 97f, 78f, 88f, 69f, 92f, 97f, 89f, 87f, 80f};
	static int sum;
		
		public static void main(String args[]){
			
			for(int i=0; i<10; i++){
				System.out.println(Array.num[i]);
			}
			System.out.println("  ");
			for(int j=0; j<10; j++){
				System.out.println(Array.names[j]);
			}
			System.out.println("  ");
			for(int k=0; k<10; k++){		
				System.out.println(Array.alphabets[k]);
			}	
			System.out.println("  ");
			for(int l=0; l<10; l++){
			System.out.println(Array.price[l]);
			}
			System.out.println("  ");
			for(int m=0; m<10; m++){
				System.out.println(Array.array[m]);
			}
			System.out.println("  ");
			for(int n=0; n<10; n++){
				System.out.println(Array.a[n]);
			}
			System.out.println("  ");
			for(int p=0; p<10; p++){
				System.out.println(Array.variable[p]);
			}	
			System.out.println("  ");
			for(int q=0; q<10; q++){	
				System.out.println(Array.value[q]);
			}	
			System.out.println("  ");
			for(int r=0; r<10; r++){	
				System.out.println(Array.value[r]);	
			}
			System.out.println("  ");
			
			//sum of an array elements
			
			for(int s=0; s<10; s++){
				sum=num[s]+value[s];
					System.out.println("Addition of two array elements is:"+Array.sum);
					
					
					
			}
			
			
		}
}