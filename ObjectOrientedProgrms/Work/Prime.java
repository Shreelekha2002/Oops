public class Prime{
	static int a[]={1, 2, 3, 4, 5, 6, 7, 8, 9};
		public static void main(String args[]){
			int i,j;
			int count=0; 
		for(i=0; i<a.length; i++){
			for(j=2; j<=a[i]; j++){
			if(a[i]%j==0)
				break;
			}
			if(a[i]==j){
				System.out.println(j);
			count+=1;
			}
		}
		System.out.println("the count is "+count);
	}
}