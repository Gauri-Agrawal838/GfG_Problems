/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    static int maxSum;
    
    int dfs(Node node) {
        if(node == null) return 0;
        int leftsubtree = dfs(node.left); 
        int rightsubtree = dfs(node.right);
        int a = Math.max(leftsubtree + node.data , rightsubtree + node.data);
        int b = Math.max(leftsubtree + rightsubtree + node.data , node.data);
        maxSum = Math.max(maxSum , Math.max(a,b));
        return Math.max(a , node.data);
    }
    
    int findMaxSum(Node node) {
        // your code goes here
        if(node == null) return 0;
        maxSum = Integer.MIN_VALUE;
        dfs(node);
        return maxSum;
    }
}