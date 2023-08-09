//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.primeProduct(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long primeProduct(int N) 
    { 
        // code here
        long prod = 1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2;i<=N;i++)
        {
            if(N%i==0)
                list.add(i);
        }
        for(int i=0;i<list.size();i++)
        {
            int a = list.get(i);
            if(checkPrime(a))
                prod *= a;
        }
        return prod;
    }
    static boolean checkPrime(int a)
    {
        int f = 0; 
        for(int i=2;i<=a/2;i++)
        {
            if(a%i==0)
            {
                f = 1;
                break;
            }
        }
        if(f==0)
            return true;
        return false;
    }
}