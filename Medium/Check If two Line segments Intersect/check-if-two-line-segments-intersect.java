//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int p1[] = new int[2];
            int q1[] = new int[2];
            int p2[] = new int[2];
            int q2[] = new int[2];
            String S1[] = read.readLine().split(" ");
            p1[0] = Integer.parseInt(S1[0]);
            p1[1] = Integer.parseInt(S1[1]);
            q1[0] = Integer.parseInt(S1[2]);
            q1[1] = Integer.parseInt(S1[3]);
            String S2[] = read.readLine().split(" ");
            p2[0] = Integer.parseInt(S2[0]);
            p2[1] = Integer.parseInt(S2[1]);
            q2[0] = Integer.parseInt(S2[2]);
            q2[1] = Integer.parseInt(S2[3]);
            Solution ob = new Solution();
            String ans = ob.doIntersect(p1, q1, p2, q2);
            // if(ans)
            System.out.println(ans);
            // else
            // System.out.println("false");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int orientation(int p[], int q[], int r[])
     {
        long val = (long)(q[1] - p[1]) * (r[0] - q[0]) - (long)(r[1] - q[1]) * (q[0] - p[0]);
        if(val == 0) return 0; // collinear
        return (val > 0) ? 1 : 2; // clock or counterclock wise
     }
    
    public boolean onSegment(int a[], int b[], int c[])
    {
        if((c[0] >= Math.min(a[0], b[0]) && c[0] <= Math.max(a[0], b[0])) &&
           (c[1] >= Math.min(a[1], b[1]) && c[1] <= Math.max(a[1], b[1])))
           {
            return true;
           }
        return false;
    }
    String doIntersect(int p1[], int q1[], int p2[], int q2[]) {
        // code here
        int o1 = orientation(p1, q1, p2);
        int o2 = orientation(p1, q1, q2);
        int o3 = orientation(p2, q2, p1);
        int o4 = orientation(p2, q2, q1);
        
        if(o1 != o2 && o3 != o4)
            return "true";
        
        if(o1 == 0 && onSegment(p1, q1, p2)) return "true";
        
        if(o2 == 0 && onSegment(p1, q1, q2)) return "true";
      
        if(o3 == 0 && onSegment(p2, q2, p1)) return "true";
      
        if(o4 == 0 && onSegment(p2, q2, q1)) return "true";
       
        return "false";
    }
}