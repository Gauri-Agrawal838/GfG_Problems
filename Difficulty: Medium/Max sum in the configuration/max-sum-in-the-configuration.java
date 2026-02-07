class Solution {
    int maxSum(int[] a) {
        // code here
        int n = a.length;
        int sum = 0;
        for (int i = 0; i < n; ++i) 
        {
           sum += a[i];
        }
        int currSum = 0;
        for (int i = 0; i < n; ++i) 
        {
            currSum += (int)i * a[i];
        }
        
        int maxi = currSum;
        for (int i = 1; i < n; ++i) 
        {
           currSum = currSum + sum - (int)n * a[n - i];
           maxi = Math.max(maxi, currSum);
            
        }
        return maxi;
    }
}