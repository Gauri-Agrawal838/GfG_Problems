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
            long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isPerfectNumber(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int isPerfectNumber(long n) {
        // code here
        long sum = 1;
        long m = (long)Math.sqrt(n);
        for(long i=2;i<=m;i++)
        {
            if(n%i==0)
            {
                sum += i;
                long v = n/i;
                if(i!=(n/i)) // This condition is for special cases like (5 != (25/5)) bcoz 5 will be added twice here, which will lead to wrong answer
                    sum += v;
            }
        }
        if(n!=1 && sum==n)
            return 1;
        return 0;
    }
};