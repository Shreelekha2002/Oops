package com.xworkz.Oops.things;

public class FibonacciSeries {
	static int N=5;
	public static void Fibonacci(int N) {
		int num1=0;
		int num2=1;
		for(int i=0; i<N; i++) {
			System.out.println(num1+" ");
			int num3=num2+num1;
			num1 = num2;
			num2 = num3;
		}
	}
	public static void main(String args[]) {
		Fibonacci(N);
	}
}
