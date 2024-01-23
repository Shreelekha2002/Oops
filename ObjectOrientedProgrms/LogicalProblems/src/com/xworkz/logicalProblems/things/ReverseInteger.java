package com.xworkz.logicalProblems.things;

class ReverseInteger {
    public int reverse(int x) {
        x=123;
        int rev=0;
    System.out.println("original number "+x);
        while(x>0){
           int rem=x%10;
            rev=(rev*10)+rem;
            x=x/10;
            
           
        }
         System.out.println("reversed element "+rev);
        return rev;
    }
}