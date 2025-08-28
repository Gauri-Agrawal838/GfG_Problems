class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int n=arr.length;
        int i=0, count=0, maxOnes=0;
        
        for(int j=0;j<n;j++){
            if(arr[j]==0)count+=1;
            while(i<=j && count>k){
                if(arr[i]==0)count--;
                i++;
            }
            maxOnes= Math.max(maxOnes,j-i+1);
        }
        return maxOnes;
    }
}