//{ Driver Code Starts
import java.util.*;
import java.io.*;

public class GFG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0)
        {
            int n = scanner.nextInt();
            int total = scanner.nextInt();
            int[] cost = new int[n];
            for (int i = 0; i < n; i++) {
                cost[i] = scanner.nextInt();
            }
            Solution solution = new Solution();
            int result = solution.max_courses(n, total, cost);
            System.out.println(result);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution {
    static int help(int n,int total,int index,int cost[],int [][]dp){
        if(total<=0 || index==n)return 0;
        if(dp[index][total]!=-1)return dp[index][total];
        int a=0,b=0;
        if(total>=cost[index]){
            a++;
            int temp=total;
            temp-=cost[index];
            temp+=(cost[index]*9)/10;
            a+= help(n,temp,index+1,cost,dp);
        }
        b = help(n,total,index+1,cost,dp);
        return dp[index][total] = Math.max(a,b);
    }
    public int max_courses(int n, int total, int[] cost) {
        // code here
        int dp[][] = new int[n][total+1];
        for(int []temp:dp){
            Arrays.fill(temp,-1);
        }
        return help(n,total,0,cost,dp);
    }
}

