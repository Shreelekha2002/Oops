package com.xworkz.Oops.things;

public class PalindromicNumber {
	public static void main(String args[]) {
		int num = 121;
		int temp = num;
		int rev = 0;
		System.out.println(num+" "+"this is a original number");
		while(num>0) {
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
			
		}
		System.out.println(rev);
		if(temp==rev) {
			System.out.println("the give number is palindromic");
		}else {
			System.out.println("the give number is not a palindromic");
		}
	}
}
