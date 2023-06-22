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
            boolean ans = obj.lemonadeChange(n, a);
            System.out.println(ans ? "True" : "False");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static boolean lemonadeChange(int n, int bills[]) {
        // code here
        int f[] = new int[3];
        Arrays.fill(f,0);
        for(int i=0;i<n;i++)
        {
            if(bills[i]==5)
            f[0]++;
            else if(bills[i]==10)
            {
                if(f[0]>0)
                {
                    f[0]--;
                    f[1]++;
                }
                else 
                    return false;
            }
            else if(bills[i]==20)
            {
                if(f[1]>0 && f[0]>0)
                {
                    f[1]--;
                    f[0]--;
                    f[2]++;
                }
                else if(f[0]>=3)
                {
                    f[0] -= 3;
                    f[2]++;
                }
                else
                    return false;
            }
        }
        return true;
    }
}
