//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            long a;
            a = Long.parseLong(br.readLine().trim());
            
            
            long b;
            b = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            long res = obj.sumOfPowers(a, b);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    public static long sumOfPowers(long a, long b) {
        // code here
        long sum = 0;
        for(int i=(int)a;i<=(int)b;i++)
        {
            sum += getFac(i);
        }
        return sum;
    }
    
    static long getFac(int num)
    {
        long ans = 0;
        for(int i=2;i*i<=num;i++)
        {
            while(num%i==0)
            {
                ans ++; 
                num = num/i;
            }
        }
        if(num>=2)
            ans++;
        return ans;
    }
}
        
