//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n;
                    n = sc.nextInt();
                    ArrayList<String> dictionary = new ArrayList<String>();
                    for(int i = 0;i<n;i++)
                        {
                            String p = sc.next();
                            dictionary.add(p);
                        }
                    String s = sc.next();
                    Solution obj = new Solution();  
                    System.out.println(obj.wordBreak(n, s, dictionary));  
                    
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static boolean help(String A,ArrayList<String> B,int index){
        if(index==A.length())return true;
        String temp="";
        boolean a=false;
        for(int i=index;i<A.length();i++){
            temp+=A.charAt(i);
            if(B.contains(temp)==true){
                a = a|help(A,B,i+1);
            }
        }
        return a;
    }
    public static int wordBreak(int n, String A, ArrayList<String> B )
    {
        //code here
        boolean ans = help(A,B,0);
        return ans==true?1:0;
    }
}