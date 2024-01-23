public class Additive{

public static void main(String args[]){
	int a=10;
	int b=6;
	int c;
	int d;
	int e;
	int f;
		c=a+b;
		d=a-b;
	
	System.out.println("Addition:"+c);
	System.out.println("Subtraction:"+d);
	a+=8;
	System.out.println("AdditionEqual:"+c);
	c*=2;
	System.out.println("Multiplication:"+c);
	b&=1;
	System.out.println("BitwiseEqual:"+b);
	e=a^b;	
System.out.println("not:"+e);


}

}