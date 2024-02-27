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
            String S=read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.DivisibleByEight(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int DivisibleByEight(String s){
        //code here
        if(s.length()<3)
        {
            int temp = Integer.valueOf(s);
            if(temp%8==0)
                return 1;
            return -1;
        }
        else
        {
            String temp = String.valueOf(s.charAt(s.length()-3)) + String.valueOf(s.charAt(s.length()-2)) + String.valueOf(s.charAt(s.length()-1));
            int val = Integer.valueOf(temp);
            if(val%8==0)
                return 1;
            return -1;
        }
    }
}