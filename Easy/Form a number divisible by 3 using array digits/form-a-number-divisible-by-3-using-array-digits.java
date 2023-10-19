//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(a[i]);

            Solution ob = new Solution();
            System.out.println(ob.isPossible(N, arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int isPossible(int N, int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<N;i++)
        {
            while(arr[i]>0)
            {
                int rem = arr[i]%10;
                list.add(rem);
                arr[i] /= 10;
            }
        }
        
        int sum = 0;
        for(int i=0;i<list.size();i++)
            sum += list.get(i);
        if(sum%3==0)
            return 1;
        return 0;
    }
}