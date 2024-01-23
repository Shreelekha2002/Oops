public class Palindrome1{
	public static void main(String args[]){
	int n=121;
	int temp=n;
	int reversed_n=0;
	while(n>0){
	reversed_n=reversed_n*10+n%10;
	n=n/10;
		System.out.println(n);
	}
	if(temp==reversed_n)
		System.out.println("It is a palindrome number");
		else
		System.out.println("It is not a palindrome number");
	}
}