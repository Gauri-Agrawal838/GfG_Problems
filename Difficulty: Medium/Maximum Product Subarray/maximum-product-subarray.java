//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int n = inputLine.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxProduct(arr));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        int p1=1, p2=1;
        for(int i=0;i<n;i++)
        {
            p1 *= arr[i];
            p2 *= arr[n-i-1];
            max = Math.max(max,Math.max(p1, p2));
            if(p1==0)
                p1 = 1;
            if(p2==0)
                p2 = 1;
        }
        return max;
    }
}