class Solution {
    public int catchThieves(char[] arr, int k) {
        // code here
        int thievesCaught = 0;
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]=='P')
            {
                int start = Math.max(0,i-k);
                int end = Math.min(n-1,i+k);
                for(int j=start;j<=end;j++)
                {
                    if(arr[j]=='T')
                    {
                        arr[j] = 'C';
                        thievesCaught++;
                        break;
                    }
                }
            }
        }
        return thievesCaught;
    }
}