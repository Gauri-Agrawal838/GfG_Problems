/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        if (head == null) return 0;

        Node meetingPoint = getMeetingPoint(head);
        if (meetingPoint == null) return 0;

        int loopLength = 1;
        Node temp = meetingPoint.next;
        while (temp != meetingPoint) {
            loopLength++;
            temp = temp.next;
        }
        return loopLength;
    }
    
    private Node getMeetingPoint(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return slow;
        }
        return null;
    }
}