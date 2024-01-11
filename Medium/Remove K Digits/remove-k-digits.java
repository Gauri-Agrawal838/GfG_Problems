//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String S = sc.next();
            int K = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.removeKdigits(S, K));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public String removeKdigits(String S, int k) {
        // code here
        Stack<Character> st = new Stack<>();
        for(int i=0;i<S.length();i++)
        {
            char c = S.charAt(i);
            while(!st.isEmpty() && st.peek()>c && k>0)
            {
                st.pop();
                k--;
            }
            
            if(!st.isEmpty())
                st.push(c);
            if(st.isEmpty() && c!='0')
                st.push(c);
            if(st.isEmpty() && c=='0')
                continue;
        }
        
        while(!st.isEmpty() && k>0)
        {
            st.pop();
            k--;
        }
        
        if(st.isEmpty())
            return "0";
            
        StringBuilder sb = new StringBuilder();
        for(char x : st)
            sb.append(x);
        return sb.toString();
    }
}