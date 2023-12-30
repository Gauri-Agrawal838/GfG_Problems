//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            
            Solution obj = new Solution();    
            String result[] = obj.winner(arr, n);
            System.out.println(result[0] + " " + result[1]);
            
           
        }
        
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!hm.containsKey(arr[i]))
                hm.put(arr[i], 1);
            else
                hm.put(arr[i], hm.get(arr[i])+1);
        }
        
        String str[] = new String[2];
        int val = 0;
        
        for(Map.Entry<String,Integer> entry : hm.entrySet())
        {
            if(entry.getValue()>val){
                val = entry.getValue();
                str[0] = entry.getKey().toString();
                str[1] = entry.getValue().toString();
            }
            else if(entry.getValue().equals(val)){
                String temp = entry.getKey();
                
                if(str[0].compareTo(temp)>0)
                {
                    str[0] = entry.getKey().toString();
                    str[1] = entry.getValue().toString();
                }
            }
        }
        return str;
    }
}

