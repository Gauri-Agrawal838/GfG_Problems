//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
	    // Your code here	
	    int top = 0;
	    int down = n-1;
	    int left = 0;
	    int right = m-1;
	    int dir = 1; //direction
	    int count = 0;
	    while(top<=down && left<=right)
	    {
	        if(dir==1)
	        {
	            for(int i=left;i<=right;i++)
	            {
	                count++;
	                if(count==k)
	                    return A[top][i];
	            }
	            
	            top++;
	            dir = 2;
	        }
	        else if(dir==2)
	        {
	            for(int i=top;i<=down;i++)
	            {
	                count++;
	                if(count==k)
	                    return A[i][right];
	            }
	            
	            right--;
	            dir = 3;
	        }
	        else if(dir==3)
	        {
	            for(int i=right;i>=left;i--)
	            {
	                count++;
	                if(count==k)
	                    return A[down][i];
	            }
	            
	            down--;
	            dir = 4;
	        }
	        else if(dir==4)
	        {
	            for(int i=down;i>=top;i--)
	            {
	                count++;
	                if(count==k)
	                    return A[i][left];
	            }
	           
	            left++;
	            dir = 1;
	        }
	        
	    }
	    return 0;
    }
}