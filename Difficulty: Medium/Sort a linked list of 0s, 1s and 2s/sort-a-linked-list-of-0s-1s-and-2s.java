/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        int zero=0, one=0, two=0;
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data==0)
                zero++;
            else if(temp.data==1)
                one++;
            else
                two++;
            temp = temp.next;
        }
        temp = head;
        while(temp!=null)
        {
            if(zero>0)
            {
                temp.data = 0;
                zero--;
            }
            else if(one>0)
            {
                temp.data = 1;
                one--;
            }
            else if(two>0)
            {
                temp.data = 2;
                two--;
            }
            temp = temp.next;
        }
        return head;
    }
}