//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            ArrayList<Integer> ans = new Solution().nthRowOfPascalTriangle(n);
            printAns(ans);

            System.out.println("~");
        }
    }

    public static void printAns(ArrayList<Integer> ans) {
        for (Integer x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        int mod = 1000000007;
        ArrayList<Integer>  al = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            al.add(0); // Initialize each element to 0L
        }
        
        al.set(0, 1);
        for(int i=0; i<n-1; i++){
            for ( int j= n - 1; j >= 1; j--) {
                al.set(j, (al.get(j)%mod + al.get(j - 1)%mod)%mod);
            }
        }

        return al;
    }
}