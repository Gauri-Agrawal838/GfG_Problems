class Solution {
    public int andInRange(int l, int r) {
        int shift = 0;

        // Make l and r equal by removing differing right bits
        while (l != r) {
            l >>= 1;
            r >>= 1;
            shift++;
        }

        // Shift left to restore the common prefix
        return l << shift;
    }
}
