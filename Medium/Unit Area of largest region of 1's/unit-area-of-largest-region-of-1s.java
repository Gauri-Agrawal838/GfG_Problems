//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.findMaxArea(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find unit area of the largest region of 1s.
    
    int row[] = {0,1,1,1,0,-1,-1,-1};
    int col[] = {1,1,0,-1,-1,-1,0,1};
    
    public int findMaxArea(int[][] grid)
    {
        // Code here
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                    count = Math.max(count,countOne(i,j,n,m,grid));
            }
        }
        
        return count;
    }
    
    int countOne(int i, int j, int n, int m, int grid[][])
    {
        grid[i][j] = 0;
        int count = 1;
        for(int k=0;k<8;k++)
        {
            int nrow = i + row[k];
            int ncol = j + col[k];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]==1)
            {
                count += countOne(nrow,ncol,n,m,grid);
            }
        }
        return count;
    }
}