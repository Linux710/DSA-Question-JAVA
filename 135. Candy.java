//-------------[ GREEDY APPROACH ]----------------



class Solution {
    public int candy(int[] ratings) {
        
        int n = ratings.length;
        int count_value = n;
     
        for(int i=1 ; i < n ;)
            
        {
            int peak = 0 , valley = 0;
            if(ratings[i] == ratings[i-1]) 
            { 
                i++;
                continue;
            }
                
                
                while( i < n && ratings[i] > ratings[i-1])
                {
                    peak++;
                    i++;
                    count_value += peak;
                }
            
            while(i < n && ratings[i]<ratings[i-1])
            {
                valley++;
                i++;
                count_value += valley;
            }
            
            count_value -= Math.min(peak,valley);
            
        }
        
        
        
        return count_value;
        
    }
}
