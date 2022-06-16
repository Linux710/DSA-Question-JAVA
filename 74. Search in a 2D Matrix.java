import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
		// Write your code here.
          int low = 0;
        if(mat.size()== 0) return false;
   
        int high = (m * n) - 1;
        
        while(low <= high) {
            int mid = (low + (high - low) / 2);
            if(mat.get(mid/n).get(mid % n) == target) {
                return true;
            }
            if(mat.get(mid/n).get(mid % n) < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
	}
}
