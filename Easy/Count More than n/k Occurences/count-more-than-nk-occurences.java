//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Driverclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();

            System.out.println(new Solution().countOccurence(arr, n, k));
        }
    }
}

// } Driver Code Ends


class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        for(int i=0;i<n;i++)
        {
            if(!hm.containsKey(arr[i]))
                hm.put(arr[i], 1);
            else
                hm.put(arr[i],hm.get(arr[i])+1);
        }
        int size = hm.size();
        for(Map.Entry<Integer,Integer> entry : hm.entrySet())
        {
            if(entry.getValue()>(n/k))
                count++;
        }
       
        return count;
    }
}
