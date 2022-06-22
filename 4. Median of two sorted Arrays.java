class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n = nums1.length + nums2.length;
        int[] merged = new int[n];
        
        int p1 = 0;
        int p2 = 0;
        int i = 0;
        
        while (p1 < nums1.length || p2 < nums2.length)// While there are values left to grab
        {
            if (p2 >= nums2.length) // p2 is OOR. Just take p1
            {
                merged[i] = nums1[p1];
                i++;
                p1++;
            }
            else if (p1 >= nums1.length) //p1 is OOR. Just take p2
            {
                merged[i] = nums2[p2];
                i++;
                p2++;
            }
            else if (p2 < nums2.length && nums1[p1] <= nums2[p2])
            {
                merged[i] = nums1[p1];
                i++;
                p1++;
            }
            else //p2 is smaller
            {
                merged[i] = nums2[p2];
                i++;
                p2++;
            }
        }
        
        if (n % 2 == 0) // EVEN
        {
            return (double)(merged[(n-1)/2] + merged[n/2]) / 2;
        }
        else return (double)(merged[n/2]);
        
    }
}
