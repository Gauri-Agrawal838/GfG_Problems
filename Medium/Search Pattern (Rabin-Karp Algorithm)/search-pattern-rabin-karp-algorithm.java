//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    ArrayList<Integer> search(String pat, String S)
    {
        // your code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<=S.length()-pat.length();i++)
        {
            int k = 0;
            while(k<pat.length() && pat.charAt(k)==S.charAt(i+k))
                k++;
            if(k==pat.length())
                list.add(i+1);
        }
        if(list.isEmpty())
            list.add(-1);
        return list;
    }
}