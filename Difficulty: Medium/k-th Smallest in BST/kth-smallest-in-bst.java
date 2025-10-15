/*
class Node {
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    // Global variables to store the result and count
    int ans = -1; // Stores the kth smallest element
    int cnt = 0;  // Counter to track the number of nodes visited

    // Helper function to perform in-order traversal
    public void help(Node root, int k) {
        // Base case: if the current node is null, return
        if (root == null) return;

        // If the count has already reached k, stop further traversal
        if (cnt >= k) return;

        // Traverse the left subtree
        help(root.left, k);

        // Increment the counter for the current node
        ++cnt;

        // If the counter equals k, store the current node's value as the answer
        if (cnt == k) {
            ans = root.data;
            return;
        }

        // Traverse the right subtree
        help(root.right, k);
    }

    // Main function to find the kth smallest element
    public int kthSmallest(Node root, int k) {
        // Call the helper function to perform in-order traversal
        help(root, k);

        // Return the kth smallest element (or -1 if not found)
        return ans;
    }
}