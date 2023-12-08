//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(a1[i]);
            }
            Solution ob = new Solution();
            int ans=ob.minNumber(a,n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public int minNumber(int arr[], int N)
    {
        int sum =0;
        //A loop to calculate sum of all array elements
        for (int i = 0;i<N;i++){
            sum +=arr[i];
        }
        
        
        //takig count variable to check how much we have to add
        int count = 0;
         while(prime(sum)!=true){//if sum is not prime then it will go inside loop 
                sum++; // And increase sum
                count++;//count start from 0 to if it goes inside loop it will increase
        }
        return count; //finaly return count 
        
    }
    //create a separate method to check if the number is prime or not
    
    boolean prime(int n){
        boolean primeC = true;
        if(n<2){
            return false;
        }
        else{
            for (int i =2;i<=n/2;i++){
                if(n%i==0){
                    primeC = false;
                    break;
                }
            }
             return primeC;
        }
    }
}
