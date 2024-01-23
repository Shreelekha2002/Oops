public class CountPrimeNumbers{
	static int num[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	public static void main(String args[]){
		int i,j;
		int count=0;

		for(i=1; i<10; i++)
		{
			for(j=2; j<=num[i]; j++)
			{
				if(num[i]%j==0){
				//System.out.println(num[j]);
				count++;
				}
				
			}
			//	System.out.println("the count is:"+count);
			count=0;
			
		}
		if(count==0){
				System.out.println("not a prime number:");
			}else{
				System.out.println("a prime number:");
			}
			
			
	}
}