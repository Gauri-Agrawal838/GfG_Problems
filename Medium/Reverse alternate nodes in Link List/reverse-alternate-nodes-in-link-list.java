//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Rearr
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node temp = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                temp.next = new Node(a);
                temp = temp.next;
            }
            
            Solution ob = new Solution();
            ob.rearrange(head);
            printLast(head);
            System.out.println();
        }
    }
    
    public static void printLast(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
class Solution
{
    public static void rearrange(Node odd)
    {
        // add your code here
        if(odd.next==null)
            return;
        Node h1 = odd;
        Node h2 = odd.next;
        
        Node t1 = h1;
        Node t2 = h2;
        
        while(true)
        {
            t1.next = t1.next.next;
            t1 = t1.next;
            
            //handling odd length, t1->last and t2->secondlast
            if(t2.next.next==null)
            {
                t1.next = null;
                break;
            }
            
            t2.next = t1.next;
            t2 = t2.next;
            
            //handling even length, t1->secondlast and t2->last
            if(t1.next.next==null)
            {
                t1.next = null;
                break;
            }
        }
        t2.next = null;
        t1.next = reverse(h2);
    }
    
    static Node reverse(Node head)
    {
        Node curr = head;
        Node prev = null;
        Node next = null;
        
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
