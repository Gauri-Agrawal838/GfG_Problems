//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}

class GfG
{
    static Scanner sc = new Scanner(System.in);
    
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        
        head = tail = new Node(val);
        
        size--;
        
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
    {
        int t = sc.nextInt();
        while(t-->0)
        {
            int n , m;
            
            n = sc.nextInt();
            Node head1 = inputList(n);
            
            m = sc.nextInt();
            Node head2 = inputList(m);
            
            Sol obj = new Sol();
            
            printList(obj.findUnion(head1, head2));
            System.out.println();
        }
    }
}
// } Driver Code Ends


/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    //Add your code here.
	    ArrayList<Integer> list = new ArrayList<>();
	    Node curr = head1;
	    while(curr!=null)
	    {
	        if(!list.contains(curr.data))
	            list.add(curr.data);
	        curr = curr.next;
	    }
	    curr = head2;
	    while(curr!=null)
	    {
	        if(!list.contains(curr.data))
	            list.add(curr.data);
	        curr = curr.next;
	    }
	    Collections.sort(list);
	    LinkedList<Node> n = new LinkedList<>();
	    Node head3 = new Node(list.get(0));
	    curr = head3;
	    for(int i=1;i<list.size();i++)
	    {
	        curr.next = new Node(list.get(i));
	        curr = curr.next;
	    }
	    return head3;
	}
}