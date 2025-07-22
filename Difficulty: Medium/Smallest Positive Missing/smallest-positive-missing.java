class Solution {
    public int missingNumber(int[] arr) {
        // code here
        Set<Integer> set = new HashSet<>();
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
                set.add(arr[i]);
        }
        
        for(int i=1;i<=n;i++)
        {
            if(!set.contains(i))
                return i;
        }
        Arrays.sort(arr);
        return n+1;
    }
}
