//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            int ans = obj.minCandy(n, a);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int minCandy(int n, int rat[]) {
        // code here
        int arr[] = new int[n];
        arr[n-1] = 1;
        for(int i=n-2; i>=0; i--){
            if(rat[i]>rat[i+1]) arr[i]=arr[i+1]+1;
            else arr[i] = 1;
        }
        
        for(int i=1; i<n; i++){
            if(rat[i]>rat[i-1] && arr[i]<=arr[i-1]) arr[i] = arr[i-1]+1;
        }
        int res = 0;
        for(int x : arr) res+=x;
        return res;
    }
}
