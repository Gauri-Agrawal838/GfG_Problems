//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}


public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0)
        {
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            Node node1 = null;
            Node temp1 = null;
            for (int i = 0; i < N; i++) {
                int value = scanner.nextInt();
                Node newNode = new Node(value);
                if (node1 == null) {
                    node1 = newNode;
                    temp1 = node1;
                } else {
                    temp1.next = newNode;
                    temp1 = temp1.next;
                }
            }
    
            Node node2 = null;
            Node temp2 = null;
            for (int i = 0; i < M; i++) {
                int value = scanner.nextInt();
                Node newNode = new Node(value);
                if (node2 == null) {
                    node2 = newNode;
                    temp2 = node2;
                } else {
                    temp2.next = newNode;
                    temp2 = temp2.next;
                }
            }
    
            GfG gfg = new GfG();
            Node result = gfg.mergeResult(node1, node2);
    
            printList(result);
        }
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}

// } Driver Code Ends


/* Structure of the node*/
/* class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
} */

class GfG
{
    static Node reverseLinkedList(Node head){
        Node prev=null,curr=head,nxt;
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        return prev;
    }
    Node mergeResult(Node node1, Node node2)
    {
	// Your code here	
        node1=reverseLinkedList(node1);
        node2=reverseLinkedList(node2);
        Node temp=new Node(0);
        Node ans=temp;
        while(node1!=null && node2!=null){
            if(node1.data>node2.data){
                ans.next=node1;
                node1=node1.next;
            }
            else{
                ans.next=node2;
                node2=node2.next;
                
            }
            ans=ans.next;
        }
        if(node1!=null)ans.next=node1;
        if(node2!=null)ans.next=node2;
        return temp.next;
    }
}


