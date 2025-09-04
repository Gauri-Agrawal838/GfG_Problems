/*
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
*/

class Solution {
    public Node reverseKGroup(Node head, int k) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(head != null){
            arr.add(head.data);
            head = head.next;
        }
        
        if(k > arr.size()){
            Collections.reverse(arr);
        }
        Collections.reverse(arr.subList(0, k));
        int i = k;
        while(i < arr.size()){
            if(arr.size() - i < k){
                Collections.reverse(arr.subList(i, arr.size()));
                break;
            }
            Collections.reverse(arr.subList(i, i + k));
            i += k;
        }
        Node nhead = new Node(arr.get(0));
        Node temp = nhead;
        for(int j = 1; j < arr.size(); j++){
           temp.next = new Node(arr.get(j));
           temp = temp.next;
        }
        return nhead;
    }
}