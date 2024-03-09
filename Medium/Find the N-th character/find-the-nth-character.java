//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String S = sc.next();
                    int R = sc.nextInt();
                    int N = sc.nextInt();
                    Solution obj = new Solution();
                    System.out.println(obj.nthCharacter(S,R,N));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public char nthCharacter(String s, int r, int n)
    {
        //code here
        while(r>0)
        {
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<s.length();i++)
            {
                if(sb.length()>n)
                    break;
                if(s.charAt(i)=='0')
                    sb.append("01");
                else
                    sb.append("10");
            }
            s = sb.toString();
            r--;
        }
        char x = s.charAt(n);
        return x;
    }
}
