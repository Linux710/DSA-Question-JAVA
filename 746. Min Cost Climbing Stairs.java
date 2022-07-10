class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int n = cost.length;
       
     for (int i = 2; i < n; i ++) {
            int prev = cost[i-1];
            int pre_prev = cost[i-2];
            cost[i] += Math.min(prev , pre_prev);
        }
        
         int last = cost[n-1];
        int before_last = cost[n-2];
        int final_cost = Math.min(last,before_last);
        return final_cost;
    }
}
