class Solution {
    public ArrayList<Integer> topKFreq(int[] nums, int k) {
        // Step 1: Count frequencies
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Use Min-Heap to keep top K frequent
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            (a, b) -> {
                if (!a.getValue().equals(b.getValue())) {
                    return a.getValue() - b.getValue(); // smaller freq first
                } else {
                    return a.getKey() - b.getKey(); // tie-breaker by key
                }
            }
        );

        // Step 3: Maintain only top K
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(entry);
            if (pq.size() > k) pq.poll();
        }

        // Step 4: Build result in reverse (since min-heap gives smallest first)
        ArrayList<Integer> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll().getKey());
        }

        // Optional: reverse to get descending order by frequency
        Collections.reverse(result);
        return result;
    }
}
