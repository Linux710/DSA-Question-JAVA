class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashSet = new HashSet<Integer>();
        int longest_streak = 0;
        
        for(int num:nums)
        {
            hashSet.add(num);
        }
        
        for(int num:nums)
        {
            if(!hashSet.contains(num-1))
            {
                int current_num = num;
                int current_streak = 1;
                
                while(hashSet.contains(current_num + 1))
                {
                    current_num += 1;
                    current_streak += 1;
                    
                }
                longest_streak = Math.max(longest_streak , current_streak);
            }
        }
        
        return longest_streak;
    }
}
