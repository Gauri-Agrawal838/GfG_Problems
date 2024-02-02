//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			int num = obj.atoi(str);
			
			System.out.println(num);
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String s) 
    {
	    // Your code here
	    int sign = 0;
	    int ans=0, i=0, temp=1;
	    if(s.charAt(0)=='-')
	    {
	        temp = -1;
	        i++;
	    }
	    for(int j=i;j<s.length();j++)
	    {
	        if(s.charAt(j)>='0' && s.charAt(j)<='9')
	            ans = ans*10 + s.charAt(j)-'0';
	        else
	            return -1;
	    }
	    return ans*temp;
    }
}
