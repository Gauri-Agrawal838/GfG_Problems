//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.findUnique(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public int findUnique(int[] arr) {
        // code here
        int xor = arr[0];
        for(int i=1;i<arr.length;i++)
            xor ^= arr[i];
        return xor;
    }
}

// 0 0 1 1
// 0 1 0 2
// 0 1 1 ans 3
// 0 0 1 1
// 0 1 0 ans 2
// 1 0 1 5
// 1 1 1 ans 7
// 1 0 1 5
// 0 1 0 ans 2
