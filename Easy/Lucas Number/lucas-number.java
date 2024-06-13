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
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.lucas(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long lucas(int n)
        {
            //code here.
            if(n==0)
                return 2;
            if(n==1)
                return 1;
            int mod = 1000000007;
            int dp[] = new int[n+1];
            dp[0] = 2;
            dp[1] = 1;
            for(int i=2;i<=n;i++)
            {
                dp[i] = (dp[i-1] + dp[i-2])%mod;
            }
            return dp[n];
        }
        
};
