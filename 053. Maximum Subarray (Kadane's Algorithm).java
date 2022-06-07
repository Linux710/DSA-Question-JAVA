// Time Complexity = O(n)

import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
        long sum =0;
           long maxSum = arr[0];
        for(int i=0; i<n ; i++)
        {
            sum +=arr[i];
            if(sum > maxSum) maxSum=sum;
            if(sum < 0) sum=0;
        }
		
    // if we do not wanna output -ve maximum sum such that in case of array of all -ve numbers
    // eg. [-7, -8, -16, -4, -8, -5, -7, -11, -10, -12, -4, -6, -4, -16,-10 ]
    // in above example Maximum sum is -ve , so we changed it into 0
        if(maxSum < 0) maxSum=0;
    
        return maxSum;
	}

}
