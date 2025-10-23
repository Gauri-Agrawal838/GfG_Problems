import java.util.*;

class Solution {
    class Pair {
        int euclidean;
        int[] point;
        
        Pair(int euclidean, int[] point) {
            this.euclidean = euclidean;
            this.point = point;
        }
    }

    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        // Max Heap by distance
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.euclidean - a.euclidean);

        // Calculate distance and maintain top k
        for (int[] point : points) {
            int distance = (point[0] * point[0]) + (point[1] * point[1]);
            pq.add(new Pair(distance, point));
            if (pq.size() > k) pq.poll();
        }

        // Convert heap result to ArrayList<ArrayList<Integer>>
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            int[] p = pq.poll().point;
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(p[0]);
            temp.add(p[1]);
            result.add(temp);
        }

        return result;
    }
}
