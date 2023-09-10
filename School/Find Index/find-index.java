//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;




class Array
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0)
	    {
	    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    int key = sc.nextInt();
		    Solution ob=new Solution();
		    int ar[]=ob.findIndex(arr,n,key);
		    System.out.println(ar[0]+" "+ar[1]);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    // Function to find starting and end index 
    static int[] findIndex(int a[], int N, int key) 
    { 
        //code here.
        int ans[] = new int[2];
        Arrays.fill(ans,-1);
        int j = N-1;
        int f1 = 0, f2 = 0;
        for(int i=0;i<N;i++, j--)
        {
            if(a[i]==key && f1==0)
            {
                ans[0] = i;
                f1 = 1;
            }
            if(a[j]==key && f2==0)
            {
                ans[1] = j;
                f2 = 1;
            }
        }
        
        return ans;
    }
}