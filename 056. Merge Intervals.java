//Codestudio implementation of same question

import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

/*
    Time Complexity: O(N * log(N))
    Space Complexity: O(1)

    Where N is the number of intervals.
*/

import java.util.*;

public class Solution {

    public static List<Interval> mergeIntervals(Interval[] intervals) {
        int n = intervals.length;
        List<Interval> res = new ArrayList();

 //Arrays.sort(interval[] , (a,b)->a[0]-b[0]) below line similar means like this
        // int compare() is used for this
        Arrays.sort(intervals, new Comparator<Interval>() {

            public int compare(Interval a, Interval b) {
                if(a.start == b.start) {
                    return a.finish - b.finish;
                }

                return a.start - b.start;
            }

        });

        for(int i = 0; i < n; i++) {
            int cur_start = intervals[i].start;
            int cur_end = intervals[i].finish;

            if(res.size() == 0 || cur_start > res.get(res.size() - 1).finish) {
                res.add(intervals[i]);
            }
            else {
                res.get(res.size() - 1).finish = Math.max(res.get(res.size() - 1).finish, cur_end);
            }
        }

        return res;
    }

}

