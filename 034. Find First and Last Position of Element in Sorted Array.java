class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1,-1};
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            
            
            
            //--------[ first idx ] ---------
            
            if(target == nums[mid]){
                int low = mid;
                while(low >= 0 && nums[low] == target){
                    low--;
                }
                result[0] = low + 1;
              
              //------[ last idx ]----------------
                
                int high = mid;
                while(high < nums.length && nums[high] == target){
                    high++;
                }
                result[1] = high - 1;
                
            //------------------------------------------    
                
                return result;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return result;
    }
}
