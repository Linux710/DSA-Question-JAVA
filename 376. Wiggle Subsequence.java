class Solution {
    public int wiggleMaxLength(int[] nums) {
        
        // peak and valley are used to represent high and lows taken from mountains
        // the top of mountain  is peak whereas distance between mountains is valey(down area)
         int peak = 0, valley = 0;
        for (int i = 1; i < nums.length; i++) {
            // current element could be a peak
            if (nums[i - 1] < nums[i]) {
                peak = valley + 1;
            }
            // current element could be a valley
            else if (nums[i - 1] > nums[i]) {
                valley = peak + 1;
            }
        }
        // add 1 because we didn't count the first element
        return 1 + Math.max(peak, valley);
        
    }
}
