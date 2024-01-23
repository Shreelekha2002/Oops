public class CountEvenNumbers{
	static int num[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11};
	public static void main(String args[]){
		int i;
		int count=0;

		for(i=0; i<10; i++){
			if(num[i]%2==0){
				System.out.println("even numbers:"+num[i]);
			}
				count=count+1;
		}
				System.out.println("the count is:"+count);
		
	}
}	
			
		/*		//count++;
				//count+=1
		
	
		//System.out.println("count is:"+count);
		while(num[i]>0){
			num[i]=num[i]/10;
			count++;
				
			}
		}
		System.out.println("The count is:"+count);
		count=0;
		}
		/*for(j=0; j<10; j++){
			if(num[j]%2!=0){
				System.out.println("odd numbers:"+num[j]);
				
			}
		}
		/*	while(j>0){
				j=num[j]/10;
				count++;
					System.out.println(" the count is:"+j);
			}*/
//}
//}
	