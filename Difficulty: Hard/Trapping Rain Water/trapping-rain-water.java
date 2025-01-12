//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().maxWater(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int maxWater(int arr[]) {
        // code here
        int ans = 0;
        int n = arr.length;
        int lefty[] = new int[n];
        int righty[] = new int[n];
        lefty[0] = arr[0];
        righty[n-1] = arr[n-1];
        for(int i=1;i<n;i++)
        {
            lefty[i] = Math.max(lefty[i-1],arr[i]);
        }
        for(int i=n-2;i>=0;i--)
        {
            righty[i] = Math.max(righty[i+1],arr[i]);
        }
        for(int i=0;i<n;i++)
        {
            ans += Math.min(lefty[i],righty[i]) - arr[i];
        }
        return ans;
    }
}
