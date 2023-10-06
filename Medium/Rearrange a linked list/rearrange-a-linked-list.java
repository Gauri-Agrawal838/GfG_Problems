//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            new Solution().rearrangeEvenOdd(head);
            printList(head); 
            t--;
        }
    } 
} 

// } Driver Code Ends


/*

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
This is method only submission.
You only need to complete the below method.
*/
class Solution
{

   // Should rearrange given linked list such that all even
   // positioned Nodes are before odd positioned.
   // Returns nothing
    void rearrangeEvenOdd(Node head)
    {
          //  The task is to complete this method
          if(head.next==null || head.next.next==null)
            return;
            
          Node h1 = head;
          Node h2 = head.next;
          
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
          t1.next = h2;
    }
}
