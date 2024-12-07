//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().inversionCount(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int Ans;
    static void MergeSort(int[] arr,int start,int end){
        if(start>=end)return;
        int mid=start+(end-start)/2;
        MergeSort(arr,start,mid);
        MergeSort(arr,mid+1,end);
        Merge(arr,start,mid,end);
    }
    static void Merge(int[] arr,int start,int mid,int end){
        int[] temp=new int[end-start+1];
        int i=start,j=mid+1,k=0;
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                Ans+=mid-i+1;  // Inversion Counting
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k]=arr[i];
            i++;k++;
        }
        while(j<=end){
            temp[k]=arr[j];
            j++;k++;
        }
        for(int x=0;x<temp.length;x++){
            arr[start]=temp[x];
            start++;
        }
        return;
    }
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        Ans=0;
        MergeSort(arr,0,arr.length-1);
        return Ans;
    }
}