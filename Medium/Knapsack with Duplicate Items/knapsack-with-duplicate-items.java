//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String line1[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(line1[0]);
            int W = Integer.parseInt(line1[1]);
            String line2[] = in.readLine().trim().split("\\s+");
            int val[] = new int[N];
            for(int i = 0;i < N;i++)
                val[i] = Integer.parseInt(line2[i]);
            String line3[] = in.readLine().trim().split("\\s+");
            int wt[] = new int[N];
            for(int i = 0;i < N;i++)
                wt[i] = Integer.parseInt(line3[i]);
                
            Solution ob = new Solution();
            System.out.println(ob.knapSack(N, W, val, wt));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int knapSack(int n, int w, int val[], int wt[])
    {
        // code here
        int arr[][] = new int[n][w+1];
        
        for(int i=0; i<n; i++){
            for(int j=1; j<=w; j++){
                
                int pick = 0;
                int np = 0;
                
                if(wt[i]<=j) pick = val[i] + arr[i][j-wt[i]];
                if(i>0) np = arr[i-1][j];
                
                arr[i][j] = Math.max(pick,np);
            }
        }
        
        return arr[n-1][w];
    }
}