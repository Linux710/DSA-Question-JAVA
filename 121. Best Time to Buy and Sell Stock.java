// Time Complexity = O(n) , Space complexity = O(1)
// import libraries are included as per LeetCode platform

class Solution {
    public int maxProfit(int[] prices) {
        int profit = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        
        for(int i = 0; i< prices.length ; i++)
        {
            mini = Math.min(prices[i] , mini);
            profit = Math.max( profit , prices[i]-mini);
        }
        
        return profit;
        
    }
}
