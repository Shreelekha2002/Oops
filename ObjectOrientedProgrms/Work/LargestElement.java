public class LargestElement{
	static int a[]={10, 753, 6, 976, 565, 54,};
	public static int largest()
	{
		int max=a[0];
		for(int i=1; i<a.length; i++)
			if(a[i]>max)
				max=a[i];
		return max;		
	}
	public static void main(String[] args){
		System.out.println("Largest element in given array is"+LargestElement.largest());
	}
	
	
}