//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob = new Solution();
            int ans[] = ob.sumClosest(arr, x);
            System.out.print(ans[0]+" "+ans[1]);
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int[] sumClosest(int[] arr, int x) {
        // code here 
        int res[] = new int[2];
        ArrayList<Integer> list = new ArrayList<>();
        int diff = Integer.MAX_VALUE;
        int n = arr.length; 
        int i = 0;
        int j = n-1;
        while(i<n && j>=0 && i!=j)
        {
            int sum = arr[i] + arr[j];
            int temp = Math.abs(sum-x);
            if(temp<diff)
            {
                diff = temp;
                list.clear();
                list.add(arr[i]);
                list.add(arr[j]);
            }
            if(sum<x)
                i++;
            else
                j--;
        }
        res[0] = list.get(0);
        res[1] = list.get(1);
        return res;
    }
}