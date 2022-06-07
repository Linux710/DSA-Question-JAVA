// Time Complexity = O(n) , Space Complexity = O(1)

// this problem is also called  Sort an array of 0’s 1’s 2’s

class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        int temp;
        while(mid <= high)
        {
            switch(nums[mid])
            {
                case 0:
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                    
                
                    
                
                case 1:
                    mid++;
                    break;
                    
                case 2:
                    //commented logic is also working
                    
                    // temp = nums[mid];
                    // nums[mid] = nums[high];
                    // nums[high] = temp;
                    // high--;
                    // break;
                    
                    temp = nums[high];
                    nums[high] = nums[mid];
                   nums[mid] = temp;
                   high--;
                   break;
                    
                    
            }
        }
        
    }
}
