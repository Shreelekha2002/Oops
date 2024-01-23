import java.util.Arrays;
	public class SortArray{
		public static void main(String args[]){
			int array[]={321, 463, 342, 343, 9875};
			Arrays.sort(array);
			reverse(array);
				System.out.println("Elements of array sorted in ascending order:");
			for(int i=0; i<array.length; i++)
			{
			System.out.println(array[i]);
			}
		}
	}