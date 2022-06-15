class Solution {
    public int majorityElement(int[] nums) {
        
        //Moore’s Voting Algorithm


        
        int count = 0;
        int stored_number = 0;
        
        for(int num : nums)
        {
            if(count == 0)
            {
                stored_number = num;  
                
            }
            
            if(stored_number == num)
            {
                count += 1;
            }
            else count -= 1;
        }
       
        
        return stored_number;
        
        
        
    }
}
