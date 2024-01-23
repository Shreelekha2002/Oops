public class PalindromeArray1{
	public static void main(String args[]){
		int arr[]={121, 123, 545, 111};
		int rem=0;
		
		for(int i=0; i<arr.length; i++){
		int original=arr[i];
		int temp=original;
		int rev=0;
		while(original>0){
			rem=original%10;
			rev=(rev*10)+rem;
			original=original/10;
			
		}
		if(temp==rev){
			System.out.println("the given number is palindrome");
		}else{
			System.out.println("the given number is not a palindrome");
		}
		}
	}
}

//code chef, code byte