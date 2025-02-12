//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.math.*;
import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

class GFG {
    static Node buildTree(String str) {
        // Corner Case
        if (str.length() == 0 || str.equals('N')) return null;
        String[] s = str.split(" ");

        Node root = new Node(Integer.parseInt(s[0]));
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        // Starting from the second element
        int i = 1;
        while (!q.isEmpty() && i < s.length) {
            // Get and remove the front of the queue
            Node currrNode = q.remove();

            // Get the currrent node's value from the string
            String currrVal = s[i];

            // If the left child is not null
            if (!currrVal.equals("N")) {

                // Create the left child for the currrent node
                currrNode.left = new Node(Integer.parseInt(currrVal));

                // Push it to the queue
                q.add(currrNode.left);
            }

            // For the right child
            i++;
            if (i >= s.length) break;
            currrVal = s[i];

            // If the right child is not null
            if (!currrVal.equals("N")) {

                // Create the right child for the currrent node
                currrNode.right = new Node(Integer.parseInt(currrVal));

                // Push it to the queue
                q.add(currrNode.right);
            }

            i++;
        }

        return root;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t > 0) {
            String s = br.readLine();
            Node root = buildTree(s);

            int k = Integer.parseInt(br.readLine().trim());

            Solution T = new Solution();
            System.out.println(T.kthSmallest(root, k));
            t--;

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

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
