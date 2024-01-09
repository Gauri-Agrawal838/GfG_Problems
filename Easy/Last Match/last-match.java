//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java
class Solution{
    static int findLastOccurence(String A,String B){
        // code here
        int ans = 0;
        for(int i=0;i<=A.length()-B.length();i++)
        {
            int k=0;
            while(k<B.length() && A.charAt(i+k)==B.charAt(k))
                k++;
            if(k==B.length())
                ans = i+1;
        }
        if(ans==0)
            return -1;
        return ans;
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            
            String A = read.readLine().trim();
             String B = read.readLine().trim();
          

            Solution ob = new Solution();
            System.out.println(ob.findLastOccurence(A,B));
        }
    }
}
// } Driver Code Ends