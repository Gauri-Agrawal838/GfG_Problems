class Solution {
    public static int minCost(int[] arr) {
        // code here
        int ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x:arr)pq.add(x);
        while(pq.size()!=1){
            int first = pq.poll();
            int second = pq.poll();
            int total = first+second;
            pq.add(total);
            ans+=total;
        }
        return ans;
    }
}