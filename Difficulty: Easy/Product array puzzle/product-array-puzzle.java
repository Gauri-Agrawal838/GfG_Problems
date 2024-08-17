//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array);

            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
            t--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static long[] productExceptSelf(int nums[]) {
        // code here
        long prod=1;
        long f=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
                prod *= nums[i];
            else 
                f++;
        }
        long ans[] = new long[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(f>1)
                ans[i] = 0;
            else if(f==1 && nums[i]!=0)
                ans[i] = 0;
            else if(f==1 && nums[i]==0)
                ans[i] = prod;
            else
                ans[i] = prod/nums[i];
        }
        return ans;
    }
}
