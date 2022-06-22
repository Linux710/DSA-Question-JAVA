import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
        HashMap<Integer,Integer> visited = new HashMap<Integer,Integer>(); 
        int c = 0; 
        int cpx = 0;
        int n = arr.size();
        for(int i = 0;i<n;i++) {
            cpx = cpx ^ arr.get(i); 
            if(visited.containsKey(cpx^x)) 
                c += visited.get(cpx ^ x); 
            if(cpx == x) {
                c++; 
            }
            if(visited.containsKey(cpx) ) 
                visited.put(cpx, visited.get(cpx) + 1); 
            else 
                visited.put(cpx, 1); 
        }
        return c; 
	}
}
