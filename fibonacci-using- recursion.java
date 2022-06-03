// recursion tree is created logically behind the code

import java.util.*;

class Solution {
    public static int fib(int n) {
        
        if(n==0) return 0;
        if(n==1) return 1;
        
        
        int res = fib(n-1) + fib(n-2);
        
        return res;
        
    }
}



class Main {
    
     public static void main(String[] args)
     {
        Scanner sc= new Scanner(System.in); 
     
        int a= sc.nextInt();
        //int a = 6;
        Solution sol = new Solution();
        int fibAns = sol.fib(a);
        
        System.out.println(fibAns);
         
     }
    
    
