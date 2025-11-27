class Solution {
    int subsetXORSum(int arr[]) {
        // code here
        int ans=0;
        for(int i=0;i<arr.length;i++)
            ans|=arr[i];
        int val=(1<<(arr.length-1));
        return (val*ans);
    }
}