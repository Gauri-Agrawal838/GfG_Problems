//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        int li = bs1(arr, 0, n-1, x);
        int ri = bs2(arr, 0, n-1, x);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(li, ri));
        return list;
    }
    
    int bs1(int arr[], int low, int high, int x)
    {
        int res = -1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid]<x)
                low = mid + 1;
            else
            {
                if(arr[mid]==x)
                    res = mid;
                high = mid - 1;
            }
        }
        return res;
    }
    
    int bs2(int arr[], int low, int high, int x)
    {
        int res = -1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid]>x)
                high = mid - 1;
            else
            {
                if(arr[mid]==x)
                    res = mid;
                low = mid + 1;
            }
        }
        return res;
    }
}



//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Integer> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}

// } Driver Code Ends