//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int a = Integer.parseInt(br.readLine().trim());
            int b = Integer.parseInt(br.readLine().trim());

            Solution ob = new Solution();
            out.println(ob.minVal(a, b));
        }
        out.flush();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int minVal(int a, int b) {
        // code here
        int csb = 0, csa = 0; 

        for (int i = 0; i < 31; i++) {

            if ((b & (1 << i)) != 0) {

                csb++;

            }

            if ((a & (1 << i)) != 0) {

                csa++; 

            }

        }

        int ans = 0; 

        if (csb < csa) {

            for (int i = 31; i >= 0; i--) {

                if ((a & (1 << i)) != 0) {

                    ans += (1 << i);

                    csb--;

                }

                if (csb == 0) {

                    break;

                }

            }

            return ans;

        } else if (csb == csa) {

            return a; 

        } else {

            java.util.Map<Integer, Integer> m = new java.util.HashMap<>();

            for (int i = 0; i < 31; i++) {

                if ((a & (1 << i)) != 0) {

                    m.put(i, 1); 

                }

            }

            int len = csb - csa; 

            ans = a;

            for (int i = 0; i < 31; i++) {

                if (!m.containsKey(i)) {

                    len--;

                    ans += (1 << i); 

                }

                if (len == 0) {

                    break;

                }

            }

            return ans;

        }
    }
}