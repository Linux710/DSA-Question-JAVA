// whatever the largest digit in string , that will be the answer

class Solution {
    public int minPartitions(String n) {
        
        int maxi = 0;
        //ans = 0;
        
        for(int i=0;i<n.length();i++)
        {
            // char ch = n.charAt(i);
            // int num = Character.getNumericValue(ch);
            // maxi = Math.max( maxi , num);
             maxi = Math.max( maxi , Character.getNumericValue(n.charAt(i)));
        }
        
        return maxi;
    }
}
