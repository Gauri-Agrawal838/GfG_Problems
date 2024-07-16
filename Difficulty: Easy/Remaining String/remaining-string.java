//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            char ch = sc.next().charAt(0);
            int count = sc.nextInt();
            Solution ob = new Solution();
            String result = ob.printString(s, ch, count);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends




class Solution {
    public String printString(String s, char ch, int count) {
        // code here
        String ans = "";
        for(int i=0;i<s.length();i++)
        {
            Character temp = s.charAt(i);
            if(temp==ch && count>0)
            {
                count--;
            }
            if(temp==ch && count==0)
            {
                for(int j=i+1;j<s.length();j++)
                {
                    Character tem = s.charAt(j);
                    ans += tem;
                }
                break;
            }
        }
        return ans;
    }
}