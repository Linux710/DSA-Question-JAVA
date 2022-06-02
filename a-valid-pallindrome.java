// Time Complexity O(n)  Space Complexity - O(1)


import java.util.*;
import java.io.*;

class Solution
{
    public boolean isPallindrome(String s)
    {
            int i = 0, j = s.length() - 1;
            while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if (Character.toLowerCase(s.charAt(i))
            != Character.toLowerCase(s.charAt(j))) {
            return false;
            }
            i++; j--;
            }
            return true;
    }
}


class Main {
    public static void main(String[] args) {
        String string = "raceaecar";
        Solution sol = new Solution();
        boolean res = sol.isPallindrome(string);
        System.out.println(res);
    }
}
