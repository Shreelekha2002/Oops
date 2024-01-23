//class 1
//helper class

import java.io.*;
	class AdditionNumbers{
		int sum=0;
		public int addTwoInt(int a, int b)
		{
			sum=a+b;
			
			return sum;
		}
	}
//class 2

class GFG{
	public static void main(String[] args)
	{
		Addition add=new AdditionNumbers();
		int sum=add.addTwoInt(1, 2);
		
		System.out.println("Sum of two integer values:"+sum);
	}
}	