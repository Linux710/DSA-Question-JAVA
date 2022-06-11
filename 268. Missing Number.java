class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        
        int sum_of_n_nums = n * (n+1)/2;
        
        int sum_of_array_elements = 0;
        
        for(int i = 0 ; i < n ; i++)
        {
            sum_of_array_elements += nums[i];
        }
        
        int ans =  sum_of_n_nums -  sum_of_array_elements;
        
        return ans;
    }
}
