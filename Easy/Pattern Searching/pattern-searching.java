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
            String input[] = read.readLine().split(" ");
            String text = input[0];
            String pattern = input[1];
            Solution ob = new Solution();
            System.out.println(ob.search(text,pattern));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int search(String text, String pat) {
        // code here
        for(int i=0;i<=text.length()-pat.length();i++)
        {
            int k=0;
            while(k<pat.length() && pat.charAt(k)==text.charAt(i+k))
                k++;
            if(k==pat.length())
                return 1;
        }
        return 0;
    }
};