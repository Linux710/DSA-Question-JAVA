import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        List<Integer> row = new ArrayList<>();
         List<Integer> pre = new ArrayList<>();
        
        for(int i=0 ; i<numRows ; i++)
        {
            row = new ArrayList<>();
            for(int j=0; j<=i ; j++)
            {
                if(j==0 || j==i)
                {
                    row.add(1);
                }
                else
                {
                    row.add(pre.get(j-1) + pre.get(j));
                }
               
            }
             pre = row;
            res.add(row);
        }
        return res;
        
    }
}
