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
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isDisarium(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int isDisarium(int N) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int m = N;
        while(N>0)
        {
            int rem = N%10;
            list.add(rem);
            N /= 10;
        }
        long sum = 0;
        int j = 1;
        for(int i=list.size()-1;i>=0;i--)
        {
            sum += Math.pow(list.get(i),(j++));
        }
        if(sum==m)
            return 1;
        return 0;
    }
};