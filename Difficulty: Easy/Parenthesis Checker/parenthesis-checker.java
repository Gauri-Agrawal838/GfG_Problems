//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Reading total number of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // reading the string
            String st = sc.next();

            // calling ispar method of Paranthesis class
            // and printing "balanced" if it returns true
            // else printing "not balanced"
            if (new Solution().isBalanced(st) == true)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    static boolean isBalanced(String x) {
        // code here
        ArrayDeque<Character> st = new ArrayDeque<>();
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)=='(' || x.charAt(i)=='{' || x.charAt(i)=='[')
                st.push(x.charAt(i));
            else
            {
                if(st.isEmpty())
                    return false;
                else if((x.charAt(i)==')' && st.peek()=='(') || (x.charAt(i)=='}' && st.peek()=='{') || (x.charAt(i)==']' && st.peek()=='['))
                    st.pop();
                else
                    return false; // {()]
            }
        }
        return(st.isEmpty());
    }
}
