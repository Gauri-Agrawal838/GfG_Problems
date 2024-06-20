//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class GFG {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str = read.readLine().trim();
            String ans = ob.compareFrac(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    String compareFrac(String s) {
        // Code here
        String str[] = s.split(",");
        if(str[0].trim().equals(str[1].trim()))
            return "equal";
            
        String ch[] = str[0].split("/");
        double a = Double.parseDouble(ch[0].trim());
        double b = Double.parseDouble(ch[1].trim());

        double e = a/b;

        String ch1[] = str[1].split("/");

        double c = Double.parseDouble(ch1[0].trim());
        double d = Double.parseDouble(ch1[1].trim());

        double f = c/d;

        if(e==f)
            return "equal"; 
        else if(e>f)
            return str[0].trim();
        else
            return str[1].trim();
    }
}
