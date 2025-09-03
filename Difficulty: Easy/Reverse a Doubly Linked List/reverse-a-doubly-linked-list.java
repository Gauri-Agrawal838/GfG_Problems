/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        if(head==null || head.next==null)
        return head;
        Node curr = head;
        Node prev = null;
        while(curr!=null)
        {
            Node temp = curr.next;
            curr.next = prev;
            curr.prev = temp;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}