public class Palindrome{
	static int reverse;
	static int a=121;
	static int temp=a;
	static int rem=0;
	public static void main(String args[]){
	

	while(a>0){
		rem=a%10;
		//System.out.println(rem);
		reverse=(reverse*10)+rem;
		a=a/10;
		System.out.println(a);
	}
		System.out.println(" "+reverse);
		
	
	if(temp==reverse){
		System.out.println("Given number is Palindrome");
	}else{
		System.out.println("Given number is not a Palindrome");
		
		
	}
}	
}		
		
	
	

