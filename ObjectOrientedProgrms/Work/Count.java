public class Count{
	public static void main(String args[])
	{
	int n=35685687;
	int count=0;
	while(n>0){
		n=n/10;
	count++;
	}
	System.out.println(count);
	}
}