// Time Complexity = O(n^2) , Space Complexity = O(1)

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
        
        ArrayList<ArrayList<Long>> res = new ArrayList<ArrayList<Long>>();
        
        for(int i=1; i<=n ; i++)
        {
            long z = 1;
            ArrayList<Long> pre = new ArrayList<Long>();
            for(int j=1; j<=i ; j++)
            {
                pre.add(z);
                z = z * (i- (long) j)/ (long) j;   // equation to add numbers in pascal triangle
            }
            res.add(pre);
        }
        return res;
    }
}
        
       
