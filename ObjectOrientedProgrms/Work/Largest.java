import java.util.Arrays;
public class Largest{
	public static void main(String args[]){
		int arr[]={12, 32, 34, 54, 13, 23};
			Arrays.sort(arr);
			System.out.println("largest element is:"+arr[arr.length+1]);
	}
}