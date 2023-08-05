//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        ArrayList<String> list = new ArrayList<>();
        char str[] = S.toCharArray();
        int n = S.length();
        permute(str,0,n-1, list);
        Collections.sort(list);
        return list;
    }
    public static void permute(char str[], int l, int r, ArrayList<String> list)
	{
	    if(l==r)
	    {
	        list.add(new String(str));
	        return;
	    }
	    for(int i=l;i<=r;i++)
	    {
	        swap(str, l, i);
            permute(str, l + 1, r, list);
            swap(str, l, i); //backtrack
	    }
	}
	public static void swap(char[] str, int i, int j)
	{
	    char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
	}
}
