import java.util.* ;
import java.io.*; 
public class Solution {
    public static int modularExponentiation(int x, int n, int m) {
        // Write your code here.
     
     long res = 1;  
        long temp = x;
 // we put x into temp to take long values while calculation.
        
  
    if (x == 0) return 0; // In case x is divisible by m;
 
    while (n > 0)
    {
        // If n is odd, multiply x with result
        if (n % 2 == 1)
            res = (res*temp) % m;
 
        // n must be even now
        
        n = n>>1; // n = n/2
        temp = (temp*temp) % m;
    }
    return (int) (res%m); // int is used to convert long values  back into int data return type
    }
}
