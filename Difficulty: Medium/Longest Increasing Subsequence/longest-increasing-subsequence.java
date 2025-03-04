//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine())
                               .trim()
                               .split(" "); // Read the input for the current test case
            int arr[] = new int[str.length];
            // Convert input string into an integer array
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            // Call the solution method and print the result
            System.out.println(new Solution().lis(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    static int lis(int a[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a[0]);
        
        int size = a.length;
        
        for(int i=1; i<size; i++) {
            int n = list.size();
            if(a[i] > list.get(n-1)) list.add(a[i]);
            else {
                int index = binarySearch(list, a[i], 0, n-1);
                list.set(index, a[i]);
            }
        }
        return list.size();
    }
    
    static int binarySearch(ArrayList<Integer> list, int a, int left, int right) {
        while( right > left) {
            int mid = (left + right)/2;
            
            if(list.get(mid) >= a) {
                right = mid;
            }
            else {
                left = mid+1;
            }
        }
        return right;
    }
}