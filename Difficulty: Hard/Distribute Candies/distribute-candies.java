/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution
{
    static int ans = 0;
    static int help(Node root){
        if(root==null)return 0;
        int l=help(root.left);
        int r=help(root.right);
        ans+=Math.abs(l)+Math.abs(r);
        return root.data-1+l+r;
    }
    public static int distCandy(Node root)
    {
        //code here
        ans=0;
        help(root);
        return ans;
    }
}