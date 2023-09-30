//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            float[] ans = new Solution().streamAvg(arr, n);
            for (int i = 0; i < n; i++) {
                DecimalFormat df = new DecimalFormat("#.##");
            	String formatted1 = df.format(ans[i]);
            	String formatted2 = String.format("%.2f", ans[i]);
            	if(formatted1.length() >= 3 && formatted1.charAt(formatted1.length()-3) == '.')
            		System.out.print(formatted1+" ");
            	else
            		System.out.print(formatted2+" ");
            }
            System.out.println();
        }
    }
}



// } Driver Code Ends


//User function Template for Java

class Solution {
    float[] streamAvg(int[] arr, int n) {
        // code here
       
        float res[] = new float[n];
        res[0] = arr[0];
        
        float sum = arr[0];
        for(int i=1;i<n;i++)
        {
            sum += arr[i];
            res[i] = sum/(i+1);
        }
        
        return res;
    }
}