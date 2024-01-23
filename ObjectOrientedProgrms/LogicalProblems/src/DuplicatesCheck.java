
public class DuplicatesCheck {
	public static void main(String[] args) {
		int a[] = {2, 3, 3, 4, 7, 7, 9, 8, 8, 5, 7, 3, 1, 1};
		int n=a.length;
		if(n==0 || n==1) {
			System.out.println(n);
		}
		for(int i=0; i<n-1; i++) {
			if(a[i]!=a[i+1]) {
				System.out.println(a[i]);
			}
		}	
	}
}
