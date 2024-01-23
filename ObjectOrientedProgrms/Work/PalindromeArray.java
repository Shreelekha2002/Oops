public class PalindromeArray{
	public static void main(String args[]){
		int a[]={2002, 1010, 3333, 4025};
		int[] b=new int[a.length];
		int r, rem=0, temp, j=0;
		int n=0;
		for(int i=0; i<a.length; i++){
			n=a[i];
			temp=n;
			rem=0;
			while(n>0){
				r=n%10;
				rem=(rem*10)+r;
				n=n/10;
			}
			if(temp==rem){
				b[j]=a[i];
				j++;
			}
		}
			int k=0;
			for(int i:b){
				if(i==0){
					continue;
				}
				k=k+1;
				System.out.print(i+" ");
			}
			if(k==0){
				System.out.println("There has no palindrome values");
			}
			System.out.println("\nth total palindromes are: "+k);
		
		
	}
	}	
