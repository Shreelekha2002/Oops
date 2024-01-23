
public class MergeArray {
	static int a[]= {1, 2, 3, 4, 5};
	static int b[]= {6, 7, 8, 9, 10};
	static int a1=a.length;
	static int b1=b.length;
	static int c1=a1+b1;
	
	
	public static void main(String[] args) {
		int c[] = new int[c1];
		for(int i=0; i<a1; i++) {
			c[i] = a[i];
			
		}
		for(int j=0; j<b1; j++) {
			c[a1+j] = b[j];
			
		}
		System.out.println("merge elements are ");
		for(int i=0; i<c1; i++) {
			
			System.out.println(c[i]);
		}
	}
}
