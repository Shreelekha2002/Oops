public class SwappArray{
	public static void main(String args[]){
		int a[]={1, 2, 3, 4, 5, 6};
		int b[]={23, 21, 56, 34, 34};
		
		for(int i=0; i<a.length-1; i+=2){
		int temp=a[i];
		a[i]=a[i+1];
		a[i+1]=temp;
		
		}
		for(int num:a)
		
		System.out.println(num);
		
		System.out.println();
		
		for(int j=0; j<b.length-1; j+=2){
			int variable=b[j];
			b[j]=b[j+1];
			b[j+1]=variable;
			
		}for(int num1:b)
			System.out.println(num1);
		
		}
		
		
	}
