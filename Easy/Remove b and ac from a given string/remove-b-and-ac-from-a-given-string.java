//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            
            System.out.println(ob.stringFilter(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String stringFilter(String str) 
    {
        // Your code goes here
        String ans = "";
        int len = str.length();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='b')
                continue;
            else if(i+1<len && str.charAt(i)=='a' && str.charAt(i+1)=='c')
                i++;
            else
                ans += str.charAt(i);
        }
        return ans;
        
    }
}