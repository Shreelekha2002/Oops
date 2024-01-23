public class SwapOddEvenIndices{
	public static void swapOddEvenIndices(int[] arr){
		for(int i=0; i<arr.length-1; i+=2){
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			
		}
	}
	public static void main(String args[]){
		int[] input1={13, 19, 23, 34, 57, 8};
		swapOddEvenIndices(input1);
		System.out.println("output:");
		
		for(int num:input1){
			System.out.println(num+" ");
		}
		System.out.println();
		
		int[] input2={12, 28, 33, 4, 9, 44, 66};
		swapOddEvenIndices(input2);
		System.out.println("output: ");
		
		for(int num:input2){
			System.out.println(num+ " ");
		}
	}
}