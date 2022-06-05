// Time Complexity O(nlogn)  Space Complexity - O(n)


import java.util.*;
import java.io.*;

class Solution
{
    public boolean isPallindrome(String s)
    {
        s = s.toLowerCase();  //O(n)
        StringBuilder b = new StringBuilder();
        
        for(int i=0 ; i<s.length() ; i++) //O(n) space
        {
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i)));
            {
                b.append(s.charAt(i));
            }
        }
          int n=b.length()-1;
        
        for(int i=0 ; i<b.length()/2 ; i++) // O(logn)
        {
            if(b.charAt(i) != b.charAt(n-i)) return false;
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
