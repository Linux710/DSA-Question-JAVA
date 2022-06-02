// Time Complexity O(n^3)  Space Complexity - O(1)


import java.util.*;
import java.io.*;

// four sum quad solution function
class Solution {

public List<List<Integer>> fourSum(int[] num, int target){
    
    ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
    
    if(num == null || num.length == 0)
        return res;
    
    int n = num.length;
    Arrays.sort(num);
    
    for(int i = 0 ; i < n ; i++)
    {
        for(int j = i+1 ; j < n ; j++)
        {
            int target_2 = target - num[j] - num[i];
            int front = j+1;
            int back = n-1;
            while(front < back)
            {
                int two_sum = num[front] + num[back];
                if(two_sum < target_2) front++;
                else if(two_sum > target_2) back--;
                else
                {
                    List<Integer> quad = new ArrayList();
                    quad.add(num[i]);
                    quad.add(num[j]);
                    quad.add(num[front]);
                    quad.add(num[back]);
                    res.add(quad);
                    
                    // processing the duplicates of number at 3rd position in quad
                    while(front < back && num[front] == quad.get(2) ) ++front;
                    
                    // processing the duplicates of number at 4th  position in quad
                    while(front < back && num[back] == quad.get(3) ) --back;
                    
                }
            }
            
            //processing the duplicates of number at 2nd position in quad
            while(j+1 < n && num[j+1] == num[j]) ++j;
            
        }
        
        //processing the duplicates of number at 1st position in quad
            while(i+1 < n && num[i+1] == num[i]) ++i;
    }
    return res;
 }

}

//---------------[Main function]-----------------------------
class Main{
   public static void main(String[] args) {
     
        int array[] = {1,0,-1,0,-2,2};
        int t = 0;
        Solution sol = new Solution();
        List<List<Integer>> ls = sol.fourSum(array, t);
        
        for(int i = 0; i<ls.size(); i++)
        {
            for(int j=0; j<ls.get(i).size(); j++)
            {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }
        
    }
}
