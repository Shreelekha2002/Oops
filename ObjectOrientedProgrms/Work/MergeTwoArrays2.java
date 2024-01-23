public class MergeTwoArrays2 { 
    public static void main(String[] args) 
    { 
  
        // first array 
        int a[] = { 30, 25, 40 }; 
        // second array 
        int b[] = { 45, 50, 55, 60, 65 }; 
  
        // determining length of first array 
        int c1 = a.length+b.length; 
        // determining length of second array 
 
  
        // resultant array size 
       // int c1 = a1 + b1; 
  
        // Creating a new array 
        int[] c = new int[c1]; 
  
        // Loop to store the elements of first 
        // array into resultant array 
        for (int i = 0; i < a.length; i = i + 1) { 
            // Storing the elements in  
            // the resultant array 
            c[i] = a[i]; 
        } 
  
        // Loop to concat the elements of second  
        // array into resultant array 
        for (int i = 0; i < b.length; i = i + 1) { 
  
            // Storing the elements in the  
            // resultant array 
            c[a.length + i] = b[i]; 
        } 
  
        // Loop to print the elements of  
        // resultant array after merging 
        for (int i = 0; i < c1; i = i + 1) { 
              
            // print the element 
            System.out.println(c[i]); 
        } 
    } 
}