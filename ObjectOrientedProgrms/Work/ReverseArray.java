public class ReverseArray{
	public static void main(String args[]){
		int num[]={1,2,3,4,5};
			for(int i=0; i<num.length;i++){
		System.out.println("Original array:"+num[i]);
	}
	for(int i=num.length-1; i>=0; i--){
		System.out.println("Reversed array:"+num[i]);
		}
}
}