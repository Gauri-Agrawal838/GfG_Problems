//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String s = read.readLine();
            Solution ob = new Solution();
            String ans = ob.transform(s);
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String transform(String S) 
    {
        // code here
        S = S.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<S.length();i++)
        {
            int count = 1;
            char c = S.charAt(i);
            while(i<S.length()-1 && c==S.charAt(i+1))
            {
                count++;
                i++;
            }
            sb.append(count);
            sb.append(c);
        }
        return sb.toString();
    }
} 