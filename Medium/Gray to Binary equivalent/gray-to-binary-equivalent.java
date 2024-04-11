//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution{
    
    // function to convert a given Gray equivalent n to Binary equivalent.
    public static int grayToBinary(int n) {
        
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        while(n!=0)
        {
            if((n&1)==1)
                list.add(1);
            else
                list.add(0);
            n = n>>1;
        }
        Collections.reverse(list);
        for(int i=1;i<list.size();i++)
        {
            int a = list.get(i-1);
            int b = list.get(i);
            list.set(i, a^b);
        }
        int ans=0, j=0;
        for(int i=list.size()-1;i>=0;i--)
        {
            if(list.get(i)==1)
                ans += Math.pow(2,j);
            j++;
        }
        return ans;
    }
       
}



//{ Driver Code Starts.

class GFG {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//initializing n
		    
		    Solution obj = new Solution();
		    
		    //calling grayToBinary() function
		    System.out.println(obj.grayToBinary(n));
		}
	}
}

// } Driver Code Ends