public class Array12{
	public static String name(String name){
			name="Shreelekha";
			System.out.println(name);
			return name;
		}
	public static void main(String args[]){
		
		int a[]={2, 3, 4, 5, 6};
		for(int i=0; i<a.length; i++){
			int b=a[i];
			if(b%2==0){
				//break;
				//return;
				//System.out.println("even number:"+b);
				//continue;
				//return;
			}
			else{
				System.out.println("Not an even number"+b);
				
			}
		}
	}
} 