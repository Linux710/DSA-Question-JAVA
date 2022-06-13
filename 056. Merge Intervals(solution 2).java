class Solution {
    public int[][] merge(int[][] n) {
        Arrays.sort(n , (a,b) -> a[0]-b[0]);
        int start=n[0][0];
        int end=n[0][1] ;
         int k = n.length;
                     
        List<int[]> res = new ArrayList<>();
        for(int i=1 ; i<k ; i++)
        {
            if(end <= n[i][1])
            {
                if(end >= n[i][0])
                {
                    end = n[i][1];
                }
                else
                {
                    res.add(new int[]{start,end});
                    start = n[i][0];
                    end = n[i][1];
                }
            }
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[0][]);
    }
}
