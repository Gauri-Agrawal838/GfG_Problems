//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S1 = read.readLine().trim();
            String S2 = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestCommonSubstr(S1, S2));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public ArrayList<Integer> arr[] = new ArrayList[256];
    
    public int moon(String s1,String s2,int i,int j){
        int count=0;
        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
                count++;
            }else return count;
        }
        return count;
    }
    
    public int longestCommonSubstr(String str1, String str2) {
        for(int i=0;i<256;i++)arr[i] =  new ArrayList<>();
        for(int i=0;i<str2.length();i++)arr[str2.charAt(i)].add(i);
        char c;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<str1.length();i++){
            c=str1.charAt(i);
            if(arr[c].size()!=0){
                for(int j:arr[c]){
                    max=Math.max(max,moon(str1,str2,i,j));
                }
            }
        }
        return max==Integer.MIN_VALUE? 0: max;
    }
}

