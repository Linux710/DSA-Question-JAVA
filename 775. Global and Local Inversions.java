// array must contains values betwwen 0 to n-1
class Solution {
    public boolean isIdealPermutation(int[] nums) {
       int max = nums[0];
        for(int i = 2; i < nums.length; ++i){
            max = Math.max(max, nums[i-2]);
            if(max>nums[i]) return false;
        }
        return true;
    }
}
